fun main(){
    var num1 = 10;
    // var num2 : Float = num1
    var num2 : Float = num1.toFloat();
    println("The converted value : "+ num2)
}

// Implicit conversion not supported --> gives compilation errors
//But for doing this conversion also, we need to use helper methods as --> toInt(), toFloat(),to