class Alien(name: String) {
    val greeting = "Poor $name!"
}

fun main() {
    // val alien = Alien() // Error
    val alien = Alien("Mr. Meeseeks")
    println (alien.greeting)
    // alien.name // Another error
}