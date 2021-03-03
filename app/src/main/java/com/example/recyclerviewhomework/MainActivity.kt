package com.example.recyclerviewhomework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerviewhomework.fragments.ContentFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contentFragment = ContentFragment()
        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragmentContainer, contentFragment)
                    .commit()
        }

        changeFragmentColor.setOnClickListener {
            val fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer) as? OnEventListener
            fragment?.onChangeColorFragmentClicked() ?: throw ClassCastException("ERROR!")
        }
    }

    interface OnEventListener {
        fun onChangeColorFragmentClicked()
    }
}