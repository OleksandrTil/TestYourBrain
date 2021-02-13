package com.example.testyourbrain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.room.Room
import com.example.testyourbrain.db.ColumnName
import com.example.testyourbrain.db.RecordDatabase
import com.example.testyourbrain.db.Records
import com.example.testyourbrain.db.RecordsDao
import com.example.testyourbrain.utils.Сonstants
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ResultActivity : AppCompatActivity() {

    private var correctAnsw: Int = 0
    private var tvFinish: TextView? = null
    private var btnNewGame: Button? = null
    private var textWin: String = ""
    private var db: RecordDatabase? = null
    private var recordsDao: RecordsDao? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        tvFinish = findViewById(R.id.tvFinish)
        btnNewGame = findViewById(R.id.btnNewGame)
        init()
        GlobalScope.launch {

            db = Room.databaseBuilder(
                applicationContext,
                RecordDatabase::class.java, "${ColumnName.TABLE_RECORDS}"
            ).fallbackToDestructiveMigration().build()
            recordsDao = db?.recordsDao()

            val myRecord = Records(0, correctAnsw)
            recordsDao?.insert(myRecord)
        }
    }

    private fun init() {
        correctAnsw = intent.getIntExtra(Сonstants.KEY1, 0)
        textWin = resources.getString(R.string.win)
        tvFinish?.text = "$textWin $correctAnsw"
    }

    fun onClickNewGame(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun onClickRecord(view: View) {
        val intent = Intent(this, RecordActivity::class.java)
        startActivity(intent)
    }
}