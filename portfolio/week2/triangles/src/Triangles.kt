// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(t: Triangle): Boolean {
    val (a, b, c) = t
    return a < b + c && b < a + c && c < a + b
}

fun triangleArea(t: Triangle): Double {
    val (a, b, c) = t
    val s = (a + b + c) / 2
    return sqrt(s * (s - a) * (s - b) * (s - c))
}
