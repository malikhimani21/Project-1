package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReceiveActivity extends AppCompatActivity {

    TextView textViewName, textViewEmail, textViewContact, textViewCity, textViewCountry, textViewRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);

        textViewName = (TextView) findViewById(R.id.re_name);
        textViewEmail = (TextView) findViewById(R.id.re_email);
        textViewContact = (TextView) findViewById(R.id.re_contact);
        textViewCity = (TextView) findViewById(R.id.re_city);
        textViewCountry = (TextView) findViewById(R.id.re_country);
        textViewRating = (TextView) findViewById(R.id.re_rating);

        Bundle bundle = getIntent().getExtras();

        String name_r = bundle.getString("KEY_NAME");
        textViewName.setText(name_r);

        String email_r = bundle.getString("KEY_EMAIL");
        textViewEmail.setText(email_r);

        String contact_r = bundle.getString("KEY_CONTACT");
        textViewContact.setText(contact_r);

        String city_r = bundle.getString("KEY_CITY");
        textViewCity.setText(city_r);

        String country_r = bundle.getString("KEY_COUNTRY");
        textViewCountry.setText(country_r);

        String rating_r = bundle.getString("KEY_RATING");
        textViewRating.setText(rating_r);


    }
}
