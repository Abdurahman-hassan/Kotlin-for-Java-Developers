package controlStructures

//types of ranges

// 1..9 IntRage
// 1 until 10 IntRange
//'a'.. 'z' CharRange
// "ab".. "az" ClosedRange<String>
// startDate.. endDate ClosedRange<MyDate>

fun main() {

//    val intRange: IntRange = 1..9
//    val anotherIntRange = 1 until 10
//    val charRang: CharRange = 'a'..'z'
//    val stringRange:ClosedRange<String> = "ab".."az"
////    val dateRange:ClosedRange<MyDate> = startdate..enddate
//
//    val check = "ball" in "a".."k"
//    val check2 = "zoo" in "a".."k"
//    val check3 = "Kotlin" in "Java".."Scala"
//
//    println("$check , $check2 , $check3")
//
//    val list = listOf('a','m','v')
//    if ('a' in list)  println('T')
//    if (list.contains('m')) println('T')

    println(isValidIdentifier("_012"))


}

fun isValidIdentifier(s: String): Boolean {

    fun isValidChar(c:Char) = c == '_' || c.isLetterOrDigit()
    // or
    // fun isValidChar2(c:Char) = c == '_' || c in 'a'..'z'|| c in '0'..'9' || c in 'A'..'Z'
    if (s.isEmpty() || s[0].isDigit())return false
    for (c3 in s ){
        if (!isValidChar(c3))
            return false
    }
    return true

}
