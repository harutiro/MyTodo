package io.github.harutiro.mytodo.page.create

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import io.github.harutiro.mytodo.MainViewModel
import io.github.harutiro.mytodo.R

@AndroidEntryPoint
class CreateToDoFragment:Fragment(R.layout.create_todo_fragment) {
    private val vm:CreateToDoViewModel by viewModels()
}