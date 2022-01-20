package com.hootor.mpdatabase.model.unit.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UnitDbEntity(
    @ColumnInfo(name = "ref") @PrimaryKey val ref: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "parent") val parent: String,
    @ColumnInfo(name = "flagRemoval") val flagRemoval: Boolean,
    @ColumnInfo(name = "numerator") val numerator: Int,
    @ColumnInfo(name = "denominator") val denominator: Int,
    @ColumnInfo(name = "modePackaging") val modePackaging: String,
    @ColumnInfo(name = "wight") val wight: Double,
)
