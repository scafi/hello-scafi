# Hello ScaFi

ScaFi is a toolkit for aggregate programming.

This project shows a basic ScaFi setup.

At a minimum, you usually need `scafi-core`,
which includes an aggregate programming domaing-specific language (DSL)
and interpreter.

Take a look at the following

- `build.sbt` shows how to load ScaFi packages
- `src/main/scala/examples/HelloScafi.scala` shows how to use ScaFi in a standalone way

Run with: `sbt run`

You should see the following output:

```
c1=C[
	I:0,
	E:Map(),
	S1:Map(),
	S2:Map()
]
e1=Map(P:/Rep(0) -> 1, P:/ -> 1)

c2=C[
	I:0,
	E:Map(0 -> Map(P:/Rep(0) -> 1, P:/ -> 1)),
	S1:Map(),
	S2:Map()
]
e2=Map(P:/Rep(0) -> 2, P:/ -> 2)
```

See the [ScaFi Website](https://scafi.github.io) and [Documentation](https://scafi.github.io/docs)
 for an introduction and more information about the paradigm. 

