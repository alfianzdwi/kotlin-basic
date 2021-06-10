package generics.programmerZmnNow.variance

class Invariant <T> (val data: T)

//Secara Default Paramater Type kita Bersifat Invariant
//Invariant Artinya Tidak Boleh Di Subtitusi oleh subtype(child) atau supertype(parent)

fun main(){
    val data: Invariant<String> = Invariant ("Hello")
    //val data1: Invariant<Any> = data //Seandaikan Bisa
    //data1.Invariant = 100 //bahaya
}