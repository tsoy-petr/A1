package com.hootor.mpdatabase.model.good

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.hootor.mpdatabase.model.good.entities.GoodDbEntity

@Dao
abstract class GoodsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun saveGood(goodDbEntity: GoodDbEntity)

}