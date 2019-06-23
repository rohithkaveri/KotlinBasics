import kotlin.math.*

fun main() {
    //doing math using val/var and math import
    var integerVal = 5
    var val2 = integerVal++
    println(val2)
    println(integerVal)
    var answer = integerVal % val2
    println(answer)
    var answer2 = (integerVal).toDouble()/(val2.toDouble())
    println(answer2)
    answer2 = -answer2
    val answer3 = abs(answer2)
    println(answer3)

    val numAnswer = addValues(num2 = answer2, num1 = answer3)
    //using named parameters means any order
    println("the result is $numAnswer")

    val sumAnswer = sum(1,2,3,4,5,6)
    println("sumAnswer is $sumAnswer")

    print("enter ur state: ")
    val stateUS:String? = readLine()
    //-> goes into switch statement "when"
    //if (stateUS == "US") println("nice")
    //else println("no")
    val stringAns = findCapital(stateUS)
    println(stringAns)

    val stablevar = 50
    val thenumAns:String? = when( stablevar){
        in 0..9 -> "close"
        in 11..20 -> "bit far"
        else -> {

            "cm'on"
        }
    }
    println("the answer is $thenumAns")


    //null values
    val nullStr:String? = null
    val number1:Int? = nullStr?.length
    //need 2 question marks here
    //null check, -1 is null:
    var isNull = nullStr ?: -1
    println("value of isNull is $isNull")

}
fun addValues (num1:Double, num2:Double):Double{
    return num1+num2
}
//can pass in an array as well
fun sum(vararg numbers:Int):Int{
    var result = 0
    for(i in numbers){
        result += i
    }
    return result
}

fun findCapital(state:String?):String {
    return when(state) {
        "CA" ->  "nice"
        "OR" ->  "why"
        else ->  "no"
    }

}