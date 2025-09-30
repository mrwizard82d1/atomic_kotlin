class Sofa {
    val cover: String = "Love seat cover"
}

fun main() {
    var sofa = Sofa()
    // Not allowed:
    // sofa.cover = "New cover"

    // But `sofa`, a `var`, can be reassigned.
    sofa = Sofa()
}
