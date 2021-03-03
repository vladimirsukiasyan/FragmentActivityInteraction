package com.example.recyclerviewhomework.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recyclerviewhomework.MainActivity
import com.example.recyclerviewhomework.R


class ContentFragment : Fragment(), MainActivity.OnEventListener {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_content, container, false)
        return view
    }

    override fun onChangeColorFragmentClicked() {
        view?.setBackgroundResource(R.color.black)
    }
}