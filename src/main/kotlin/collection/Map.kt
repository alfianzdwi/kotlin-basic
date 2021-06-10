package collection

fun main(){
    val city = mapOf(
        "Jakarta" to "DKI Jakarta",
        "Bogor" to "Jawa Barat",
        "Solo" to "Jawa Tengah"
    )

    //Saat menggunakan simbol [ ] atau indexing,konsol akan menampilkan hasil null saat key yang dicari tidak ada di dalam Map
    println(city["Bogor"])
    //Saat kita menggunakan getValue(), konsol akan memberikan sebuah Exception.
    println(city.getValue("Solo"))

    val mapKeys = city.keys
    val mapValues = city.values
    println(mapKeys)
    println(mapValues)

    //Mengubah Map Menjadi Mutable Map Agar Bisa Menambahkan Key Dan Value Nya
    val mCity = city.toMutableMap()
    mCity.put("Amsterdam", "Netherlands")
    mCity.put("Berlin", "Germany")

    println(mCity)
}