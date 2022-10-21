package edu.uwaterloo.cs.todo.lib

import kotlinx.datetime.LocalDate
import java.util.UUID

@Suppress("unused")
actual interface TodoItem{
    val uniqueId: UUID
    val name: String
    val description: String
    val categoryId: UUID
    val importance: ItemImportance
    val deadline: LocalDate?
}