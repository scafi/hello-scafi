package examples

import it.unibo.scafi.incarnations.BasicAbstractIncarnation

// 1. Define (or import) an incarnation, which provides an instantiation of types and other classes to import
object MyIncarnation extends BasicAbstractIncarnation

// 2. Bring into scope the stuff from the chosen incarnation
import MyIncarnation._

// 3. Define an "aggregate program" using the ScaFi DSL by extending AggregateProgram and specifying a "main" expression
class BasicUsageProgram extends AggregateProgram  {
  override def main(): Any = rep(0)(_+1)
}

// 4. In your program, implement an "execution loop" whereby your device or system executes the aggregate program
object HelloScafi extends App {
  val program = new BasicUsageProgram()

  // Simulate first round for device 0, with empty context
  val c1 = factory.context(selfId = 0, exports = Map(), lsens = Map(), nbsens = Map())
  val e1 = program.round(c1)

  // Simulate second round for device 0, with context given only by its previous export
  val c2 = factory.context(0, Map(0 -> e1))
  val e2 = program.round(c2)

  // Print contexts and exports in output
  println(s"c1=$c1\ne1=$e1\n\nc2=$c2\ne2=$e2")
}
