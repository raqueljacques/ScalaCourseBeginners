package lectures.part1basics

object ValuesVariablesTypes extends App {
  // The type of the variable is optional, but it's a good practice to specify it
  val x =  42
  val y: Int = 43
  println(x)

  //x = 2 // This will not compile because x is a val and it's immutable
  //VALS ARE IMMUTABLE
  //COMPILER can infer types

  val aString: String = "hello"; val anotherString = "goodbye";// ; is optional in Scala, only necessary if you have multiple expressions in the same line
  val bString = "HELLO";
  val cString = "GOODBYE"

  val trueBoolean: Boolean = true
  val falseBoolean: Boolean = false

  val aChar: Char = 'a'

  val anInt: Int = x

  val aShort: Short = 4613
  val aLong: Long = 5273985273895237L
  val aFloat: Float = 2.0f


  //Variables
  var aVariable: Int = 4
  aVariable = 5 // Side effects

}
