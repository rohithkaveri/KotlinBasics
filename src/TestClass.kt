class TestClass {
    var runningTotal = 0.0
    fun addtoTotal(value:Double){
        runningTotal += value
    }

    companion object{
        fun addNumbers(num1:Int, num2:Int):Int{
            return num1+ num2
        }
        fun useOperator(op:String, num1: Int, num2: Int):Int{
            println("$num1$op$num2")
            return when(op){
                Operators.ADD.op -> num1 + num2
                Operators.SUBTRACT.op -> num1-num2
                else -> -1

            }
        }
    }
}