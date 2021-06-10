package objectOrientedProgramming.exception

fun main(){
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    //Try : Berisi Kode Yang Berpeluang Memicu Error
    //Catch : Berisi Kode Yang Terpanggil Jika Terjadi Error,sebuah kode alternatif untuk menampilkan pesan eror atau yang lainnya.

    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null!!"
        println(someMustNotNullValue)
    }

    //Jika Menggunakan Handling Kalau Error Kode Berikutnya Akan Tetap Di Eksekusi
    println("Kocak")
    println("Kocak")
    println("Kocak")


}