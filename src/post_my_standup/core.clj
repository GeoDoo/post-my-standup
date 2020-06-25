(ns post-my-standup.core
  (:require [clj-http.client :as client]
            [cheshire.core :as json]))

(defn article-title
  [article]
  (get-in article [:title :rendered]))

(defn get-body
  [response]
  (get-in response [:body]))

(defn -main
  []
  (client/get "https://geodoo.work/wp-json/wp/v2/posts"
              {:async? true}
              (fn [response] (println "response is:" (map article-title (json/parse-string (get-body response) true))))              
              (fn [exception] (println "exception message is: " (.getMessage exception)))))

