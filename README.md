# Hello ScaFi

[ScaFi](https://scafi.github.io) is a toolkit for aggregate programming.

This project shows a basic ScaFi setup.

At a minimum, you usually need `scafi-core`,
which includes an aggregate programming domaing-specific language (DSL)
and interpreter.

Take a look at the following

- `build.sbt` shows how to load ScaFi packages
- `src/main/scala/examples/HelloScafi.scala` shows how to use ScaFi in a standalone way

Run with: `sbt run`

You should see the following output, corresponding to a synchronous execution of 5 rounds on 5 devices
 disposed on a linear network `1 -- 2 -- 3 -- 4 -- 5`,
with rounds scheduled using a round-robin scheduling:

```
RUN: DEVICE 1
        CONTEXT: DeviceState(1,Map(),Map(source -> false),Map(nbrRange -> Map(1 -> 0.0, 2 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 1, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)
        OUTPUT: Infinity
--------------
RUN: DEVICE 2
        CONTEXT: DeviceState(2,Map(1 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 1, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)),Map(source -> true),Map(nbrRange -> Map(1 -> 1.0, 2 -> 0.0, 3 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 2, P:/Rep(0) -> 0.0, P:/ -> 0.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)
        OUTPUT: 0.0
--------------
RUN: DEVICE 3
        CONTEXT: DeviceState(3,Map(2 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 2, P:/Rep(0) -> 0.0, P:/ -> 0.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)),Map(source -> false),Map(nbrRange -> Map(2 -> 1.0, 3 -> 0.0, 4 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 3, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)
        OUTPUT: Infinity
--------------
RUN: DEVICE 4
        CONTEXT: DeviceState(4,Map(3 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 3, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)),Map(source -> false),Map(nbrRange -> Map(3 -> 1.0, 4 -> 0.0, 5 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 4, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)
        OUTPUT: Infinity
--------------
RUN: DEVICE 5
        CONTEXT: DeviceState(5,Map(4 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 4, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)),Map(source -> false),Map(nbrRange -> Map(4 -> 1.0, 5 -> 0.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 5, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)
        OUTPUT: Infinity
--------------
RUN: DEVICE 1
        CONTEXT: DeviceState(1,Map(1 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 1, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity), 2 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 2, P:/Rep(0) -> 0.0, P:/ -> 0.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)),Map(source -> false),Map(nbrRange -> Map(1 -> 0.0, 2 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 1, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)
        OUTPUT: Infinity
--------------
RUN: DEVICE 2
        CONTEXT: DeviceState(2,Map(1 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 1, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity), 2 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 2, P:/Rep(0) -> 0.0, P:/ -> 0.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity), 3 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 3, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)),Map(source -> true),Map(nbrRange -> Map(1 -> 1.0, 2 -> 0.0, 3 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 2, P:/Rep(0) -> 0.0, P:/ -> 0.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 0.0)
        OUTPUT: 0.0
--------------
RUN: DEVICE 3
        CONTEXT: DeviceState(3,Map(2 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 2, P:/Rep(0) -> 0.0, P:/ -> 0.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 0.0), 3 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 3, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity), 4 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 4, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)),Map(source -> false),Map(nbrRange -> Map(2 -> 1.0, 3 -> 0.0, 4 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 3, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)
        OUTPUT: 1.0
--------------
RUN: DEVICE 4
        CONTEXT: DeviceState(4,Map(3 -> Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 3, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity), 4 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 4, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity), 5 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 5, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)),Map(source -> false),Map(nbrRange -> Map(3 -> 1.0, 4 -> 0.0, 5 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 4, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)
        OUTPUT: Infinity
--------------
RUN: DEVICE 5
        CONTEXT: DeviceState(5,Map(4 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 4, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity), 5 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 5, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)),Map(source -> false),Map(nbrRange -> Map(4 -> 1.0, 5 -> 0.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 5, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)
        OUTPUT: Infinity
--------------
RUN: DEVICE 1
        CONTEXT: DeviceState(1,Map(1 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 1, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity), 2 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 2, P:/Rep(0) -> 0.0, P:/ -> 0.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 0.0)),Map(source -> false),Map(nbrRange -> Map(1 -> 0.0, 2 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 1, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)
        OUTPUT: 1.0
--------------
RUN: DEVICE 2
        CONTEXT: DeviceState(2,Map(1 -> Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 1, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity), 2 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 2, P:/Rep(0) -> 0.0, P:/ -> 0.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 0.0), 3 -> Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 3, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)),Map(source -> true),Map(nbrRange -> Map(1 -> 1.0, 2 -> 0.0, 3 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 2, P:/Rep(0) -> 0.0, P:/ -> 0.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 0.0)
        OUTPUT: 0.0
--------------
RUN: DEVICE 3
        CONTEXT: DeviceState(3,Map(2 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 2, P:/Rep(0) -> 0.0, P:/ -> 0.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 0.0), 3 -> Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 3, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity), 4 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 4, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)),Map(source -> false),Map(nbrRange -> Map(2 -> 1.0, 3 -> 0.0, 4 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 3, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 1.0)
        OUTPUT: 1.0
--------------
RUN: DEVICE 4
        CONTEXT: DeviceState(4,Map(3 -> Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 3, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 1.0), 4 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 4, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity), 5 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 5, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)),Map(source -> false),Map(nbrRange -> Map(3 -> 1.0, 4 -> 0.0, 5 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 4, P:/Rep(0) -> 2.0, P:/ -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)
        OUTPUT: 2.0
--------------
RUN: DEVICE 5
        CONTEXT: DeviceState(5,Map(4 -> Map(P:/Rep(0)/FoldHood(0) -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 4, P:/Rep(0) -> 2.0, P:/ -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity), 5 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 5, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)),Map(source -> false),Map(nbrRange -> Map(4 -> 1.0, 5 -> 0.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 5, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)
        OUTPUT: Infinity
--------------
RUN: DEVICE 1
        CONTEXT: DeviceState(1,Map(1 -> Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 1, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity), 2 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 2, P:/Rep(0) -> 0.0, P:/ -> 0.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 0.0)),Map(source -> false),Map(nbrRange -> Map(1 -> 0.0, 2 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 1, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 1.0)
        OUTPUT: 1.0
--------------
RUN: DEVICE 2
        CONTEXT: DeviceState(2,Map(1 -> Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 1, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 1.0), 2 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 2, P:/Rep(0) -> 0.0, P:/ -> 0.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 0.0), 3 -> Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 3, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 1.0)),Map(source -> true),Map(nbrRange -> Map(1 -> 1.0, 2 -> 0.0, 3 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 2, P:/Rep(0) -> 0.0, P:/ -> 0.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 0.0)
        OUTPUT: 0.0
--------------
RUN: DEVICE 3
        CONTEXT: DeviceState(3,Map(2 -> Map(P:/Rep(0)/FoldHood(0) -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 2, P:/Rep(0) -> 0.0, P:/ -> 0.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 0.0), 3 -> Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 3, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 1.0), 4 -> Map(P:/Rep(0)/FoldHood(0) -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 4, P:/Rep(0) -> 2.0, P:/ -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)),Map(source -> false),Map(nbrRange -> Map(2 -> 1.0, 3 -> 0.0, 4 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 3, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 1.0)
        OUTPUT: 1.0
--------------
RUN: DEVICE 4
        CONTEXT: DeviceState(4,Map(3 -> Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 3, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 1.0), 4 -> Map(P:/Rep(0)/FoldHood(0) -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 4, P:/Rep(0) -> 2.0, P:/ -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity), 5 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 5, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)),Map(source -> false),Map(nbrRange -> Map(3 -> 1.0, 4 -> 0.0, 5 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 4, P:/Rep(0) -> 2.0, P:/ -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 2.0)
        OUTPUT: 2.0
--------------
RUN: DEVICE 5
        CONTEXT: DeviceState(5,Map(4 -> Map(P:/Rep(0)/FoldHood(0) -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 4, P:/Rep(0) -> 2.0, P:/ -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 2.0), 5 -> Map(P:/Rep(0)/FoldHood(0) -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 5, P:/Rep(0) -> Infinity, P:/ -> Infinity, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)),Map(source -> false),Map(nbrRange -> Map(4 -> 1.0, 5 -> 0.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> 3.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 5, P:/Rep(0) -> 3.0, P:/ -> 3.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)
        OUTPUT: 3.0
--------------
RUN: DEVICE 1
        CONTEXT: DeviceState(1,Map(1 -> Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 1, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 1.0), 2 -> Map(P:/Rep(0)/FoldHood(0) -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 2, P:/Rep(0) -> 0.0, P:/ -> 0.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 0.0)),Map(source -> false),Map(nbrRange -> Map(1 -> 0.0, 2 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 1, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 1.0)
        OUTPUT: 1.0
--------------
RUN: DEVICE 2
        CONTEXT: DeviceState(2,Map(1 -> Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 1, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 1.0), 2 -> Map(P:/Rep(0)/FoldHood(0) -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 2, P:/Rep(0) -> 0.0, P:/ -> 0.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 0.0), 3 -> Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 3, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 1.0)),Map(source -> true),Map(nbrRange -> Map(1 -> 1.0, 2 -> 0.0, 3 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 2, P:/Rep(0) -> 0.0, P:/ -> 0.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 0.0)
        OUTPUT: 0.0
--------------
RUN: DEVICE 3
        CONTEXT: DeviceState(3,Map(2 -> Map(P:/Rep(0)/FoldHood(0) -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 2, P:/Rep(0) -> 0.0, P:/ -> 0.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 0.0), 3 -> Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 3, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 1.0), 4 -> Map(P:/Rep(0)/FoldHood(0) -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 4, P:/Rep(0) -> 2.0, P:/ -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 2.0)),Map(source -> false),Map(nbrRange -> Map(2 -> 1.0, 3 -> 0.0, 4 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 3, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 1.0)
        OUTPUT: 1.0
--------------
RUN: DEVICE 4
        CONTEXT: DeviceState(4,Map(3 -> Map(P:/Rep(0)/FoldHood(0) -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 3, P:/Rep(0) -> 1.0, P:/ -> 1.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 1.0), 4 -> Map(P:/Rep(0)/FoldHood(0) -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 4, P:/Rep(0) -> 2.0, P:/ -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 2.0), 5 -> Map(P:/Rep(0)/FoldHood(0) -> 3.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 5, P:/Rep(0) -> 3.0, P:/ -> 3.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)),Map(source -> false),Map(nbrRange -> Map(3 -> 1.0, 4 -> 0.0, 5 -> 1.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 4, P:/Rep(0) -> 2.0, P:/ -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 2.0)
        OUTPUT: 2.0
--------------
RUN: DEVICE 5
        CONTEXT: DeviceState(5,Map(4 -> Map(P:/Rep(0)/FoldHood(0) -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 4, P:/Rep(0) -> 2.0, P:/ -> 2.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 2.0), 5 -> Map(P:/Rep(0)/FoldHood(0) -> 3.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 5, P:/Rep(0) -> 3.0, P:/ -> 3.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> Infinity)),Map(source -> false),Map(nbrRange -> Map(4 -> 1.0, 5 -> 0.0)))
        EXPORT: Map(P:/Rep(0)/FoldHood(0) -> 3.0, P:/Rep(0)/FoldHood(0)/Nbr(0) -> 5, P:/Rep(0) -> 3.0, P:/ -> 3.0, P:/Rep(0)/FoldHood(0)/Nbr(1) -> 3.0)
        OUTPUT: 3.0
--------------
```

This example shows a gradient computation, self-stabilising to the field of minimum distances from source devices (here, device with ID=2).
In this case of a *hop* gradient computation, distances are measured in terms of hops.
Then, we see that device 2 yields 0.0 (since it is the source),
devices 1 and 3 eventually yield  1.0 (they are at a distance of 1 hop from device 2),
device 4 eventually yields 2.0 (it is at a distance of 2 hops from device 2),
and
device 5 eventually yields 3.0 (it is at a distance of 3 hops from device 3).
The nice thing about this algorithm and approach is that changes (e.g. switch of sources, changes in topology etc.) would be absorbed by playing additional rounds:
 the idea, indeed, is that in each round the devices perceive and act upon their local context, and communicate with neighbours to progressively steer the collective behaviour.

See the [ScaFi Website](https://scafi.github.io) and [Documentation](https://scafi.github.io/docs)
 for an introduction and more information about the paradigm. 

