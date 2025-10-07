package exceptions

fun erroneousCode() {
    // Uncomment the next line to get an exception:
    val i = "1$".toInt()
}

fun main() {
    erroneousCode()
}
