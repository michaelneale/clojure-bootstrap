# sample-clojure-cloudbees

A good starting point for lein and ring powered clojure apps - for deployment to cloudbees. 

You can also use https://github.com/CloudBees-community/clojure-clickstart for one that uses Jenkins to build/test.


If you don't have a CloudBees account - get one one:

  <button onClick="javascript:window.location='https://grandcentral.cloudbees.com/authenticate/start?provider=github&login_redirect=/';"><img src="https://grandcentral.cloudbees.com/images/github-icon_40.png" /><div>Sign in with GitHub<div></button>
  <button onClick="javascript:window.location='https://grandcentral.cloudbees.com/authenticate/start?provider=google&login_redirect=/';"><img src="https://grandcentral.cloudbees.com/images/google-icon_color_40.png" /><div>Sign in with Google<div></button> 


## Usage

	lein do clean, deps, ring server	

This will start the app - and open a browser. Hack away, press refresh, no need to restart unless you udpate dependencies etc.
('do' means do a list of things in lein terms)

To deploy to cloudbees:

1) Open project.clj - give your project a cloudbees-app-id 
2) Then go to https://grandcentral.cloudbees.com/user/keys and get your credentials - punch them in (see project.clj). 

From then on: 
	
	lein cloudbees deploy
	lein cloudbees list-apps
	lein cloudbees

Be happy.


The cloudbees plugin (http://clojars.org/lein-cloudbees) is used here for deployment (no runtime dependency, of course).


## License

Copyright (C) 2011 Michael Neale

Whatever.
