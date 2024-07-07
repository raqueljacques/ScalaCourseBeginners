package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // Expression
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <= (relational operators)

  println(!(1 == x))
  // ! && || (logical negation, logical and, logical or)

  var aVariable = 2
  aVariable += 3 // Also works with -= *= /= ... side effects
  println(aVariable)

  //changing the value of a variable is a side effect

  // Instructions (DO - tell the computer to do something) vs Expressions (VALUE)
  // Instructions are executed (think Java/ imperative languages/ Do something), expressions are evaluated (Scala/ funcional languages/ Value)
  // In Scala we'll think in terms of expressions


  // IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 // IF expression
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)

  // NEVER WRITE THIS AGAIN.
  var i = 0
  val aWile: Unit = while (i < 10) {
    println(i)
    i += 1
  }

  // while and loops are very specific to imperative programming, and they are discouraged in Scala
  // Scala forces everything to be an expression!
  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects in scala are actually expressions returning Unit

  // side effects: println(), whiles, reassigning
  // side effects are reminiscent of imperative programming

  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }
  // code blocks are expressions
  // the value of the block is the value of the last expression
  // the code inside the block is isolated, can't access the variables defined outside the block


  //Exercises
  // 1. difference between "hello world" vs println("hello world")?
  // "hello world" is a string, println("hello world") is a side effect = is an expression that returns Unit
  // 2. what's the value of:
  val someValue = {
    2 < 3
  }
  println(someValue) // true

  // 3. what's the value of:
  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }
  println(someOtherValue) // 42
}
