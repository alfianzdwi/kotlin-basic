package collection

fun main(){

    //Set Akan Menghidarkan Dari Nilai Yang Duplikat,Urutan Tidak Penting Di Dalam Set
    val setA = setOf(1, 2, 5, 7, 9, 9, 9, 5)
    val setB = setOf(5, 9, 12, 15, 21, 24)
    val setC = setOf('A', 'B', 'C', 'D', 'D', 'B')

    //Fungsi union dan intersect untuk mengetahui gabungan dan irisan dari 2 (dua) buah Set
    val union = setA.union(setB)
    val intersect = setA.intersect(setB)

    println(setC)
    println(union)
    println(intersect)

    //Mengubah Set Biasa Menjadi Mutable Set agar kita bisa menambah dan menghapus item
    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 // tidak bisa mengubah set immutable,Set tidak dapat di ubah walaupun sudah mutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1

    println(mutableSet)

}