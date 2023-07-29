package com.example.articletheme

import android.os.Bundle
import android.provider.Contacts
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.data.position

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articletheme.ui.theme.ArticleThemeTheme
import kotlin.text.Typography.less

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticleThemeTheme {
                
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article()
                }
            }
        }
    }
}

@Composable
fun Article(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Image(painter = painterResource(id = R.drawable.imageand) , contentDescription ="image" ,
        modifier = Modifier)

        Text(
            text = "Jetpack Compose tutorial",
            fontWeight=FontWeight.Bold,
            fontSize=24.sp ,
            textAlign=Justify,

            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = "Jetpack Compose is a modern toolkit for building a native Android UI. Jetpack Compose simpilifies and accelerates UI development on Android with less code, powerful tools , and intuitive Kotlin APIs.",

            textAlign=Justify,

            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = " In this tutorial, you 'll build a Simple UI component with declarative  function . Insted ,you will call composable function to define what elements you want , and Compose compiler will do the rest. Jetpack Compose is built around a composable function . These function let you define your app's UI programmatically by describing how it should look and providing data dependencies, rather than focusing on the process of he UI's construction initializing an element, attaching it to a parent, etc.).To create a composable function , just add the @Composable annotation to the function name.",

                 textAlign=Justify,
            modifier = Modifier
                .padding(16.dp)
        )


    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticleThemeTheme {
        Article()
    }
}