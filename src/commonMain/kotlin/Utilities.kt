@file:Suppress("unused")

package edu.uwaterloo.cs.todo.lib

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.security.MessageDigest
import kotlin.text.Charsets.UTF_8

const val realm: String = "edu.uwaterloo.cs.todo"

fun getHashedPassword(userName: String, password: String): ByteArray =
    MessageDigest.getInstance("MD5").digest("$userName:$realm:$password".toByteArray(UTF_8))

fun breakLines(s: String, lineWidth: Int): String {
    return buildString {
        var currentLineLength = 0
        for (word in s.split(Regex("\\\\s+"))) {
            if (currentLineLength + 1 + word.length > lineWidth) {
                append("\n")
                currentLineLength = 0
            } else {
                append(" ")
                currentLineLength++
            }

            append(word)
            currentLineLength += word.length
        }
    }
}

fun serializeItemList(list: List<TodoItemModel>): String {
    return Json.encodeToString(list)
}

fun deserializeItemList(json: String): List<TodoItemModel> {
    return Json.decodeFromString(json)
}

fun serializeCategoryList(list: List<TodoCategoryModel>): String {
    return Json.encodeToString(list)
}

fun deserializeCategoryList(json: String): List<TodoCategoryModel> {
    return Json.decodeFromString(json)
}