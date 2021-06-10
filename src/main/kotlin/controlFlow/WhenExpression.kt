package controlFlow

import kotlin.random.Random
//When Sama Seperti Switch Case Pada Java Di Gunakan Jika Memiliki Kondisi Yang Banyak Atau Lebih Dari Dua
    fun main() {
        val anyType: Any = 100L
        when (anyType) {
            is Long -> println("the value has a Long type")
            is Int -> println("the value has a Int type")
            is Double -> println("the value has a Double type")
            else -> println("undefined")
        }
    }



