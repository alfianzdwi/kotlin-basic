package basic

//Array di Kotlin direpresentasikan oleh kelas Array yang memiliki fungsi get dan set serta properti size

fun main(){
    val mixArray = arrayOf("Alfian", 20, "Teknologi Informasi")
    println(mixArray[0])

    val umur = intArrayOf(25, 23, 18)
    println(umur[1])

    umur[1]=30
    println(umur[1])

    val intArray = Array(10, { i -> i * i })
    for (n in intArray){
        print("$n ")
    }
}