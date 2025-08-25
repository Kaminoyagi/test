package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MyActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.layout02);

        Intent intent = this.getIntent();
        CalculationData data = (CalculationData)intent.getParcelableExtra("CALCULATION_DATA");

        if (data != null) {
            int sum = data.sumCalculation(data.getNum1(),data.getNum2());
            TextView textView = findViewById(R.id.t1);
            textView.setText("计算结果为："+sum);
        }
        else {
            TextView textView = findViewById(R.id.t1);
            textView.setText("未找到有效数据！");
        }
    }
}