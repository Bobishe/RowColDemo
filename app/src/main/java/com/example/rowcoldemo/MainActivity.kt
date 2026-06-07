package com.example.rowcoldemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    // Дизайн 1. Column — вертикальное размещение
    Column(modifier = modifier.fillMaxSize().padding(16.dp)) {
        Text("Первый")
        Text("Второй")
        Text("Третий")

        // Дизайн 2. Row — горизонтальное размещение
        Row(modifier = Modifier.fillMaxWidth().padding(top = 16.dp)) {
            Text("A ")
            Text("B ")
            Text("C ")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RowColPreview() {
    RowColDemoTheme {
        RowColScreen()
    }
}
