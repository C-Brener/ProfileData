package br.com.caiquebrener.navigationcomponentappmirror.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import br.com.caiquebrener.navigationcomponentappmirror.data.model.User
import br.com.caiquebrener.navigationcomponentappmirror.ui.registration.RegistrationViewParams


//Anotação que faz com que a classe seja identificada como uma tabela do db

@Entity(tableName = "User")
data class UserEntity(
    @PrimaryKey val id: Long = 0,
    val name: String,
    val bio: String,
    val userName: String,
    val password: String
)

fun RegistrationViewParams.toUserEntity(): UserEntity {
    return with(this) {
        UserEntity(
            name = this.name,
            bio = this.bio,
            userName = this.username,
            password = this.password


        )
    }
}
fun UserEntity.toUser():User{
    return  User(
        id = this.id.toString(),
        name = this.name,
        bio = this.bio
    )
}