package objectOrientedProgramming.Overloading

//Overloading : Memberikan Nama Function Yang Sama Tapi Beda Parameternya
class Calculator {
    fun add(valueA: Int, valueB:Int) = valueA + valueB
    fun add(valueA: Int, valueB:Int, valueC:Int) = valueA + valueB + valueC
    fun add(valueA: Double, valueB:Double) = valueA + valueB
    fun add(valueA: Float, valueB:Float) = valueA + valueB

    fun min(value1: Int, value2: Int) = if (value1 < value2) value1 else value2
    fun min(value1: Double, value2: Double) = if (value1 < value2) value1 else value2
}

fun main(){
    val calc = Calculator()

    println(calc.add(2, 4))
    println(calc.add(2.5, 2.2))
    println(calc.add(6f, 7f))
    println(calc.add(1, 2, 3))

    println(calc.min(9, 2))
    println(calc.min(17.2, 18.3))
}