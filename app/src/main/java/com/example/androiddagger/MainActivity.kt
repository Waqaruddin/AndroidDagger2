package com.example.androiddagger

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var messageProvider: MessageProvider

    override fun onCreate(savedInstanceState: Bundle?) {
//        val messageProvider =
//            (application as MyApplication).applicationComponent.getMessageProvider()

        //or

        (application as MyApplication).applicationComponent.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.mytextview)
        tv!!.text = messageProvider.getMessage()
    }
}

class MessageProvider @Inject constructor() {
    fun getMessage(): String {
        return "Hello, Universe"
    }
}

