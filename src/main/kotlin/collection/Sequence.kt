package collection

// eager evaluation yakni "Kita kerjakan dulu semua elemen pada suatu proses terlebih dahulu lalu lanjut ke proses berikutnya"
fun eagerEvaluation(){
    val list = (1..10).toList()
    list.filter { println("filter -> $it") ; it % 2 == 0}
        .map{ println("map $it * 2 -> ${it * 2}")  ; it * 2 }
        .first{ println("first -> $it") ; it ==  4}
}

//lazy evaluation adalah "kita kerjakan semua proses pada sebuah elemen terlebih dahulu lalu lanjut ke elemen berikutnya jika masih memungkinkan"
fun lazyEvaluation(){
    val list = (1..5).toList()
    list.asSequence().filter { println("filter -> $it") ; it % 2 == 0}
        .map{ println("map $it * 2 -> ${it * 2}")  ; it * 2 }
        .first{ println("first -> $it") ; it ==  4 }
}


fun main() {
    println("EAGER EVALUATION")
    eagerEvaluation()
    println("===============================")
    println("LAZY EVALUATION")
    lazyEvaluation()


    //Membuat Objek Sequence
    val sequenceNumber = generateSequence(11) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }

}
