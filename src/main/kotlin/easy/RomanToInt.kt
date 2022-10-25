private fun main(){
        //test()
    print(getIntFromRoman("XI"))
    //print(romanToInt("XIV"))
}

private fun getIntFromRoman(str : String):Int{
    val map : HashMap<Char,Int> = HashMap()
    map['I'] = 1
    map['V'] = 5
    map['X'] = 10
    map['L'] = 50
    map['C'] = 100
    map['D'] = 500
    map['M'] = 1000

    var result = map[str[str.length-1]]

    //print(result)

    for(i in str.length-2 downTo  0){
        if(map[str[i]]!! < map[str[i+1]]!!){
            //print("minus -> ${map[str[i]]}")
            result = result!! - map[str[i]]!!
        }
        else{
            result = result!! + map[str[i]]!!
            //print("plus -> ${map[str[i]]}")
        }

    }

    return result!!

}

private fun romanToInt(S: String): Int {
    var ans = 0
    var num = 0
    for (i in S.length - 1 downTo 0) {
        when (S[i]) {
            'I' -> num = 1
            'V' -> num = 5
            'X' -> num = 10
            'L' -> num = 50
            'C' -> num = 100
            'D' -> num = 500
            'M' -> num = 1000
        }
        if (4 * num < ans){
            ans -= num
        }  else{
            ans += num
        }
    }
    return ans
}

private fun mySol(){
    val n = "xiv"

}


private fun test(){
    val s ="def"
    when(s){
       "abc"-> print("1")
       "def"-> print("2")
       "def"-> print("3")
    }
}