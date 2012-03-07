(ns pangu.views.compasstest
  (:require [pangu.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/compasstest" []
         (common/layout
          [:p "compass test"]
          [:div.example
           [:div#padding-box "Padding Box"]
           [:div#border-box "Border Box"]]))
