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


class LoginFragment : Fragment(R.layout.fragment_login) {



    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button
    private lateinit var buttonRegistration: Button
    private lateinit var buttonResetPassword: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        init()
        registerListeners(view)

    }
    private fun registerListeners(view: View) {
        buttonRegistration.setOnClickListener {
            val controller = Navigation.findNavController(view)
            val action2 = LoginFragmentDirections.actionLoginFragment3ToRegisterFragment()
            controller.navigate(action2)
        }

        buttonResetPassword.setOnClickListener {
            val controller = Navigation.findNavController(view)
            val action2 = LoginFragmentDirections.actionLoginFragment3ToResetPasswordFragment()
            controller.navigate(action2)
        }
        buttonLogin.setOnClickListener {
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(activity, "ცარიელია", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            FirebaseAuth.getInstance()
                .signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        val controller = Navigation.findNavController(view)
                        val action = LoginFragmentDirections.actionLoginFragment3ToSecretFragment()
                        controller.navigate(action)

                    } else {
                        Toast.makeText(activity, "ERROR!", Toast.LENGTH_SHORT).show()
                    }

                }


        }
    }

    private fun init() {
        editTextEmail = requireView().findViewById(R.id. editTextEmail)
        editTextPassword = requireView().findViewById(R.id. editTextPassword)
        buttonLogin =requireView().findViewById(R.id. buttonLogin)
        buttonRegistration = requireView().findViewById(R.id. buttonRegistration)
        buttonResetPassword = requireView().findViewById(R.id.  buttonResetPassword)


    }








}
