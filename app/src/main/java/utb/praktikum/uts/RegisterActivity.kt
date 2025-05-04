package utb.praktikum.uts

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val usernameInput : EditText = findViewById(R.id.Username)
        val passwordInput : EditText = findViewById(R.id.Password)
        val nameInput : EditText = findViewById(R.id.Nama)
        val asalInput : EditText = findViewById(R.id.Asal)
        val btnRegister : Button = findViewById(R.id.Register)

        btnRegister.setOnClickListener({

            if(usernameInput.text.toString().isBlank() || passwordInput.text.toString().isBlank()
                || nameInput.text.toString().isBlank() || asalInput.text.toString().isBlank()) {
                Toast.makeText(this, "Data belum, diisi dengan benar", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Register berhasil!", Toast.LENGTH_SHORT).show()

                // Pindah ke Dashboard
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
        })


    }
}