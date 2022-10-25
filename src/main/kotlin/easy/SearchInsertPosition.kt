package easy


private fun main(){
    val arr  : IntArray = intArrayOf(0,2,5,6)
    print("\nfinal"+searchInsert(arr,7))
}

private fun searchInsert(nums: IntArray, target: Int): Int {
    var pos = nums.size

    for(i in nums.indices){
        if(nums[i]==target){
            pos=i
            break
        }
        else if(nums[i]>target){
            pos=i
            break
        }
    }

    return pos
}