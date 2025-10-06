class Scientist(val name: String) {
    override fun toString() = "Scientist('$name')"
}

fun main() {
    val zeep = Scientist("Zeep Xanflorp")
    println(zeep)
}
