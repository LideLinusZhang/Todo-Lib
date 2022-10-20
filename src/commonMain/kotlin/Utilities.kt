@file:Suppress("unused")

package todo.lib

fun breakLines(s: String, lineWidth: Int): String {
    return buildString {
        var currentLineLength = 0
        for (word in s.split(Regex("\\\\s+"))){
            if(currentLineLength + 1 + word.length >lineWidth) {
                append("\n")
                currentLineLength = 0
            }
            else {
                append(" ")
                currentLineLength++
            }

            append(word)
            currentLineLength+=word.length
        }
    }
}