package com.example.borredapp.ui.component.main.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.borredapp.R
import com.example.borredapp.ui.component.main.viewmodel.InitialViewModel

class InitialFragment : Fragment() {

    companion object {
        fun newInstance() = InitialFragment()
    }

    private lateinit var viewModel: InitialViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.initial_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InitialViewModel::class.java)
        // TODO: Use the ViewModel
    }

}