// we changed the name of this top level function to call it to java with a different name MainClass instead of MainKotlin
@file:JvmName("MainClass")

package bsics

fun main() {

    val name = "Kotlin"
    println("Hello, $name")
    //  if we need to call a function into println we will add ${} , ex. ${callFunHere()}

    println("First, ${foo()}, second ${foo()}")

    //  variables

    //  val -> value -> read only
    val question: String = "life, the universe," + "and everything"
    println("$question?")
    //  question= "sure?"
    //  Compiler error: val cannot be reassigned it's the same as final in Java

    //  var -> mutable
    var answer = 0
    answer = 42
    println(answer)

    //    we can modify this object and we can't assign another reference.
    val languages = mutableListOf("Java")
    languages.add("Kotlin")
    languages.add("Python")

    // languages = "test"
    // val cann't be re-assigned

    val list = listOf("Java")
    //  list.add("Kotlin")
    //  we can't modify the read only list

    println(listOf('a', 'b', 'c').joinToString(separator = "", prefix = "(", postfix = ")"))
    displaySeparator()
    displaySeparator('#', 33)
}

fun foo(): String {
    println("Calculating foo ... ")
    return "foo"
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
    //  convert to expression body
    //  fun max(a: Int, b: Int): Int = if (a > b) a else b
}

// type of functions
/*    top level function
    fun toplevel() = 1
    member function
    class A{
        fun memberfunction() = 2
    }
    local function
    fun localfunction(){
        fun local() = 3
    }*/

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}

// Calling a function with default arguments from java
// if we need to call function with default arguments sum(1); we need to insert annotation
@JvmOverloads
fun sum(a: Int = 0, b: Int = 0, c: Int = 0) = a + b + c