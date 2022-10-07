package edu.todo.lib

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class TodoCategory(
    name: String,
    description: String = String(),
    ownerId: Int
): Serializable {
    val UniqueId: Int
    var Name: String = name
    var Description: String = description
    val Owners: MutableList<Int> = mutableListOf()

    init {
        UniqueId= getUniqueId()
        Owners.add(ownerId);
    }

    companion object {
        fun decodeFromString(jsonString: String): TodoItem = Json.decodeFromString(jsonString)
    }
}