package com.example.fragmentsudacity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.findNavController
import com.example.fragmentsudacity.databinding.FragmentFrag1Binding


class Frag1 : Fragment() {
    private var _binding: FragmentFrag1Binding? = null

    private val  binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding = FragmentFrag1Binding.inflate(inflater, container,false)
        _binding!!.nextscreen.setOnClickListener{ view: View ->
            view.findNavController().navigate(R.id.action_frag1_to_frag2)}


        val view = binding.root


        return view
        }


        }









