fun main(){
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 22

    twoSum(nums, target).forEach {
        print(it)
    }

}

fun twoSum(nums: IntArray, target: Int): IntArray {
    for(i in 0 until (nums.size-1)){
       for(j in i+1 until nums.size){
           if(nums[i]+nums[j]==target){
               return intArrayOf(i,j)
           }
       }
    }
    return intArrayOf()
}