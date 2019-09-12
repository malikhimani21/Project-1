package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;

public class InfoActivity extends AppCompatActivity {

    EditText name, email, contact;
    AutoCompleteTextView autoCompleteTextView_city;
    Spinner spinner;
    RatingBar ratingBar;
    Button button;

    ArrayAdapter arrayAdapter, arrayAdapterCountry;
    String cityName[] = {"Pune", "Ahmedabad", "Baroda", "Surat", "Banglore", "Botad", "Bhavnagar"};
    String countyName[] = {"India", "USA", "Canada", "Dubai", "Paris", "English", "Sounth Africa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        initializationOfVar();

        // AutoCompleteTextView
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cityName);
        autoCompleteTextView_city.setAdapter(arrayAdapter);
        autoCompleteTextView_city.setThreshold(1);

        arrayAdapterCountry = new ArrayAdapter(this, android.R.layout.simple_list_item_1, countyName);
        spinner.setAdapter(arrayAdapterCountry);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NAME = name.getText().toString();
                String EMAIL = email.getText().toString();
                String CONTACT = contact.getText().toString();
                String CITY = autoCompleteTextView_city.getText().toString();
                String COUNTRY = spinner.getSelectedItem().toString();
                String RATING = String.valueOf(ratingBar.getRating());

                Intent intent = new Intent(InfoActivity.this, ReceiveActivity.class);
                intent.putExtra("KEY_NAME", NAME);
                intent.putExtra("KEY_EMAIL", EMAIL);
                intent.putExtra("KEY_CONTACT", CONTACT);
                intent.putExtra("KEY_CITY", CITY);
                intent.putExtra("KEY_COUNTRY", COUNTRY);
                intent.putExtra("KEY_RATING", RATING);
                startActivity(intent);
            }
        });


    }

    private void initializationOfVar() {
        name = (EditText) findViewById(R.id.e_name);
        email = (EditText) findViewById(R.id.e_email);
        contact = (EditText) findViewById(R.id.e_contact);

        autoCompleteTextView_city = (AutoCompleteTextView) findViewById(R.id.e_city);

        spinner = (Spinner) findViewById(R.id.spimmer_country);

        ratingBar = (RatingBar) findViewById(R.id.ratingbar);

        button = (Button) findViewById(R.id.sendInfoButton);
    }
}
