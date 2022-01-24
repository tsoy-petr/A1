package com.hootor.mpdatabase

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hootor.mpdatabase.model.characteristic.CharacteristicGoodDao
import com.hootor.mpdatabase.model.characteristic.entities.CharacteristicGoodDbEntity
import com.hootor.mpdatabase.model.good.GoodsDao
import com.hootor.mpdatabase.model.good.entities.GoodDbEntity
import com.hootor.mpdatabase.model.typeGood.TypeGoodDao
import com.hootor.mpdatabase.model.typeGood.entities.TypeGoodDbEntity
import com.hootor.mpdatabase.model.unit.UnitsDao
import com.hootor.mpdatabase.model.unit.entities.UnitGoodDbEntity
import com.hootor.mpdatabase.model.unit.entities.UnitTypeGoodDbEntity

@Database(
    version = 1,
    entities = [
        GoodDbEntity::class,
        UnitGoodDbEntity::class,
        UnitTypeGoodDbEntity::class,
        CharacteristicGoodDbEntity::class,
        TypeGoodDbEntity::class
    ]
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getGoodsDao(): GoodsDao
    abstract fun getUnitDao(): UnitsDao
    abstract fun getTypeGoodDao(): TypeGoodDao
    abstract fun getCharacteristicGoodDao(): CharacteristicGoodDao

}