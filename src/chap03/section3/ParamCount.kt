package chap03.section3

fun main() {
    noParam({"Hello World!"})
    noParam {"Hello World!"}

    oneParam({ a -> "Hello World! $a" })
    oneParam { a -> "Hello World! $a" }
    oneParam { "Hello World! $it" }

    moreParam { a, b -> "Hello World! $a $b" }
    moreParam { _, b -> "Hello World! $b"}

    withArgs("Arg1", "Arg2", { a, b -> "Hello World! $a $b" })
    withArgs("Arg1", "Arg2") { a, b -> "Hello World! $a $b" }

    twoLambda({ a, b -> "First $a $b" }, { "Second $it" })
    twoLambda({ a, b -> "First $a $b" }) { "Second $it" }
}

fun noParam(out: () -> String) = println(out())

fun oneParam(out: (String) -> String): Unit {
    println(out("OneParam"))
}

fun moreParam(out: (String, String) -> String): Unit {
    println(out("OneParam", "TwoParam"))
}

fun withArgs(a: String, b: String, out: (String, String) -> String): Unit {
    println(out(a, b))
}

fun twoLambda(first: (String, String) -> String, second: (String) -> String ): Unit {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}

