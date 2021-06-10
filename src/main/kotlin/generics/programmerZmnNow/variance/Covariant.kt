package generics.programmerZmnNow.variance

//Covariant : Artinya Kita bisa men subtitusi subtype(child) dengan supertype (parent) kata kunci out menandakan covariant
//Dan Parameter type hanya boleh di jadikan return type tidak boleh di jadikan parameter input
class Covariant <out T> (val data: T) {
    fun data(): T {
        return data
    }

    // Tidak boleh membuat fungsi input pada generic covariant
    /*fun setData(value: T){
        data = value
    }
     */
}

fun main(){
    val data: Covariant<String> = Covariant("Alfian")
    val data1: Covariant<Any> = data

    println(data1.data())
}