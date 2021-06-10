package generics
import java.lang.reflect.Array.get



fun main() {
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)
}
   //Tipe Parameter //Tipe Argument
class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}


interface List<T> {
    operator fun get(index: Int): T
}
