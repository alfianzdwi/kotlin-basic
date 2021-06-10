package objectOrientedProgramming

class Kendaraan(
    val jenis: String,
    val warna: String,
    val speed: Int,

){
    fun maju(){
        println("$jenis Maju Jalan Dengan Kecepatan $speed Km/h")
    }
    fun rem(){
        println("$jenis Warna $warna Nge-Rem!!")
    }
    fun belok(){
        println("$jenis Belok Kiri")
    }

}


fun main() {
    val mobil = Kendaraan("Mobil", "Merah", 70)
    println("Jenis Kendaraan : ${mobil.jenis}, Warna : ${mobil.warna}, Kecepatan : ${mobil.speed} Km/h")
    mobil.maju()
    mobil.rem()
    mobil.belok()

}