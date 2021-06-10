package objectOrientedProgramming
import kotlin.reflect.KProperty

/*Delegation :  kelas yang memang bertugas untuk mengatur atau
mengelola fungsi getter dan setter untuk sebuah properti kelas.
Teknik tersebut pada Kotlin dinamakan Delegate.*/

class Delegate {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal {
    var name: Any by Delegate()
    var age: Any by Delegate()
    var isReptil: Any by Delegate()
}

class Person {
    var name: Any by Delegate()
}

class Hero {
    var name: Any by Delegate()
}


fun main(){
    val animal = Animal()
    animal.name = "Komodo"
    animal.age = 15
    animal.isReptil = true

    println("Nama Hewan : ${animal.name}")
    println("Umur Hewan : ${animal.age} Tahun")
    println("Komodo Adalah Reptil $animal.isReptil")

    println("=================================================================================")
    val person = Person()
    person.name = "Alfian"
    println("Nama Orang : ${person.name}")

    println("=================================================================================")
    val hero = Hero()
    hero.name = "Cleric"
    println("Nama Hero : ${hero.name}")

}