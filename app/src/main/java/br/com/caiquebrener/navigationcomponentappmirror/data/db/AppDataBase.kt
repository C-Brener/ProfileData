package br.com.caiquebrener.navigationcomponentappmirror.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//Criamos a classe como abstract, pois quem fará implementação da mesma será o room

@Database(entities = [UserEntity::class], version = 1, exportSchema = false)
abstract class AppDataBase : RoomDatabase(){
    companion object{
        @Volatile
        private var INSTANCE:AppDataBase? = null

        fun getDatabase(context: Context):AppDataBase{
            val tempInstance = INSTANCE
            if(tempInstance!=null){
                return  tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDataBase::class.java,
                    "app_datanase"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}