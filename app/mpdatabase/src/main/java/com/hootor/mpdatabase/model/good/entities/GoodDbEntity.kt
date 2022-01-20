package com.hootor.mpdatabase.model.good.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "goods",
    indices = [
        Index("ref", unique = true),
        Index("parent", unique = false)
    ]
)
data class GoodDbEntity(
    @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo(name="ref") val ref: String,
    @ColumnInfo(name="parent") val parent: String,
    @ColumnInfo(name="title") val title: String,
    @ColumnInfo(name="isGroup") val isGroup: Boolean,
    @ColumnInfo(name="typeNomenclature") val typeNomenclature: String,
    @ColumnInfo(name="flagRemoval") val flagRemoval: Boolean
)