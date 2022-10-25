package easy

import java.util.*


fun main(){
    print(isValid2("[{(}]"))
}

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    for (c in s.toCharArray()) {
        if (c == '('){
            stack.push(')')
            print("pushed -> )\n")
        }
        else if (c == '{') {
            stack.push('}')
            print("pushed -> }\n")
        }
        else if (c == '[') {
            stack.push(']')
            print("pushed -> ]\n")
        }
        else if (stack.isEmpty() || stack.pop() != c){
            return false
        }
    }
    return stack.isEmpty()
}

fun isValid2(s: String): Boolean {
    //var isValid = true
    var insertCounter =0
    var deleteCounter =0
    val list = mutableListOf<Char>()
    var lastOssositeElement  = mutableListOf<Char>()

    for(element in s){
        if(element =='('){
            list.add('(')
            lastOssositeElement.add(')')
            insertCounter++
            print("pushed '('\n")
        }
        else if(element == '{'){
            list.add('{')
            lastOssositeElement.add('}')
            print("pushed '{'\n")
            insertCounter++
        }
        else if (element=='['){
            list.add('[')
            lastOssositeElement.add(']')
            print("pushed '['\n")
            insertCounter++
        }
        else if(lastOssositeElement.isNotEmpty() && element==lastOssositeElement[lastOssositeElement.size-1]){
            list.removeAt(list.size-1)
            lastOssositeElement.removeAt(lastOssositeElement.size-1)
            deleteCounter++
            print("matched\n")
        }

        else if(lastOssositeElement.isNotEmpty() && element!=lastOssositeElement[lastOssositeElement.size-1]){
            print("not magtched -> ic $insertCounter:: dc$deleteCounter ")
            return false
        }

        else{
            print("else -> ic $insertCounter:: dc$deleteCounter ")
            return false
        }

    }

    if (insertCounter != deleteCounter){
        print("not magtched -> ic $insertCounter:: dc$deleteCounter\n")
        return false
    }

    return true
}