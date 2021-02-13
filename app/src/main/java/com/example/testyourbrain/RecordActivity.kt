package com.example.testyourbrain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.testyourbrain.adapter.MyAdapter
import com.example.testyourbrain.db.ColumnName
import com.example.testyourbrain.db.RecordDatabase
import com.example.testyourbrain.db.Records
import com.example.testyourbrain.db.RecordsDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class RecordActivity : AppCompatActivity() {

    private var rcView: RecyclerView? = null
    private var db: RecordDatabase? = null
    private var recordsDao: RecordsDao? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record)
        init()
    }


    private fun init() {
        rcView = findViewById(R.id.rcView)
        var listRecords: ArrayList<Records> = ArrayList<Records>()

        GlobalScope.launch {

            db = Room.databaseBuilder(
                applicationContext,
                RecordDatabase::class.java, "${ColumnName.TABLE_RECORDS}"
            ).fallbackToDestructiveMigration().build()
            recordsDao = db?.recordsDao()

            listRecords = recordsDao?.getAllDesc()!! as ArrayList

            withContext(Dispatchers.Main) {
                rcView?.layoutManager = LinearLayoutManager(this@RecordActivity)
                val myAdapter = MyAdapter(listRecords, this@RecordActivity)
                myAdapter.listArray = listRecords as ArrayList
                rcView?.adapter = myAdapter
            }
        }
    }

    fun onClickBack(view: View) {
        val intent = Intent(this, StartActivity::class.java)
        startActivity(intent)
    }

}