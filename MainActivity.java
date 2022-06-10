package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    Button b1;
    TextView t1;
    Button b2;
    Button b3;
    Button b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editText1);
        e2=findViewById(R.id.editText2);
        b1=findViewById(R.id.button);
        t1=findViewById(R.id.textView);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                double num1=Double.parseDouble(s1);
                double num2=Double.parseDouble(s2);
                double addResult=(num1+num2);
                t1.setText("The sum of two number is "+ addResult);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s3=e1.getText().toString();
                String s4=e2.getText().toString();
                double num3=Double.parseDouble(s3);
                double num4=Double.parseDouble(s4);
                double subResult=(num3-num4);
                t1.setText("The difference of two number is "+subResult);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s5=e1.getText().toString();
                String s6=e2.getText().toString();
                double num5=Double.parseDouble(s5);
                double num6=Double.parseDouble(s6);
                double mulResult=(num5*num6);
                t1.setText("The product of two number is "+mulResult);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s7=e1.getText().toString();
                String s8=e2.getText().toString();
                double num7=Double.parseDouble(s7);
                double num8=Double.parseDouble(s8);
                double divResult=(num7/num8);
                t1.setText("The quotient is "+divResult);
            }
        });
    }
}
