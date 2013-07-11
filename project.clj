(defproject sample-clojure-cloudbees "1.0.0-SNAPSHOT"
  :description "Sample clojure application - clojure 1.3 !"


  ;; Your app id here ! Change this to something meaningful:
  :cloudbees-app-id "michaelvideo/headers"

  ;; punch in your cloudbees details - don't put your secrets in this file or you will 
  ;; accidentally put them in git !  
  ;; 
  ;; - by default they are in ~/.bees/bees.config in the form of 
  ;; bees.api.secret=S
  ;; bees.api.key=Y
  ;; you can also refer to them directly:
  ;;  :cloudbees-api-key ~(slurp "/Users/michaelneale/michaelvideo-cloudbees.apikey")
  ;;  :cloudbees-api-secret ~(slurp "/Users/michaelneale/michaelvideo-cloudbees.secret")


  ;; ring is middleware for clojure
  ;; the compujure web framework is handy (which uses ring)
  :dependencies [[org.clojure/clojure "1.3.0"]
  				[compojure "0.6.4"]]



  ;; so we can do "lein ring server" (and used by deployment plugin)				
  :plugins [[lein-ring "0.7.3"]
            [lein-cloudbees "1.0.3"]]                   

  ;; the main entry point for our app
  :ring {:handler sample-clojure-cloudbees.core/app}


)