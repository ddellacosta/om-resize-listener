(defproject om-resize-listener "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2234"]
                 [org.clojure/core.async "0.1.303.0-886421-alpha"]
                 [om "0.6.4"]
                 [sablono "0.2.17"]]

  :plugins [[lein-cljsbuild "1.0.3"]]

  :source-paths ["src"]

  :cljsbuild { 
    :builds [{:id "om-resize-listener"
              :source-paths ["src"]
              :compiler {
                :output-to "om_resize_listener.js"
                :output-dir "out"
                :optimizations :none
                :source-map false}}]})
