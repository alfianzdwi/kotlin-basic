package functionalProgramming

data class Item(val key: String, val value: Any)
val items = listOf(
    Item("1", "Kotlin"),
    Item("2", "is"),
    Item("3", "Awesome"),
    Item("3", "as"),
    Item("3", "Programming"),
    Item("3", "Language")
)


fun main(){

    //Silce : Adalah Fungsi yg bisa di manfaatkan jika kita ingin menyaring item dari posisi tertentu
    val numbers = listOf<Int>(1,3,6,9,12,15,18,21,24)
    val slice = numbers.slice(3..7 step 3)
    println(slice)
    //Jika ingin menentukan posisi yang lebih spesifik,kita bisa mendefinisikannya di dalam sebuah collection
    val index = listOf(2, 3, 5, 8)
    val sliceSpecified = numbers.slice(index)
    println(sliceSpecified)

    //Distinct : untuk menyaring item yang sama
    val total = listOf(1, 2, 1, 3, 4, 5, 2, 2, 2, 3, 4, 5)
    val distinct = total.distinct()
    println(distinct)
    // Untuk Menyaring dengan spesifik
    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct1 = text.distinctBy {
        it.length
    }
    println(distinct1)

    //Chunked : fungsi chunked() bisa kita gunakan untuk memecah nilai String menjadi beberapa bagian kecil dalam bentuk Array
    val word = "QWERTY"
    val chunked = word.chunked(2){
        it.toString().toLowerCase()
    }
    println(chunked)

}