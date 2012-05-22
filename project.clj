(defproject clojure-blog-search-www "0.1.0-SNAPSHOT"
  :description "Web interface for a demo search application"
  :url "https://github.com/fmw/clojure-blog-search-www"
  :license {:name "Apache License, version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.0-RC1"]
                 [enlive "1.0.0-SNAPSHOT"]
                 [alida "0.1.2"]]
  :plugins [[lein-ring "0.7.0"]]
  :ring {:handler clojure-blog-search-www.core/app})