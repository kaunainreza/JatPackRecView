package com.example.jatpackrecview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jatpackrecview.ui.theme.JatPackRecViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          UserList()
        }
    }
}
@Composable
fun UserList (){
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        for (i in 1..50){
            UserCard()
        }
    }
}

@Composable
fun UserCard(){
    Card(
        elevation= 4.dp,
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth()
            .wrapContentHeight()
    ){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(12.dp)
            .border(width = 1.dp, color = Color.Green)
            .padding(12.dp)

    ){
        Image(
            painter = painterResource(id = R.drawable.ic_facee),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)

        )
        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "dhgcfjsdghfwey sajkdfhuiseyr jhdcbwjegf jehgwegyssdhgfweuijh dfweufgb jhfwde")
            Button(onClick = {

            }) {
                Text(text ="View More" )

            }
        }
    }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Surface(Modifier.fillMaxSize()) {
        UserCard()

    }
}