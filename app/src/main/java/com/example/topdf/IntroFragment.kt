package com.example.topdf

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.topdf.databinding.FragmentIntroBinding


class IntroFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding: FragmentIntroBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_intro, container, false
        )
        binding.startButton.setOnClickListener (Navigation.createNavigateOnClickListener(R.id.action_introFragment_to_fragmentUploadImage2))
        return binding.root

    }

}