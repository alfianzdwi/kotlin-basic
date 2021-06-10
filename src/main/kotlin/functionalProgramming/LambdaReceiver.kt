package functionalProgramming

fun main(){
    //Eksekusi 1
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }
    println(message)

    //Eksekusi 2
    println(true.toJavanese())
}
//Contoh 1
fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

//Contoh 2
val toJavanese: Boolean.() -> String = { if(this) "Bener" else "Guduk" }


