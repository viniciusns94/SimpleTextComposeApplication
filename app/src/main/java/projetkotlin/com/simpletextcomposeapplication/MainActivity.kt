package projetkotlin.com.simpletextcomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingText(name = "world")
        }
    }
}

@Composable
fun GreetingText(name: String) {
    Text(
        text = "Hello $name!",
        modifier = Modifier
            .clickable(onClick = { })
            .width(200.dp)
            .height(240.dp)
            .padding(all = 24.dp),
        style = MaterialTheme.typography.headlineSmall,
        fontWeight = FontWeight.SemiBold
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewMainActivity() {
    GreetingText(name = "world")
}