package edu.todo.lib

import kotlinx.datetime.LocalDate
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Suppress("unused")
class TodoItem(
    var name: String,
    var description: String,
    var categoryId: Int,
    var importance: ItemImportance,
    var deadline: LocalDate,
    ownerId: Int
): Serializable {
    val uniqueId: Int = getUniqueId()
    val owners: MutableList<Int> = mutableListOf()

    init {
        owners.add(ownerId)
    }

    companion object {
        fun decodeFromString(jsonString: String): TodoItem = Json.decodeFromString(jsonString)
    }
}