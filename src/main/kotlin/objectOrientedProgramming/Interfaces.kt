package objectOrientedProgramming

//Interfaces Tidak Memiliki Consturctor
//Function Di dalam interface otomatis akan bersifat abstract semua tidak seperti abstract class yang function nya bisa abstract maupun non abstract
interface IFly {

    //Function Abstract Pada Interfaces Wajib Di Override Jika Tidak Akan Error
    fun fly()

    //Properties Pada Interfaces Tidak Bisa Di Inisiasi Langsung Melainkan harus di override
    val numberOfWings: Int
}

class Bird(override val numberOfWings: Int) : IFly{
    override fun fly(){
        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I'm Flying without wings")
    }
}


fun main(){
    val bird = Bird(5)

    bird.fly()

}

/*Abstract kelas digunakan jika kita ingin membuat sebuah basis kelas yang akan diwariskan ke kelas lainnya dengan konsep inheritance.
Sedangkan Intefaces bisa kita gunakan ketika kita ingin membuat sebuah fungsionalitas yang sama untuk beberapa object berbeda*/