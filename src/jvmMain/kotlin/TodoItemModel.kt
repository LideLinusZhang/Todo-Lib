package edu.uwaterloo.cs.todo.lib

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable
import java.util.UUID

@Suppress("unused")
@Serializable
actual data class TodoItemModel(
    @Serializable(with = UUIDAsStringSerializer::class)
    val uniqueId: UUID,
    val name: String,
    val description: String,
    @Serializable(with = UUIDAsStringSerializer::class)
    val categoryId: UUID,
    val favoured: Boolean,
    val importance: ItemImportance,
    val deadline: LocalDate?,
    val modifiedTime: LocalDateTime
)