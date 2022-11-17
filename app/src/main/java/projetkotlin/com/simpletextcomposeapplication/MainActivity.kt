package projetkotlin.com.simpletextcomposeapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingButton()
        }
    }
}

@Composable
fun GreetingText(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun GreetingButton(){
    Button(onClick = { }) {
        GreetingText(name = "Button!!")
        GreetingText(name = "Inovando Button!!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewMainActivity() {
    GreetingButton()
}