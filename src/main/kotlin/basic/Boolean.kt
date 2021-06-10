package basic

fun main(){
    val open = 9
    val closed = 18
    val now = 21

    //Conjuction Atau Operator AND : Operator AND Keduanya Harus Bernilai True Jika Tidak Maka Akan Menghasilkan False
    val isOpen = now > open && now < closed
    println("Toko Sedang Buka : $isOpen")

    //Disjunction Atau Operator OR : Operator And Hanya Perlu Satu Nilai True Dari Evaluasi Untuk Menghasilkan Nilai True
    val issOpen = now > open || now < closed
    println("Toko Sedang Buka : $issOpen")

    //Negatian Atau NOT : Operator NOT Akan Menghasilkan Nilai Sebaliknya Dari Hasil Evaluasi
    val isssOpen = !isOpen
    println("Hasil Negasi : $isssOpen")
}

