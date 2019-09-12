package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    private static CheckBox pizza, coffee, tea, water, juice, pepsi;
    Button btnOrder;
    private TextView textViewOrder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        pizza = (CheckBox) findViewById(R.id.pizza);
        coffee = (CheckBox) findViewById(R.id.coffee);
        tea = (CheckBox) findViewById(R.id.tea);
        water = (CheckBox) findViewById(R.id.water);
        juice = (CheckBox) findViewById(R.id.juice);
        pepsi = (CheckBox) findViewById(R.id.pepsi);
        btnOrder = (Button) findViewById(R.id.btnOrder);
        textViewOrder = (TextView) findViewById(R.id.textViewOrder);

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                int totalRs = 0;
                stringBuilder.append("Your order is ");
                if (pizza.isChecked()) {
                    stringBuilder.append("\n\nPizza 100");
                    totalRs += 100;
                }

                if (coffee.isChecked()) {
                    stringBuilder.append("\nCoffee 110");
                    totalRs += 110;
                }

                if (tea.isChecked()) {
                    stringBuilder.append("\nCoffee 90");
                    totalRs += 90;
                }

                if (water.isChecked()) {
                    stringBuilder.append("\nWater 80");
                    totalRs += 80;
                }

                if (juice.isChecked()) {
                    stringBuilder.append("\nJuice 70");
                    totalRs += 70;
                }

                if (pepsi.isChecked()) {
                    stringBuilder.append("\nPepsi 60");
                    totalRs += 60;
                }
                stringBuilder.append("\n\nTotal is " + totalRs + " rs.");

                textViewOrder.setText(stringBuilder.toString());
                Toast.makeText(getApplicationContext(), stringBuilder.toString(), Toast.LENGTH_LONG).show();
            }
        });


    }
}
