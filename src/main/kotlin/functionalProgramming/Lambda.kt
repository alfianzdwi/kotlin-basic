package functionalProgramming

fun main(){
    //Mengeksekusi
    val resultSgt = segitiga(5,7)
    println(resultSgt)

    //Mengeksekusi
    message()
    //Mengeksekusi
    printMessage ("Halo Ini Lambda 2")

    //Mengesksekusi
    val result = contohLambda("Alfian", 20)
    println(result)

    //Mengeksekusi
    val result1 = contohLambda1("Kotlin")
    println(result1)

    //Mengeksekusi
    val result2 = contohLamda2("kotlin")
    println(result2)

}


//Lambda Function
val segitiga = { alas: Int, tinggi: Int -> alas * tinggi * 0.5 }

//Lambda Function Tanpa Parameter
val message = { println("Halo Ini Lambda 1")}

//Lambda Function Dengan Parameter
val printMessage = { message: String -> println(message) }

//Contoh Lambda Expression : Baris Terakhir Pada Body Adalah Returnnya
                 //Param      //Tipe Kembalian
val contohLambda: (String, Int) -> String = {name: String, age:Int ->
    val result = "My Name is $name And I am $age years old"
    result
}

//Kata Kunci It Adalah Paramater itu sendiri jadi kita tidak perlu mendeklarasikan kembali param nya,dan it hanya berjalan jika kita memiliki satu parameter saja
val contohLambda1: (String) -> String = {
    val result = "$it is Awesome"
    result
}

//Method References Adalah Membuat lambda expression dari fungsi yg sudah ada
fun toUpper(value: String) :String = value.toUpperCase()
val contohLamda2: (String) -> String = :: toUpper


//Tanda Ini -> Untuk membedakan daftar parameter dengan body function


