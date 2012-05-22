;; src/clojure-blog-search-www/core.clj search web application
;; Copyright 2012, F.M. (Filip) de Waard <fmw@vix.io>.
;;
;; Licensed under the Apache License, Version 2.0 (the "License");
;; you may not use this file except in compliance with the License.
;; You may obtain a copy of the License at
;;
;; http://www.apache.org/licenses/LICENSE-2.0
;;
;; Unless required by applicable law or agreed to in writing, software
;; distributed under the License is distributed on an "AS IS" BASIS,
;; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
;; See the License for the specific language governing permissions and
;; limitations under the License.

(ns clojure-blog-search-www.core
  (:use compojure.core)
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [alida.lucene :as lucene]
            [clojure-blog-search-www.views :as views]))

(def lucene-directory (lucene/create-directory "resources/index/"))
(def index-reader (lucene/create-index-reader lucene-directory))
(def analyzer (lucene/create-analyzer))

(defn read-int [possible-integer]
  "Converts a numeric string to an integer or returns nil when
   the number isn't formatted as expected."
  (when possible-integer
    (try
      (Integer/parseInt possible-integer)
      (catch java.lang.NumberFormatException e
        nil))))

(defn read-float [possible-float]
  "Converts a numeric string to a float or returns nil when the
   number format isn't recognized."
  (when possible-float
    (try
      (Float/parseFloat possible-float)
      (catch java.lang.NumberFormatException e
        nil))))

(defn response [body & {:keys [status content-type]}]
  {:status (or status (if (nil? body) 404 200))
   :headers {"Content-Type" (or content-type "text/html; charset=UTF-8")}
   :body body})

(defroutes main-routes
  (GET "/"
       {{q :q
         after-doc-id :after-doc-id
         after-score :after-score
         pp-after-doc-id :pp-aid
         pp-after-score :pp-as}
        :params}
       (response
        (if (not-empty q)
          (let [after-doc-id-int (read-int after-doc-id)
                after-score-float (read-float after-score)]
            (views/search-results-view
             20
             (lucene/search q
                            nil ;; no filter
                            "fulltext"
                            21
                            index-reader
                            analyzer
                            after-doc-id-int
                            after-score-float)
             q
             pp-after-doc-id
             pp-after-score
             after-doc-id-int
             after-score-float
             (not (and after-doc-id-int after-score-float))))
          (views/search-start-page))))
  (route/resources "/")
  (route/not-found "Page not found"))

(def app
  (handler/site main-routes))