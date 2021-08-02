package com.example.viewpagerhistory.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.viewpagerhistory.MainViewModel
import com.example.viewpagerhistory.R
import kotlinx.android.synthetic.main.fragment_button.*


class ButtonFragment : Fragment() {
    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(requireActivity()).get(
            MainViewModel::class.java
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_button, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_plus.setOnClickListener { viewModel.onPlusClick() }
        btn_minus.setOnClickListener { viewModel.onMinusClick() }
    }


}


