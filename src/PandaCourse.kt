fun main() {

    println("Введите статус погоды: ")
    val weatherStatus = readln()

    println("Введите компонент, требующий ремонта: ")
    val componentName = readln()

    if (weatherStatus == "Хорошая") {
        if (componentName == "Колеса") {
            println("Стоимость ремонта: 150 кредитов")
        } else if (componentName == "Корпус") {
            println("Стоимость ремонта: 250 кредитов")
        } else if (componentName == "Двигатель") {
            println("Стоимость ремонта: 500 кредитов")
        } else {
            println("Стоимость ремонта: определить не удалось")
        }
    }

    if (weatherStatus == "Плохая") {
        if (componentName == "Колеса") {
            println("Стоимость ремонта: 300 кредитов")
        } else if (componentName == "Корпус") {
            println("Стоимость ремонта: 500 кредитов")
        } else if (componentName == "Двигатель") {
            println("Стоимость ремонта: 1000 кредитов")
        } else {
            println("Стоимость ремонта: определить не удалось")
        }
    }


//    if (componentName == "Колеса") {
//        println("Стоимость ремонта: 150 кредитов")
//    } else if (componentName == "Корпус") {
//        println("Стоимость ремонта: 250 кредитов")
//    } else if (componentName == "Двигатель") {
//        println("Стоимость ремонта: 500 кредитов")
//    } else {
//        println("Стоимость ремонта: определить не удалось")
//    }

}