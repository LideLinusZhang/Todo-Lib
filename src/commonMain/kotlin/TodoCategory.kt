package edu.todo.lib

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Suppress("unused")
class TodoCategory(
    var name: String,
    var description: String,
    ownerId: UInt
): Serializable {
    val uniqueId: UInt
    val owners: MutableList<UInt> = mutableListOf()

    init {
        uniqueId= getUniqueId()
        owners.add(ownerId)
    }

    companion object {
        fun decodeFromString(jsonString: String): TodoItem = Json.decodeFromString(jsonString)
    }
}