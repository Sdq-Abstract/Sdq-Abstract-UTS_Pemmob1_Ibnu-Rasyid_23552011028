package utb.praktikum.uts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val usernameInput : EditText = findViewById(R.id.Username)
        val passwordInput : EditText = findViewById(R.id.Password)
        val btnLogin : Button = findViewById(R.id.btnLogin)
        val btnRegister : Button = findViewById(R.id.btnRegister)


            btnLogin.setOnClickListener {
                val inputUsername = usernameInput.text.toString()
                val inputPassword = passwordInput.text.toString()

                if(inputUsername.isBlank() || inputPassword.isBlank()){
                    Toast.makeText(this, "Username atau password salah!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Login berhasil!", Toast.LENGTH_SHORT).show()

                    // Pindah ke Dashboard
                    val intent = Intent(this, Dashboard::class.java)

                    startActivity(intent)
                }

                }

            btnRegister.setOnClickListener({
                val intent = Intent(this, RegisterActivity::class.java)
                startActivity(intent)
            })
            }
        }








