package basic.typeData

fun main(){
    //String : Tipe Data Untuk Menyimpan Value Berupa Teks Berapapun Panjangnnya
    val namaDepan: String = "Alfian "
    val namaBelakang = "Dwi Prayoga"

    val namaLengkap = namaDepan + namaBelakang
    println("Nama Lengkap Saya Adalah "+namaLengkap)

    //Char In String
    for (char in namaDepan){
        print("$char ")
    }
    println("")
    //Numbers : Tipe Data Untuk Menyimpan Value Berupa Angka
    val angka1: Int = 3
    var angka2 = 55

    val hasil = angka1 * angka2
    println("Hasil Dari Perkalian $angka1 Dan $angka2 Adalah "+hasil)

    //Char : Tipe Data Untuk Menyimpan Teks,Tapi Hanya Dapat Menyimpan Nilai Tunggal Tidak Bisa Lebih Dari Satu
    var kode: Char = 'A'

    //Pada Tipe Data Char Kita Bisa Melakukan Increment ++ Dan Decrement --

    println("Huruf : "+ kode++)
    println("Huruf : "+ kode++)
    println("Huruf : "+ kode++)
    println("---------")
    println("Huruf : "+ kode--)
    println("Huruf : "+ kode--)
    println("Huruf : "+ kode--)
    println("Huruf : "+ kode--)

}
