package objectOrientedProgramming.Inheritances

open class Rectangle {
    open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"
}

class FilledRectangle : Rectangle() {
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }

    val fillColor: String get() = super.borderColor
}

fun main(){
    val bgDatar = FilledRectangle()

    bgDatar.draw()
    println(bgDatar.fillColor)
}