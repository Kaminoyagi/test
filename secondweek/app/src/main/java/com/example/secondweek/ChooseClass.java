package com.example.secondweek;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChooseClass extends AppCompatActivity implements
        View.OnClickListener,CompoundButton.OnCheckedChangeListener {
    private CheckBox cb_one;
    private CheckBox cb_two;
    private CheckBox cb_three;
    private CheckBox cb_four;
    private Button btn_send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.chooseclass);

        cb_one = (CheckBox) findViewById(R.id.cb_one);
        cb_two = (CheckBox) findViewById(R.id.cb_two);
        cb_three = (CheckBox) findViewById(R.id.cb_three);
        cb_four = (CheckBox) findViewById(R.id.cb_four);
        btn_send = (Button) findViewById(R.id.btn);

        cb_one.setOnCheckedChangeListener(this);
        cb_two.setOnCheckedChangeListener(this);
        cb_three.setOnCheckedChangeListener(this);
        cb_four.setOnCheckedChangeListener(this);
        btn_send.setOnClickListener(this);

    }
    @Override
    public void onCheckedChanged(CompoundButton compoundButton,boolean b) {
        /*if(compoundButton.isChecked())
            Toast.makeText(this,compoundButton.getText().toString(),Toast.LENGTH_SHORT).show();*/
    }

    @Override
    public void onClick(View view) {
        String choose ="";
        if(cb_one.isChecked()) choose = choose + cb_one.getText().toString() +"";
        if(cb_two.isChecked()) choose = choose + cb_two.getText().toString() +"";
        if(cb_three.isChecked()) choose = choose + cb_three.getText().toString() +"";
        if(cb_four.isChecked()) choose = choose + cb_four.getText().toString() +"";
        Toast.makeText(this,choose,Toast.LENGTH_SHORT).show();
    }
}