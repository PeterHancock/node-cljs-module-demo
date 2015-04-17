(ns node_cljs.core
    (:require [cljs.nodejs :as node]))

    (node/enable-util-print!)

    (defn plusone [x] (+ 1 x))

    (def render (let [mustache (node/require "mustache")]
            (fn [t v] (. mustache render t v))
        )
    )

    (set! *main-cli-fn* #()) ;; cljs compiler demands this
