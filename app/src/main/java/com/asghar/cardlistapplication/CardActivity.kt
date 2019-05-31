package com.asghar.cardlistapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.card_details_fragment.*

class CardActivity : AppCompatActivity() {
    private var cardText = "POSITION"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.card_details_fragment)

        cardText = intent.getStringExtra("FRAGMENT_TEXT")
        cardViewText.text = cardText

    }

}
