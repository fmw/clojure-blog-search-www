===================================
Clojure Blog Search web application
===================================

This is a very simple web application that provides a front-end to
search results indexed by `Alida`_, which is a search library I wrote
for my talk at `EuroClojure 2012`_ on the topic of "Building a search
engine with Clojure".

These are the commands you need to run to start it on GNU/Linux or a
similar operating system::

    git clone https://github.com/fmw/clojure-blog-search-www.git
    cd clojure-blog-search-www
    lein deps
    lein ring server

That's it. These commands should start a local server at
http://localhost:3000 with the web application. You do need Git, a
working Java environment and a copy of `Leiningen`_, however.

Questions?
----------

Don't hesitate to contact me if you have any questions or
feedback. You can email me at fmw@vixu.com.

About me
--------

My name is Filip de Waard. As the founder of `Vixu.com`_ I write
Clojure code for a living. The main focus of `Vixu.com`_ is providing
website-management software as a service. Under the hood we use the
free, open source `Vix`_ application to power the service. My company
is also working on a product search application written in Clojure.


License
-------

Copyright 2012, F.M. de Waard / `Vixu.com`_.
All code is covered by the `Apache License, version 2.0`_.

.. _`Alida`: https://github.com/fmw/alida
.. _`EuroClojure 2012`: http://euroclojure.com/2012/
.. _`Leiningen`: https://github.com/technomancy/leiningen
.. _`Vixu.com`: http://www.vixu.com/
.. _`Vix`: https://github.com/fmw/vix
.. _`Apache License, version 2.0`: http://www.apache.org/licenses/LICENSE-2.0.html
