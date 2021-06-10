package functionalProgramming

//Recursive Function : adalah sebuah mekanisme di mana sebuah fungsi digunakan dari dalam fungsi itu sendiri. Ini memungkinkan sebuah fungsi dapat berjalan beberapa kali.

fun main(){

    //Tanpa Recursive
    fun factorial(n: Int): Int{
        return if (n == 1){
            n
        }else{
            var result = 1
            for (i in 1..n) {
                result *= i
            }
            result
        }
    }

    val result = factorial(8)
    println(result)

    //Dengan Recursive : Tapi Ketika kita menjalankan fungsi di atas, program akan menciptakan tumpukan frame dengan jumlah berdasarkan nilai n di mana setiap frame akan mengkonsumsi memori
    fun factorial1(n: Int): Int{
        return if (n == 1){
            n
        }else{
            n * factorial(n - 1)
        }
    }

    val result1 = factorial1(8)
    println(result1)

    //Tail Call Recursion : Yakni sekumpulan urutan instruksi untuk menjalankan tugas tertentu (subroutine) yang dijalankan terakhir pada sebuah prosedur.
    tailrec fun factorial2(n: Int, result: Int = 1): Int{
        val newResult = n * result
        return if (n == 1) {
            newResult
        } else {
            factorial2(n - 1, newResult)
        }
    }

    val result2 = factorial2(8)
    println(result2)
}

/*Ketika sebuah fungsi ditandai dengan modifier tailrec,
maka fungsi tersebut hanya boleh dipanggil untuk dijalankan
terakhir dan tidak boleh digunakan dari dalam blok try-catch-finally.*/