(defproject sample-clojure-cloudbees "1.0.0-SNAPSHOT"
  :description "Sample clojure application - clojure 1.3 !"


  ;; punch in your cloudbees details - don't put your secrets in this file or you will 
  ;; accidentally put them in git !
  :cloudbees-api-key ~(.trim (slurp "/Users/michaelneale/michaelvideo-cloudbees.apikey"))
  :cloudbees-app-id "michaelvideo/sampleclojure"
  :cloudbees-api-secret ~(.trim (slurp "/Users/michaelneale/michaelvideo-cloudbees.secret"))

  ;; ring is middleware for clojure
  ;; the compujure web framework is handy (which uses ring)
  :dependencies [[org.clojure/clojure "1.3.0"]
  				[compojure "0.6.4"]]

  ;; so we can do "lein ring server" (and used by deployment plugin)				
  :dev-dependencies [[lein-ring "0.4.6"]
                     [lein-cloudbees "1.0.0"]]

  ;; the main entry point for our app
  :ring {:handler sample-clojure-cloudbees.core/app}


)