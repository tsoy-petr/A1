package com.hootor.mpdatabase.model.unit

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.hootor.mpdatabase.model.unit.entities.UnitGoodDbEntity
import com.hootor.mpdatabase.model.unit.entities.UnitGoodTuples
import com.hootor.mpdatabase.model.unit.entities.UnitTypeGoodDbEntity
import com.hootor.mpdatabase.model.unit.entities.UnitTypeGoodTuples

@Dao
abstract class UnitsDao {

    @Query("SELECT * FROM units_good WHERE parent = :parent")
    abstract fun getUnitsGoodByParent(parent: String): List<UnitGoodDbEntity>

    @Insert
    abstract suspend fun insertUnitsOfGood(unitGoodDbEntity: UnitGoodDbEntity)

    @Transaction
    open suspend fun saveUnitsOfGood(unitGoods: List<UnitGoodDbEntity>){
        unitGoods.forEach { unitDbEntity ->
            insertUnitsOfGood(unitDbEntity)
        }
    }

    @Query("SELECT ref, title, parent FROM units_good")
    abstract suspend fun findUnitsGoodByParent(parent: String): List<UnitGoodTuples>



    @Query("SELECT * FROM units_type_good WHERE parent = :parent")
    abstract fun getUnitsTypeGoodByParent(parent: String): List<UnitTypeGoodDbEntity>

    @Insert
    abstract suspend fun insertUnitsOfTypeGood(unitTypeGoodDbEntity: UnitTypeGoodDbEntity)

    @Transaction
    open suspend fun saveUnitsOfTypeGood(unitsGood: List<UnitTypeGoodDbEntity>){
        unitsGood.forEach { unitDbEntity ->
            insertUnitsOfTypeGood(unitDbEntity)
        }
    }

    @Query("SELECT ref, title, parent FROM units_good")
    abstract suspend fun findUnitsTypeGoodByParent(parent: String): List<UnitTypeGoodTuples>
}