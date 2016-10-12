(defproject euler "0.1.0-SNAPSHOT"
  :description "Solutions for Project Euler"
  :url "https://github.com/jcosentino11/euler"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot euler.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
