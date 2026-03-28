fun main() {


//________________________________________________________________________________________________
//    Цикл For




// ____________________________________
// ____________________________________
// ____________________________________



// ____________________________________
//    val dishCount = readln().toInt()
//    var caloriesSum = 0
//
//    for(number in 1..dishCount) {
//        val dishName = readln()
//        when(dishName) {
//            "Грибной суп" -> {
//                caloriesSum +=  50900
//            }
//            "Крем-суп из тыквы" -> {
//                caloriesSum +=  92500
//            }
//            "Винегрет" -> {
//                caloriesSum +=  130100
//            }
//        }
//    }
//    print("Количество калорий в блюдах: $caloriesSum")
//

// ____________________________________

//    var number = readln().toInt()
//    var message = readln()
//    var count = 0
//
//
//    if (number == 5){
//        for (radioNomber in 0 until number) {
//            count++
//            println("Приёмник #$count: $message");
//        }
//    } else if (number == 3){
//        for (radioNomber in 0 until number) {
//            count++
//            println("Приёмник #$count: $message");
//        }
//    }



// ____________________________________

//    var bookCount = 0
//
//    var bookId = 0
//    do {
//        println("Введите количество книг:")
//
//        bookCount = readln().toInt()
//    } while (bookCount == 0)
//
//    println("Отсканированные книги:")
//
//    for(bookNumber in 1 .. bookCount) {
//        bookId++
//        val bookName = readln()
//        println("  - $bookName, ID-$bookId")
//        println()
//    }

// _______________________________________

//    println("Введите количество плодов для проверки:")
//    val inputData = readln().toInt()
//    println("Статус плодов:")
//
//    for (number in 1..inputData) {
//        val diameter = readln().toInt()
//
//        when (diameter) {
//            in -10000..0 -> println(" - Не соответствует")
//            in 1..30 -> println(" - Соответствует")
//            in 31..10000 -> println(" - Не соответствует")
//        }
//
//    }



// ____________________________________

//    println("Введите количество посетителей:")
//    val inputGuestCount = readln()
//    val guestCount = inputGuestCount.toInt()
//    println("Список чеков:")
//
//
//    for (guestNumber in 1..guestCount) {
//        val guestType = readln()
//
//        // пишите код здесь
//        when (guestType) {
//            "VIP" -> println(" - Чек на 50% больше")
//            "Common" -> println(" - Обычный чек")
//        }
//
//    }



// ____________________________________

//    val inputTransportCount = readln()
//    val transportCount = inputTransportCount.toInt()
//
//    var totalHarvest = 0
//
//    for (transportNumber in 1..transportCount) {
//        val deliveredHarvest = readln().toInt()
//
//        // пишите код здесь
//        totalHarvest += deliveredHarvest
//    }
//
//    println("Общий урожай: $totalHarvest тонн")
//________________________________________________________________________________________________
//    Циклы While и Do..While


//    var formNumber = 0
//    var userQuestionNumber = 0
//    var userBalls = 0
//
//    while (true) {
//
//        val question = readln()
//
//        if (question == "") {
//            formNumber++
//
//            val avgUserBalls = userBalls / userQuestionNumber
//            if(avgUserBalls >= 4.75) {
//                println("Анкета #${formNumber}: Годен")
//            } else {
//                println("Анкета #${formNumber}: Не годен")
//            }
//
//            userBalls = 0
//
//            continue
//        }
//        if (question == "Анкеты закончились")
//            break
//
//        val answer = readln()
//
//
//
//        when (question) {
//            "Почему вы хотите стать шпионом?" -> {
//                when (answer) {
//                    "Патриотизм, желание служить планете" -> userBalls += 5
//                    "Интерес к разведке и шпионажу" -> userBalls += 4
//                    "Другое" -> userBalls += 3
//                }
//            }
//
//            "Вы способны хранить секреты и работать в условиях неопределенности?" -> {
//                when (answer) {
//                    "Да, всегда" -> userBalls += 5
//                    "Да, в большинстве случаев" -> userBalls += 4
//                    "Нет, мне трудно хранить секреты" -> userBalls += 1
//                }
//            }
//
//            "Вы умеете работать в команде и выполнять приказы" -> {
//                when (answer) {
//                    "Да, всегда" -> userBalls += 5
//                    "Да, в большинстве случаев" -> userBalls += 4
//                    "Нет, мне трудно работать в команде" -> userBalls += 1
//                }
//            }
//
//            else -> {
//                println("Вопрос не найден в банке данных")
//                continue
//            }
//        }
//
//        userQuestionNumber++
//    }
// ____________________________________

//    fun main() {
//
//        var totalIncome = 0.0
//        var travelRequests = 0
//
//        while (true) {
//            println("Введите уровень отдыха (1-3):")
//
//            val inputNumber = readln()
//
//            if(inputNumber == "" || inputNumber == "Завершить обслуживание") {
//                break
//            }
//
//            val number = inputNumber.toInt()
//
//            when(number) {
//                1 -> totalIncome += 1000
//                2 -> totalIncome += 3000
//                3 -> totalIncome += 10000
//                else -> {
//                    println("Введен некорректный уровень отдыха")
//                    continue
//                }
//            }
//
//            travelRequests++
//        }
//
//        val avgCostOfTravel = totalIncome / travelRequests
//
//        println()
//        println("Общий доход: $totalIncome")
//        println("Средняя стоимость путешествия: $avgCostOfTravel")
//    }
// ____________________________________

//
//    while (true) {
//
//
//
//    println("Введите команду:")
//    val inputCommand = readln()
//
//    when(inputCommand) {
//        "Запустить бурение" -> println("Процесс бурения начат")
//        "Закончить бурение" -> println("Процесс бурения завершается")
//        "Запустить добычу" -> println("Процесс добычи начат")
//        "Закончить добычу" -> println("Процесс добычи завершается")
//    }
//
//        if(inputCommand == "Остановить работу платформы") {
//            println("Платформа завершает свою работу")
//            break
//        }
//
//    }



// ____________________________________
//    var currentPoint = 0
//
//    while(true) {
//        println("Введите команду:")
//        val inputCommand = readln()
//        currentPoint++
//        // пишите код здесь
//
//
//
//        if(inputCommand == "Продолжить движение") {
//            if(currentPoint % 2 == 0) {
//                println("Челнок отправился в точку A")
//            } else {
//                println("Челнок отправился в точку B")
//            }
//        }
//        if(inputCommand == "Закончить движение"){
//            break
//        }
//    }


    // ____________________________________
//    var taskNumber = 0
//
//    println("Список задач:")
//
//    while (true) {
//        // пишите код здесь
//        taskNumber++
//        val task = readln()
//
//
//        if (task == "Завершить запись") {
//            break
//        }
//
//        val taskDescription = readln()
//
//        println("${taskNumber}. $task, $taskDescription")
//    }

    // ____________________________________


//    var stage = 0 // текущий этап, постоянно изменяется (1 -> 2 -> 3 -> 4)
//    var isError = false
//
//    do {
//        stage++ // обновляем номер текущего этапа
//
//        when (stage) {
//            1 -> {
//                println("Происходит форматирование жесткого диска")
//            }
//
//            2 -> {
//                println("Происходит выделение места под файлы ОС")
//            }
//
//            3 -> {
//                println("Происходит распаковка файлов ОС на жесткий диск")
//            }
//
//            4 -> {
//                println("Проверка целостности всех файлов")
//                isError = true
//            }
//        }
//
//        if (isError) {
//            println("Произошла ошибка во время установки ОС")
//            break
//        }
//    } while (stage != 4)


    // ____________________________________
//    Задача 2. Модернизируйте предыдущее решение, убрав возможность подбора пароля. В случае, если пользователь неверно введет ПИН-код три раза, вывести сообщение "Замок заблокирован".
//
//    var inputPIN = "" // переменная для хранения вводимого ПИН-кода
//    var numberOfAttempts = 3 // количество попыток ввода
//
//    while (true) { // выполняем цикл бесконечное количество раз
//
//        print("Введите ПИН-код: ")
//        inputPIN = readln() // ожидаем нового ввода пользователем ПИН-кода
//
//        if(inputPIN == "1234") {
//            println("ПИН-код указан верно") //выполнится, если пользователь введет верный ПИН-код
//            break // выходим из цикла
//        } else {
//            println("ПИН-код неверный") // если введенный ПИН-код не совпадает, печатаем сообщение
//            numberOfAttempts-- // уменьшаем количество попыток на 1
//        }
//
//        if(numberOfAttempts == 0) {
//            println("Замок заблокирован") // если неправильно ввели ПИН-код 3 раза, выводим сообщение
//            break // выходим из цикла
//        }
//    }
    // ____________________________________
//    Шаг 3. Где используется бесконечный цикл? Одним из основных примеров использования бесконечного цикла является обработка ввода данных пользователя в консоль:
//
//    var username = ""
//
//    while(true) { // пока условие истинно
//        println("Введите имя пользователя: ") // отображаем подсказку
//        val inputData = readln() // ожидаем ввод пользователя
//
//        if(inputData != "") { // если введенная не строка пустая
//            username = inputData // сохраняем введенное значение в переменную
//            break // выходим из цикла
//        }
//    }
//
//    println("Имя пользователя: $username") // печатаем результат

    // ____________________________________
//    Альтернативным примером может быть обработка команд от пользователя:
//
//    var command = ""
//
//    while (true) { // пока условие истинно
//        println("Введите команду: ") // отображаем подсказку
//        val inputData = readln() // ожидаем ввод пользователя
//
//        if (inputData == "") { // если введенная строка пустая
//            continue // начинаем сначала
//        }
//
//        command = inputData // сохраняем введенное значение в переменную
//
//        when (command) {
//            "Показать список маршрутов" -> {
//                println("Список маршрутов следующий ...")
//            }
//            "Купить билет" -> {
//                println("Происходит покупка билета ...")
//            }
//            "Завершить работу" -> {
//                println("Происходит завершение работы ...")
//                break
//            }
//            else -> {
//                println("Неизвестная команда")
//            }
//        }
//    }
//
//    println("Программа закрывается") // печатаем сообщение
    // ____________________________________
//    Шаг 2. Как завершить бесконечный цикл? В примере выше условие всегда является истинным, а значит цикл самостоятельно никогда не прекратится (программа "зависнет" на повторении выполнения заданных в цикле действий). Для его завершения следует добавить соответствующие условие:
//
//    var counter = 0
//
//    while(true) { // пока условие истинно
//        counter++ // увеличиваем счетчик
//        print("$counter") // и печатаем значение в консоль
//
//        if(counter > 10000) // если счетчик больше 10000
//            break // выходим из цикла
//    }


    // ____________________________________



    // ____________________________________

//    Переход на следующую итерацию
//            Переход на следующую итерацию цикла возможен при достижении конца блока (тела цикла) или при помощи указания в теле цикла ключевого слова continue.
//
//    var power = 10
//    var tasks = 0
//    var isSuccessOperation = false
//
//    do{
//        tasks += 1
//
//        if(tasks == 1){ // если это первая задача
//            continue // переходим на следующую итерацию
//        } else {
//            power -= 5 // на второй и последующих задачах ужде отнимаем энергию
//        }
//    } while (power != 0)
//
//    if(isSuccessOperation){
//        print("Задачи успешно завершены")
//    } else {
//        print("Задачи не были завершены, не хватило энергии")
//    }

    // ____________________________________
//    Выход из цикла
//    Выход из цикла возможен при достижении конечного условия или при помощи указания в теле цикла ключевого слова break.
//
//    var power = 100
//    var tasks = 0
//    var isSuccessOperation = false
//
//    do{
//        tasks += 1
//        power -= 5
//
//        if(tasks == 10){ // если выполнили 10 задач
//            isSuccessOperation = true // считаем, что операция выполнена успешна
//            break // выходим из цикла
//        }
//    } while (power != 0)
//
//    if(isSuccessOperation){
//        print("Задачи успешно завершены")
//    } else {
//        print("Задачи не были завершены, не хватило энергии")
//    }


//________________________________________________________________________________________________
//    Практические задачи по теме "when"

//    Как выглядит условное выражение?
//
//    val mark = 4 // Оценка
//    var markName = "" // Название оценки
//
//    markName = when (mark) {
//        5 -> "Отлично"
//        4 -> "Хорошо"
//        3 -> "Удовлитеворительно"
//        else -> "Неудовлетворительно"
//    }
//
//    print("Ваша оценка: $markName")

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