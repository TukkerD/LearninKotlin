import java.math.RoundingMode
import java.text.DecimalFormat


class Currency(){
var converted = Double
    fun convert(currency: String, amount: Double): Any {
        if (currency == "1"){
            val yen = 129.259053
            var converted = amount * yen
            val df = DecimalFormat("#.##")
            df.roundingMode = RoundingMode.UP
            var round = df.format(converted).toDouble()
            return round
        }
        if (currency == "2"){
            val pesos = 19.93
            var converted = amount * pesos
            val df = DecimalFormat("#.##")
            df.roundingMode = RoundingMode.UP
            var round = df.format(converted).toDouble()
            return round
        }
        if (currency == "3"){
            val pounds = .80
            var converted = amount * pounds
            val df = DecimalFormat("#.##")
            df.roundingMode = RoundingMode.UP
            var round = df.format(converted).toDouble()
            return round
        }
        if (currency == "4"){
            val rupee = 1.26
            var converted = amount * rupee
            val df = DecimalFormat("#.##")
            df.roundingMode = RoundingMode.UP
            var round = df.format(converted).toDouble()
            return round
        }
        return 0
    }
}

fun main(args: Array<String>){
    var currency = "9"
    while(currency != "0"){
        println("Welcome to The Currency Converter!")
        println("What do you want USD converted to?")
        println("")
        println("1. Yen")
        println("2. Pesos")
        println("3. Pounds")
        println("4. Rupees")
        println("0. Quit")
        currency = readLine().toString()

        if(currency == "0"){
            break
        }

        println()
        println("What is the amount you want converted in USD?")
        val amount = readLine()!!.toDouble()


        if(currency == "1"){
            println()
            println("$$amount USD is roughly ¥" + Currency().convert(currency, amount)+" Yen.")
            currency = "0"
            break
        }
        if(currency == "2"){
            println()
            println("$$amount USD is roughly MX$" + Currency().convert(currency, amount)+" Pesos.")
            currency = "0"
            break
        }
        if(currency == "3"){
            println()
            println("$$amount USD is roughly £" + Currency().convert(currency, amount)+" British Pounds.")
            currency = "0"
            break
        }
        if(currency == "4"){
            println()
            println("$$amount USD is roughly ₹" + Currency().convert(currency, amount)+" Indian Rupees.")
            currency = "0"
            break
        }
    }
}

