package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    TextView textViewWebFont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        // Web Fonts apply to textView
        textViewWebFont = (TextView) findViewById(R.id.textViewWebFont);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Ginga.ttf");
        textViewWebFont.setTypeface(typeface);

        final Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (Exception e) {

                } finally {
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                }
                super.run();
            }
        };
        thread.start();


    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
