package Extensions

fun main() {
    //and we can use it as a member function.
    val c: Char = "abc".lastChar()
    println(c)
    val s: String = "hello".repeat(4)
    println(s)

    standardCollections()
    formattingMultipleStringLines()
    conversionInNumber()

    // normal
    val sum = sum(listOf(1, 2, 3))
    println(sum)

    // sum as extension
    val sum2 = listOf(1, 2, 3).sumAsExtension()
    println(sum2)


}

// Extension function extends the class.
// It is defined outside of the class but can be called as a regular member to this class.
// Here, we define an extension function to string called lastChar,

fun String.lastChar() = this.get(this.length - 1)

fun String.repeat(n: Int): String {
    val sb = StringBuilder(n * length)
    for (i in 1..n) {
        sb.append(this)
    }
    return sb.toString()
}

fun standardCollections() {
    val hashSet = hashSetOf(1, 7, 99)
    val arrayList = arrayListOf(1, 3, 7)
    val hashMap = hashMapOf(1 to "seven", 53 to "fifty-three")

    println(hashSet)
    println(arrayList)
    println(hashMap.javaClass)

}

fun formattingMultipleStringLines() {
    // formatting multiple string lines
    val str = """"hello world,
        |or not to code
        |test""".trimMargin()

    val str2 = """"hello world,
                   teeee
                   in this..""".trimIndent()
    println(str)
    println(str2)


    val reg = """ \d{2}\.\d{2} """.toRegex()
        println(reg.matches("11.11"))
}

fun conversionInNumber(){

    println("123".toInt())
    println("1e-10".toDouble())
    println("123".toIntOrNull())
    println("tto".toIntOrNull())
//    println("xx".toInt()) // FormattingException
}

fun sum(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
}

// extension fun
fun List<Int>.sumAsExtension(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}






