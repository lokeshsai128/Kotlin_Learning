// cannot assign null values by default
//  "?" will be used beside the datatype to define it as nullable
// functions/methods of nullable references cannot be called directly
// instead we can use a safe null operator "?." which assigns a null value if there is no value
// we can also assign some define value using safe Elvis operator "?:" instead of null
// we also have a non null assertin operator which actually converts an object irrespective of it's type to non null , we use this only in the case when it cannot be null at all  
fun main(){
    var nullablereference : String? = "I can take null"
    println(nullablereference)
    nullablereference = null
    println(nullablereference)
}