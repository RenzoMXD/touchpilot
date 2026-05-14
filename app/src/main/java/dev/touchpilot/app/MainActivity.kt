package dev.touchpilot.app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this).apply {
            text = "TouchPilot"
            textSize = 28f
            setPadding(48, 72, 48, 48)
        }

        setContentView(textView)
    }
}
