package chap05.section2.secondary

class Bird constructor(_name: String, _wing: Int, _beak: String, _color: String) {
    var name: String = _name
    var wing: Int = _wing
    var beak: String = _beak
    var color: String = _color

    //constructor(_name: String, _wing: Int, _beak: String, _color: String) {
    //    name = _name
    //    wing = _wing
    //    beak = _beak
    //    color = _color
    //}

    //constructor(_name: String, _beak: String) {
    //    name = _name
    //    wing = 2
    //    beak = _beak
    //    color = "gray"
    //}

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val bird1 = Bird("mybird", 2, "short", "blue")
    //var bird2 = Bird("mybird2", "long")

    println("bird1.name: ${bird1.name}")
    //println("bird2.name: ${bird2.name}")

    //coco.color = "yellow"
    //println("coco.color: ${coco.color}")
    //coco.fly()
    //coco.sing(3)
}
