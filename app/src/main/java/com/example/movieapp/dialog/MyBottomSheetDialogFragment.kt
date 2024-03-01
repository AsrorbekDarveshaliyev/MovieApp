package com.example.movieapp.dialog

import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.movieapp.databinding.FragmentBottomSheetDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class MyBottomSheetDialogFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentBottomSheetDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBottomSheetDialogBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.parentView.minHeight =
            (Resources.getSystem().displayMetrics.heightPixels * 0.75).toInt()

    }
}