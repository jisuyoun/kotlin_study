package org.example.study.aroundhub.kotlin.function

fun main() {
    println(sum1(1, 12))
    println(sum2(1, 12))
    noReturnFunction("un used value")
    defaultParameter("my value")
    defaultParameter()
    namedArgument("around", "studio", "hub")
}

fun sum1(a: Int, b: Int): Int {
    val c = a - b
    val d = a * b
    return a+ b
}

fun sum2(a: Int, b: Int) = a + b

fun noReturnFunction(a: String) {
    println(a)
}

fun defaultParameter (a: String = "default value") {
    println(a)
}

fun namedArgument (a: String, b: String, c: String) {
    println("$a $b $c")
}