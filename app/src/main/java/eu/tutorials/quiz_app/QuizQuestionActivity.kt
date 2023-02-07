package eu.tutorials.quiz_app

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class QuizQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val questionsList = Constants.getQuestions()
        Log.i("QuestionsList size is" , "${questionsList.size}")

    }
}