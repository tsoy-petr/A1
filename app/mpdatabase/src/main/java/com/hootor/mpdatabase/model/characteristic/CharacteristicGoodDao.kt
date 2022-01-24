package com.hootor.mpdatabase.model.characteristic

import androidx.room.*
import com.hootor.mpdatabase.model.characteristic.entities.CharacteristicGoodDbEntity
import com.hootor.mpdatabase.model.characteristic.entities.CharacteristicListTuple
import com.hootor.mpdatabase.model.good.entities.GoodDbEntity
import com.hootor.mpdatabase.model.good.entities.GoodsListTuple
import kotlinx.coroutines.flow.Flow

@Dao
abstract class CharacteristicGoodDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insert(goodDbEntity: CharacteristicGoodDbEntity)

    @Transaction
    open suspend fun saveCharacteristicGood(characteristicsGood: List<CharacteristicGoodDbEntity>) {
        characteristicsGood.forEach { characteristicGood ->
            insert(characteristicGood)
        }
    }

    @Query("SELECT ref, parent, title FROM characteristic_good WHERE parent =:parent")
    abstract fun findByParentForList(parent: String): List<CharacteristicListTuple>

}