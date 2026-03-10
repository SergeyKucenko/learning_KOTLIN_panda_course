fun main() {


    val temperature = readln().toInt()

    val hot: Boolean = temperature < 25
    val cold = temperature < 20

    if(hot){
        println("AC IS ON")
    } else if (cold) {
        println ("ac is off")
    } else {
        println("ac not work")
    }




//
//    val typeCAR = readln().toBoolean()
//
//    val valuePowerCar = readln().toInt()
//
//    if (typeCAR && valuePowerCar <= 100) {
//        println("Вид ТС: грузовой автомобиль")
//        println("Мощность двигателя: $valuePowerCar л.с.")
//        println("Налоговая ставка: 25 руб./л.с.")
//        println("Сумма налога: ${valuePowerCar * 25} руб.")
//
//    } else if (typeCAR && valuePowerCar > 100 && valuePowerCar <= 150) {
//        println("Вид ТС: грузовой автомобиль")
//        println("Мощность двигателя: $valuePowerCar л.с.")
//        println("Налоговая ставка: 40 руб./л.с.")
//        println("Сумма налога: ${valuePowerCar * 40} руб.")
//    } else if (typeCAR && valuePowerCar > 150 && valuePowerCar <= 200) {
//        println("Вид ТС: грузовой автомобиль")
//        println("Мощность двигателя: $valuePowerCar л.с.")
//        println("Налоговая ставка: 50 руб./л.с.")
//        println("Сумма налога: ${valuePowerCar * 50} руб.")
//    } else if (typeCAR && valuePowerCar > 200 && valuePowerCar <= 250) {
//        println("Вид ТС: грузовой автомобиль")
//        println("Мощность двигателя: $valuePowerCar л.с.")
//        println("Налоговая ставка: 65 руб./л.с.")
//        println("Сумма налога: ${valuePowerCar * 65} руб.")
//    } else if (typeCAR && valuePowerCar >= 250) {
//        println("Вид ТС: грузовой автомобиль")
//        println("Мощность двигателя: $valuePowerCar л.с.")
//        println("Налоговая ставка: 85 руб./л.с.")
//        println("Сумма налога: ${valuePowerCar * 85} руб.")
//    }
//
//
//
//
//
//    if (!typeCAR && valuePowerCar <= 100) {
//        println("Вид ТС: легковой автомобиль")
//        println("Мощность двигателя: $valuePowerCar л.с.")
//        println("Налоговая ставка: 10 руб./л.с.")
//        println("Сумма налога: ${valuePowerCar * 10} руб.")
//
//    } else if (!typeCAR && valuePowerCar > 100 && valuePowerCar <= 150) {
//        println("Вид ТС: легковой автомобиль")
//        println("Мощность двигателя: $valuePowerCar л.с.")
//        println("Налоговая ставка: 34 руб./л.с.")
//        println("Сумма налога: ${valuePowerCar * 34} руб.")
//    } else if (!typeCAR && valuePowerCar > 150 && valuePowerCar <= 200) {
//        println("Вид ТС: легковой автомобиль")
//        println("Мощность двигателя: $valuePowerCar л.с.")
//        println("Налоговая ставка: 49 руб./л.с.")
//        println("Сумма налога: ${valuePowerCar * 49} руб.")
//    } else if (!typeCAR && valuePowerCar > 200 && valuePowerCar <= 250) {
//        println("Вид ТС: легковой автомобиль")
//        println("Мощность двигателя: $valuePowerCar л.с.")
//        println("Налоговая ставка: 75 руб./л.с.")
//        println("Сумма налога: ${valuePowerCar * 75} руб.")
//    } else if (!typeCAR && valuePowerCar >= 250) {
//        println("Вид ТС: легковой автомобиль")
//        println("Мощность двигателя: $valuePowerCar л.с.")
//        println("Налоговая ставка: 150 руб./л.с.")
//        println("Сумма налога: ${valuePowerCar * 150} руб.")
//    }
}


