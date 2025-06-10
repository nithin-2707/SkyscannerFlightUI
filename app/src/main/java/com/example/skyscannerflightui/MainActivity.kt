package com.example.skyscannerflightui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import net.skyscanner.backpack.button.BpkButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the Book Now button and set click listener
        val bookButton = findViewById<BpkButton>(R.id.bookButton)
        bookButton.setOnClickListener {
            Toast.makeText(this, "Booking functionality coming soon!", Toast.LENGTH_SHORT).show()
        }
    }
}
