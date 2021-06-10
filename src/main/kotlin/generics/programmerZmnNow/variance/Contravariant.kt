package generics.programmerZmnNow.variance


//Covariant : Artinya Kita bisa men subtitusi  supertype (parent) dengan subtype(child) nya,kata kunci in menandakan covariant
//Dan Hanya di perbolehkan untuk menerima input data generic nya saja
class Contravariant <in T>{
    fun sayHello (value: T){
        println("Hello $value")
    }

    //Tidak Boleh Membuat fungsi return pada generic Contravariant
    /*fun get(): T{
        return data
    }*/
}

fun main(){
    val data: Contravariant<Any> = Contravariant()
    val data1: Contravariant<String> = data

    data1.sayHello("Alfian")
    //data1.get() //error
}