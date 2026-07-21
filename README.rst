===================================
Clojure Blog Search web application
===================================

Project status
--------------

This repository is preserved for archival purposes only and is no longer
actively developed. A new version of Alida, specifically tailored for crawling
data for vector databases, is available as `Alida Vector`_. See `alida.dev`_
for an overview.

This is a very simple web application that provides a front-end to
search results indexed by `Alida`_, which is a search library I wrote
for my talk at `EuroClojure 2012`_ on the topic of "Building a search
engine with Clojure". A recording of the talk is available from `ClojureTV on
YouTube`_.

These are the commands you need to run to start it on GNU/Linux or a
similar operating system::

    git clone https://github.com/fmw/clojure-blog-search-www.git
    cd clojure-blog-search-www
    lein deps
    lein ring server

That's it. These commands should start a local server at
http://localhost:3000 with the web application. You do need Git, a
working Java environment and a copy of `Leiningen`_, however.

About and contact
-----------------

You can read more `about me <https://filipdewaard.com/about.html>`_ on my
personal homepage, which also includes `contact information
<https://filipdewaard.com/contact.html>`_. Feel free to reach out if you have
any questions or feedback!


License
-------

Copyright 2012, F.M. de Waard / `Vixu.com`_.
All code is covered by the `Apache License, version 2.0`_.

.. _`Alida`: https://github.com/fmw/alida
.. _`Alida Vector`: https://github.com/fmw/alida-vector
.. _`alida.dev`: https://alida.dev/
.. _`ClojureTV on YouTube`: https://www.youtube.com/watch?v=OezmEuxTQhM
.. _`EuroClojure 2012`: http://euroclojure.com/2012/
.. _`Leiningen`: https://github.com/technomancy/leiningen
.. _`Vixu.com`: http://www.vixu.com/
.. _`Apache License, version 2.0`: http://www.apache.org/licenses/LICENSE-2.0.html
