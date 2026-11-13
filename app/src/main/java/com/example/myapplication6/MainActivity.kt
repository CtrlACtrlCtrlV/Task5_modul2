package com.example.myapplication6

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Task5ProfileHeader() {
    // 1. Серый контейнер на всю ширину и высотой 100.dp
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.LightGray),
        contentAlignment = Alignment.Center // Центрируем круг
    ) {
        // 2 и 3. Круг занимает ВСЮ доступную высоту (100.dp)
        Box(
            modifier = Modifier
                .fillMaxHeight() // Занимает все 100.dp в высоту
                .aspectRatio(1f) // Делает форму идеального круга
                .background(Color(0xFFFF5722), CircleShape), // Оранжевый фон
            contentAlignment = Alignment.Center // Центрируем текст внутри круга
        ) {
            // Текст с инициалами и вертикальными отступами 16.dp
            Text(
                text = "КЦД",
                modifier = Modifier.padding(vertical = 16.dp),
                color = Color.Black
            )
        }
    }
}

@Preview(name = "Task5Preview", showSystemUi = true)
@Composable
fun Task5Preview() {
    Task5ProfileHeader()
}