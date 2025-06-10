// fun main(){
//     var num1 = 11;
//     if(num1 == 10){
//         println("The number is equal to 10")
//     }
//     else{
//         println("The number is not equal to 10")
//     }
//     var message = if(num1 == 10){
//         println("The number is equal to 10")
//     }
//     else{
//         println("The number is not equal to 10")
//     }

//     println("Message is $message")

//     var message1 = if (num1 <10) "Less" else "More"
//     println("Message1 is $message1")
// }

// When statements 
fun main(){
    var num1 = 5
    when(num1){
        1 -> println("This is one")
        2 -> println("This is two")
        else -> {
            println("Invalid Entry")
            println("Enter valid number")
        }
    }

    var message = when(num1){
        1 -> "This is one"
        2 -> "This is two"
        else -> "Invalid Entry"
    }
    print("Message is $message")
}

