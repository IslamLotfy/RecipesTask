package com.example.recipestask.modules.login.presentation

import androidx.lifecycle.ViewModel
import com.example.recipestask.core.utils.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor() : ViewModel() {
    val loginResult = SingleLiveEvent<Boolean>()

    fun login(userName: String, password: String) {
        if (validateCredentials(userName, password))
            loginResult.postValue(true)
        else
            loginResult.postValue(false)
    }

    private fun validateCredentials(userName: String, password: String): Boolean {
        if(userName.isBlank() || password.isBlank())
            return false
        return true
    }
}