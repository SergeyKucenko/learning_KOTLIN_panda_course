fun main() {


    println("Введите валюту (прием):")
    val inputCurrency = readln()

    println("Введите валюту (получение):")
    val outputCurrency = readln()

    println("Введите количество валюты на обмен:")
    val amountOfCurrency = readln().toInt()

    if (inputCurrency == "Кредиты") {
        if (outputCurrency == "Серебро") {
            val result = amountOfCurrency * 0.05
            println("Выдано (серебро): $result")
        } else if (outputCurrency == "Золото") {
            val result = amountOfCurrency * 0.05
            println("Выдано (золото): $result")
        } else {
            println("Обмен \"$inputCurrency -> $outputCurrency\" не поддерживается")
        }
    } else if (inputCurrency == "Серебро") {
        if (outputCurrency == "Кредиты") {
            val result = amountOfCurrency * 0.05
            println("Выдано (кредиты): $result")
        } else if (outputCurrency == "Золото") {
            val result = amountOfCurrency * 0.05
            println("Выдано (золото): $result")
        } else {
            println("Обмен \"$inputCurrency -> $outputCurrency\" не поддерживается")
        }
    } else if (inputCurrency == "Золото") {
        if (outputCurrency == "Серебро") {
            val result = amountOfCurrency * 0.05
            println("Выдано (серебро): $result")
        } else if (outputCurrency == "Кредиты") {
            val result = amountOfCurrency * 0.05
            println("Выдано (кредиты): $result")
        } else {
            println("Обмен \"$inputCurrency -> $outputCurrency\" не поддерживается")
        }
    } else if (inputCurrency == "Драхмы") {
        if (outputCurrency == "Кредиты") {
            val result = amountOfCurrency /20.0
            println("Выдано (кредиты): $result")
        } else if (outputCurrency == "Драхмы") {
            val result = amountOfCurrency * 0.05
            println("Выдано (кредиты): $result")
        } else {
            println("Обмен \"$inputCurrency -> $outputCurrency\" не поддерживается")
        }
    }






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