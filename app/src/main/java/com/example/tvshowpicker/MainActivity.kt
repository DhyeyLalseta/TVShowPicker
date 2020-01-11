package com.example.tvshowpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val showList = arrayListOf("Friends", "Naruto", "DBZ", "Brooklyn Nine-Nine", "Pink Panther")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        shuffleButton.setOnClickListener{
            val random = Random()
            val randomTVShow = random.nextInt(showList.count())
            tvShowName.text = showList[randomTVShow]
        }

        addTVShow.setOnClickListener{
            val newShow = addShowText.text.toString()
            showList.add(newShow)
            addShowText.text.clear()
            println(showList)
        }
    }
}
