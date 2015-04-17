var core = require('./index');

var println = console.log.bind(console);

println(core);

println(core.plusone(2));

println(core.render("Hello {{name}}", {name: "cljs!"}));
