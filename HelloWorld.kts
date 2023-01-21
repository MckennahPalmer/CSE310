//the main function
/*fun main(args: Array<String>) {
    println("Hello, world!")
}*/

//Nearly everything in kotlin has a value
//Loops are the only exception to that
// Will assign kotlin.Unit
val isUnit = println("This is an expression")
println(isUnit)

//The keyword fun designates a function in kotlin
//This function prints out a Hello World to the console
fun printHello() {
    println("Hello World")
}

printHello()

//Some more Expressions
val temperature = 10
val isHot = if (temperature > 50) true else false
println(isHot)

//Here is a lambda
//In this example, the lambda takes an Int named dirty,
// and returns dirty / 2. (Because filtering removes dirt.)
var dirtyLevel = 20
val waterFilter2 = { dirty : Int -> dirty / 2}
println(waterFilter2(dirtyLevel))

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

val waterFilter3: (Int) -> Int = { dirty -> dirty / 2 }
println(updateDirty(30, waterFilter3))

