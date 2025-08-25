package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.layout01);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        Button button = findViewById(R.id.b1);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int num1 = Integer.parseInt(e1.getText().toString());
                    int num2 = Integer.parseInt(e2.getText().toString());

                    CalculationData data = new CalculationData(num1,num2);

                    Intent intent = new Intent(MainActivity.this, MyActivity2.class);

                    intent.putExtra("CALCULATION_DATA",data);
                    startActivity(intent);

                }catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "请输入数字！", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}