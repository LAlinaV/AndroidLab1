package com.example.lab1task5

import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab1task5.ui.theme.Lab1task5Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Lab1task5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    MyCard()
                }
            }
        }
    }
}

@Composable
fun MyCard() {
    var isVisible = remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(bitmap = ImageBitmap.imageResource(R.drawable.me), contentDescription = "My photo")
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Плавание\n\nМузыка\n\nФильмы\n\nКниги"
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row(Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceEvenly) {
            Button(
                modifier = Modifier.padding(30.dp),
                onClick = { isVisible.value = true }
            ) {
                Text("Telegram")
            }
            if (isVisible.value){
                Text(
                    text = "@Alina_L_N",
                    modifier = Modifier.padding(40.dp)
                )
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun MyCardPreview() {
    MyCard()
}