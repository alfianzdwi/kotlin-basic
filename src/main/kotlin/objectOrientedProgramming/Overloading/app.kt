package objectOrientedProgramming.Overloading

/*Overloading : Adalah menggunakan dua atau lebih fungsi dengan nama yang sama
 Overloading dapat dilakukan selama fungsi itu memiliki parameter yang berbeda.*/

//Modifier internal
internal class Hewan(val nama: String , val umur: Int ,val berat: Double){

    fun eat(){
        println("$nama Sedang Makan")
    }

    fun eat(typeFood: String) {
        println("$nama memakan $typeFood!")
    }

    fun eat(typeFood: String, quantity: Double) {
        println("$nama memakan $typeFood sebanyak $quantity grams!")
    }

}

fun main(){
    var hewan = Hewan("Kucing",2,4.5)
    println("Nama : ${hewan.nama}, Umur : ${hewan.umur} Tahun, Berat : ${hewan.berat} Kg")
    hewan.eat()
    hewan.eat("Ikan")
    hewan.eat("Daging",1.5)

}
