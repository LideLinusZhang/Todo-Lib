package edu.todo.lib

class Owner(userName: String) {
    val UniqueId: Int
    var UserName: String = userName
    // TODO: user authentication info
    val TodoCategories: MutableList<TodoCategory> = mutableListOf()

    init {
        UniqueId = getUniqueId()
    }
}