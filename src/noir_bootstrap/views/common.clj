(ns noir-bootstrap.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css include-js html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "noir-bootstrap"]
               (include-css "/css/bootstrap.css")
               (include-css "/css/bootstrap-responsive.css")
               [:style "body { padding-top: 60px; }"]]
              [:body
               (list
                [:div.navbar.navbar-fixed-top {"data-toggle" "collapse" "data-target" ".nav-collapse"}
                 [:div.navbar-inner
                  [:div.container
                   [:a.btn.btn-navbar
                    [:span.icon-bar]]
                  [:a.brand "Noir Bootstrap"]
                   [:div.nav-collapse
                    [:ul.nav
                     [:li.active
                      [:a {"href" "#"} "Home"]]
                     [:li
                      [:a {"href" "http://www.webnoir.org/tutorials"} "Tutorials"]]
                     [:li
                      [:a {"href" "http://groups.google.com/group/clj-noir"} "Google Group"]]
                     [:li
                      [:a {"href" "http://www.webnoir.org/docs/"} "API"]]
                     [:li
                      [:a {"href" "https://github.com/ibdknox/noir"} "Source"]]]]]]]
                [:div.container content] 
                (include-js "http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js")
                (include-js "/js/bootstrap.min.js"))]))
