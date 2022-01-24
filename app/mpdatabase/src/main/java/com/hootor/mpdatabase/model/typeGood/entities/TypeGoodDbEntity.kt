package com.hootor.mpdatabase.model.typeGood.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "type_good"
)
data class TypeGoodDbEntity(
    @ColumnInfo(name="ref") @PrimaryKey val ref: String,
    @ColumnInfo(name="title") val title: String
)
