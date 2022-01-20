package com.hootor.mpdatabase

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hootor.mpdatabase.model.good.GoodsDao
import com.hootor.mpdatabase.model.good.entities.GoodDbEntity
import com.hootor.mpdatabase.model.unit.entities.UnitDbEntity

@Database(
    version = 1,
    entities = [
        GoodDbEntity::class,
        UnitDbEntity::class
    ]
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getGoodsDao(): GoodsDao

}