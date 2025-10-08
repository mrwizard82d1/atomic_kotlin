import atomictest.eq

fun main() {
    val ints = listOf(99, 3, 5, 7, 11, 13)
    ints eq "[99, 3, 5, 7, 11, 13]"

    // Select each element in the list
    var result = ""
    for (i in ints) {
        result += "$i "
    }
    result eq "99 3 5 7 11 13"

    // "Indexing" into the List:
    ints[4] eq 11
}
