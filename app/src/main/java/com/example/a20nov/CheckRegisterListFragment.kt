package com.example.a20nov

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.a20nov.databinding.FragmentCheckRegisterListBinding


/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class CheckRegisterListFragment : Fragment() {

    private var _binding: FragmentCheckRegisterListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCheckRegisterListBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnVolver.setOnClickListener {
            findNavController().navigate(R.id.action_CheckRegisterListFragment_to_CheckRegisterDetailsFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}