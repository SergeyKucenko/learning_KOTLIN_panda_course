fun main() {

//________________________________________________________________________________________________
//    Практические задачи по теме "when"



    // ____________________________________
//    var oceanName = readln()
//    var pollutionLevel = readln().toDouble()
//
//    when (pollutionLevel) {
//        0.0 -> println("$oceanName в идеальном состоянии")
//
//        in 0.0..0.1 -> {
//            val temp1 = pollutionLevel * 100
//            println("$oceanName загрязнен на $temp1%")
//        }
//        in 0.1..1.0 -> {
//            val temp2 = pollutionLevel * 100
//            println("$oceanName загрязнен на $temp2%")
//        }
//
//        in 1.1..2.0 -> {
//            val temp3 = pollutionLevel * 100
//            println("$oceanName загрязнен на $temp3%")
//        }
//
//        else -> println("$oceanName загрязнен более чем на 200%")
//    }
//

// ____________________________________

//    val planetName = readln()
//    val windSpeed = readln().toInt()
//
//    val message = when {
//        windSpeed >= 150 -> "Внимание, туристы! Рельеф планеты $planetName может сильно измениться в течение ближайших нескольких часов."
//        windSpeed in 100..149 -> "Внимание, туристы! Рельеф планеты $planetName может сильно измениться в течение следующих суток."
//        windSpeed in 50..99 -> "Внимание, туристы! Рельеф планеты $planetName может сильно измениться в течение ближайшей недели."
//        else -> "Рельеф планеты $planetName в ближайшее время не изменится."
//    }
//
//    println(message)



    // ____________________________________

//    val guestNumber = readln().toInt()
//
//    when {
//        guestNumber % 1000  == 0  -> print("100 000 кредитов и клубная карта почетного гостя \"Paradise and point\"")
//        guestNumber % 250  == 0  -> print("Бесплатное проживание в оплаченном номере на 7 дней")
//        guestNumber % 100 == 0 -> print("Бесплатное путешествие на пиратском корабле")
//        guestNumber % 5 == 0 -> print("Скидка на аттракцион \"Водные горки\"")
//        else -> print("К сожалению, вы не выиграли приз.")
//    }


    // ____________________________________

//    val month = readln().toInt()
//    val day = readln().toInt()
//
//    when (month) {
//        1, 2, 3, 12 -> println("Зима, цветет сакура")
//        4, 5 -> println("Весна, цветет сакура")
//        6, 7, 8 -> println("Лето, цветет сакура")
//        9, 10, 11 -> println("Осень, цветет сакура")
//        else -> println("Неверный месяц")
//    }
//
//    when (day) {
//        6, 7 -> println("Выходной, высокий пассажиропоток")
//        1,2, 3, 4, 5 -> println("Будний день, низкий пассажиропоток")
//        else -> println("Неверный день")
//    }


    // ____________________________________
//    val usluga = readln()
//
//    when (usluga) {
//        "Замена покрышек" -> println("$usluga обойдется в 1000 кредитов")
//        "Замена масла" -> println("$usluga обойдется в 350 кредитов")
//        "Замена тормозных колодок" -> println("$usluga обойдется в 940 кредитов")
//        "Обновление лакокрасочного покрытия" -> println("$usluga обойдется в 4999 кредитов")
//        else -> {
//            println("Услуга \"$usluga\" не предоставляется")
//        }
//    }


    // ____________________________________
//    val rank = readln()
//    var discount:Double = 0.0
//
//    when(rank) {
//        "Солдат" -> discount = 5.0
//        "Капрал" -> discount = 7.0
//        "Сержант" -> discount = 10.0
//        "Лейтенант" -> discount = 15.0
//        "Капитан" -> discount = 25.0
//        "Коммандер" -> discount = 35.0
//        "Маршал-коммандер" -> discount = 45.0
//        "Гражданин" ->{
//            println("Для Вас сегодня нет скидки, приходите завтра ;)")
//            return
//        }
//        else -> discount = 0.0
//
//    }
//
//
//    print("Ваша скидка в процентах: " + discount / 2)
//










//________________________________________________________________________________________________

//    Условный оператор when

//    val sourceDeviceType = readln()
//    val destinationDeviceType = readln()
//    val destination = readln()
//
//    var isTeleportationPossible = false
//
//    when (sourceDeviceType) {
//        "Infinity Mirror" -> {
//            when (destinationDeviceType) {
//                "Infinity Mirror" -> isTeleportationPossible = true
//                "Quantum Gateway" -> isTeleportationPossible = true
//                "Stargate" -> isTeleportationPossible = true
//            }
//        }
//        "Quantum Gateway" -> {
//            when (destinationDeviceType) {
//                "Infinity Mirror" -> isTeleportationPossible = true
//                "Quantum Gateway" -> isTeleportationPossible = true
//                "Stargate" -> isTeleportationPossible = true
//            }
//        }
//        "Stargate" -> {
//            when (destinationDeviceType) {
//                "Infinity Mirror" -> isTeleportationPossible = true
//                "Quantum Gateway" -> isTeleportationPossible = true
//                "Stargate" -> isTeleportationPossible = true
//            }
//        }
//    }
//
//    if(isTeleportationPossible) {
//        println("Телепортация на $destination разрешена")
//    } else {
//        println("Телепортация на $destination невозможна")
//    }
//
//
////________________________________________________________________________________________________
//    // пишите код здесь
//    println("Введите ваши предпочтения:")
//    val interests = readln()
//    println("Введите ваш бюджет:")
//    val budget = readln().toInt()
//
//
//
//    when (interests) {
//        "Природа" -> println("Рекомендуем экскурсию в национальный парк.")
//        "История" -> println("Рекомендуем посетить местный исторический музей.")
//        "Развлечения" -> println("Рекомендуем сходить в аквапарк или парк аттракционов.")
//    }
//
//    when (budget) {
//        // пишите код здесь
//        in 0..100 -> println("Рекомендуем бюджетный вариант отдыха: прогулки по городу, посещение местных рынков.")
//        in 101..500 -> println("Рекомендуем средний вариант отдыха: экскурсию в пригород, посещение культурных достопримечательностей.")
//        in 501..1000 -> println("Рекомендуем премиум-вариант отдыха: эксклюзивную экскурсию, посещение элитных ресторанов.")
//        else -> println("Рекомендуем обратиться в наш отдел для составления индивидуального плана отдыха.")
//    }


//________________________________________________________________________________________________
//    val objectType = readln()
//    val transformation = readln()
//
//    when (objectType) {
//        "Планета" -> {
//            when (transformation) {
//                "T1" -> println("Землеподобная планета с умеренным климатом")
//                "M2" -> println("Марсоподобная планета с пустынным ландшафтом")
//                "O3" -> println("Океаническая планета, полностью покрытая водой")
//                else -> println("Неизвестный тип трансформации для планеты")
//            }
//        }
//        "Астероид" -> {
//            when (transformation) {
//                "I4" -> println("Астероид с ледяной поверхностью и запасами воды")
//                "M5" -> println("Астероид, богатый металлами и минералами")
//                else -> println("Неизвестный тип трансформации для астероида")
//            }
//        }
//        "Спутник" -> {
//            when (transformation) {
//                "I6" -> println("Луна с ледяной поверхностью и подземным океаном")
//                "V7" -> println("Луна с активными вулканами и горячим ядром")
//                else -> println("Неизвестный тип трансформации для спутника")
//            }
//        }
//        else -> println("Неизвестный тип объекта")
//    }


//________________________________________________________________________________________________
//    val name = "Энакин"
//    val money = 1000
//    var price = 0
//
//    when(name){
//        "Энакин" -> {
//            if (money < 1000) {
//                price = 500
//            } else if (money >= 1000 && money < 2000) {
//                price = 1000
//            } else {
//                price = 3000
//            }
//        }
//        "Асока" -> {
//            if (money < 1000) {
//                price = 500
//            } else if (money >= 1000 && money < 2000) {
//                price = 1500
//            } else {
//                price = 3500
//            }
//        }
//    }
//
//    print("Для Вас специальная цена: " + price)


//________________________________________________________________________________________________
//    val day = readln()
//    val time = readln()
//    if (day == "Понедельник") {
//        if (time == "08:00") {
//            print("Высота воды: 4.7 метра")
//        } else if (time == "14:00") {
//            print("Высота воды: 2.3 метра")
//        } else if (time == "20:00") {
//            print("Высота воды: 6.7 метра")
//        }
//    } else if (day == "Вторник") {
//        if (time == "08:00") {
//            print("Высота воды: 3.2 метра")
//        } else if (time == "14:00") {
//            print("Высота воды: 1.2 метра")
//        } else if (time == "20:00") {
//            print("Высота воды: 4.3 метра")
//        }
//    } else if (day == "Среда") {
//        if (time == "08:00") {
//            print("Высота воды: 4.1 метра")
//        } else if (time == "14:00") {
//            print("Высота воды: 2.2 метра")
//        } else if (time == "20:00") {
//            print("Высота воды: 5.1 метра")
//        }
//    } else if (day == "Четверг") {
//        if (time == "08:00") {
//            print("Высота воды: 5.2 метра")
//        } else if (time == "14:00") {
//            print("Высота воды: 2.5 метра")
//        } else if (time == "20:00") {
//            print("Высота воды: 6.2 метра")
//        }
//    } else if (day == "Пятница") {
//        if (time == "08:00") {
//            print("Высота воды: 3.2 метра")
//        } else if (time == "14:00") {
//            print("Высота воды: 1.2 метра")
//        } else if (time == "20:00") {
//            print("Высота воды: 4.3 метра")
//        }
//    } else if (day == "Суббота") {
//        if (time == "08:00") {
//            print("Высота воды: 4.1 метра")
//        } else if (time == "14:00") {
//            print("Высота воды: 2.2 метра")
//        } else if (time == "20:00") {
//            print("Высота воды: 5.1 метра")
//        }
//    } else if (day == "Воскресенье") {
//        if (time == "08:00") {
//            print("Высота воды: 5.2 метра")
//        } else if (time == "14:00") {
//            print("Высота воды: 2.5 метра")
//        } else if (time == "20:00") {
//            print("Высота воды: 6.2 метра")
//        }
//    }

//________________________________________________________________________________________________
//    println("Введите валюту (прием):")
//    val inputCurrency = readln()
//
//    println("Введите валюту (получение):")
//    val outputCurrency = readln()
//
//    println("Введите количество валюты на обмен:")
//    val amountOfCurrency = readln().toInt()
//
//    if (inputCurrency == "Кредиты") {
//        if (outputCurrency == "Серебро") {
//            val result = amountOfCurrency * 0.05
//            println("Выдано (серебро): $result")
//        } else if (outputCurrency == "Золото") {
//            val result = amountOfCurrency * 0.05
//            println("Выдано (золото): $result")
//        } else {
//            println("Обмен \"$inputCurrency -> $outputCurrency\" не поддерживается")
//        }
//    } else if (inputCurrency == "Серебро") {
//        if (outputCurrency == "Кредиты") {
//            val result = amountOfCurrency * 0.05
//            println("Выдано (кредиты): $result")
//        } else if (outputCurrency == "Золото") {
//            val result = amountOfCurrency * 0.05
//            println("Выдано (золото): $result")
//        } else {
//            println("Обмен \"$inputCurrency -> $outputCurrency\" не поддерживается")
//        }
//    } else if (inputCurrency == "Золото") {
//        if (outputCurrency == "Серебро") {
//            val result = amountOfCurrency * 0.05
//            println("Выдано (серебро): $result")
//        } else if (outputCurrency == "Кредиты") {
//            val result = amountOfCurrency * 0.05
//            println("Выдано (кредиты): $result")
//        } else {
//            println("Обмен \"$inputCurrency -> $outputCurrency\" не поддерживается")
//        }
//    } else if (inputCurrency == "Драхмы") {
//        if (outputCurrency == "Кредиты") {
//            val result = amountOfCurrency /20.0
//            println("Выдано (кредиты): $result")
//        } else if (outputCurrency == "Драхмы") {
//            val result = amountOfCurrency * 0.05
//            println("Выдано (кредиты): $result")
//        } else {
//            println("Обмен \"$inputCurrency -> $outputCurrency\" не поддерживается")
//        }
//    }



//________________________________________________________________________________________________
//    println("Введите статус погоды: ")
//    val weatherStatus = readln()
//
//    println("Введите компонент, требующий ремонта: ")
//    val componentName = readln()
//
//    if (weatherStatus == "Хорошая") {
//        if (componentName == "Колеса") {
//            println("Стоимость ремонта: 150 кредитов")
//        } else if (componentName == "Корпус") {
//            println("Стоимость ремонта: 250 кредитов")
//        } else if (componentName == "Двигатель") {
//            println("Стоимость ремонта: 500 кредитов")
//        } else {
//            println("Стоимость ремонта: определить не удалось")
//        }
//    }
//
//    if (weatherStatus == "Плохая") {
//        if (componentName == "Колеса") {
//            println("Стоимость ремонта: 300 кредитов")
//        } else if (componentName == "Корпус") {
//            println("Стоимость ремонта: 500 кредитов")
//        } else if (componentName == "Двигатель") {
//            println("Стоимость ремонта: 1000 кредитов")
//        } else {
//            println("Стоимость ремонта: определить не удалось")
//        }
//    }
//________________________________________________________________________________________________


}