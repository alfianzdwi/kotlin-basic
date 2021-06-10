package functionalProgramming

//Scope Function : Biasa Di Gunakan untuk mengeksekusi object dengan mudah memanfaatkan lambda expression

fun main() {
    //run : . Fungsi run akan sangat berguna jika di dalam blok lambda terdapat inisialisasi objek dan perhitungan untuk nilai kembalian.
    //Contoh 1
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello","Keren")
        "replace text from $from to $to"

    }
    println("result : $result")

    //Contoh 2
    val pi = 3.14
    val lingkaran = pi.run{
        val keliling = 10
        val jari2 = 6
        this * keliling * jari2
    }

    println(lingkaran)


    //with : Fungsi with sendiri disarankan untuk mengakses apa yang menjadi anggotanya tanpa harus menyediakan nilai kembalian.
    val message = "Hello Alfian!"
    val result1 = with(message){
        println("Value is $this,You Are The Best ")
        println("Value lenght ${this.length}")
    }


    //apply : Berbeda dengan fungsi-fungsi sebelumnya, nilai yang dikembalikan dari Fungsi apply adalah nilai dari konteks objeknya dan objek konteksnya tersedia sebagai receiver (this). Baiknya fungsi apply dapat melakukan inisialisasi atau konfigurasi dari receiver-nya.
    val message1 = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message1.toString())



}
