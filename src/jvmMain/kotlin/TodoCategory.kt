package edu.uwaterloo.cs.todo.lib

import java.util.UUID

@Suppress("unused")
actual interface TodoCategory {
    val uniqueId: UUID
    val name: String
    val favoured: Boolean
}