//How to write classes in kotlin
//Kotlin automatically creates getters and setters for the properties you defined
class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {//now has constructors
    // Dimensions in cm
    var length: Int = length
    var width: Int = width
    var height: Int = height

    init {
        println("aquarium initializing")
    }
    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000} l")
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}

fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()
}

/*fun main() {
    buildAquarium()
}*/

buildAquarium()