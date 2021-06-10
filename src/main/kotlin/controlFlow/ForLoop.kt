package controlFlow

    fun main() {
        val ranges = 1.rangeTo(10) step 3
        for ((index, value) in ranges.withIndex()) {
            println("value $value with index $index")
        }
        
        for (n in 1..25){
            print("$n ")
        }
        println("")

        for (n in 1..5){
            println("Hello Kotlin!")
        }
    }
