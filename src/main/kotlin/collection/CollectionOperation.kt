package collection

fun main(){
    //Filter Dan FilterNot : fungsi tersebut akan menghasilkan list baru dari seleksi berdasarkan kondisi yang kita berikan
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }
    val notEvenList = numberList.filterNot { it % 2 == 0 }

    println(evenList)
    println(notEvenList)

    //Map : Fungsi ini akan membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya
    val mList = numberList.map { it * 5 }

    println(mList)

    //Count : Fungsi count() dapat kita gunakan untuk menghitung jumlah item yang ada di dalam collection.
    println(numberList.count())

    //Find & firsOrNull & lastOrNull : Fungsi yang digunakan untuk mencari item pada sebuah collection
    //fungsi find() dan firstOrNull() ini akan langsung mengembalikan nilai ketika kondisi terpenuhi tidak seperti filter/map yang melakukan iterasi ke semua value
    val firstOddNumber = numberList.find { it % 2 == 0 }
    val firstOrNullNumber = numberList.firstOrNull { it * 2 == 10 }

    println(firstOddNumber)
    println(firstOrNullNumber)

    //First & Last : Hampir sama seperti fungsi firstOrNull() dan lastOrNull(), fungsi first() dan last() digunakan untuk menyaring item pertama atau terakhir dari sebuah collection
    val moreThan6 = numberList.first { it > 6 }
    println(moreThan6)

    //Sum : Untuk Menjumlahkan Semua Value Yang Ada Pada list,Hanyya Bisa Di Gunakan Jika Valuenya Angka
    println(numberList.sum())

    //Sorted : Untuk Mengurutkan Value
    val kotlinChar = listOf(2, 5, 1, 0, 11, 3)
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)
}