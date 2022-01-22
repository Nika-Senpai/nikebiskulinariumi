package com.example.nikebiskulinariumi.fragment

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.nikebiskulinariumi.R

class ThirdSecretFragment : Fragment(R.layout.fragment_third_secret) {


    private lateinit var editTextNote: EditText
    private lateinit var buttonAdd: Button
    private lateinit var textView: TextView
    private lateinit var clear: Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()
        val sharedPreferences = requireActivity().getSharedPreferences(
            "amateratsu",
            Context.MODE_PRIVATE
        )
        val text = sharedPreferences.getString("shinigami", "bijo bijuna")

        textView.text = text

        buttonAdd.setOnClickListener() {
            var note = editTextNote.text.toString()
            var text = textView.text.toString()
            var result = note + "\n" + text
            textView.text = result

            if (editTextNote.text.isEmpty()){
                editTextNote.error = "ცარიელია ბიჯო"

            }
            else{
                sharedPreferences.edit().putString("shinigami", result).apply()
            }


                if (editTextNote.isFocused){
                    editTextNote.setText("")
                }

            }



            clear.setOnClickListener {
                textView.text = " "
            }
            }



    private fun init() {
        textView = requireView().findViewById(R.id.textView)
        editTextNote = requireView().findViewById(R.id.editTextNote)
        buttonAdd = requireView().findViewById(R.id.buttonAdd)
        clear = requireView().findViewById(R.id.clear)

    }

}