// Standard library function which are pre-defined functions like print(),sqrt()
// User defined functions are created by the developer to perform a specific task, The signature would look something like this : 
// fun_keyword fun_name (Paremeter_list:datatype) : return type {}
// we can also use one liner functions if it is an expression
// a function must be called within the main fucntion
// different ways of calling a function are : 
// There are three ways of calling a function : 
// 1. Function default arguments, 2. Function named arguments, 3. Variable number of arguments


fun main(){
    myFun("I am IronMan","Marvel")
}
fun myFun(message:string, name:string){
    println("Message : $message for  $name")
}