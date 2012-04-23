(defproject pangu "0.0.1"
  :description "Birdthings Pangu Project."
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [jayq "0.1.0-alpha3"]
                 [crate "0.1.0-alpha3"]
                 [fetch "0.1.0-alpha2"]
                 [noir "1.2.2"]]
  :plugins [[lein-cljsbuild "0.1.8"]]
  :hooks [leiningen.cljsbuild]
  :cljsbuild {:builds [
              {:source-path "src/pangu/cljs/main",
                :compiler {
                 ; :output-dir "resources/public/cljs/main",  ;; for debug mode
                 :output-to "resources/public/js/main.js",
                 :optimizations :simple,
                 :pretty-print false}}
              {:source-path "src/pangu/cljs/welcome",
                :compiler {
                 ; :output-dir "resources/public/cljs/welcome",  ;; for debug mode
                 :output-to "resources/public/js/welcome.js",
                 :optimizations :simple,
                 :pretty-print false}}
                 ]}
  :main pangu.server)
