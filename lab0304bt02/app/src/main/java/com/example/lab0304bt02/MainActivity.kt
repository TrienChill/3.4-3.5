package com.example.lab0304bt02

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
import com.example.lab0304bt02.ui.theme.Lab0304bt02Theme

import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Liên kết các thành phần giao diện
        val textViewContainer: LinearLayout = findViewById(R.id.textViewContainer)
        val addFromXmlButton: Button = findViewById(R.id.addFromXmlButton)
        val clearButton: Button = findViewById(R.id.clearButton)
        // LayoutInflater để nạp giao diện từ XML
        val inflater = LayoutInflater.from(this)
        // Xử lý sự kiện nhấn nút "Thêm thành phần"
        addFromXmlButton.setOnClickListener {
            val textView = inflater.inflate(R.layout.textview_layout, textViewContainer, false)
            textViewContainer.addView(textView) // Thêm TextView từ XML vào
        }
        // Xử lý sự kiện nhấn nút "Xóa tất cả"
        clearButton.setOnClickListener {
            textViewContainer.removeAllViews() // Xóa tất cả các TextView đã thêm
        }
    }
}