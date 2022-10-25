import java.util.*

fun main(){
        print(getCommonPrefix(arrayOf("cir", "car")))
    //test2()
}


fun getCommonPrefixSolved(strs : Array<String>):String{
    var prefix: String = strs.get(0)
    for (index in 1 until strs.size) {
        while (strs.get(index).indexOf(prefix) !== 0) {
            prefix = prefix.substring(0, prefix.length - 1)
        }
    }
    return prefix
}

private fun getCommonPrefix(list : kotlin.Array<String>) : String {
    var result = ""
    if(list.size==0){
        return ""
    }

    if(list.size==1){
        return list[0]
    }


    var tempResult = ""

    val smallestArrayElementSize = getSmallestArrayIndex(list)
    val arraySile = list.size


    for (i in 0 until smallestArrayElementSize) {
        var count = 0
        for (j in 0 until arraySile-1) {
            if (list[j][i] == list[j + 1][i]) {
                count++
                print("matched :: i=$i :: j=$j :: ${list[j][i]} \n")
            }
            else{
                print("not matched\n")
                tempResult = ""
                //count=0
                break
            }
            print("count $count :: arraysile-1 -> ${arraySile-1} :: i->$i \n")
            if(count==arraySile-1){
                tempResult = tempResult.plus(list[j][i])
                if(tempResult.length>result.length){
                    result=tempResult
                    print("semi temp result ${tempResult}\n")
                }

            }
        }

    }

    //print("Final Result -> $result")
    return result

}

fun getSmallestArrayIndex(list: kotlin.Array<String>): Int {
    var smallestIndex = list[0].length

        for(i in 1 until list.size){
            if(list[i].length<smallestIndex){
                smallestIndex=list[i].length
            }

        }

    return smallestIndex

}


private fun test(){
    val str = arrayOf("linxo","liz","linhskd","avhgbgbgf")
    Arrays.sort(str)

    for (element in str){
        print(element+"\n")
    }

}

private fun test2(){
    val arrayz = arrayOf(1,2,3,4,5,6,7,8,9,10)
    val size = arrayz.size

    for(i in 0 until size){
        print(i)
    }
}
