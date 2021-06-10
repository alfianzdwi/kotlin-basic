package functionalProgramming

//Extension Function : Untuk menambahkan fungsi baru untuk kelas mana pun di kelas lain,
fun main(){
    //Eksekusi
    val hasil = 10.printInt()//Mengakses fungsi ekstensi
    println(hasil)

    //Eksekusi
    val myString = "My String"
    myString.printString()//mencetak: dari fungsi ekstensi: MyString

    //Eksekusi
    val name: String = "Kotlin"
    val hello : String = name.hello()
    println(hello)

}

//Int setelah fun sebagai receiver type
    fun Int.printInt():Int {
        return this * 8
    }

    fun String.printString() {
        println("from extension function: $this")
    }
//Extension function juga bisa menambahkan fungsi ke tipe data,this di gunakan jika kita butuh mengakses nilai tipe datanya
    fun String.hello(): String = "Hello $this"










/*Skenario umum: Ketika Kita membuat kelas. Kita menulis beberapa metode.
Kemudian,kita menyadari bahwa kami membutuhkan lebih banyak metode untuk kelas.
lalu kitapun  menulis lebih banyak metode di kelas yang sama.
Tetapi, jika kelas berada di library pihak ketiga yang kita gunakan melalui ketergantungan atau
sedemikian rupa sehingga kita tidak dapat menambahkan fungsi baru di kelas tersebut, kita tidak dapat memodifikasi kelas tersebut.*/