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

class RegisterFragment : Fragment(R.layout.fragment_register){
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonRegister: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        init()
        registerListeners(view)

    }


    private fun init(){
        editTextEmail = requireView().findViewById(R.id.editTextEmail)
        editTextPassword = requireView().findViewById(R.id.editTextPassword)
        buttonRegister = requireView().findViewById(R.id. buttonRegister)
    }

    private fun registerListeners(view: View) {
        buttonRegister.setOnClickListener {

            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()

            if (email.isEmpty() || password.isEmpty()){
                Toast.makeText(activity, "ცარიელია", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener{task ->
                    if (task.isSuccessful){
                        val controller = Navigation.findNavController(view)
                        val action = RegisterFragmentDirections.actionRegisterFragmentToLoginFragment3()
                        controller.navigate(action)
                        Toast.makeText(activity, "რეგისტრაცია წარმატებით დასრულდა", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(activity, "ERROR!", Toast.LENGTH_SHORT).show()
                    }

                }

        }
    }
}

