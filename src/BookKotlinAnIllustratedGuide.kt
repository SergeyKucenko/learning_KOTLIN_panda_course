fun main() {


    val nameOfSchnauzer: String = "Шейди"

    val breedOfSchnauzer: String = "Миниатюрная"



    fun describe(breed: SchnauzerBreed) = when (breed) {
        SchnauzerBreed.MINIATURE -> "Маленькая"
        SchnauzerBreed.STANDARD -> "Средняя"
        SchnauzerBreed.GIANT -> "Крупная"


    }


    val breed: SchnauzerBreed = SchnauzerBreed.GIANT

    println(SchnauzerBreed.GIANT.height)

    println(SchnauzerBreed.STANDARD.family)
    println(SchnauzerBreed.STANDARD.isShorterThan(40))



}


