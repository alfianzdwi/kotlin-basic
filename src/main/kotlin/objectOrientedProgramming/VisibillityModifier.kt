package objectOrientedProgramming

                                    //Protected modifier
open class Kendaraan1 (val name:String,protected val warna:String)

//Public Modifier            //Private Modifier                                //Mengakses Protected Melalui Kelas Turunannya
class Mobil(val merk:String ,private var speed:Int) : Kendaraan1 ("Mobil","Merah")
{

    //Untuk Mengambil Property Yang Modifierya private
    fun getSpeed() : Int {
        return speed
    }

    //Untuk merubah Property yang Modifiernya private
    fun setSpeed(newSpeed: Int) {
        speed = newSpeed
    }
}


fun main(){
    var mobil = Mobil("BMW",2000)

    //Bisa Di Akses Karena Public
    println(mobil.merk)

    //Tidak Bisa Di Akses Karena Private Harus Di Akses Melalui Fungsi Get
    //println(mobil.speed)
    println("Max Speed : ${mobil.getSpeed()}")

    //Mengubah Nilai Speed
    mobil.setSpeed(4300)
    println("Max Speed : ${mobil.getSpeed()}")

    //Tidak Mengakses Property mobil.warna yang modifiernya protected dari luar kelas
    println("Jenis Kendaraan : ${mobil.name}, Warna : $mobil.warna ")
}

/*
Public: Hak akses yang cakupannya paling luas. Anggota yang diberi modifier ini dapat diakses dari manapun.
Private: Hak akses yang cakupannya paling terbatas. Anggota yang menerapkannya hanya dapat diakses pada scope yang sama.
Protected: Hak akses yang cakupannya terbatas pada hirarki kelas. Anggota hanya dapat diakses pada kelas turunannya atau kelas itu sendiri.
Internal: Hak akses yang cakupannya terbatas pada satu modul. Anggota yang menggunakannya tidak dapat diakses diluar dari modulnya tersebut.
*/













