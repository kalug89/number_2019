import java.util.Random

fun main(args: Array<String>) {

    fun IntRange.random() =
            Random().nextInt((endInclusive + 1) - start) + start

    var error = false
    var number = (0..100).random()
    println(number)
    println("Wpisz numer z zakresu 1 do 100")

    while (!error) {
        var myNumber: Int = readLine()!!.toInt()
        println(myNumber)
        if (number > myNumber) {
            println("Twój numer jest za mały")
        } else if (number < myNumber) {
            println("Twój numer jest za duży")
        } else {
            println("Doskonale - szukana liczba to $number")
            error = true
        }
    }
}
