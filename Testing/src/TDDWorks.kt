package testing3
import atomictest.eq

fun main() {
    // Now everything fails
    //
    // This failure is because all our values are of type `Int` and
    // dividing an `Int` value by a larger `Int` value produces zero.
    calculateBMI(160.0, 68.0) eq "Normal weight"
    calculateBMI(100.0, 68.0) eq "Underweight"
    calculateBMI(200.0, 68.0) eq "Overweight"
}

fun calculateBMI(lbs: Double, height: Double): String  {
    val bmi = lbs / (height * height) * 703.7
    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}
