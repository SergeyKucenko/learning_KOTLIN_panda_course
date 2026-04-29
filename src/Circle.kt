
import kotlin.math.PI



val smallCircle = Circle(5.2)
val radiusOfSmallCircle: Double = smallCircle.radius
val circumferenceOfSmallCircle = smallCircle.circumference()
val areaOfSmallCircle = smallCircle.area()
val diameterOfSmallCircle = smallCircle.diameter()


class Circle (var radius: Double) {


    fun circumference() = diameter() * PI
    fun area() = PI * radius * radius
    fun diameter() = 2 * radius

}





