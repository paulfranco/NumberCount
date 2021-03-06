package com.example.numbercount

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.example.numbercount.ui.theme.NumberCountTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NumberCountTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Counter()
                }
            }
        }
    }
}

@Composable
fun Counter() {
    var numbers by remember { mutableStateOf(0)}
    
    /**set design*/
    
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = "Number count is: $numbers",
            modifier = Modifier.padding(bottom = 9.dp),
            style = MaterialTheme.typography.h5
        )
        Button(onClick = { numbers++ }) {
            Text(text = "Increase Count")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NumberCountTheme {
        Counter()
    }
}