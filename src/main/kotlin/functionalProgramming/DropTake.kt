package functionalProgramming


fun main(){

    //Drop : Adalah fungsi yang bisa kita manfaatkan untuk memangkas item yang berada di dalam sebuah objek collection berdasarkan jumlah yang kita tentukan
    val numbers = listOf(1,5,10,15,20,25,30)
    val drop = numbers.drop(4)
    val dropLast = numbers.dropLast(4)
    println(drop)
    println(dropLast)

    //Take : Adalah fungsi yang bisa kita manfaatkan untuk menyaring item yang berada di dalam sebuah objek collection.
    val take = numbers.take(2)
    val takeLast = numbers.takeLast(2)
    println(take)
    println(takeLast)
}