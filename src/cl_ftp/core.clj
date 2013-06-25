(ns cl-ftp.core
 (:import [org.apache.ftpserver FtpServerFactory FtpServer
           listener.ListenerFactory usermanager.PropertiesUserManagerFactory]
          [org.slf4j Logger LoggerFactory]
          [org.apache.ftpserver/ftplet-core]))


(defn -main []
  (let [ftp-factory (new FtpServerFactory)
        listener-factory (new ListenerFactory)
        user-manager-factory (new PropertiesUserManagerFactory)]
     (. listener-factory setPort 1250)
     (. user-manager-factory setFile (clojure.java.io/file "users.properties"))
     (. ftp-factory addListener "default" (. listener-factory createListener))
     (. ftp-factory setUserManager (. user-manager-factory createUserManager))
     (. (. ftp-factory createServer) start)))