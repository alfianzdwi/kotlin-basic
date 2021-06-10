package generics.programmerZmnNow.genericFunction

//Generic Param type yg kita deklarasikan di function hanya bisa di akses di function tersebut,tidak bisa di luar function
//Artinya Parameter type Function Satu Dan Function Lain Tidak Ada Hubungannya
class Function (val name: String) {

    fun <T> sayHello (param: T){
        println("Hello $param, My Name is $name")
    }


}

fun main(){
    val function = Function("Alice")
    function.sayHello<String>("Jordi")
    function.sayHello<Char>('A')


}