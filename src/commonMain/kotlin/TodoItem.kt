package edu.todo.lib

import kotlinx.datetime.LocalDate
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Suppress("unused")
class TodoItem(
    var name: String,
    var description: String,
    var categoryId: UInt,
    var importance: ItemImportance,
    var deadline: LocalDate?,
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