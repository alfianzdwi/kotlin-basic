package generics.programmerZmnNow.perbedaan

class Datta (val data: Any)

//Jika Tanpa Generic Tidak Ketahuan Errornya Jika value yg di isi tidak sesuai dengan tipe data nya
fun main(){
    val name = Datta(10)
    val result: String = name.data as String
    println(result)

    val age = Datta(20)
    val resultt: Int = age.data as Int
    println(resultt)
}