package easy

fun main(){
    val arr =  IntArray(6)
    arr[0]=1
    arr[1]=1
    arr[2]=2
    arr[3]=3
    arr[4]=3
    arr[5]=4
    print("\nfinal"+removeElement(arr,2))
}

private fun removeElement(nums: IntArray, `val`: Int): Int {
    var count=0

    for (element in nums){
        if(element!=`val`){
            nums[count]=element
            count++
        }
    }

    return count
}