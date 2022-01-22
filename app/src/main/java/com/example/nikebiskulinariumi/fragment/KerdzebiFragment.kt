package com.example.nikebiskulinariumi.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.nikebiskulinariumi.R

class KerdzebiFragment : Fragment(R.layout.fragment_kerdzebi) {


    private lateinit var chalagaji: TextView
    private lateinit var kuchmachi: TextView
    private lateinit var tashmijabi: TextView
    private lateinit var dorado: TextView
    private lateinit var aligatori: TextView
    private lateinit var gebjalia: TextView
    private lateinit var saidumlo: Button
    private lateinit var chalagajienter: Button



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()

        val controller = Navigation.findNavController(view)

        saidumlo.setOnClickListener {
            val action2 = KerdzebiFragmentDirections.actionKerdzebiFragmentToLoginFragment3()
            controller.navigate(action2)
        }
        chalagaji.setOnClickListener {
            val action2 = KerdzebiFragmentDirections.actionKerdzebiFragmentToChalagajisFragment()
            controller.navigate(action2)
        }
        kuchmachi.setOnClickListener {
            val action2 = KerdzebiFragmentDirections.actionKerdzebiFragmentToKuchmachiFragment()
            controller.navigate(action2)
        }

    }






    private fun init() {
        chalagaji = requireView().findViewById(R.id.chalagaji)
        kuchmachi = requireView().findViewById(R.id.kuchmachi)
        tashmijabi = requireView().findViewById(R.id.tashmijabi)
        dorado = requireView().findViewById(R.id.dorado)
        aligatori = requireView().findViewById(R.id.aligatori)
        gebjalia = requireView().findViewById(R.id.gebjalia)
        saidumlo = requireView().findViewById(R.id.saidumlo)

    }
}
