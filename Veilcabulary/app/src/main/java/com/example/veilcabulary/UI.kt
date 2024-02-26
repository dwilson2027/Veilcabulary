package com.example.veilcabulary

import android.os.Bundle
import android.util.Size
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.veilcabulary.ui.theme.VeilcabularyTheme
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.padding



class UI : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VeilcabularyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}


// Wordle

enum class WordleScreen() {
    Setup,
    Game
}























// SMS

enum class SMSScreen() {
    Contacts,
    AddContact,
    Messenger,
    Settings
}




@Composable
fun Greeting() {
    Column {
        Text("Messenger", fontSize = 60.sp)
        TextField(value = "Enter message", onValueChange = {})
    }
}

@Preview(showBackground = true, showSystemUi = true )
@Composable
fun DefaultPreview() {
    VeilcabularyTheme {
        Greeting()
    }
}

