package controlFlow

enum class Startup (val umur: Int, val ceo: String) {
    Dicoding(6, "Narendra Wicaksono"),
    Google(22, "Sundar Pichai"),
    Facebook(17, "Mark Zuckerberg")
}

fun main() {
    val infoCompany = Startup.valueOf("Google") //Saya memanggil objek enum dengan nama "Dicoding"
    println("1) Variabel infoCompany memiliki tipe data : '${infoCompany.javaClass}'")
    println("2) Nama perusahaan yang dipilih adalah ${infoCompany.name}. " +
            "Umur-nya adalah ${infoCompany.umur} dan CEO-nya adalah ${infoCompany.ceo}")
}

/*fungsi valueOf() bukan hanya Untuk mendapatkan nama dari sebuah objek enum, tetapi
fungsinya adalah untuk mendapatkan objek enum Beserta Value2 nya melalui nama objek tersebut dari sebuah class enum.*/