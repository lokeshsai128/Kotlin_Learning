// Loops are of three types normally as While loop, Do while loop and for loop
// Break statements are classified as two types for stopping the iterations of loops: 
        // Unlabelled Break statements(Normal break)
        // Labelled Break statements (@First , @Second)
//Continue statements are also two types here for skipping the iterations of the loops : 
        // unlabelled continue statements(Normal skipping of iteration)
        // labelled continue statement(@First, @Second, @Inner, @Outer)

fun main(){
    var num1 = 1
    println("**********This is for While Loop******************")
    while(num1<5){
        println("Present Iteration is "+num1)
        num1++;
    }
    println("**********This is for Do-While Loop******************")
    var num2 = 1
    do{
        println("Presen Iteration is "+num2)
        num2++
    }
    while(num2 < 5)
    println("**********This is For Loop******************")
    for(i in 1..5){
        println("Present Iteration is "+i)
    }

}