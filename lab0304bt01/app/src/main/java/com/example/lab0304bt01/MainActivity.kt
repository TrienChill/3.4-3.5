package com.example.lab0304bt01

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
import com.example.lab0304bt01.ui.theme.Lab0304bt01Theme

import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Liên kết các thành phần giao diện
        val textViewContainer: LinearLayout = findViewById(R.id.textViewContainer)
        val addButton: Button = findViewById(R.id.addButton)
        val removeButton: Button = findViewById(R.id.removeButton)
        // Xử lý sự kiện nhấn nút "Thêm TextView"
        addButton.setOnClickListener {
            val textView = TextView(this)
            textView.text = "TextView mới được thêm"
            textView.layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            textViewContainer.addView(textView) // Thêm TextView vào LinearLayout
        }
        // Xử lý sự kiện nhấn nút "Xóa TextView"
        removeButton.setOnClickListener {
            val childCount = textViewContainer.childCount
            if (childCount > 0) {
                textViewContainer.removeViewAt(childCount - 1) // Xóa TextView cuối cùng
            }
        }
    }
}