package com.example.lab0305bt02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab0305bt02.ui.theme.Lab0305bt02Theme

import android.graphics.Color
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Liên kết nút
        val customButton: Button = findViewById(R.id.customButton)
        // Xử lý sự kiện khi nhấn nút
        customButton.setOnClickListener {
            // Thay đổi màu nền khi nhấn
            customButton.setBackgroundColor(Color.parseColor("#FF5722"))
        }
    }
}