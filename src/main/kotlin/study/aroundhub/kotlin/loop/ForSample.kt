package org.example.study.aroundhub.kotlin.loop

class ForSample {
	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			for (i in 1..5) println(i) // 1 2 3 4 5
			println()

			for (i in 5 downTo 1) println(i) // 5 4 3 2 1
			println()

			for (i in 1..5 step 2) println(i) // 1 3 5
			println()
		}
	}
}
