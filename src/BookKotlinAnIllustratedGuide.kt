fun main() {


//    ФУНКЦИИ стр 33

    val radius = readln().toDouble();

    val nomNumber = correctRadius(radius)
    println("Окружность равна: $nomNumber")


}

fun correctRadius(radius: Double): Double = 2 * 3.14 * radius
