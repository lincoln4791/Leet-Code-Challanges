package easy

private fun main(){
    print(lengthOfLastWord("   fly me   to   the moon  "))
}

fun lengthOfLastWord(s: String): Int {
    var count=0
    val splitedArray = s.split(" ").toTypedArray()
    val size  = splitedArray.size

    while(true){
        if(splitedArray[size-1+count].isNotEmpty()){
            break
        }
        count--
    }

    return splitedArray[size+count-1].length

}