package com.example.testyourbrain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.testyourbrain.utils.Сonstant
import com.example.testyourbrain.utils.ListQuestions
import com.example.testyourbrain.utils.Questions
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var questions = ListQuestions()
    private var listQuestions: ArrayList<Questions> = ArrayList<Questions>()
    private var correctAnsw: Int = 0
    private var incorrectAnsw: Int = 0
    private var pos: Int = 0
    private var counter: Int = 0

    private var tvQuestion: TextView? = null
    private var btnAnswA: Button? = null
    private var btnAnswB: Button? = null
    private var btnAnswC: Button? = null
    private var btnAnswD: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listQuestions = questions.addList()
        init()
        nextQuestion()

        btnAnswA?.setOnClickListener(this)
        btnAnswB?.setOnClickListener(this)
        btnAnswC?.setOnClickListener(this)
        btnAnswD?.setOnClickListener(this)
    }

    private fun init() {
        tvQuestion = findViewById(R.id.tvQuestion)
        btnAnswA = findViewById(R.id.btnAnswA)
        btnAnswB = findViewById(R.id.btnAnswB)
        btnAnswC = findViewById(R.id.btnAnswC)
        btnAnswD = findViewById(R.id.btnAnswD)
    }

    fun nextQuestion() {
        val random: Random = Random
        if (listQuestions.size > 0) {
            pos = random.nextInt(listQuestions.size)
            tvQuestion?.text = listQuestions.get(pos).question
            btnAnswA?.text = listQuestions.get(pos).answer1
            btnAnswB?.text = listQuestions.get(pos).answer2
            btnAnswC?.text = listQuestions.get(pos).answer3
            btnAnswD?.text = listQuestions.get(pos).answer4
        }
        if (counter == 10) {
            val intent = Intent(this, ResultActivity::class.java).apply {
                putExtra(Сonstant.KEY1, correctAnsw)
                putExtra(Сonstant.KEY2, incorrectAnsw)
            }
            startActivity(intent)
            finish()
        }
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btnAnswA -> {
                if (listQuestions.get(pos).trueAnswer.equals(listQuestions.get(pos).answer1)) correctAnsw++
                else incorrectAnsw++
            }
            R.id.btnAnswB -> {
                if (listQuestions.get(pos).trueAnswer.equals(listQuestions.get(pos).answer2)) correctAnsw++
                else incorrectAnsw++
            }
            R.id.btnAnswC -> {
                if (listQuestions.get(pos).trueAnswer.equals(listQuestions.get(pos).answer3)) correctAnsw++
                else incorrectAnsw++
            }
            R.id.btnAnswD -> {
                if (listQuestions.get(pos).trueAnswer.equals(listQuestions.get(pos).answer4)) correctAnsw++
                else incorrectAnsw++
            }
        }
        counter++
        listQuestions.removeAt(pos)
        nextQuestion()
    }
    
}