fun main() {


//________________________________________________________________________________________________
// 11.1 Игра "Угадай число"

    val hiddenNumber = readln().toInt()

    while (true) {
        println("Введите число:")
        val userNumber = readln().toInt()


}






//    println(
//        "1. Запустить игру\n" + "2. Гид по игре\n" + "3. Выйти из игры\n"
//    )
//
//    println("Выберите пункт:")
//    var choiceGame = readln().toInt()
//    when(choiceGame){
//        1-> println("\nИдет запуск игры")
//        2-> println("\nОткрывается гид по игре")
//        3-> println("\nИдет закрытие игры")
//    }


//    val question = readln()
//    when(question){
//        "Какая цель игры?"-> println("\nЦелью игры является отгадывание числа, придуманного ИИ \"Алиса\", за минимальное число попыток.")
//        "Сколько дается попыток?"-> println("\nКоличество попыток вычисляет Алиса по собственной формуле, и она отказывается раскрывать ее.")
//        "Есть ограничение по времени?"-> println("\nАлиса очень терпеливая, она будет ждать вашего ответа до тех пор, пока ее Создатель не забудет оплатить счет за аренду сервера.")
//    }
//
//    println("Вопрос: Какая цель игры?")
//    println("Целью игры является отгадывание числа, придуманного ИИ \"Алиса\", за минимальное число попыток.\n")
//
//    println("Вопрос: Сколько дается попыток?")
//    println("Ответ: Количество попыток вычисляет Алиса по собственной формуле, и она отказывается раскрывать ее.\n")
//
//    println("Вопрос: Есть ограничение по времени?")
//    println("Ответ: Алиса очень терпеливая, она будет ждать вашего ответа до тех пор, пока ее Создатель не забудет оплатить счет за аренду сервера.\n")
//________________________________________________________________________________________________
//  10.1 Функции
//  10.3 Необязательные параметры и именованные аргументы
// ____________________________________
//    Задача
//    Отель-астероид "Андромеда" пользуется успехом уже не одну сотню циклов.
//    Ключом к успеху стала программа бронирования номеров, в которую автоматически включаются дополнительные услуги.
//    Ваша задача: проанализируйте программу и внесите улучшения в код.
//
//    println("Введите ваше имя: ")
//    val guestName = readln()
//
//    println("Введите тип номера (стандартный, люкс, президентский): ")
//    val roomType = readln()
//
//    println("Введите количество дней проживания: ")
//    val daysOfStay = readln().toInt()
//
//    println("Включить завтрак (да/нет)? ")
//    val breakfastIncluded = readln() == "да"
//
//    bookRoom(guestName, roomType, daysOfStay, breakfastIncluded)
//}
//
//fun bookRoom(
//    guestName: String,
//    roomType: String,
//    daysOfStay: Int,
//    breakfastIncluded: Boolean = true
//) {
//    println("Номер забронирован")
//}

// ____________________________________
//    Задача
//    Ежегодно на полях планеты Потейто сеют миллионы тонн пшеницы.
//    Для сокращения всевозможных затрат принято решение автоматизировать процесс сеяния.
//    Ваша задача: проанализируйте программу и добавьте следующий функционал:
//    автоматический выбор сорта пшеницы для посева.

//    println("Тип культуры для засева:")
//    val inputAgriculturalCropType = readln()
//
//    println("Сорт культуры для засева:")
//    val inputAgriculturalCropVariety = readln()
//
//    if(inputAgriculturalCropVariety == "Не задан")
//        sowWheat()
//    else
//        sowWheat(inputAgriculturalCropVariety)
//}
//
//fun sowWheat(wheatVariety: String = "Ясенка") {
//    println("Для засева выбрана культура \"${wheatVariety}\"")
//}

// ____________________________________
//    Задача
//    Климат на планете-соседке Мелон, находящейся в той же планетарной системе,
//    что и Томейто, идеально подходит для выращивания арбузов.
//    Автоматизация пришла к ним раньше, поэтому в новом сезоне на полях появились гигантские арбузы.
//
//    println("Тип сельскохозяйственной культуры:")
//    val inputAgriculturalCropType = readln()
//
//    println("Планируемый диаметр (см):")
//    val inputDiameter = readln()
//
//    if(inputDiameter == "Не задан") {
//        plantAgriculturalCrop(inputAgriculturalCropType)
//    } else {
//        val diameter = inputDiameter.toInt()
//        plantAgriculturalCrop(inputAgriculturalCropType, diameter)
//    }
//}
//
//fun plantAgriculturalCrop(cropType: String, diameter: Int = 27) {
//    when(cropType) {
//        "Арбуз" -> {
//            println("Средний диаметр арбуза - $diameter см")
//        }
//    }
//}

// ____________________________________
//Задача
//    В школе техно-волшебства девушки любят готовить виртуальные зелья и конструировать на 3D-принтере кибер-метлы.
//    Вас попросили написать программку, считающую расходы всех учениц на квантовые частички, обеспечивающие энергией все изобретения.
//    Ядро (с англ. яз. "core") программы уже написано:


//    val girls = readln().toLong()
//    val count = readln().toLong()
//    val price = readln().toLong()
//
//    val result = calculateCost(girls, count, price)
//    print(result)
//}
//
//   fun calculateCost(girls: Long, count: Long, price: Long): Long {
//    val formula = girls * count * price
//    return (formula)
//}

// ____________________________________
//Задача
//От командира армии Вам поступил запрос на разработку программы,
//выполняющей расчеты некоторых засекреченных данных. Ядро программы уже написано:
//    val param1 = readln().toInt()
//    val param2 = readln().toInt()
//
//    val result = calculateSecretData(param1, param2)
//    print(result)
//}
//
//fun calculateSecretData(param1: Int, param2: Int): Int {
//    val formula = 2 * (param1 + param2) * (param1 + param2)
//    return formula
//}

// ____________________________________
//    Задача
//    Метеорологическая станция каждый час получает сотни тысяч Гигабайт данных с зондов, следящих за температурой на планете.
//    Для получения точной температуры данные берутся с нескольких соседних зондов и считается среднее значение.
//    val satelliteOne = readln().toFloat()
//    val satelliteTwo = readln().toFloat()
//    val satelliteThree = readln().toFloat()
//    val satelliteFour = readln().toFloat()
//    val satelliteFive = readln().toFloat()
//
//    val result = calculateAvgTemperature(satelliteOne, satelliteTwo, satelliteThree, satelliteFour, satelliteFive)
//    print(result)
//
//}
//    fun calculateAvgTemperature(satelliteOne: Float , satelliteTwo : Float, satelliteThree : Float, satelliteFour : Float,satelliteFive : Float): Float {
//        val avgTemperture =( satelliteOne+satelliteTwo+satelliteThree+satelliteFour+satelliteFive)/4
//        return(avgTemperture)
//    }


// ____________________________________
//    Задача
//    Глава фракции Бибо заинтересован в получении уникального лота на аукционе.
//
//    Сам аукцион работает по принципу - побеждает первый участник, предложивший максимальную цену.
//
//
//    println("Список претендентов:")
//
//    val inputUsers = readln()
//    val users = inputUsers.split(", ").toTypedArray()
//
//    val winnerNumber = getWinner(users)
//
//    println("Новый владелец лота - №${winnerNumber}")
//}
//
//fun getWinner(users: Array<String>): String {
//    var winnerNumber = ""
//
//    for(user in users) {
//        val userData = user.split(" - ")
//        val userName = userData[0]
//        val userNumber = userData[1]
//        if(userName == "Бибо") {
//            winnerNumber = userNumber
//        }
//    }
//
//    return winnerNumber
//


// ____________________________________
//    Задача
//    На морских курортах сложнее всего найти время на посещение всех достопримечательностей.
//    До недавнего времени туристические агентства предлагали маршруты, разработанные специализированной программой, но после недавнего обновления она перестала работать.
//    Ваша задача: проанализируйте новую версию программы и исправьте ошибки.
//    Подсказка: добавьте недостающие аргументы для функции.

//    println("Время на маршрут (в минутах):")
//    val time = readln().toInt()
//
//    println("Максимальная стоимость тура (в кредитах):")
//    val maxCost = readln().toInt()
//
//    println("Максимальное количество локаций (в единицах):")
//    val maxLocationCount = readln().toInt()
//
//    val foundRoute = findRoute(time, maxCost, maxLocationCount)
//
//    println("Маршрут:")
//    if (foundRoute.size > 0) {
//        for (point in foundRoute) {
//            println(" - $point")
//        }
//    } else {
//        println(" - Не найден")
//    }
//
//}
//
//val interestPoints = arrayOf(
//    arrayOf("Отель", "15 минут", "20 кредитов"),
//    arrayOf("Пляж", "15 минут", "50 кредитов"),
//    arrayOf("Водные горки", "15 минут", "30 кредитов"),
//    arrayOf("Подводная экскурсия", "60 минут", "300 кредитов"),
//)
//
//fun findRoute(maxTime: Int, maxCost: Int, maxLocationCount: Int): Array<String> {
//    val route = Array(maxLocationCount) { "" }
//
//    var currentTime = 0
//    var currentCost = 0
//    var currentLocationIndex = 0
//
//    for (index in interestPoints.indices) {
//        val pointName = interestPoints[index][0]
//        val pointTimeCost = interestPoints[index][1].split(" ")[0].toInt()
//        val pointMoneyCost = interestPoints[index][2].split(" ")[0].toInt()
//
//        if (currentTime + pointTimeCost <= maxTime) {
//            if (currentCost + pointMoneyCost <= maxCost) {
//                if (currentLocationIndex < maxLocationCount) {
//                    route[currentLocationIndex] = pointName
//
//                    currentTime += pointTimeCost
//                    currentCost += pointMoneyCost
//                    currentLocationIndex++
//                } else {
//                    break
//                }
//            }
//        }
//    }
//
//    return route



// ____________________________________
//    Задача
//    С появлением беспилотников V поколения стоимость проезда на скоростном поезде снизилась на 30%,
//    что привело к регистрации множества новых пользователей в системе онлайн-бронирования билетов.
//    Ваша задача: проанализируйте программу и разработайте функционал для заказа двух и более билетов.

//    println("Выберите тип билета (1-3):")
//    val ticketType = readln().toInt()
//
//    println("Выберите количество билетов:")
//    val ticketCount = readln().toInt()
//
//
//    val total = bookTicket(ticketType, ticketCount)
//
//}
//
//fun bookTicket(ticketType: Int, ticketCount: Int) {
//    when (ticketType) {
//        1 -> {
//            println("Стоимость билетов - ${2000 * ticketCount} кредитов")
//        }
//
//        2 -> {
//            println("Стоимость билетов - ${1000 * ticketCount} кредитов")
//        }
//
//        3 -> {
//            println("Стоимость билетов - ${500 * ticketCount} кредитов")
//        }
//
//    }


// ____________________________________
//    Задача
//    Туристическая экспедиция в наши дни не обходится без галактических карт, астролёта и парочки дроидов.
//    И как известно, не ломается только тот дроид, которого у вас нет.
//    Ваша задача: проанализируйте одну из вспомогательных программ дроида и исправьте ошибки.

//    println("Желаете починить робота? (Да/Нет)")
//    val userAnswer = readln()
//
//    if (userAnswer == "Да") {
//        // пишите код здесь
//        initRepair()
//    } else {
//        println("Вы отказались от ремонта")
//    }
//}
//
//fun initRepair() {
//    println("Запущен процесс авторемонта ...")
//
//    var cooldown = 5
//    while (cooldown > 0) {
//        println("До запуска робота $cooldown")
//        cooldown--
//    }
//
//    println("Ремонт завершён")

// ____________________________________
//    println("Ваш идентификатор?")
//
//    val userId = readln()
//    val isValidUserId = checkUserId(userId)
//    if (isValidUserId) {
//        println("Доступ разрешён")
//    } else {
//        println("Доступ запрещён")
//    }
//}
//
//    fun checkUserId(userId: String): Boolean {
//    val whitelistId = arrayOf("TK-01001", "TK-01011")
//
//    return userId in whitelistId

//________________________________________________________________________________________________

//    МАССИВЫ [[[[ ]]]]


////    Задача
//    Неко-сан мечтает помочь звёздам, которые устали от папарацци.
//    Для этого она начала разрабатывать специальную программу, но у неё возникли трудности.
//    Ваша задача: доработайте программу, которая используется для отображения всех папарацци в регионе в режиме реального времени.
//    Подсказка: проверяйте все элементы в массиве для добавления и поиска данных.

// val paparazziСount = 10
//    val paparazziIds = Array<Int>(paparazziСount) { 0 }
//
//    while(true) {
//        println("Введите ID папарацци (0 для выхода):")
//        val inputData = readln()
//
//        if (inputData == "0") break
//
//        val paparazziId = inputData.toInt()
//
//        for (i in paparazziIds.indices) {
//            if (paparazziIds[i] == 0) {
//                paparazziIds[i] = paparazziId
//                break
//            }
//        }
//    }
//
//    println()
//    println("Карта региона:")
//
//    var paparazziFound = false
//    for(paparazziId in paparazziIds) {
//        if(paparazziId != 0) {
//            println(" - Обнаружен папарацци с ID: $paparazziId")
//            paparazziFound = true
//        }
//    }
//
//    if(!paparazziFound) {
//        println(" - Папарацци не обнаружено")
//    }

// ____________________________________
//    Задача
//    На заснеженной Аркании добывают лёд.
//    И на этом неплохо зарабатывают все компании, ведь блюдо "Сладкий лёд" любят во всей галактике!
//    Ваша задача: доработайте программу, которая будет считать оставшийся в леднике лёд.
//    Руководство потеряло документацию к программе, поэтому Вам предстоит самостоятельно определить назначение тестовых данных, проанализировав код программы.
//    Подсказка: для вычисления оставшегося льда перезаписывайте значения в массиве.

//    val glasierVolumesList = arrayOf(100.0, 250.0, 35.0)
//
//    val days = readln().toInt() // дни
//    var minedIceVolume = 0.0 // объем льда
//    var inputGlasierNumber = -1 // индекс
//
//
//    var currentDay = 0
//    while(currentDay < days) {
//        inputGlasierNumber = readln().toInt()
//        minedIceVolume = readln().toDouble()
//
//        glasierVolumesList[inputGlasierNumber - 1] -= minedIceVolume
//
//        currentDay++
//    }
//
//    println("Статистика по ледникам:")
//    for(glasierData in glasierVolumesList) {
//        println(" - ${glasierData}")
//    }
//

// ____________________________________
//    Задача
//    Приветствуем Вас в жарких тропиках, где проходит первый галактический розыгрыш "IWIN".
//    Для получения приза в 100,000 кредитов предстоит пройти полосу препятствий за 14 дней.
//    Участников ждут:
//    Пересечение пустынных пляжей близ бирюзового океана;
//    Приготовление амброзии из дикоросов;
//    Сон под открытым небом в зоне E1 с коэффициентом ULWR 0,0%.
//    Ваша задача: доработайте программу, которая будет считать количество дней до конца розыгрыша (и завидовать участникам).

//    val targetDay = 14
//    val pointDayList = Array(targetDay) { "" }
//
//    var correctDay = 0
//
//    while (true) {
//        val inputData = readln()
//
//        if (inputData == "Подсчёт продолжается" || inputData == "Подсчёт окончен")
//            break
//
//        pointDayList[correctDay] = inputData
//        correctDay++
//
//    }
//
//
//    var countDownOfDays = targetDay
//    for (pointDay in pointDayList) {
//        if (pointDay != "") {
//            countDownOfDays--
//        } else {
//            break
//        }
//    }
//
//    println("До конца мероприятия (дней): $countDownOfDays")
//

// ____________________________________
//    Задача
//    Разведка Технократии обнаружила старинный алгоритм по эффективному расчету премий.
//    Ваша задача: требуется доработать программу, которая будет начислять премии жителям Технократии, внеся следующие улучшения:
//    добавьте массив со статусом достижений 5 сотрудников за месяц - есть / нет.
//    P.S. Создайте массив с 5 элементами определенного типа с помощью команды arrayOf().

//    val employees = arrayOf("Джейсон Тесла", "Алекс Вейланд", "Лекс Таргон", "Кайл Ренгар", "Майя Рейнольдс")
//    val salaryOfEmployees = arrayOf(1500.0, 10000.0, 5000.0, 5500.0, 5000.0)
//    val achievementsOfEmployees = arrayListOf(true, false, false, true, true) // пишите код здесь
//
//
//        for(index in employees.indices) {
//            val employeeAward = if(achievementsOfEmployees[index]) {
//                salaryOfEmployees[index] * 1.5
//            } else {
//                0.0
//            }
//            val totalSalary = salaryOfEmployees[index] + employeeAward
//
//            println("${employees[index]}, зарплата: ${totalSalary}")
//        }


// ____________________________________
//    Ваша задача: требуется доработать программу, которая хранит данные по средней температуре в течение дня на планете, добавив следующий функционал:
//
//    В случае падения температуры ниже -30 градусов вывести сообщение "Оставайтесь на базе".
//
//    val nightTemperatureList = arrayOf(-10, -55, -25, -30, -50, -55, -60, -5)
//
//    for(index in nightTemperatureList.indices) {
//        if(nightTemperatureList[index] < -30) {
//            println("День ${index+1}. Оставайтесь на базе")
//        }
//    }
//


// ____________________________________

//    Примеры решения задач:
//    Задача 1.
//    Перед заседанием Совета джедаев протокольный дроид приветствует всех магистров и раздает отчеты.
//    Модернизируйте программу дроида. При встречи дроида с Оби-Ваном Кеноби замените стандартное приветствие на "Привет, Оби-Ван".
//
//    val jedi = arrayOf(
//        "Мейс Винду",
//        "Пло Кун",
//        "Ки-Ади-Мунди",
//        "Сэси Тийн",
//        "Шаак Ти",
//        "Эвен Пиел",
//        "Оппо Ранцизис",
//        "Ади Галия",
//        "Йода",
//        "Коулман Требор",
//        "Иит Кот",
//        "Оби-Ван Кеноби"
//    )
//
//    for (jediName in jedi) {
//        if (jediName == "Оби-Ван Кеноби") {
//            println("Привет, Оби-Ван")
//        } else {
//            println("Здравствуйте, магистр")
//        }
//    }
//


//    Задача 2.
//    Оби-Ван оценил шутку. Повторно модернизируйте программу протокольного дроида.
//    При встрече дроида с Мейсом Винду отключите приветствие.
//
//    val jedi = arrayOf(
//        "Мейс Винду",
//        "Пло Кун",
//        "Ки-Ади-Мунди",
//        "Сэси Тийн",
//        "Шаак Ти",
//        "Эвен Пиел",
//        "Оппо Ранцизис",
//        "Ади Галия",
//        "Йода",
//        "Коулман Требор",
//        "Иит Кот",
//        "Оби-Ван Кеноби"
//    )
//
//    for (jediName in jedi) {
//        if (jediName == "Мейс Винду") {
//            continue
//        } else {
//            println("Здравствуйте, магистр")
//        }
//    }


//    Задача 3.
//    Не все заседания Совета джедаев проходят малым кругом, некоторые из них посещают юнлинги или падаваны с учителями.
//    Для таких случаев решено создать "реестр посетителей". Примечание: максимальное количество посетителей одного заседания строго регламентировано.

//    val maxGuestCount = 10
//
//    /*1*/  /*2*/      /*3*/       /*4*/
//    val guests =
//        Array<String>(maxGuestCount) { "" } // создаем массив (1), в котором можно хранить значения типа String (2).
//    // Размер массива определяет переменная maxGuestCount (3). Каждый элемент массива содержит пустую строку (4).
//
//    var index = 0
//    while (index < maxGuestCount) {
//        val guestName = readln() // считываем имя гостя из консоли
//        guests[index] = guestName // записываем в массив значение
//        index++ // увеличиваем индекс для нового элемента
//    }
//
//    println("Список гостей:")
//    for (guest in guests) {
//        println(" - $guest")
//    }


//    Задача 4.
//    Протокольному дроиду поручили передать секретное послание для Йоды .
//    Модернизируйте программу дроида.Если протокольный дроид не найдет адресата, ему следует вернуться на базу.
//
//    val jedi = arrayOf(
//        "Мейс Винду",
//        "Пло Кун",
//        "Ки-Ади-Мунди",
//        "Сэси Тийн",
//        "Шаак Ти",
//        "Эвен Пиел",
//        "Оппо Ранцизис",
//        "Ади Галия",
//        "Йода",
//        "Коулман Требор",
//        "Иит Кот",
//        "Оби-Ван Кеноби"
//    )
//
//// Флаг (переменная, которая хранит логическое значение и используется в качестве условия для выполнения определенного действия)
//    var jediFound = false
//
//    for (jediName in jedi) { // проверяем все элементы в массиве
//        if (jediName == "Йода") { // если элемент удовлетворяет условию
//            println("Вам секретное послание!") // выполняем задачу
//            jediFound = true // обновляем значение для флага
//            break // завершаем обход, чтобы не тратить лишнее время
//        }
//    }
//
//    if (!jediFound) { // если обошли весь массив, но не выполнили задачу
//        println("Секретное послание не было доставлено. Возвращаюсь на базу") // выполняем блок кода
//    }


// ____________________________________

//    val stringArray: Array<String> = arrayOf("Звёздный крейсер", "тяжелый линкор", "легкий фрегат", "корвет")
////    printArray(stringArray)
//
//    val ints: Array<Int> = arrayOf(150, 260, 380, 740, 999)
//    val double: Array<Double> = arrayOf(150.5, 260.0, 380.0, 740.0, 999.9)
//    val boolean: Array<Boolean> = arrayOf(true, false, false, true)
//
//    println("["+stringArray.joinToString()+"]")
//    println("["+ints.joinToString()+"]")
//    println("["+double.joinToString()+"]")
//    println("["+boolean.joinToString()+"]")




//________________________________________________________________________________________________

//    Цикл For
// ____________________________________
//ЗАДАЧА **
//    Метеорологическая станция *Stars-1* передала данные о температуре за последние 7 дней.
//    Ваша задача: напишите программу, которая определит самый тёплый и самый холодный день.
//    Примечание: самый теплый день - максимальное значение температуры, а самый холодный - минимальное значение.

//    var tempMax = 0
//    var tempMin = 0
//    var dayWeekMax = ""
//    var dayWeekMin = ""
//
//    println("Введите температуры за 7 дней:")
//
//    for (i in 1..7) {
//
//    val currentDay = when (i) {
//        1    -> "Понедельник"
//        2    -> "Вторник"
//        3    -> "Среда"
//        4    -> "Четверг"
//        5    -> "Пятница"
//        6    -> "Суббота"
//        7    -> "Воскресенье"
//        else -> ""
//    }
////
//
//        var currentTemp = readln().toInt()
//
//        if (i == 1) {
//            tempMax = currentTemp
//            tempMin = currentTemp
//            dayWeekMax = currentDay
//            dayWeekMin = currentDay
//        }
//
//        if (currentTemp > tempMax) {
//            tempMax = currentTemp
//            dayWeekMax = currentDay
//        }
//        if (currentTemp < tempMin) {
//            tempMin = currentTemp
//            dayWeekMin = currentDay
//        }
//
//
//    }
//
//    println("Самый теплый день: $dayWeekMax")
//    println("Самый холодный день: $dayWeekMin")


// ____________________________________
//    Задача
//    В магазине OrbitWear продаются футуристические скафандры.
//    Клиенты жалуются, что не видят все варианты расцветок и размеров. Ваша задача — автоматизировать подбор.
//    Ваша задача: напишите программу, которая выведите все возможные комбинации в формате - "Цвет + Размер".
//
//    Примечание: доступны следующие размеры скафандров - "XS", "M", "XL".
//
//    val sizes = 3
//
//    println("Введите количество цветов скафандров:")
//    val colorCount = readln().toInt()
//
//    for (colorNumber in 1..colorCount) {
//        println("Введите цвет #${colorNumber}:")
//        val color = readln()
//
//        println("Список доступных моделей:")
//        for(sizeId in 1 ..sizes) {
//            val sizeName = when(sizeId) {
//                1 -> "XS"
//                2 -> "M"
//                3 -> "XL"
//                else -> ""
//            }
//            println(" - $color $sizeName")
//        }
//
//        println()
//    }


    //        val numbers = 9 // количество цифр для таблицы умножения
//
//        println("Таблица умножения:")
//        for (number1 in 1..numbers) { // для каждой цифры
//            for (number2 in 1..numbers) { // выполняем умножение на все другие
//                println("${number1} x ${number2} = ${number1 * number2}") // и выводим результат
//            }
//        }
//


// ____________________________________

//    Сбор клубники занимает значительную часть доходов у аграрных планет.
//
//    И для повышения этого дохода на оперативном совещании принят закон о награждении самого эффективного сборщика.
//
//    Ваша задача: напишите программу, которая проанализирует собранный урожай каждого сборщика и найдет самого эффективного.
//
//    Примечание: эффективный сборщик - сборщик, который собрал больше всего урожая клубники.



//    println("Введите количество сборщиков:")
//    val count = readln().toInt()
//    var goodHarvest = 0
//    var goodHarvestNumber = 0
//
//    for (i in 1..count) {
//        println("Введите урожай сборщика #$i:")
//        val harvest = readln().toInt()
//
//        if (i == 1) goodHarvest = harvest
//
//        if (harvest > goodHarvest) {
//            goodHarvest = harvest
//            goodHarvestNumber = i
//
//        }
//
//    }
//
//    println("Самый эффективный сборщик: #$goodHarvestNumber | ${goodHarvest}т")
//


// ____________________________________
//    Задача 1. Напишите программу для поиска максимального значения в списке.
//

//        val items = 5 // количество элементов для проверки
//
//        var maxItemValue = 0 // переменная для хранения найденного значения
//
//        for (itemNumber in 1..items) {
//            println("Введите значение элемента:")
//            val currentItemValue = readln().toInt()
//
//            if(itemNumber == 1) { // если это первый элемент в списке
//                maxItemValue = currentItemValue // устанавливаем его максимальным
//            }
//            if (currentItemValue > maxItemValue) { // для остальных проверяем истинность условия
//                maxItemValue = currentItemValue // и в случае истинности выполняем код
//            }
//        }
//
//        println("Максимальное значение: $maxItemValue") // печатаем найденное максимальное значение


    // ____________________________________

//    Задача 2. Напишите программу для фильтрации значений в списке.
//
//
//        val items = 5 // количество элементов для проверки
//
//        val filterNumber = 4 // определяем какой номер запрещён
//
//        for (itemNumber in 1..items) {
//            println("Введите значение элемента:")
//            val inputNumber = readln().toInt()
//
//            if (inputNumber != filterNumber) { // проверяем истинность условия
//                println("Значение разрешено: ${inputNumber}") // печатаем обновленный список
//            } else {
//                println("Значение запрещено") // или выводим предупреждение
//            }
//        }
////




// ____________________________________
//    Задача 3. Напишите программу для печати таблицы умножения.
//
//
//        val numbers = 9 // количество цифр для таблицы умножения
//
//        println("Таблица умножения:")
//        for (number1 in 1..numbers) { // для каждой цифры
//            for (number2 in 1..numbers) { // выполняем умножение на все другие
//                println("${number1} x ${number2} = ${number1 * number2}") // и выводим результат
//            }
//        }
//

// ____________________________________

//    Задача
//    Вы — таможенный инспектор на космопорте Альфа. Вам поручено проверить грузы на наличие запрещённых предметов.
//
//    Для сокращения затрат знакомые предложили автоматизировать этот процесс .
//
//    Ваша задача : напишите программу, которая проанализирует список грузов на наличие в «чёрном списке»
//    ("Контейнер X", "Ящик Z") и выведет "Груз #{порядковый_номер_груза} задержан!" при соответствии.
//
//
//    println("Введите количество ящиков для проверки:")
//    val countOfConteiners = readln().toInt()
//
//    for (count in 1..countOfConteiners) {
//        println("Введите название груза #$count:")
//        val nameOfConteiners = readln();
//
//        when (nameOfConteiners) {
//            "Контейнер X", "Ящик Z" -> {
//                println("Груз #$count задержан!")
//            }
//        }
//
//    }

// ____________________________________

//    Задача
//    Вам поступил запрос от Космической академии.
//
//    Ассистенты в библиотеке не справляются с ревизией книг.
//
//    Ваша задача: напишите программу, которая считает количество книг со статусом "На руках".
//
//    println("Введите количество книг для проверки:")
//    val countOfBooks = readln().toInt()
//
//    var bookStatusCount = 0
//
//    for (count in 1..countOfBooks) {
//        println("Введите название книги $count: ")
//        val nameBook = readln();
//        println("Введите статус книги \"$nameBook\": ")
//        var bookStatus = readln()
//
//        if(bookStatus == "На руках") {
//            bookStatusCount++
//        }
//
//    }
//
//    println("Количество книг со статусом \"На руках\": $bookStatusCount")

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


