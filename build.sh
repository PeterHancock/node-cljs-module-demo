#!/bin/bash

MODULE='node_cljs.core' #ns

drip -cp cljs.jar:src clojure.main build.clj

(echo '(function(){'; tail -n +2 main.js; echo ";module.exports=$MODULE;})();") > index.js

#smoke test
node test
