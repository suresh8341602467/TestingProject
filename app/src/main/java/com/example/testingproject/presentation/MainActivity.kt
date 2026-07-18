package com.example.testingproject.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable

class MainActivity: ComponentActivity() {

    val message = "suresh"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            myMessage(message)
            UserScreen()
        }
    }
}

fun myMessage(message:String){
    println(message)
}
@Composable
fun UserScreen(){

}