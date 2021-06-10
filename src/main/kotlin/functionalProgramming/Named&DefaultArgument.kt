package functionalProgramming

fun main(){
    val data = getData(last = 20)
    println(data)
}

//Default Argument : default dari sebuah parameter.Jika kita melewatkan argumen untuk dilampirkan, maka nilai default tersebut lah yang akan digunakan.
fun getData (first: String = "My",
             middle: String = "Age is",
             last: Int = 35):Any{
    return "$first $middle $last"
}