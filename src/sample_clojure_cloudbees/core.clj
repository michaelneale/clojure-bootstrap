(ns sample-clojure-cloudbees.core
  (:use compojure.core)  
  (:use ring.middleware.resource)  
  (:require 
	  [compojure.route :as route]
	  [compojure.handler :as handler]))

(defroutes main-routes    
  (GET "/" [] "<h1>Hello World</h1>")
  (GET "/head" [] {:headers {"Access-Control-Allow-Origin" "foo.com"} :body "<h1>Hello World</h1>"})
  (GET "/another-page" [] "This is another page")  
  (route/resources "/")
  (route/not-found "<h1>Page not found</h1>"))

(def app  
  (handler/site main-routes))

