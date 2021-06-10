package basic

fun  main(){
    val nilai = 50
    val keterangan: String

    keterangan = if (nilai >= 90){
        "Selamat Anda Mendapatkan Nilai A"
    }
    else if(nilai >= 80){
        "Selamat Anda Mendapatkan Nilai B"
    }
    else if(nilai >= 60){
        "Selamat Anda Mendapatkan Nilai C"
    }else{
        "Maaf Anda Belum Lulus"
    }

    println(keterangan)
}
