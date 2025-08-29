package com.example.proj1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private val historyList = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activit_main_2)
        Toast.makeText(this, "Welcome World", Toast.LENGTH_LONG).show()

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSub = findViewById<Button>(R.id.btnSub)
        val btnMul = findViewById<Button>(R.id.btnMul)
        val btnDiv = findViewById<Button>(R.id.btnDiv)
        val etA = findViewById<EditText>(R.id.et_a)
        val etB = findViewById<EditText>(R.id.et_b)
        val resultView = findViewById<TextView>(R.id.ans)
        val historyView = findViewById<TextView>(R.id.history)

        // Function to update the history view
        fun updateHistory() {
            historyView.text = historyList.joinToString("\n")  // Join the history with line breaks
        }

        btnAdd.setOnClickListener {
            val aText = etA.text.toString()
            val bText = etB.text.toString()

            val a = aText.toDoubleOrNull()
            val b = bText.toDoubleOrNull()

            if (a != null && b != null) {
                val sum = a + b
                resultView.text = sum.toString()
                val historyEntry = "${a}+${b}=${sum}"
                historyList.add(historyEntry)
                updateHistory()  // Update history view after adding the entry
            } else {
                resultView.text = "Invalid input"
            }
        }

        btnSub.setOnClickListener {
            val aText = etA.text.toString()
            val bText = etB.text.toString()

            val a = aText.toDoubleOrNull()
            val b = bText.toDoubleOrNull()

            if (a != null && b != null) {
                val sub = a - b
                resultView.text = sub.toString()
                val historyEntry = "${a}-${b}=${sub}"
                historyList.add(historyEntry)
                updateHistory()  // Update history view after adding the entry
            } else {
                resultView.text = "Invalid input"
            }
        }

        btnMul.setOnClickListener {
            val aText = etA.text.toString()
            val bText = etB.text.toString()

            val a = aText.toDoubleOrNull()
            val b = bText.toDoubleOrNull()

            if (a != null && b != null) {
                val mul = a * b
                resultView.text = mul.toString()
                val historyEntry = "${a}*${b}=${mul}"
                historyList.add(historyEntry)
                updateHistory()  // Update history view after adding the entry
            } else {
                resultView.text = "Invalid input"
            }
        }

        btnDiv.setOnClickListener {
            val aText = etA.text.toString()
            val bText = etB.text.toString()

            val a = aText.toDoubleOrNull()
            val b = bText.toDoubleOrNull()

            if (a != null && b != null && b != 0.0) {
                val div = a / b
                resultView.text = div.toString()
                val historyEntry = "${a}/${b}=${div}"
                historyList.add(historyEntry)
                updateHistory()  // Update history view after adding the entry
            } else {
                resultView.text = "Invalid input or division by zero"
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Welcome Earth", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Welcome Apple", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Welcome orange", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Welcome Potato", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "Welcome Tomato", Toast.LENGTH_LONG).show()
    }
}