package edu.uwaterloo.cs.todo.lib

import java.util.UUID

@Suppress("unused")
actual interface Owner {
    val uniqueId: UUID
    val name: String
    // TODO: user authentication info
    val todoCategories: MutableList<TodoCategoryModel>
}