package controlFlow

//Step Adalah Jumlsh Range Yang Akan Di lewati atau Di Langkahi
fun main(){
    val nilai = 1..10 step 3
    if ( 5 in nilai){
        println("Nilai Berada Di Dalam Range")
    }else{
        println("Nilai Tidak Berada Di Dalam Range")
    }
}