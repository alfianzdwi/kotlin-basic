package objectOrientedProgramming

class Animals(name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean

    init {
        this.weight = if (weight < 0) 0.1 else weight
        this.age = if (age < 0) 0 else age
        this.name = name
        this.isMammal = false
    }

    //Secondary constructor digunakan ketika kita ingin menginisialisasi sebuah kelas dengan cara yang lain. Anda dapat membuat lebih dari satu secondary constructor
                                                                            //This di sini untuk memanggil primary constructor
    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        this.isMammal = isMammal
    }

}

fun main(){
    //Menggunakan Secondary Constructor
    val dicodingCat = Animals("Dicoding Miaw", 2.5, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")

    //Menggunakan Primary Constructor
    val dicodingBird = Animals("Dicoding tweet", 0.5, 1)
    println("Nama: ${dicodingBird.name}, Berat: ${dicodingBird.weight}, Umur: ${dicodingBird.age}, mamalia: ${dicodingBird.isMammal}")
}


/*Dengan begitu, objek Animal dapat diinisialisasi dengan
secondary constructor ketika nilai name, weight, age dan isMammal tersedia.
Tetapi jika nilai isMammal tidak tersedia,  primary constructor lah yang
akan digunakan dan nilai isMammal dapat diinisialisasi pada blok init dengan nilai default.*/