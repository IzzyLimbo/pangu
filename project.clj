(defproject pangu "0.0.1"
  :description "Birdthings Pangu Project."
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [jayq "0.1.0-SNAPSHOT"]
                 [crate "0.1.0-SNAPSHOT"]
                 [fetch "0.1.0-SNAPSHOT"]
                 [noir "1.2.2"]]
  :plugins [[lein-cljsbuild "0.1.7"]]
  :hooks [leiningen.cljsbuild]
  :cljsbuild {:builds [
              {:source-path "src/pangu/cljs/main",
                :compiler {
               ; :output-dir "resources/public/cljs/main",  ;; for debug mode
                 :output-to "resources/public/js/main.js",
                 :optimizations :simple,
                 :pretty-print true}}
              {:source-path "src/pangu/cljs/welcome",
                :compiler {
               ; :output-dir "resources/public/cljs/welcome",  ;; for debug mode
                 :output-to "resources/public/js/welcome.js",
                 :optimizations :simple,
                 :pretty-print true}}
                 ]}
  :main pangu.server)
