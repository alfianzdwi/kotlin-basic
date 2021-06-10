package generics.Class

internal class All_in_One<T> {

    //T Adalah Kepanjangan dari Tipe Parameter
    private var manusia: T? = null

    //Function Set Dengan Tipe Parameter T
    fun set(Manusia: T) {
        manusia = Manusia
    }

    //Method Return Get Yang Mengembalikan Nilai Manusia
    fun get(): T? {
        return manusia
    }


}