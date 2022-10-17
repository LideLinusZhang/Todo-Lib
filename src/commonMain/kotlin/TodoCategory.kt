package edu.todo.lib

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Suppress("unused")
class TodoCategory(
    var name: String,
    var favored: Boolean,
    ownerId: UInt
): Serializable {
    val uniqueId: UInt = getUniqueId()
    val owners: MutableList<UInt> = mutableListOf()

    init {
        owners.add(ownerId)
    }

    companion object {
        fun decodeFromString(jsonString: String): TodoItem = Json.decodeFromString(jsonString)
    }
}