//import TestClass.Companion.addNumbers
import java.lang.NullPointerException
import java.lang.NumberFormatException
import kotlin.math.*
import Operators.*

fun main() {
    //doing math using val/var and math import
    doMath()
    capitalAns()
    //null values
    val nullStr:String? = null
    val number1:Int? = nullStr?.length
    //need 2 question marks here
    //null check, -1 is null:
    var isNull = nullStr ?: -1
    println("value of isNull is $isNull")

    simpleCalc()
    println(TestClass.addNumbers(1,2))

    var mathlib = TestClass()
    mathlib.addtoTotal(1.7)
    println(mathlib.runningTotal)

    val num = TestClass.useOperator(num1=5,num2=3,op="+")
    print(num)

    println(Operators.SUBTRACT.ordinal)

}




//can pass in an array as well
fun sum(vararg numbers:Int):Int{
    var result = 0
    for(i in numbers){
        result += i
    }
    return result
}

fun doMath(){
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

    val numAnswer = TestClass.addNumbers(num2 = answer2.toInt(), num1 = answer3.toInt())
    //using named parameters means any order
    println("the result is $numAnswer")

    val sumAnswer = sum(1,2,3,4,5,6)
    println("sumAnswer is $sumAnswer")
}

fun findCapital(state:String?):String {
    return when(state) {
        "CA" ->  "nice"
        "OR" ->  "why"
        else ->  "no"
    }

}
fun capitalAns(){
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
}

fun withIndices(){
    val values = arrayOf(1,2,3,4,5)
    for (i in values.indices step 2){
        println(values[i])
    }
    //for each loop, can control index increment with "step" keyword
}

fun simpleCalc(){
    try {
        print("enter num1: ")
        val number1 = readLine()!!.toDouble()
        print("enter num2: ")

        val number2 = readLine()!!.toDouble()



        println("select an operation: * + - /")
        val op = readLine()
        val answer =
        when (op){
            "+" -> number1+number2
            "-" -> number1-number2
            "/" -> number1/number2
            "*" -> number1*number2
            else -> "Unknown Operation"

        }
        print(answer)
    }
    catch (e:NumberFormatException){
        println("${e.message} Not an operator/number")
    }
    catch (e:KotlinNullPointerException){
        println("${e.message} entered null number")
    }
}