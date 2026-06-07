package com.example.rowcoldemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rowcoldemo.ui.theme.RowColDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RowColDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    RowColScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun RowColScreen(modifier: Modifier = Modifier) {
    // Дизайн 4. weight — пропорциональное распределение (1:2:1)
    Row(modifier = modifier.fillMaxWidth().padding(16.dp)) {
        Text(
            "1",
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1f).background(Color(0xFFB3E5FC)).padding(16.dp)
        )
        Text(
            "2",
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(2f).background(Color(0xFFFFF59D)).padding(16.dp)
        )
        Text(
            "3",
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1f).background(Color(0xFFC8E6C9)).padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RowColPreview() {
    RowColDemoTheme {
        RowColScreen()
    }
}
