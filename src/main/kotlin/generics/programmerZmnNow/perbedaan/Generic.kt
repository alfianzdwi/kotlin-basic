package generics.programmerZmnNow.perbedaan

class Data <T>(val data: T)

fun main(){
    val name = Data<String>("Alfian")
    val result = name.data
    println(result)

    val age = Data<Int>(20)
    val resultt = age.data
    println(resultt)
}