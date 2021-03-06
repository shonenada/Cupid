(defproject cupid "0.1.0-SNAPSHOT"
  :description "Cupid"
  :url "https://github.com/shonenada/Cupid"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.json "0.2.5"]
                 [org.clojure/tools.logging "0.3.0"]
                 [org.clojure/java.jdbc "0.3.5"]
                 [org.clojure/data.generators "0.1.2"]
                 [mysql/mysql-connector-java "5.1.31"]
                 [org.mindrot/jbcrypt "0.3m"]
                 [environ "0.5.0"]
                 [ring/ring-core "1.2.2"]
                 [ring/ring-json "0.3.1"]
                 [ring/ring-jetty-adapter "1.2.2"]
                 [compojure "1.5.0"]
                 [korma "0.4.2"]
                 [selmer "1.0.7"]]
  :main ^:skip-aot cupid.core
  :profiles {:uberjar {:aot :all}})
