package functionalProgramming

fun main() {
    //Tanpa Inner Function
    fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
        if (valueA == 0) {
            throw IllegalArgumentException("valueA must be better than 0")
        }
        if (valueB == 0) {
            throw IllegalArgumentException("valueB must be better than 0")
        }
        if (valueC == 0) {
            throw IllegalArgumentException("valueC must be better than 0")
        }
        return valueA + valueB + valueC
    }
    val result = sum(valueA = 15, valueB = 2, valueC = 9)
    println(result)


    //Mengunakan Inner Function : : Menghindari Kita Dai Penulisan Berulang2,Dengan hak akses terbatas hanya untuk fungsi terluarnya.
    fun kali(valueA: Int, valueB: Int, valueC: Int): Int {
        fun validateNumber(value: Int) {
            if (value == 0) {
                throw IllegalArgumentException("valueC must be better than 0")
            }
        }

        validateNumber(valueA)
        validateNumber(valueB)
        validateNumber(valueC)

        return valueA * valueB * valueC
    }

    val result1 = kali(3,5,4)
    println(result1)

}
