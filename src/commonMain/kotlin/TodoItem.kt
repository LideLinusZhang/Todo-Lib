package edu.todo.lib

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

enum class ItemImportance {
    CRITICAL,
    VERY_HIGH,
    HIGH,
    NORMAL,
    BELOW_NORMAL,
    LOW
}

class TodoItem(
    name: String,
    description: String = String(),
    categoryId: Int? = null,
    importance: ItemImportance = ItemImportance.NORMAL,
    ownerId: Int
) {
    val Id: Int
    var Name: String = name
    var Description: String = description
    var CategoryId: Int? = categoryId
    var Importance: ItemImportance = importance
    val Owners: MutableList<Int>

    init {
        this.Id = getUniqueId()
        this.Owners = mutableListOf()
        Owners.add(ownerId)
    }

    companion object {
        fun decodeFromString(jsonString: String): TodoItem = Json.decodeFromString(jsonString)
    }

    fun encodeToString(): String = Json.encodeToString(this)
}