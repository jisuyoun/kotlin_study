package org.example.study.aroundhub.kotlin.classes

class PersonWithConstructor constructor(private val name: String, private val age: Int) { // 주 생성자

	private var etc: String = "no value"

	init { // 첫번째 무조건 실행되는 메소드
		println("initializer block : $etc")
	}

	constructor(name: String) : this(name, 15) // 부생성자

	constructor(name: String, age: Int, etc: String) : this(name, age) { // 추가 생성자
		this.etc = etc
		println("additional constructor is called : ${this.etc}")
	}

	fun sayHello() {
		println("Hi!")
	}

	fun introduce() {
		println("I'm $name and my age is $age.")
	}
}
