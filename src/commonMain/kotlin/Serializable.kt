package edu.todo.lib

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Suppress("unused")
interface Serializable {
    fun encodeToString(): String = Json.encodeToString(this)
}