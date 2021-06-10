package objectOrientedProgramming

open class Animaals(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }
}

class Cat : Animaals("Kucing",4.5,2,false){

}

class Komodo : Animaals("Komodo",154.7,15,true){

}

class Fish : Animaals("Ikan",0.5,1,false){

}
fun main(){
    val cat = Cat()
    cat.eat()
    cat.sleep()
    println("======================================")
    val komodo = Komodo()
    komodo.eat()
    komodo.sleep()
    println("======================================")
    val fish = Fish()
    fish.eat()
    fish.sleep()
}