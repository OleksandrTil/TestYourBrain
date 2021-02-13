package com.example.testyourbrain.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RecordsDao {
    @Query("SELECT*FROM ${ColumnName.TABLE_RECORDS}")
    fun getAll(): List<Records>

    @Query("SELECT*FROM ${ColumnName.TABLE_RECORDS} ORDER BY ${ColumnName.COLUMN_RECORDS} DESC")
    fun getAllDesc(): List<Records>

    @Query("SELECT*FROM ${ColumnName.TABLE_RECORDS} WHERE id = :id")
    fun getAllByIds(id: IntArray): List<Records>

    @Insert
    fun insertAll(vararg records: Records)

    @Insert
    fun insert(vararg records: Records)

    @Delete
    fun delete(records: Records)
}