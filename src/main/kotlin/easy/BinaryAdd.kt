package easy

import java.math.BigInteger




private fun main(){
   print(binaryAdd3("101","110"))
}

private fun binaryAdd(arr1 : String , arr2 : String){
    var carry=0
    for(i in arr1.indices){
        /*if(ARR){

        }*/
    }

}

private fun binaryAdd2(a:String,b:String) : String{
    val sb =
        StringBuilder() //Google immutability or string vs stringbuilder if you don't know why we use this instead of regular string

    var i: Int = a.length - 1
    var j: Int = b.length - 1
    var carry = 0 //two pointers starting from the back, just think of adding two regular ints from you add from back

    while (i >= 0 || j >= 0) {
        var sum = carry //if there is a carry from the last addition, add it to carry
        if (j >= 0) sum += b[j--] - '0' //we subtract '0' to get the int value of the char from the ascii
        if (i >= 0) sum += a[i--] - '0'
        sb.append(sum % 2) //if sum==2 or sum==0 append 0 cause 1+1=0 in this case as this is base 2 (just like 1+9 is 0 if adding ints in columns)
        carry = sum / 2 //if sum==2 we have a carry, else no carry 1/2 rounds down to 0 in integer arithematic
    }
    if (carry != 0) sb.append(carry) //leftover carry, add it

    return sb.reverse().toString()
}

private fun binaryAdd3(a:String,b:String) :String{
    return BigInteger(a, 2).add(BigInteger(b, 2)).toString(2)
}

private fun test(){


}



