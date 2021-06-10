package objectOrientedProgramming.exception

fun main() {
    val someStringValue: String? = "18.4"
    var someIntValue: Int = 0

    //Multiple Catch : kita dapat gunakan untuk menangani semua tipe exception yang terjadi. Baik itu ketika terjadi NullPointerException atau NumberFormatException

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}