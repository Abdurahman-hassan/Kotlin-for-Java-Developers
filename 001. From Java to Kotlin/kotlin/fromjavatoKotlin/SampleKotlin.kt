package fromjavatoKotlin

import com.sun.prism.paint.Color.BLUE
import fromJavatoKotlin.PersonJava
import fromJavatoKotlin.SampleJavaClass
import java.awt.Color.ORANGE
import java.awt.Color.RED

fun main() {
    val rectangleArea: Int = SampleJavaClass.rectangleArea(10, 20)
    println("inside the Kotlin codes:" + rectangleArea)

    val objectFromKotlin = PersonKotlin("Abdelrahman", 25)
    println(objectFromKotlin.age)
    println(objectFromKotlin.name)

    val objectFromJava = PersonJava("Abdelrahman", 25)
    println(objectFromJava.age)
    println(objectFromJava.name)

    SampleJavaClass.updateWeatherJava(44)
    updateWeatherKotlin(9)
    updateWeatherKotlin2(22)


}

fun updateWeatherKotlin(degree: Int) {
    val (descreption, color) =
        if (degree < 10) {
            Pair("Cold", BLUE)
        } else if (degree < 25) {
            Pair("Mild", ORANGE)
        } else {
            Pair("Hot", RED)
        }
    println("descraption weather is: $descreption\nColor is: $color")
}

fun updateWeatherKotlin2(degree: Int) {
    val (descreption, color) = when {
        degree < 10 -> "Cold" to BLUE
        degree < 25 -> "Mild" to ORANGE
        else -> " Hot " to RED
    }
    println("descraption weather is: $descreption\nColor is: $color")
}


