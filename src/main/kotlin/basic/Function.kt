package basic

fun main (){
  val sh = sayHello("Alfian",20)
   println(sh)

   val sgt = segitiga(15,10)
   println("Luas Segitiga Adalah $sgt")

   yourName("Zartan")
}

//Jika Function Hanya Memiliki Satu Exxpressio Bisa Langsung Seperti Ini
fun sayHello(name: String,umur: Int) = "Hello My Name Is $name And My Age This Year $umur"

//Function Dengan Nilai Kembalian
fun segitiga(alas: Int, tinggi: Int): Double {
   return alas*tinggi*0.5
   }

//Function Tanpa Nilai Kembalian
fun yourName(name: String):Unit {
   println("Your Name Is $name ")
}


