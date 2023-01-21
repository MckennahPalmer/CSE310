//How you assign variables and mark them as different types
//Byte, Int, Long, Double, String, possibly more.

//With Val you can only assign the variable once
val i: Int = 6
println(i)

//With Var you assign it, then later can change it if needed.
var change: Int = 7
println(change)
change = (change + 1)
println(change)

//This is a Byte which is different than an Int and String
val b2: Byte = 1 // OK, literals are checked statically
println(b2)

//if I want to change the type
val i4: Int = b2.toInt() // OK!
println(i4)

//To make long numeric constants more readable,
// Kotlin allows you to place underscores in the numbers,
// where it makes sense to you.
val oneMillion = 1_000_000
val socialSecurityNumber = 999_99_9999L
val hexBytes = 0xFF_EC_DE_5E
val bytes = 0b11010010_01101001_10010100_10010010
println(oneMillion)

//Null variables
//Use the question mark operator, ?, after the type to indicate that a variable can be null.
var marbles: Int? = null
println(marbles)

//You can test for null with the ? operator, saving you the pain of writing many if/else statements.
var fishFoodTreats = 9
var answer = fishFoodTreats?.dec() //will decrement the number by one
println(answer)

//Listof makes a list that can't be changed
val school = listOf("mackerel", "trout", "halibut")
println(school)

//mutablelistof can be changed
val myList = mutableListOf("tuna", "salmon", "shark")
println(myList)
myList.remove("shark") //if written alone with no println right after, will send true
println(myList)

//Kotlin has arrays
val schoolTwo = arrayOf("shark", "salmon", "minnow")
println(schoolTwo.contentToString())

//Or we could use a loop to print it out
for (element in schoolTwo) {
    print(element + " ") //looks more normal this way
}

//new line needed
println('\n')

//In Kotlin, you can loop through the elements and the indexes at the same time.
//be careful to start a new line, it for some reason tacks it on the last thing if you don't.
for ((index, element) in schoolTwo.withIndex()) {
    println("Item at $index is $element\n")
}

//Other loops you can write
for (i in 1..5) print(i)
println('\n')

for (i in 5 downTo 1) print(i)
println('\n')

for (i in 3..6 step 2) print(i)
println('\n')

for (i in 'd'..'g') print (i)
println('\n')

//while loops
var bubbles = 0
while (bubbles < 50) {
    bubbles++
}
println("$bubbles bubbles in the water\n")

do {
    bubbles--
} while (bubbles > 50)
println("$bubbles bubbles in the water\n")

//repeat loops
repeat(3) {
    println("A Dragon is coming")
}