package functionalProgramming

///Scope Function : Biasa Di Gunakan untuk mengeksekusi object dengan mudah memanfaatkan lambda expression

fun main(){
    //let : Fungsi let menggunakan argumen (it) untuk mengakses konteks dari sebuah objek. Penggunaan fungsi let akan banyak kita temukan pada objek yang bertipe non-null.
    //Contoh 1
    val message: String? = null
    val result = message?.let {
        val lenght = it.length * 2
        val text = "Text lenght is $lenght"
        println(text)
    }?: run {
        val text = "message is null"
        println(text)
    }

    //Contoh 2
    val lebar: Int? = 7
    val result1 = lebar?.let{
        val p = 12
        val t = 10
        val total = it * p * t
        total
    }?: run {
        val text = "Nilai Lebar null"
        println(text)
    }
    println(result1)


    //also : Fungsi also baiknya digunakan ketika kita ingin menggunakan konteks dari objek sebagai argumen tanpa harus mengubah nilainya.
    val text = "Hello Kotlin"
    val result2 = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result2")
}