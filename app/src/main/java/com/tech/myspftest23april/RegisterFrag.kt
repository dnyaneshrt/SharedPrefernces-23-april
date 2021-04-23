package com.tech.myspftest23april

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.register_frag.*
import kotlinx.android.synthetic.main.register_frag.view.*

class RegisterFrag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var inflater = LayoutInflater.from(context)
        var view = inflater.inflate(R.layout.register_frag, container, false)

//this interface object isued to get spf
        var spf = activity?.getSharedPreferences("myspf23", Context.MODE_PRIVATE)

        //spf.edit();

        var editor: SharedPreferences.Editor? = spf?.edit()


        /*      possible modes are
              Context.MODE_PRIVATE
              Context.MODE_WORLD_READABLE
               Context.MODE_WORLD_WRITEABLE
         */

        view.btn_register.setOnClickListener {


            var username = et_username.text.toString()
            var password = et_password.text.toString()

            editor?.putString("username", username)
            editor?.putString("password", password)
            editor?.commit()


Toast.makeText(activity,"data registered successfully",Toast.LENGTH_SHORT).show()

            var fmanager = activity?.supportFragmentManager
            var tx = fmanager?.beginTransaction()
            tx?.replace(R.id.myframe, LoginFrag())
            tx?.commit()

        }

        return view
    }
}