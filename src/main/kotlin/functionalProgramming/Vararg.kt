package functionalProgramming


fun main(){
val data = getData(13,15,20,39,25,24,21, nama = "Alfian")
    println(data)

}


//Vararg : kata kunci vararg untuk menyederhanakan beberapa parameter yang memiliki tipe data yang sama menjadi parameter tunggal.
fun getData(vararg number: Int, nama: String): Any {
    println("Nama Saya : $nama")
    return number.size
}