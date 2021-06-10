package objectOrientedProgramming

class Animall (var name: String, var weight: Double, var age: Int, var isReptil: Boolean)

val Animall.getAnimalInfo : String
    get() =  "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isReptil}"

class Segitiga (var alas: Int,var tinggi:Int)

val Segitiga.getSegitiga : Double
get() = this.alas * this.tinggi * 0.5

fun main(){
    val animall = Animall("Komodo",125.5,17,true)
    println(animall.getAnimalInfo)

    val segitiga = Segitiga(5,7)
    println("Luas Segitiga Adalah ${segitiga.getSegitiga}")
}