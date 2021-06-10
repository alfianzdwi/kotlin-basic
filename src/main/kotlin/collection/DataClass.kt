package collection

import java.net.Inet4Address

//Contoh Data Class
data class dataMahasiswa (val name: String, val age: Int, val address: String) {
    fun intro() {
        println("My name is $name, I am $age years old And My City is $address")
    }
}

//Class Pada Umumnya
class  mahasiswa (val name: String, val age: Int)


fun main(){
    var dtMhs = dataMahasiswa("Alfian",20, "Bogor")
    val mhs = mahasiswa("Alfian",20)

    //Menggunakan Fungsi copy() Yang Di Miliki Data Class Dan Juga Memodifikasinya
    val dtMhs1 = dtMhs.copy(age = 21)

    //Destruction Delcaration : Memetakan Sebuah Objek Menjadi Variabel
    val (nama, umur, alamat) = dtMhs

    println(mhs)
    println(dtMhs)
    println(dtMhs1)
    println("Halo,Nama Saya Adalah $nama Umur Saya $umur Tahun Dan Saya Tinggal Di $alamat")
    dtMhs.intro()

}


/*val  nama = dtMhs.component1()
    val umur = dtMhs.component2()
    val alamat = dtMhs.component3()*/