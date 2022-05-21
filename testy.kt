import java.util.Scanner
import kotlin.math.ln

class Name() {
    var test = 12
    fun person() {
        println("Enter your first name")
        var firstname = readLine()

        println("Enter your last name")
        var lastname = readLine()

        println("Hello $firstname, $lastname")
    }
}
fun main(args: Array<String>) {
    val name = Name()
    name.person()
    println("${name.test}")

}

