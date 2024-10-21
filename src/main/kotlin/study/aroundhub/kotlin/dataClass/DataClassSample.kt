package org.example.study.aroundhub.kotlin.dataClass

data class DataClassSample(val name: String, val age: Int)

class NoDataClassSample(val name: String, val age: Int)

fun main() {
	val data1 = NoDataClassSample(name = "flature", age = 10)
	val data2 = NoDataClassSample(name = "flature", age = 10)

	println(data1.hashCode())
	println(data2.hashCode())

	println(data1 == data2) // false
	println(data1.toString()) // org.example.study.aroundhub.kotlin.dataClass.NoDataClassSample@7699a589

	val data3 = DataClassSample(name = "flature", age = 10)
	val data4 = DataClassSample(name = "flature", age = 10)

	println(data3.hashCode())
	println(data4.hashCode())

	println(data3 == data4) // true
	println(data3.toString()) // DataClassSample(name=flature, age=10)

	println("name is ${data3.component1()}") // name is flature
	println("age is ${data3.component2()}") // age is 10

	val (name, age) = data3  // 값들이 있으면 data3에 넣어줘
	println(name)
	println(age)

	val data5 = data3.copy()
	val data6 = data3.copy(name = "around hub studio")

	println(data3 == data5) // true
	println(data5 == data6) // false
	println(data5) // DataClassSample(name=flature, age=10)
	println(data6) // DataClassSample(name=around hub studio, age=10)
}
