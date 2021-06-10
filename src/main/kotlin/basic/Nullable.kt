package basic

fun main(){
    /*Error Karena Variable Tidak Boleh Bernilai Null Tambahkan Tanda Tanya Agar Objek Boleh Bernilai Null
    var name: String = null*/

    /* ?  Safe Calls kompiler akan melewatkan proses jika objek tersebut bernilai null
    *  ?: Elvis Operator untuk menetapkan default value atau nilai dasar jika objek bernilai null. */

    var name: String? = null
    name = "Alfian Dwi Prayoga"
    println(name?.length ?:8)

    var nilai: Int? = null
    nilai = 20
    val getNilai = nilai ?: 7
    println(getNilai * 2)



    /*if (name !== null){
        val namele = name.length
    }*/


}