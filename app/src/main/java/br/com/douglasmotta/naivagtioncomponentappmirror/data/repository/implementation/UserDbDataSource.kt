package br.com.douglasmotta.naivagtioncomponentappmirror.data.repository.implementation

import br.com.douglasmotta.naivagtioncomponentappmirror.data.db.dao.UserDao
import br.com.douglasmotta.naivagtioncomponentappmirror.data.db.toUser
import br.com.douglasmotta.naivagtioncomponentappmirror.data.db.toUserEntity
import br.com.douglasmotta.naivagtioncomponentappmirror.data.model.User
import br.com.douglasmotta.naivagtioncomponentappmirror.data.repository.interfaces.UserRepository
import br.com.douglasmotta.naivagtioncomponentappmirror.ui.registration.model.RegistrationViewParams

class UserDbDataSource(
    private val userDao: UserDao
): UserRepository {

    override fun createUser(registrationViewParams: RegistrationViewParams) {

        val userEntity = registrationViewParams.toUserEntity()

        userDao.save(userEntity)

    }

    override fun getUser(id: Long): User {
        return  userDao.getUser(id).toUser()

    }

    override fun login(username: String, password: String): Long {

        return  userDao.login(username, password)

    }
}