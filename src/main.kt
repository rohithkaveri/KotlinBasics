import kotlin.math.*

fun main() {
    var integerVal = 5
    var val2 = integerVal++
    println(val2)
    println(integerVal)
    var answer = integerVal % val2
    println(answer)
    var answer2 = (integerVal).toDouble()/(val2.toDouble())
    println(answer2)
    answer2 = -answer2
    var answer3 = abs(answer2)
    println(answer3)


}