package chap05.section2.init

class Bird(var name: String = "NONAME", var wing: Int = 2, var beak: String, var color: String) {

    init {
        println("-------------- start init block -------------------")
        println("name $name, beak $beak")
        this.sing(3)
        println("-------------- end init block -------------------")
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    //val coco = Bird("mybird", 2, "short", "blue")
    val coco = Bird(beak = "long", color = "red")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
}
