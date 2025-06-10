fun main(){
    var arr1 = arrayOf(1,2,3,4,5);
    var arr2 = arrayOf<Int>(1,2,3,4,5);
    var arr3 = intArrayOf(1,2,3,4,5);

    var arr4 = arrayOf(1.0,2.0,3.0,4.0,5.0);
    var arr5 = arrayOf("A","B","C","D","E");

    arr1[0] = 5;
    arr2.set(1,0);

    println(arr1[0])
    println(arr2.get(1))
}