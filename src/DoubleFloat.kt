fun main() {

    var manNomber1 = readln().toDouble()
    var simvolOperacii = readln()
    var manNomber2 = readln().toDouble()


    if (simvolOperacii == "+") {
        val summa = (manNomber1+manNomber2)
        println("$summa")
    } else if (simvolOperacii == "-") {
        val minus = (manNomber1-manNomber2)
        println("$minus")
    } else if (simvolOperacii == "/") {
        val delenie = (manNomber1/manNomber2)
        println("$delenie")
    } else if (simvolOperacii == "*") {
        val umnozhenye = (manNomber1*manNomber2)
        println("$umnozhenye")
    }




}