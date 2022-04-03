package br.com.caiquebrener.navigationcomponentappmirror.data.repository.implementation

import br.com.caiquebrener.navigationcomponentappmirror.data.db.dao.UserDao
import br.com.caiquebrener.navigationcomponentappmirror.data.db.toUser
import br.com.caiquebrener.navigationcomponentappmirror.data.db.toUserEntity
import br.com.caiquebrener.navigationcomponentappmirror.data.model.User
import br.com.caiquebrener.navigationcomponentappmirror.data.repository.interfaces.UserRepository
import br.com.caiquebrener.navigationcomponentappmirror.ui.registration.RegistrationViewParams

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