package edu.uwaterloo.cs.todo.lib

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Suppress("unused")
@Serializable
actual data class TodoCategoryModificationModel (
    val name: String?,
    val favoured: Boolean?,
    val modifiedTime: LocalDateTime
)