package com.tech.myspftest23april

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class WelcomeFrag:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view=LayoutInflater.from(context).inflate(R.layout.welcome_frag,container,false)
        return view
    }
}