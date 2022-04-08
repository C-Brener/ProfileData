package br.com.douglasmotta.naivagtioncomponentappmirror.data.repository.interfaces

import br.com.douglasmotta.naivagtioncomponentappmirror.ui.registration.model.RegistrationViewParams
import br.com.douglasmotta.naivagtioncomponentappmirror.data.model.User

interface UserRepository {

    suspend fun createUser(registrationViewParams: RegistrationViewParams)

     fun getUser(id:Long): User

     fun login(username:String, password:String):Long
}