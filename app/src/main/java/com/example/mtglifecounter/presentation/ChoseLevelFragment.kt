package com.example.mtglifecounter.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mtglifecounter.R
import com.example.mtglifecounter.databinding.FragmentChoseLevelBinding
import java.lang.RuntimeException


class ChoseLevelFragment : Fragment() {

    private var _binding: FragmentChoseLevelBinding? = null
    private val binding: FragmentChoseLevelBinding
        get() = _binding ?: throw RuntimeException("FragmentChooseLevel == null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChoseLevelBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //TODO написать реализацию
    }
}