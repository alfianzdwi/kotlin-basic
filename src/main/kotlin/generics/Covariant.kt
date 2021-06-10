package generics

/*Ketika kita menandai sebuah tipe parameter dengan kata kunci out maka nilai dari tipe
parameter tersebut hanya bisa diproduksi seperti menjadikanya sebagai return type */

interface Liist<out E> : Collection<E> {
    operator fun get(index: Int): E
}