package objectOrientedProgramming.exception


fun main() {

        //AritmathicException
        val someValue = 6
        println(someValue / 0)

        //NumberFormatException
        val someStringValue = "18.9"
        println(someStringValue.toInt())

        //NullPointerException
        val someNullValue: String? = null
        val someMustNotNullValue: String = someNullValue!!
        println(someMustNotNullValue)
}
