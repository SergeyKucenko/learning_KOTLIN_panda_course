fun main() {









//_____________________________________________________________________________________________
//    2.15 Целочисленные типы Long Short Byte








//_____________________________________________________________________________________________
    //   2.14 Диапазоны Ranges


//    val chislo1 = readln().toInt()
//
//    val chislo2 = readln().toInt()
//
//    val numbers = chislo1..chislo2 step 8
//
//    for (number in numbers) {
//
//        println("$number")
//    }

//_____________________________________________________
//    val numbers = 0..1000 step 2
//    println("Enter your number")
//    val chislo = readln().toInt()
//
//    if(chislo !in numbers){
//        println("Number is not in range")
//    } else {
//        println("Number in the range")
//    }


//_____________________________________________________
//    val numbers = 0..1000 step 10
//
//    for (number in numbers) {
//
//        println("$number")
//    }


//_____________________________________________________________________________________________
//    2.13 Цикл for и свойство size

//    val brands = listOf<String>("lada", "bmw", "tesla", "Toyota", "volvo")
//
//    val marka = readln()
//    var foundBrand = false
//
//    for (carBrand in brands) {
//        if (carBrand == marka) {
//            foundBrand = true
//        }
//    }
//    println(foundBrand)
//

//_____________________________________________________
//    val numbers = listOf<Int>(1, 78, 9, 10, 12, 132, 41, 86, 88, 55)
//
//    for (number in numbers) {
//        if (number % 2 == 0) {
//            println("$number")
//        }
//    }

    //_____________________________________________________
//    val names = listOf<String>("John", "Mike", "Nick", "Helen", "Alex", "Emma")
//    println("Enter your Name")
//    val searchName = readln()
//    var nameFound = false
//
//
//    for(name in names){
//        println(name)
//        if (searchName in name) {
//            nameFound = true
//            break
//        }
//    }
//
//    println("Name is Found : $nameFound")
//
//_____________________________________________________
//    val names = listOf<String>("John", "Mike", "Nick", "Helen", "Alex", "Emma")
//    println("Enter your Name")
//    val searchName = readln()
//    var nameFound = false
//    var index = 0
//
//    while (index < names.size) {
//        println(names[index])
//        if (searchName == names[index]) {
//            nameFound = true
//            break
//        }
//        index++
//    }
//
//    println("Name is Found : $nameFound")


//_____________________________________________________________________________________________

// 2.12 Циклы Repeat и While

//    val number = readln().toInt()
//
//    var sum = 0
//
//    var currentNumber = 1
//
//
//    while (currentNumber <= number) {
//    sum+= currentNumber
//        currentNumber++
//    }
//    println("Сумма чисел от 1 до $number равна $sum")


//____________________________________________
//    val correctNumber = Random.nextInt(100)
//
//    var win = false
//
//    while(!win){
//        print("Любое число от 1 до 100?")
//        val number = readln().toInt()
//
//        if (number < correctNumber) {
//            println("Ваше чиcло меньше")
//        } else if (number > correctNumber) {
//            println("Ваше число больше")
//        } else {
//            win =true
//            println("Вы угадали!")
//        }
//    }
//

//_____________________________________________________________________________________________

//    var temperature = readln().toInt()
//    var airConditionIsOn = false
//
//
//    if (temperature > 20) {
//        airConditionIsOn = true
//
//    } else if (temperature < 20) {
//        airConditionIsOn = false
//    }
//    if(airConditionIsOn){
//        temperature -= 5
//    } else{
//        temperature += 5
//    }
//
//    println("Air condition corrent temperature: $temperature")
//
//    if(temperature > 25 ) {
//        airConditionIsOn = true
//    } else if (temperature<20) {
//        airConditionIsOn=false
//    }
//
//    if(airConditionIsOn) {
//        temperature-=5
//    } else{
//        temperature+=5
//    }
//println("corrent temperature: $temperature ")

//_____________________________________________________________________________________________



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
//_____________________________________________________________________________________________

}


