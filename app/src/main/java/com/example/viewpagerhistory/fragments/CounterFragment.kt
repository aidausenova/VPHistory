package com.example.viewpagerhistory.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.viewpagerhistory.MainViewModel
import com.example.viewpagerhistory.R
import kotlinx.android.synthetic.main.fragment_counter.*

class CounterFragment : Fragment() {
    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(requireActivity()).get(
            MainViewModel::class.java
        )
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         viewModel.archiveCount.observe(viewLifecycleOwner, Observer {
                    tv_counter.text = it.toString()
                })
        return inflater.inflate(R.layout.fragment_counter, container, false)
    }

}