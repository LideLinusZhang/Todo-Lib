package edu.todo.lib

@Suppress("unused")
class Owner(var userName: String) {
    val uniqueId: Int = getUniqueId()

    // TODO: user authentication info
    val todoCategories: MutableList<TodoCategory> = mutableListOf()
}