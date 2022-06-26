package io.github.harutiro.mytodo.page.detail

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import io.github.harutiro.mytodo.R

@AndroidEntryPoint
class ToDoDetailFragment:Fragment(R.layout.todo_detail_fragment) {
    private val vm:ToDoDeteilViewModel by viewModels()
}