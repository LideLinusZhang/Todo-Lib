@file:Suppress("unused")

package edu.uwaterloo.cs.todo.lib

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

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

fun <T> serializeList(list: List<T>): String {
    return Json.encodeToString(list)
}

fun <T> deserializeList(json: String): List<T> {
    return Json.decodeFromString(json)
}