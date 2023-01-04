package org.tensorflow.lite.examples.imageclassification

import android.content.Intent
import android.content.pm.ActivityInfo
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.io.File


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        val fileName = "/data/data/org.tensorflow.lite.examples.imageclassification/files/" + "cas1.txt"
        var file = File(fileName)
        // create a new file
        val isNewFileCreated :Boolean = file.createNewFile()
        if(isNewFileCreated){
            Log.d("neki007","$fileName is created successfully.")
        } else{
            Log.d("neki007","$fileName already exists.")
            Log.d("neki007",file.readText().toString())
        }
        val tsLong = System.currentTimeMillis()
        file.writeText(tsLong.toString())
        Log.d("neki007",file.readText().toString())
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
            mp.start();
            /*var handler: Handler = Handler()
            var runnable: Runnable? = null
            var delay = 3000
            handler.postDelayed(Runnable {
                handler.postDelayed(runnable!!, delay.toLong())
                //Toast.makeText(this@CameraFragment, "This method will run every 10 seconds", Toast.LENGTH_SHORT).show()
                //soundPool.play(sound1, 1.0f, 1.0f, 1, 0, 1.0f)
                mp.start()
            }.also { runnable = it }, delay.toLong())*/
            //mp.start()
            //System.exit(0)
        }

    }

}









