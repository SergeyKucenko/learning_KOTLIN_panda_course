fun main() {


    println ("The wear is good?")
    val isGoodWeather = readln().toBoolean()
    println ("What time is it ? ")
    val time = readln().toInt()

    val isDay = time < 22 && time > 5


    if (isDay && isGoodWeather) {
        println("Go walk ! ")
    } else if (isDay && !isGoodWeather) {
        println("Dont walk !")
    } else {
        println("Go to sleep")
    }


}

