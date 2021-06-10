package collection

fun main(){
    /* List bersifat immutable alias tidak bisa diubah.
       Namun jangan khawatir. Kotlin standard library juga menyediakan collection dengan tipe mutable.
       Artinya kita melakukan perubahan pada nilainya seperti menambah, menghapus, atau mengganti nilai yang sudah ada.*/
    val aList = mutableListOf(1, 'A', "Kocak", true)

    aList.add('d') // menambah item di akhir list
    aList.add(1, "love") // menambah item pada indeks ke-1
    aList[3] = "Jamet" // mengubah nilai item pada indeks ke-3
    aList.removeAt(1) // menghapus item User() berdasarkan index atau posisi nilai di dalam Array

    println(aList)
    print(aList[2])
}