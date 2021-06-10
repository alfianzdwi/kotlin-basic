package objectOrientedProgramming

class Motor{
    var merk: String = "Honda"

        //Get : Memanggil value
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }

        //Set : Merubah Value
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

fun main(){
    val motor = Motor()
    println("Merk Motor : ${motor.merk}")
    println("=====================================")
    motor.merk = "Yamaha"
    println("Merk Motor : ${motor.merk}")
}