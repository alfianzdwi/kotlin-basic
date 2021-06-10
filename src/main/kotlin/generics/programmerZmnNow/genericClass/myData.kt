package generics.programmerZmnNow.genericClass

// T Hanya Keyword Saja Dan Parameter Type Pada Generic Bisa Lebih Dari Satu
class myData <T, U> (val firstData: T, val secondData: U){

    fun getFirst():T = firstData

    fun getSecond():U = secondData

    fun printData(){
        println("Data is $firstData, $secondData")
    }
}

fun main(){
    //Menginstance Class Generic
    val dataStr: myData<String,Boolean> = myData<String,Boolean> ("Alfian",true)
    dataStr.printData()

    //Kotlin Juga Bisa Mendeteksi Tipe Data Tanpa Kita Hrus Menuliskannya Secara Eksplisit
    val dataInt = myData(5000,'A')
    dataInt.printData()

}

