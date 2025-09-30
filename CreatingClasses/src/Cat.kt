class Cat {
    fun meow() = "mrrrow!"
}

fun main() {
    val cat = Cat()
    // Call `meow()` for `Cat`
    val m1 = cat.meow()

    println(m1)
}
