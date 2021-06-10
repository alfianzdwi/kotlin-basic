package objectOrientedProgramming.exception

fun main(){
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    /*Finally : blok ini bersifat opsional.finally akan dieksekusi setelah
    program keluar dari blok try ataupun catch.Bahkan finally juga
    tereksekusi ketika terjadi exception yang tidak terduga*/

    try {
        someMustNotNullValue = someNullValue!!
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
    } finally {
        println(someMustNotNullValue)
    }

}