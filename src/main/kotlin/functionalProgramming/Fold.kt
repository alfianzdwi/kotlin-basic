package functionalProgramming

fun main(){
    /*Fold : Dengan fungsi fold, kita bisa dengan mudah melakukan perhitungan setiap nilai yang berada di dalam sebuah collection tanpa harus melakukan iterasi item tersebut satu-persatu*/
    val numbers = listOf(1, 2, 3, 4, 10)
    val fold = numbers.fold(20) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current * item
    }
    println("Fold result: $fold")
}