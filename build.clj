(require 'cljs.closure)

(cljs.closure/build "src" {
    :main 'node-cljs.core
    :target :nodejs
    :output-to "main.js"
    :optimizations :simple ;; All in one but without Closures deadcode trimming :-()
    })
