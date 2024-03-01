package com.example.movieapp.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.movieapp.R
import com.example.movieapp.databinding.DialogDeleteFragmentBinding

class DeleteDialog : DialogFragment() {
    private lateinit var binding: DialogDeleteFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogDeleteFragmentBinding.inflate(inflater, container, false)

        isCancelable=true
        return binding.root
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setStyle(STYLE_NO_FRAME, R.style.Theme_Kooky_Component_AlertDialogFragment)
    }
}