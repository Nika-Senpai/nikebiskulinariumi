package com.example.nikebiskulinariumi.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.nikebiskulinariumi.R
import com.google.firebase.auth.FirebaseAuth

class ResetPasswordFragment : Fragment(R.layout.fragment_reset_password)  {
    private lateinit var editTextEmail: EditText
    private lateinit var buttonSendEmail: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()
        registerListeners(view)
    }


    private fun init(){
        editTextEmail = requireView().findViewById(R.id.editTextEmail)
        buttonSendEmail = requireView().findViewById(R.id.buttonSendEmail)

    }

    private fun registerListeners(view: View){
        buttonSendEmail.setOnClickListener {
            val email = editTextEmail.text.toString()
            if (email.isEmpty()){
                Toast.makeText(activity, "E-mail ცარიელია", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            FirebaseAuth.getInstance().sendPasswordResetEmail(email)
                .addOnCompleteListener{ task ->
                    if(task.isSuccessful){
                        val controller = Navigation.findNavController(view)
                        val action = ResetPasswordFragmentDirections.actionResetPasswordFragmentToLoginFragment3()
                        controller.navigate(action)
                        Toast.makeText(activity, "შეამოწმეთ E-mail!", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(activity, "ERROR!", Toast.LENGTH_SHORT).show()
                    }
                }

        }

    }
}
