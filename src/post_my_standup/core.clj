(ns post-my-standup.core
  (:require [clj-http.client :as client]))

(defn -main
  []
  (client/get "https://geodoo.work/wp-json/wp/v2/posts"
              {:async? true}
              ;; respond callback
              (fn [response] (println "response is:" response))
              ;; raise callback
              (fn [exception] (println "exception message is: " (.getMessage exception)))))
