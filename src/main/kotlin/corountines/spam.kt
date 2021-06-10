package corountines

import kotlinx.coroutines.*

fun main() = runBlocking{
    launch {
        //Outpurt println akan di jalankan setelah hello dan akan delay sesuai waktu yg di tentukan
        delay(11000L)
        println("Corountines!!")
    }
    println("Hello,")
    // Kode delay(2000L) digunakan untuk menunda selama 2 detik sebelum JVM berakhir.
    delay(2000L)
}