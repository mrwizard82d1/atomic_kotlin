class House {
    var sofa : String = ""
}

fun main() {
    val house = House()
    house.sofa = "Simple sleeper sofa: $89.00"
    println(house.sofa)

    house.sofa = "New leather sofa: $3,099.00"
    println(house.sofa)

    // Cannot reassign `val house` to a new instance of a `House`
    // house = House()
}