package functionalProgramming

fun main(){
    //Eksekusi1
    val result = printResult(10 , kali)

    //Eksekusi2
    println(hello("Alfian", toUpper))
    //Trailing Lambda : jika argumen terakhir dari fungsi merupakan sebuah lambda expression, maka lambda expression tersebut ditempatkan di luar parenthesis ()
    val result1 = hello("ALFIAN"){value:String -> value.toLowerCase()}
    println(result1)
}

//Contoh 1
fun printResult (value: Int, kali: (Int) -> Int){
    val result = kali(value)
    println(result)
}
val kali: (Int) -> Int =  {value -> value * value }

//Contoh 2
fun hello(name:String, trasnfom: (String) -> String ):String {
    val nameTransform = trasnfom(name)
    return "Hello $nameTransform"
}
val toUpper = {value:String -> value.toUpperCase()}



/*Konsep ini dinamakan sebagai Higher-Order Function, yaitu sebuah
fungsi yang menggunakan fungsi lainnya sebagai parameter,
menjadikan tipe kembalian, ataupun keduanya. */