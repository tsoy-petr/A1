package com.hootor.mpdatabase.model.unit.entities

import androidx.room.*
import com.hootor.mpdatabase.model.good.entities.GoodDbEntity

@Entity(
    tableName = "units_good",
    indices = [
        Index("ref", unique = true),
        Index("parent", unique = false),
        Index("ref", "parent", unique = true)
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
data class UnitGoodDbEntity(
    @ColumnInfo(name = "ref") @PrimaryKey val ref: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "parent") val parent: String,
    @ColumnInfo(name = "flagRemoval") val flagRemoval: Boolean,
    @ColumnInfo(name = "numerator") val numerator: Int,
    @ColumnInfo(name = "denominator") val denominator: Int,
    @ColumnInfo(name = "modePackaging") val modePackaging: String,
    @ColumnInfo(name = "wight") val wight: Double,
)
