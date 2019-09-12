package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalciActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button sum, sub, mul, div;
    TextView textViewResult, textViewMarquee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calci);

        editText1 = (EditText) findViewById(R.id.edit1);
        editText2 = (EditText) findViewById(R.id.edit2);

        sum = (Button) findViewById(R.id.sumBtn);
        sub = (Button) findViewById(R.id.subBtn);
        mul = (Button) findViewById(R.id.mulBtn);
        div = (Button) findViewById(R.id.divBtn);

        textViewResult = (TextView) findViewById(R.id.textViewResult);
        textViewMarquee = (TextView) findViewById(R.id.textMarqueeTextView);
        textViewMarquee.setSelected(true);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string1 = editText1.getText().toString();
                String string2 = editText2.getText().toString();
                if (TextUtils.isEmpty(string1) || TextUtils.isEmpty(string2)) {
                    Toast.makeText(getApplicationContext(), "Enter value first", Toast.LENGTH_LONG).show();
                } else {
                    int a = Integer.parseInt(string1);
                    int b = Integer.parseInt(string2);
                    int sum = a + b;
                    Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
                    textViewResult.setText(String.valueOf(sum));
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string1 = editText1.getText().toString();
                String string2 = editText2.getText().toString();
                if (TextUtils.isEmpty(string1) || TextUtils.isEmpty(string2)) {
                    Toast.makeText(getApplicationContext(), "Enter value first", Toast.LENGTH_LONG).show();
                } else {
                    int a = Integer.parseInt(string1);
                    int b = Integer.parseInt(string2);
                    int sub = a - b;
                    Toast.makeText(getApplicationContext(), String.valueOf(sub), Toast.LENGTH_LONG).show();
                    textViewResult.setText(String.valueOf(sub));
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string1 = editText1.getText().toString();
                String string2 = editText2.getText().toString();
                if (TextUtils.isEmpty(string1) || TextUtils.isEmpty(string2)) {
                    Toast.makeText(getApplicationContext(), "Enter value first", Toast.LENGTH_LONG).show();
                } else {
                    int a = Integer.parseInt(string1);
                    int b = Integer.parseInt(string2);
                    int mul = a * b;
                    Toast.makeText(getApplicationContext(), String.valueOf(mul), Toast.LENGTH_LONG).show();
                    textViewResult.setText(String.valueOf(mul));
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string1 = editText1.getText().toString();
                String string2 = editText2.getText().toString();

                if (TextUtils.isEmpty(string1) || TextUtils.isEmpty(string2)) {
                    Toast.makeText(getApplicationContext(), "Enter value first", Toast.LENGTH_LONG).show();
                } else {
                    int a = Integer.parseInt(string1);
                    int b = Integer.parseInt(string2);
                    int div = a / b;
                    Toast.makeText(getApplicationContext(), String.valueOf(div), Toast.LENGTH_LONG).show();
                    textViewResult.setText(String.valueOf(div));
                }

            }
        });


    }
}
