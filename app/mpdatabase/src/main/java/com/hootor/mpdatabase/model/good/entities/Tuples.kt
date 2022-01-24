package com.hootor.mpdatabase.model.good.entities

data class GoodsListTuple(
    val ref: String,
    val title: String,
    val parent: String = "",
    val isGroup: Boolean
)