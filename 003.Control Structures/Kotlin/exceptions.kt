package controlStructures

import java.io.IOException
import kotlin.reflect.typeOf

fun main() {

//    println(percentage(50))
    convertNumberToletter("332")



}

fun percentage(number: Int) =

    if (number in 0..100)
        number
    else throw java.lang.IllegalArgumentException(
        "A percentage must be between 0..100: $number"
    )

fun convertNumberToletter(string: String) {

    val number = try {
        Integer.parseInt(string)
    } catch (e: java.lang.NumberFormatException) {
        println(e.message)
        return
    }
    println(number)

}

// if we will the function is Kotlin only
fun foo(){
    throw IOException()
}

// if we will the function in Kotlin and Java
@Throws(IOException::class)
fun bar(){
    throw IOException()
}
