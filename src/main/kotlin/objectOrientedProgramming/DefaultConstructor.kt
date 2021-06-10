package objectOrientedProgramming

//Kotlin secara otomatis membuat sebuah default constructor pada kelas jika kita tidak membuat sebuah konstruktor secara manual.
class Jamet {
    val nama = "Asep"
    val umur = 24
    val asal = "Tuban"
}

//Ketika kita membuat sebuah objek, default konstruktor akan dipanggil. Konstruktor tersebut akan menginisialisasi properti yang terdapat pada kelas dengan nilai default.
fun main(){
    val jamet = Jamet()
    println("Nama : ${jamet.nama}, Asal : ${jamet.asal}, Umur : ${jamet.umur} Tahun")

    val jamet1 = Jamet()
}