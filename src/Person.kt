//class Person {
//
//    var name: String = ""
//    var age: Int = 0
//    var weight: Double = 0.0
//    var height: Double = 0.0
//
//    fun sayHello() {
//        println("HELLO")
//    }
//
//    fun run() {
//        repeat(10) {
//            println("Running....")
//        }
//    }
//}


//class Assistant {
//    var name: String = ""
//    var famaly: String = ""
//
//
//    fun bringCoffee(drinkName: String, count: Int) {
//
//        repeat(count) {
//
//            println("Get UP")
//            println("Go to the coffee machine")
//            println("Push button \"$drinkName\"")
//            println("wait")
//            println("get your cup")
//        }
//    }
//}
//_______________________________________________________________

class Car {

    var brand: String = ""
    var model: String = ""
    var enginePower: Int = 0
    var bodyColor: String = ""

    fun drive() {
        println("Еду на автомобиле")
    }

    fun refuel(nameAzs:String, oilName:String, litri:Int) {
        println("Произведена заправка на АЗС \"$nameAzs\" + ")
        println("Марка бензина: $oilName")
        println("Кол-во литров: $litri")
    }

}
