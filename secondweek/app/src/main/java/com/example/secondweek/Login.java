package com.example.secondweek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class Login extends AppCompatActivity {
    private EditText etUsername;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login);

        etUsername = findViewById(R.id.et_Username);
        etPassword = findViewById(R.id.et_Password);
        Button btnLogin = findViewById(R.id.btn_Login);
        Button btnExit = findViewById(R.id.btn_Exit);

        btnLogin.setOnClickListener(v -> {
            String username = etUsername.getText().toString().trim();
            String password = etPassword.getText().toString().trim();

            if("admin".equals(username) && "admin".equals(password)) {
                Intent intent = new Intent(Login.this,ChooseClass.class);
                startActivity(intent);
            }else {
                Toast.makeText(Login.this,"用户名或密码错误，请重新输入！",Toast.LENGTH_SHORT).show();
            }
        });

        btnExit.setOnClickListener(v -> finish());

    }
}
