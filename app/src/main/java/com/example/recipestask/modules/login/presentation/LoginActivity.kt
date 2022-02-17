package com.example.recipestask.modules.login.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.recipestask.R
import com.example.recipestask.databinding.ActivityLoginBinding
import com.example.recipestask.modules.home.presentation.view.homescreen.HomeActivity
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private val loginViewModel: LoginViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loginViewModel.loginResult.observe(this) {
            if (it) {
                startActivity(Intent(this, HomeActivity::class.java))
                this.finish()
            } else
                Snackbar.make(
                    binding.root,
                    "please enter a valid user name and password",
                    Snackbar.LENGTH_SHORT
                ).show()
        }
        binding.btnLogin.setOnClickListener {
            val userName = binding.etUserName.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()
            loginViewModel.login(userName, password)
        }
    }
}