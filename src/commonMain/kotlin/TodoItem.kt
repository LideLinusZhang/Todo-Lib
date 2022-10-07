package edu.todo.lib

public enum class ItemImportance {
    CRITICAL,
    VERY_HIGH,
    HIGH,
    NORMAL,
    BELOW_NORMAL,
    LOW
}

public class TodoItem(
    name: String,
    description: String = String(),
    categoryId: Int? = null,
    importance: ItemImportance = ItemImportance.NORMAL,
    ownerId: Int
) {
    val Id: Int = getUniqueId()
    var Name: String = name
    var Description: String = description
    var CategoryId: Int? = categoryId
    var Importance: ItemImportance = importance
    val Owners: MutableList<Int> = mutableListOf()

    init {
        Owners.add(ownerId)
    }
}