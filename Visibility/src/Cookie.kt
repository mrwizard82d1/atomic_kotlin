// Privacy is most commonly used for members of a class:

class Cookie (
    private var isReady: Boolean
) {
    private fun crumble() =
        println("crumble")

    public fun bite() =
        println("bite")

    // Public by "default"
    fun eat() {
       isReady = true
       crumble()
       bite()
    }
}

fun main() {
    val x = Cookie(false)
    x.bite()

    // Cannot access private members
    // x.isReady()
    // x.crumble()
    x.eat()
}
