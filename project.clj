(defproject time-slip "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/data.zip "0.1.1"]
                 [clj-http "1.0.1"]
                 [clj-time "0.9.0"]
                 [clojure-opennlp "0.3.3"]]
  :aot [time-slip.core]
  :main time-slip.core)
