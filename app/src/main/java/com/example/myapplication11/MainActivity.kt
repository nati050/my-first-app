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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_constraint)
    }

    override fun onStop() {
        super.onStop()
        logger.log(Level.WARNING,"My first view")
    }

}