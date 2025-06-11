// Standard library function which are pre-defined functions like print(),sqrt()
// User defined functions are created by the developer to perform a specific task, The signature would look something like this : 
// fun_keyword fun_name (Paremeter_list:datatype) : return type {}
// we can also use one liner functions if it is an expression
// a function must be called within the main fucntion
// different ways of calling a function are : 
// There are three ways of calling a function : 
// 1. Function default arguments, 2. Function named arguments, 3. Variable number of arguments
// Recursie function in kotlin is a bit different , we do use tail recurision in the kotlin
// Tail recursion performs the calculation first and then execute the recursive call
// Benefits of using tail recursion are : No need to save current function call in stack memory and also No StackOverflowError during the execution of program

fun main(){
    myFun("I am IronMan","Marvel", 1,2,3,4,5)
}
fun myFun(message:String, name:String, vararg numbers : Int){
    println("Message : $message ,conveying to : $name")
    for(i in numbers){
        print("$i ")
    }
}