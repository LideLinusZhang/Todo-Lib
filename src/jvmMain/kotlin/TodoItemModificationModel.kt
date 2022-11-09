package edu.uwaterloo.cs.todo.lib

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Suppress("unused")
@Serializable
actual data class TodoItemModificationModel(
    val name: String?,
    val description: String?,
    val favoured: Boolean,
    val importance: ItemImportance?,
    val deadline: LocalDate?,
    val modifiedTime: LocalDateTime
)