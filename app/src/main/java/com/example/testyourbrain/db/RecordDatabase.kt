package com.example.testyourbrain.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Records::class), version = 1)
abstract class RecordDatabase: RoomDatabase() {
    abstract fun recordsDao(): RecordsDao
}