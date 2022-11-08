package easy

private fun main(){
        val arr = intArrayOf(9,9,9,9)
    for (element in plusOne2(arr)){
        print(element)
    }
    test()
}

private fun plusOne(digits: IntArray): IntArray {
    var num = 0
    var finalArr  = emptyArray<Int>()

    for(element in digits){
        num = (num *10).plus(element)
    }

    num += 1

    while(num!=0){

    }

    print(num)
    return intArrayOf(1,2)
}

private fun plusOne2(digits: IntArray) : IntArray{
    for (i in digits.size - 1 downTo 0) {
        if (digits[i] < 9) {
            digits[i]++
            return digits
        }
        digits[i] = 0
    }

    val digit = IntArray(digits.size + 1)
    digit[0] = 1
    return digit

}

private fun test(){
    val arr  = IntArray(5)

    for(element in arr){
        print(element)
    }
}