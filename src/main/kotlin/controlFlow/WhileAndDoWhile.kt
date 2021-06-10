package controlFlow

fun main(){

    /*while : While bersifat Entry Controlled Loop. Artinya, kondisi yang diberikan akan dievaluasi terlebih dahulu.
     Jika kondisi tersebut terpenuhi maka proses perulangan akan dijalankan.
     Jika kondisi yang diberikan tidak terpenuhi sejak awal maka proses perulangan tidak akan dijalankan. */

    var i = 1
    while ( i <= 10){
        println("Alfian")
        i++
    }

    /*Do While : Bersifat Exit Controlled Loop di mana proses perulangan akan langsung dijalankan di awal.
                 Jika telah selesai, barulah kondisi yang diberikan akan dievaluasi.*/
    var j = 1
    do {
        println(j)
        j++
    }while (j <= 20)

}