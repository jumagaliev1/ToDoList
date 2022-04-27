package com.example.todolist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.todolist.databinding.FragmentToDoListBinding

class ToDoListFragment: Fragment() {
    private var _binding: FragmentToDoListBinding? = null
    private lateinit var viewModel: ToDoListViewModel
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentToDoListBinding.inflate(layoutInflater, container, false)

        val view = binding.root

        val factory = ToDoListViewModelFactory()
        viewModel = ViewModelProvider(viewModelStore, factory)[ToDoListViewModel::class.java]

        binding.viewModel = viewModel
        binding.lifecycleOwner = this


        return view
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}