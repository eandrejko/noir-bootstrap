(ns noir-bootstrap.views.welcome
  (:require [noir-bootstrap.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/" []
  (common/layout
   [:h1 "Welcome to Noir Bootstrap"]
   [:p (list
        "A combination of "
        [:a {"href" "http://webnoir.org"} "Noir"]
        " and "
        [:a {"href" "http://twitter.github.com/bootstrap/"} "Twitter Bootstrap"]
        "."
        [:br]
        "Use this as a way to quick start any new project.")]))
