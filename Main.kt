fun main(){

    // Calculator app mr younes >>

    print("[-]Enter the first number :")
    val num1 = readln()!!.toDouble()

    print("[-]Enter the second number:")
    val num2 = readln()!!.toDouble()

    print("[-]Enter an operator ( + ,- ,* ,/)")
    val  operator = readln()!!

    val result = when(operator){
        "+" -> num1 + num2
        "-" -> num1 + num2
        "*" -> num1 + num2
        "/" -> num1 + num2

        else -> {
            println("Tnvalid operator")
            return
        }

    }
    println("Result: $result")
//
}