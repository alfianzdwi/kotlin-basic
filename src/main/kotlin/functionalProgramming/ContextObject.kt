package functionalProgramming

fun main(){
    //Lambda Receiver this
    val buildString = StringBuilder().apply {
        append("Hello ")
        append("Kotlin ")
    }
    println(buildString)


    //Lambda Argument it
    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }
}
/*Sebelum kita mengulas beberapa fungsi yang menjadi bagian dari scope function di atas,
kita perlu mengetahui terlebih dahulu bagaimana cara mengakses konteks sebuah objek dari dalam lambda yang menjadi bagian dari scope function.
Terdapat 2 (dua) cara, yaitu: diakses sebagai lambda receiver (this) dan lambda argumen (it).
Keduanya memiliki kapabilitas yang sama dan tentunya digunakan untuk kasus yang berbeda.*/