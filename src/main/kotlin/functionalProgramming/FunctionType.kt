package functionalProgramming

import basic.yourName

fun main() {
    val sumResult = sum?.invoke(5,15)
    val multiplyResult = multiply?.invoke(10,5)

    println(sumResult)
    println(multiplyResult)


}

//Function Type Merubah Fungsi Menjadi Tipe Data
//Type Alias : berfungsi ketika kita mempunyai beberapa fungsi yang memiliki function type yang sama.untuk memberikan nama alternatif dari sebuah function type
typealias Arithmetic = ((Int, Int) -> Int)?

val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

