package io.github.harutiro.mytodo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import io.github.harutiro.mytodo.databinding.MainFragmentBinding

class MainFragment:Fragment(R.layout.main_fragment) {
    private val vm:MainViewModel by viewModels()

    private var _binding:MainFragmentBinding? = null
    private val binding:MainFragmentBinding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        this._binding = MainFragmentBinding.bind(view)

        binding.fab.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_createToDoFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        this._binding = null
    }
}