package br.com.douglasmotta.naivagtioncomponentappmirror.ui.registration

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.douglasmotta.naivagtioncomponentappmirror.data.repository.interfaces.UserRepository

class RegistrationViewModelFactory(private val userRepository:UserRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return RegistrationViewModel(userRepository) as T
    }
}