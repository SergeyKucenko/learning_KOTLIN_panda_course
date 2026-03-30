fun main() {



////_____________________________________________________________________________________________
//    2.18 Do while и split

//    Напишите программу, которая складывает числа введенные пользователем и выводит результат в консоль.
//
//    Обратите внимание что пользователь вводит числа в одну строку.
//
//    Для решения вам потребуется использовать метод split()

//    val numbers = readln().split(" ")
//
//    var sum = 0
//
//    for (num in numbers) {
//
//        sum += num.toInt();
//    }
//    println(sum)
//

//_____________________________________________________
//    val daysOfWeekString = "Monday,Tuesday,Wednesday,Thursday,Friday,Saturday"
//
//    val daysOfWeek = daysOfWeekString.split(",")
//
//    for(day in daysOfWeek){
//        println(day)
//    }


//_____________________________________________________
//    var count = readln().toInt()
//
//    do {
//        println("Hello")
//        count--
//    } while (count > 0)

////_____________________________________________________________________________________________
//    2.17 Символьный тип данных

//    val password = readln().toCharArray()
//
//    var symbolIsValid = false
////  var contaiInNotValid = false
//
//    for (symbol in password) {
//        if (symbol == 'Ъ') {
//            symbolIsValid = true
//        }
//    }
//
//    if(symbolIsValid){
//        println("У вас идеальный пароль!")
//    } else{
//        println("Опс! В вашем пароле кое-чего не хватает.")
//    }

//_____________________________________________________
//    println("Enter password: ")
//
//    val password = readln().toCharArray()
//
//    var containsLetter = false
//    var containsDigit = false
//    var cotainsSpecialSymbol = false
//
//    for (symbol in password) {
//        if (symbol.isLetter()) {
//            containsLetter = true
//        }
//        if (symbol.isDigit()) {
//            containsLetter = true
//        }
//        if (!symbol.isLetterOrDigit()) {
//            containsLetter = true
//        }
//
//    }
//    if (containsLetter && containsDigit && cotainsSpecialSymbol && password.size >= 8) {
//        println("pASSWORD IS WALID")
//    } else {
//        println("pASSWORD IS not WALID")
//    }


////_____________________________________________________________________________________________
//    2.16 If and when are expressions

//    Напишите программу расчета стоимости доставки:
//
//    Пользователь вводит вес груза
//    Программа выводит в консоль: _ руб./км.
//    Внимание - "до n кг" означает меньше n(не включительно), то есть запись "до 2 кг." означает от 0 до 1,99999...кг
//
//    до 2 кг. - 150 руб./км.
//    до 5 кг. - 200 руб./км.
//    до 12 кг. - 250 руб./км.
//    до 18 кг. - 300 руб./км.
//    до 30 кг. - 350 руб./км.
//    до 200 кг. - 1000 руб./км.
//    200кг и более - Для расчета стоимости свяжитесь с менеджером.

//    val vesGruza = readln().toInt()
//
//    var costDelivery = when (vesGruza) {
//        in 0 until 2 -> {150}
//        in 2 until 4 -> {200}
//        in 5 until 12 -> {250}
//        in 12 until 18 -> {300}
//        in 18 until 30 -> {350}
//        in 30 until 200 -> {1000}
//
//        else -> {
//            println("Для расчета стоимости свяжитесь с менеджером.")
//        }
//    }
//    println("$costDelivery руб./км.")


//_____________________________________________________
//    val мonth = readln()
//
//    val seazon = when (мonth) {
//        "январь", "декабрь", "февраль" -> "Зима"
//        "март", "апрель", "май" -> "Весна"
//        "июнь", "июль", "август" -> "Лето"
//        "сентябрь", "октябрь", "ноябрь" -> "Осень"
//        else -> ""
//    }
//    if (seazon == "") {
//        println("нет такого сезона")
//    } else {
//        println("Сезон - $seazon")
//    }


//   /\ выше тоже что и ниже но более компактно:

//    val numberOfMonth = readln().toInt()
//
//    val seazon = when (numberOfMonth) {
//        12,1,2 -> "Зима"
//        3,4,5 -> "Весна"
//        6,7,8 -> "Лето"
//        9,10,11->"Осень"
//
//        else -> ""
//    }
//
//    if (numberOfMonth in 1..12) {
//        println("Вы ввели номер месяца $numberOfMonth , который соответствует времени года: $seazon")
//    } else {
//        println("Вы ввели номер месяца $numberOfMonth , которому не соответствует ни одному времени года")
//    }


//_____________________________________________________
//    val numberOfMonth = readln().toInt()
//
//    val month = when (numberOfMonth) {
//        1 -> "January"
//        2 -> "February"
//        3 -> "Marth"
//
//        else -> ""
//    }
//
//    if (numberOfMonth in 1..12) {
//        println("Вы ввели номер месяца $numberOfMonth , который соответствует месяцу: $month")
//    } else {
//        println("Вы ввели номер месяца $numberOfMonth , которому не соответствует месяц")
//    }
//
//


//_____________________________________________________________________________________________
//    2.15 Целочисленные типы Long Short Byte


//    val terraByte = readln().toLong()
//
//    val resulByte = ((((terraByte * 1024) * 1024) * 1024) * 1024)
//
//    println(resulByte)

//
//    Напишите программу, которая переводит значение терабайт (Тб), введенное пользователем, в байты.
//
//    1 Кб (килобайт) = 1024 байта
//
//            1 Мб (мегабайт) = 1024 Кб
//
//            1 Гб (гигабайт) = 1024 Мб
//
//            1 Тб (терабайт) = 1024 Гб


//_____________________________________________________
//    val numbers = 0..1_000_000_000L
//
////    var sum = 0L
////
////    for (number in numbers) {
////        sum += number
////    }
//    println(numbers.sum())


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


