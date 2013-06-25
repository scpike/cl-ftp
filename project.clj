(defproject cl-ftp "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.apache.ftpserver/ftpserver-core "1.0.6"]
                 [org.apache.ftpserver/ftplet-api "1.0.6"]
                 [org.slf4j/slf4j-api "1.7.5"]
                 [org.slf4j/slf4j-simple "1.7.5"]
                 [org.apache.mina/mina-core "2.0.7"]]
  :main cl-ftp.core)

