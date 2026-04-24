//val smallCircle = Circle(5.2)
//val mediumCircle = Circle(6.7)
//val largeCircle = Circle(10.0)

val smallCircle = Circle(5.2)
val radiusOfSmallCircle: Double = smallCircle.radius
val circumferenceOfSmallCircle = smallCircle.circumference()
val areaOfSmallCircle = smallCircle.area()
val diameterOfSmallCircle = smallCircle.diameter()


class Circle (var radius: Double) {
    private val pi: Double = 3.14

    fun circumference() = diameter() * pi
    fun area() = pi * radius * radius
    fun diameter() = 2 * radius

}





