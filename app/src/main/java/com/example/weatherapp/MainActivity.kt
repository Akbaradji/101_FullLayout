package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Weather()
                }
            }
        }
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
    WeatherAppTheme {
        Greeting("Android")
    }
}

@Composable
fun Weather(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(
            text = "Akbar Adji Herlambang",
            fontSize = 25.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
            )

        Spacer(modifier = Modifier.padding(13.dp))
        BoxHeader()
        Spacer(modifier = Modifier.padding(13.dp))
        Lokasi()
        BoxKeterangan()
    }

}

@Composable
fun BoxHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Cyan))
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()){
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = "",
                modifier = Modifier.size(200.dp)
            )
            Text(text = "Rain", fontSize = 25.sp, modifier = Modifier.padding(10.dp))
        }
    }
}

@Composable
fun Lokasi() {

    Text(
        text = "21℃",
        fontSize = 40.sp,
        color = Color.Black,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold
    )
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = R.drawable.location),
            contentDescription = "Location",

            )
        Spacer(modifier = Modifier.padding(3.dp))
        Text(
            text = "Yogyakarta",
            fontSize = 32.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
            )
    }
    Spacer(modifier = Modifier.padding(13.dp))
    Text(
        text = "Kasihan, Kabupaten Bantul, \n " +
                "Daerah Istimewa Yogyakarta",
        color = Color.Gray,
        fontSize = 20.sp,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        )
}

@Composable
fun BoxKeterangan(){
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(Color.Cyan)
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    text = "Humidity",
                    fontSize = 18.sp,
                modifier = Modifier.padding(10.dp)
                )
                Text(
                    text = "UV Index",
                    fontSize = 18.sp,
                modifier = Modifier.padding(10.dp)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "98%",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(10.dp)
                    )
                Text(
                    text = "9/10",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(10.dp)
                    )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Sunrise",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(5.dp)
                    )
                Text(
                    text = "Sunset",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(5.dp)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
                ) {
                Text(
                    text = "05.00 PM",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(5.dp)
                    )
                Text(
                    text = "05.40 PM",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(5.dp)
                )

            }

        }

    }

}



