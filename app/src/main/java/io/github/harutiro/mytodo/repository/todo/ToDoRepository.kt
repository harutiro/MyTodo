package io.github.harutiro.mytodo.repository.todo

interface ToDoRepository {
    suspend fun create(title:String,detail:String)
}