package com.example.nikebiskulinariumi.fragment

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.nikebiskulinariumi.R


class SecretFragment : Fragment(R.layout.fragment_secret) {

    private lateinit var perspace: TextView
    private lateinit var Sezamgaige: ImageView



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Handler().postDelayed({
            val controller = Navigation.findNavController(view)
            val action2 = SecretFragmentDirections.actionSecretFragmentToThirdSecretFragment()
            controller.navigate(action2)
        }, 5000)
        perspace = requireView().findViewById(R.id.perspace)
        Sezamgaige = requireView().findViewById(R.id.Sezamgaige)





    }



}

