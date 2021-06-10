package functionalProgramming

fun main(){
    val nilai: Int? = null
    val nilai2: Int? = 20
    val nilai3: Int = 100.slice

    println(nilai.slice)
    println(nilai2.slice)
    println(nilai3)

}

//Div : untuk melakukan pembagian (div)
val Int?.slice: Int
    get() = this?.div(2) ?: 0