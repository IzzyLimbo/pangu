(ns pangu.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css include-js html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "pangu"]
               (include-css "/css/reset.css")
               (include-css "http://fonts.googleapis.com/css?family=Oxygen")
               [:link {:href "/css/screen.css" :media "screen, projection" :rel "stylesheet" :type "text/css"}]
               [:link {:href "/css/print.css" :media "print" :rel "stylesheet" :type "text/css"}]
               "<!--[if IE]>"
               [:link {:href "/css/ie.css" :media "screen, projection" :rel "stylesheet" :type "text/css"}]
               "<![endif]-->"
               (include-js "https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js")
               (include-js "/js/main.js")]
              [:body
               [:div#wrapper
                content]
               ]))
