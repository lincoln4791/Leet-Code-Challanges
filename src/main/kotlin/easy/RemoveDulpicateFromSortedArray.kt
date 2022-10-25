package easy


fun main(){
    //print(removeDuplicates()
        val arr =  IntArray(6)
    arr[0]=1
    arr[1]=1
    arr[2]=2
    arr[3]=3
    arr[4]=3
    arr[5]=4
    print("\nfinal"+removeDuplicates(arr))
}

private fun removeDuplicates(nums: IntArray): Int {
    var count = 1
    for(i in 0 until nums.size-1){
        if(nums[i]<nums[i+1]){
            nums[count]=nums[i+1]
            count++
        }
    }

    for(element in nums ){
        print("${element}\n")
    }

    return count
}