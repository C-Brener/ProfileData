package br.com.douglasmotta.naivagtioncomponentappmirror.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey


//Anotação que faz com que a classe seja identificada como uma tabela do db

@Entity(tableName = "User")
data class UserEntity(
    @PrimaryKey val id:Long = 0,
    val name:String,
    val bio:String,
    val userName:String,
    val password:String
)