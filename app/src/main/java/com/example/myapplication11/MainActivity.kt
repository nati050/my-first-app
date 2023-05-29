package com.example.myapplication11

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication11.ui.theme.MyApplication11Theme
import org.w3c.dom.Text
import java.util.logging.Level
import java.util.logging.Logger

class MainActivity : ComponentActivity() {
    var logger = Logger.getLogger("MainActivity")
    lateinit var  edittext:TextView
    lateinit  var btn:Button
    lateinit var emailtext:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)


         edittext=findViewById<TextView>(R.id.textView4)

          emailtext=findViewById<EditText>(R.id.editTextTextEmailAddress2)
         btn=findViewById(R.id.button2)


        btn.setOnClickListener ({logger.log(Level.WARNING,"My first view"  +"edittext"+ edittext.text  + emailtext.text)  })
    }

    override fun onStop() {
        super.onStop()
        logger.log(Level.WARNING,"My first view")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplication11Theme {
        Greeting("Android")
    }
}