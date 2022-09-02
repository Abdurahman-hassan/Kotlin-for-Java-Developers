package controlStructures

// while and do while is the same as Java

// For loop is a bit different

fun main() {
    normalIteration()
//    mapIteration()
//    indexIteration()
//    rangeIteration()
//    stringIteration()
}

fun normalIteration() {
    val list = listOf("a".."z", "0".."9", "_")
    println(list[0])
//    for (s in list) {
//        println(s)
//    }

//    or we can initial the type
/*
 for (s:String in list){
        println(s)
    }*/
}

// we also can iterate into map
fun mapIteration() {
    val map = mapOf(
        1 to "One",
        2 to "Two",
        3 to "Three"
    )

    for ((Key, value) in map) {
        println("$Key == $value")
    }
}

fun indexIteration() {
    val list = listOf("a", "b", "c")
    for ((elemet, index) in list.withIndex()) {
        println("elemet is: $elemet and index is: $index")
    }
}

fun rangeIteration() {
    // from 1 to 9
    for (i in 1..9) {
        print(i)
    }
    // or

    // from 1 to 8
    for (i in 1 until 9) {
        print(i)
    }
    //97531
    for (i in 9 downTo 1 step 2) {
        println(i)
    }
}

// bcd
fun stringIteration() {
    for (alph in "abc") {
        print(alph + 1)
    }
}


