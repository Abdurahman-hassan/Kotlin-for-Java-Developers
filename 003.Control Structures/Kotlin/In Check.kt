package controlStructures

fun main() {
    println(isLetter('A'))
    println(recognize('%'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun notLetter(c: Char) = c !in 'a'..'z' || c in 'A'..'Z'

fun recognize(c: Char): String {
    return when (c) {
        in '0'..'9' -> "It's a digit"
        in 'a'..'z' -> "It's a Letter"
        else -> "I don't know"
    }
}

fun recognizeExprission(c: Char) =
    when (c) {
        in '0'..'9' -> "It's a digit"
        in 'a'..'z' -> "It's a Letter"
        else -> "I don't know"
    }
