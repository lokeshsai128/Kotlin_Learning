// cannot assign null values by default
//  "?" will be used beside the datatype to define it as nullable
fun main(){
    var nullablereference : String? = "I can take null"
    println(nullablereference)
    nullablereference = null
    println(nullablereference)
}