package br.com.caiquebrener.navigationcomponentappmirror.data.repository.interfaces

import br.com.caiquebrener.navigationcomponentappmirror.ui.registration.RegistrationViewParams
import br.com.caiquebrener.navigationcomponentappmirror.data.model.User

interface UserRepository {

    fun createUser(registrationViewParams: RegistrationViewParams)

    fun getUser(id:Long): User

    fun login(username:String, password:String):Long
}