private fun main(){
    print(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"))
    //print('a'+2)
}

private fun checkIfPangram(sentence: String): Boolean {
    for (i in 0..25) {
        val currChar = ('a' + i).toChar()
        print("${sentence.indexOf(currChar)}\n")
        // If 'sentence' doesn't contain currChar, it is not a pangram.
        if (sentence.indexOf(currChar) === -1){
            //print(sentence.indexOf(currChar) === -1)
            return false
        }
    }
    return true
}