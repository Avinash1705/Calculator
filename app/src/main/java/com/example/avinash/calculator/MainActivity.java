package com.example.avinash.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button add,sub,mul,div;
    EditText num1,num2;
    TextView res;
    int a,b,c;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        add=findViewById(R.id.sum);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        sub=findViewById(R.id.sub);
        num1=findViewById(R.id.et1);
        num2=findViewById(R.id.et2);
        res=findViewById(R.id.tv);
        
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(num1.getText().toString());
                b=Integer.parseInt(num2.getText().toString());
                c=a+b;
                Toast.makeText(getApplicationContext(),String.valueOf(c), Toast.LENGTH_SHORT).show();
                res.setText(String.valueOf(c));
                
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(num1.getText().toString());
                b=Integer.parseInt(num2.getText().toString());
                c=a*b;
                Toast.makeText(getApplicationContext(),String.valueOf(c), Toast.LENGTH_SHORT).show();
                res.setText(String.valueOf(c));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(num1.getText().toString());
                b=Integer.parseInt(num2.getText().toString());
                c=a/b;
                Toast.makeText(MainActivity.this, String.valueOf(c), Toast.LENGTH_SHORT).show();
                res.setText(String.valueOf(c));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(num1.getText().toString());
                b=Integer.parseInt(num2.getText().toString());
                c=a-b;
                Toast.makeText(getApplicationContext(), String.valueOf(c), Toast.LENGTH_SHORT).show();
                res.setText(String.valueOf(c));
            }
        });
    }
}
