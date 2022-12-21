package org.tensorflow.lite.examples.imageclassification

import android.content.Intent
import android.content.pm.ActivityInfo
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            // Do something in response to button click
            Log.d("TAG", "BLABLA")
            val myIntent = Intent(this, MainActivity2::class.java)
            startActivity(myIntent)
        }
        val button1: Button = findViewById(R.id.button3)
        button1.setOnClickListener {
            // Do something in response to button click
            System.exit(0)
        }
        val button2: Button = findViewById(R.id.button2)

        button2.setOnClickListener {
            val  mp: MediaPlayer = MediaPlayer.create(this, R.raw.beep_02);
            mp.start()
            //System.exit(0)
        }

    }

}









