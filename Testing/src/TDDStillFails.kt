package testing2
import atomictest.eq

fun main() {
    // Now everything fails
    //
    // This failure is because all our values are of type `Int` and
    // dividing an `Int` value by a larger `Int` value produces zero.
    calculateBMI(160, 68) eq "Normal weight"
    calculateBMI(100, 68) eq "Underweight"
    calculateBMI(200, 68) eq "Overweight"
}

fun calculateBMI(lbs: Int, height: Int): String  {
    val bmi = lbs / (height * height) * 703.7
    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}
