package com.hootor.mpdatabase.model.good

import androidx.room.*
import com.hootor.mpdatabase.model.good.entities.GoodDbEntity
import com.hootor.mpdatabase.model.good.entities.GoodsListTuple
import kotlinx.coroutines.flow.Flow

@Dao
abstract class GoodsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insert(goodDbEntity: GoodDbEntity)

    @Transaction
    open suspend fun saveGoods(goods: List<GoodDbEntity>) {
        goods.forEach { goodDbEntity ->
            insert(goodDbEntity)
        }
    }

    @Query("SELECT ref, title, parent, isGroup FROM goods WHERE parent =:parent")
    abstract fun findByParentForList(parent: String): Flow<List<GoodsListTuple>>

}