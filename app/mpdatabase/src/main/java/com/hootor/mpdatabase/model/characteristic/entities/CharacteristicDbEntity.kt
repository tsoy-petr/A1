package com.hootor.mpdatabase.model.characteristic.entities

import androidx.room.*
import com.hootor.mpdatabase.model.good.entities.GoodDbEntity

@Entity(
    tableName = "characteristic_good",
    primaryKeys = [
        "ref"
    ],
    indices = [
        Index("parent")
    ],
    foreignKeys = [
        ForeignKey(
            entity = GoodDbEntity::class,
            parentColumns = ["ref"],
            childColumns = ["parent"],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        )
    ]
)
data class CharacteristicGoodDbEntity(
    @ColumnInfo(name="ref") val ref: String,
    @ColumnInfo(name="parent") val parent: String,
    @ColumnInfo(name="title") val title: String,
)
