package functionalProgramming

fun main(){
    val numbers = 1..10

    //Function Refference : Membuat lambda Menggunakan Function Lain Sebagai Refrensi
    val evenNumbers = numbers.filter(Int::genap)
    println(evenNumbers)

    val angka = 1..50
    val angkaGenap = angka.filter(Int::genap)
    print(angkaGenap)

}
//Pada suatu kondisi, terkadang kita butuh mereferensikan sebuah fungsi.
fun Int.genap() = this % 2 == 0