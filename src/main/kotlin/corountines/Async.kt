package corountines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun getCapital(): Int {
    delay(1500L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1500L)
    return 75000
}

fun main() = runBlocking {
    //Tanpa Menggunakan Async
    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

    //Menggunakan Async
    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
    }
    println("Completed in $timeOne ms vs $timeTwo ms")
}
//Async : fungsi ini digunakan untuk memulai sebuah coroutine yang akan mengembalikan sebuah hasil.
/*Dengan async seolah-olah kedua fungsi tersebut berjalan bersamaan
dan membutuhkan waktu yang lebih singkat dari kode sebelumnya.*/