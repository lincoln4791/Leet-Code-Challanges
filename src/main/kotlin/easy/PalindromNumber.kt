private fun main(){
    print(isPalindrome(3553))
}

private fun isPalindrome(x: Int): Boolean {
    // Base condition
    if (x < 0) {
        return false
    }
    // Store the number in a variable
    var number = x
    // This will store the reverse of the number
    var reverse = 0
    while (number > 0) {
        reverse = reverse * 10 + number % 10
        number /= 10
    }
    return x == reverse
}