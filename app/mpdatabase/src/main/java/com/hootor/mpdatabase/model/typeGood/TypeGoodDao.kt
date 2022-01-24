package com.hootor.mpdatabase.model.typeGood

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.hootor.mpdatabase.model.typeGood.entities.TypeGoodDbEntity

@Dao
abstract class TypeGoodDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insert(typeGoodDbEntity: TypeGoodDbEntity)

    open suspend fun saveTypeGoods(typeGoodDbEntities: List<TypeGoodDbEntity>) {
        typeGoodDbEntities.forEach {typeGoodDbEntity ->
            insert(typeGoodDbEntity)
        }
    }

}