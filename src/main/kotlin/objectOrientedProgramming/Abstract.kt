package objectOrientedProgramming

abstract class Annimal (var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name Sedang Makan")
    }

    fun sleep(){
        println("$name Sedang Tidur")
    }

    //Abstract Function Juga Hanya bisa di deklarasikan tanpa body,harus di override di child class nya
    /*abstract fun run(){
        println("$name Lari!!")
    }*/
}

fun main(){
    //Abstract Class Tidak Bisa Langsung di instance/di buat objek,melainkan harus di turunkan dulu ke child class
    //val animal = Annimal()
}