package org.example.study.aroundhub.kotlin.classes

fun main() {
    val aMan = Person()
    aMan.sayHello()
    aMan.introduce()

    aMan.age = 55
    println("sorry, my real age is ${aMan.age}")

    println("===============================")

    var jedi = PersonWithConstructor("jedi", 150) // 주생성자
    val flature = PersonWithConstructor("flature") // 부생성자
    val harry = PersonWithConstructor("harry", 25, "추가값") // 추가생성자

    flature.sayHello()
    flature.introduce()
    jedi.sayHello()
    jedi.introduce()
    harry.sayHello()
    harry.introduce()
}