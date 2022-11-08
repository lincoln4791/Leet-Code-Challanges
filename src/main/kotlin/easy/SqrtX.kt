package easy

private fun main(){
    print("\n${mySqrt(8)}")
}

private fun mySqrt(x: Int): Int {
    val low = 0
    var high =x
    var mid = 0

    while(low<=high){
        mid = (high-low)/2
        val gunFol = mid*mid
        print("init mid -> $mid : gunfol -> $gunFol\n")
        if (gunFol > x) {
            high = mid
            print("gunfol high -> $mid\n")
        } else if (gunFol < x) {
            print("gunfol  low -> $mid\n")
            return (mid + 1)
        } else {
            print("gunfol matyched -> $mid\n")
            return mid
        }
    }
    return mid

}


private fun mySqrt2(x: Int): Int {
    var low: Long = 0
    var high = x.toLong()
    var ans: Long = 0
    while (low <= high) {
        val mid = (low + high) / 2
        if (mid * mid < x) {
            low = mid + 1
            ans = mid
        } else if (mid * mid > x) {
            high = mid - 1
        } else {
            return mid.toInt()
        }
    }
    return ans.toInt()

}