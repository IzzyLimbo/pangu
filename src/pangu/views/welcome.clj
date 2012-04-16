(ns pangu.views.welcome
  (:require [pangu.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]
        [hiccup.page-helpers :only [include-css include-js html5]]))

(defpage "/" []
  (common/layout
   [:p "Welcome to pangu"]
   (include-js "js/welcome.js"))
  ;(include-js "js/welcome.js")
  )
