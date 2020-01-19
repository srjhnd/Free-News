package com.srjhnd.opennews.data

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull


@Entity(tableName = "headlines_table")
data class Headline(
    @Embedded
    var source: Source?,
    var author: String?,
    @PrimaryKey
    var title: String,
    var description: String?,
    var url: String?,
    var urlToImage: String?,
    var publishedAt: String?,
    var content: String?
)