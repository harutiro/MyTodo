package io.github.harutiro.mytodo.model.todo

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ToDoDAO {

    @Query("select * from ToDo where created < :startCreated order by created desc limit :limit")
    fun getWithCreated(startCreated:Long,limit:Int): Flow<List<ToDo>>
//    :で指定をしてあげると、引数で持ってきた値をSQLの書き方に入れ込んでくれる。
//    Flowで記述するとDBの変更があったときに適宜読んでくれる。

    @Insert
    suspend fun create(todo: ToDo)

    @Update
    suspend fun  update(todo: ToDo)

    @Delete
    suspend fun  delete(todo:ToDo)
}