package io.github.harutiro.mytodo

import android.content.Context
import androidx.room.Room
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.github.harutiro.mytodo.model.todo.ToDoDAO
import io.github.harutiro.mytodo.model.todo.ToDoDatabase
import io.github.harutiro.mytodo.repository.todo.ToDoRepository
import io.github.harutiro.mytodo.repository.todo.ToDoRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ToDoModule {
    @Singleton
    @Provides
    fun provideToDoDatabase(
        @ApplicationContext context: Context
    ): ToDoDatabase {
        return Room.databaseBuilder(
            context,
            ToDoDatabase::class.java,
            "todo.db"
        ).build()
    }

    @Singleton
    @Provides
    fun procideToDoDAO(db: ToDoDatabase):ToDoDAO{
        return db.todoDAO()
    }
}

@Module
@InstallIn(SingletonComponent::class)
abstract class ToDoRepositoryModule {
    @Singleton
    @Binds
    abstract fun bindToDoRepository(
        impl: ToDoRepositoryImpl
    ): ToDoRepository
}