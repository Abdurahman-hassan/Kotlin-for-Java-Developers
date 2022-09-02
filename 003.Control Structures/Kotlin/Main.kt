package controlStructures

import controlStructures.Color.*

enum class Color {
    RED, ORANGE, BLUE, YELLOW, GREEN, INDEGO, VIOLET
}

fun main() {

    println(max(3, 5))
    println(getDescription(RED))
    println(mix(RED, VIOLET))


}

// no ternary operator in kotlin
// (a>b) ? a:b
fun max(a: Int, b: Int) = if (a > b) a else b

fun getDescription(color: Color): String =
    when (color) {
        RED -> "Hot"
        ORANGE -> "Mild"
        BLUE -> "Cold"
        else -> "Cold"
    }

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(BLUE, YELLOW) -> GREEN
        setOf(BLUE, VIOLET) -> INDEGO
        else -> throw Exception("Dirty color")
    }

fun respondToInputBlockBody(input: String): String {
    return when (input) {
        "y", "yes", "Y", "Yes" -> "I'm glad you agree"
        "N", "No", "n", "no" -> "Sorry for hear that"
        else -> "I don't understand you"
    }
}

// or

fun respondToInputExpressionBody(input: String):String = when (input) {
    "y", "yes", "Y", "Yes" -> "I'm glad you agree"
    "N", "No", "n", "no" -> "Sorry for hear that"
    else -> "I don't understand you"
}

/*
val pet  = getMyFavoritPet()
when(pet){
    is Cat -> pet.meow()
    is Dog -> pet.woof()
}*/

//or

/*
when(val pet  = getMyFavoritPet()){
    is Cat -> pet.meow()
    is Dog -> pet.woof()
}*/

// Also we can include it into fun

/*
fun getSound(): String =
    when (val pet = getMyFavoritPet()) {
        is Cat -> pet.meow()
        is Dog -> pet.woof()
    }
*/


// when without argument

fun updateWeatherKotlin2(degree: Int) {
    val (descreption, color) = when {
        degree < 10 -> "Cold" to com.sun.prism.paint.Color.BLUE
        degree < 25 -> "Mild" to java.awt.Color.ORANGE
        else -> " Hot " to java.awt.Color.RED
    }
    println("descraption weather is: $descreption\nColor is: $color")
}


// Loops

