(ns sample-clojure-cloudbees.core
  (:use compojure.core, ring.adapter.jetty)
  (:require [compojure.route :as route]))

(defroutes main-routes
  (GET "/" [] "<h1>Hello World</h1>")
  (GET "/another-page" [] "This is another page")
  (route/not-found "<h1>Page not found</h1>"))


