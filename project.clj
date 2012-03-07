(defproject pangu "0.1.0-SNAPSHOT"
  :description "Birdthings Pangu Project."
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [jayq "0.1.0-SNAPSHOT"]
                 [crate "0.1.0-SNAPSHOT"]
                 [fetch "0.1.0-SNAPSHOT"]
                 [noir "1.2.2"]]
  :plugins [[lein-cljsbuild "0.1.2"]]
  :cljsbuild {:builds
              [{:source-path "src",
                :compiler
                {:output-dir "resources/public/cljs/",
                 :output-to "resources/public/js/bootstrap.js",
                 :optimizations :simple,
                 :pretty-print true}}]}
  :main pangu.server)
