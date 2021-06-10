package generics.Class


    fun main() {
        //Membuat Instance dan Mendefinisikan Tipe Data String
        val nama = All_in_One<String>()
        nama.set("Wildan")
        println("Nama Saya: ${nama.get()}")

        //Membuat Instance dan Mendefinisikan Tipe Data Integer
        val umur = All_in_One<Int>()
        umur.set(19)
        println("Usia Saya:  ${umur.get()}Tahun")

        //Membuat Instance dan Mendefinisikan Tipe Data Boolean
        val kondisi = All_in_One<Boolean>()
        kondisi.set(true)
        println("Saya Sedang Belajar Kotlin: ${kondisi.get()}" )

        //Membuat Instance dan Mendefinisikan Tipe Data Float
        val IPK = All_in_One<Float>()
        IPK.set(3.5f)
        println("Nilai IPK Saya: ${IPK.get()}")

        //Membuat Instance dan Mendefinisikan Tipe Data Character
        val Karakter = All_in_One<Char>()
        Karakter.set('W')
        println("Huruf Awalan Nama Saya Adalah: ${Karakter.get()}")
    }


    /*disana kita membuat beberapa Instance/Objek dengan tipe data
    yang berbeda beda dengan 1 buah variable didalamnya yaitu Manusia,
    pada variable Manusia kita dapat melakukan apa saja, libih mudah dan praktis bukan*/