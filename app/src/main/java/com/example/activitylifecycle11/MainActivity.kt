package com.example.activitylifecycle11

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.activitylifecycle11.ui.theme.ActivityLifecycle11Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(
            applicationContext,
            "onCreate()",
            Toast.LENGTH_SHORT
        ).show()

        enableEdgeToEdge()

        setContent {
            ActivityLifecycle11Theme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.my_photo),
                        contentDescription = "Student Photo",
                        modifier = Modifier.size(250.dp),
                        contentScale = ContentScale.Crop
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(
            applicationContext,
            "onStart()",
            Toast.LENGTH_SHORT
        ).show()
    }
}