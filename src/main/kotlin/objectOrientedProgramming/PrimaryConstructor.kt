package objectOrientedProgramming

/* Konstruktor merupakan fungsi spesial yang digunakan untuk menginisialisasi properti yang terdapat pada kelas tersebut.
 Primary constructor juga dapat memiliki nilai default Contohnya pada  isMammal*/
class Animalll(name: String, weight: Double, age: Int , isMammal: Boolean = true){
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

//Kotlin menyediakan blok init yang memungkinkan kita untuk menuliskan properti di dalam body class ketika kita menggunakan primary constructor
//init di sini memiliki beberapa fungsi selain menginisialisasi properti kelas.  satu fungsi lainnya adalah untuk membantu dalam memvalidasi sebuah nilai properti sebelum diinisialisasi.
    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0 else age
        this.name = name
        this.isMammal = isMammal
    }


}



fun main(){
    val animalll = Animalll("Macan",-0.5, age = -1 )
    println("Nama : ${animalll.name}, Berat : ${animalll.weight}, Umur : ${animalll.age}, Mamalia : ${animalll.isMammal}")

}