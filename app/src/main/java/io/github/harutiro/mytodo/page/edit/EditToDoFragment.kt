package io.github.harutiro.mytodo.page.edit

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import io.github.harutiro.mytodo.R

@AndroidEntryPoint
class EditToDoFragment:Fragment(R.layout.edit_todo_fragment) {
    private val vm:EditToDoViewModel by viewModels()

}