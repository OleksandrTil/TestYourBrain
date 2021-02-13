package com.example.testyourbrain.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "${ColumnName.TABLE_RECORDS}")
 data class Records (
    @PrimaryKey (autoGenerate = true) val id:Int,
    @ColumnInfo(name = "${ColumnName.COLUMN_RECORDS}") var rec: Int
)