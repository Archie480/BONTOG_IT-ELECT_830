package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Log.v(TAG,"This is a verbose log.");
            Log.d(TAG,"This is a debug log.");
            Log.i(TAG,"This is an info log.");
            Log.w(TAG, "This is a warn log.");
            Log.e(TAG,"This is an error log");

            Button button = (Button) findViewById(R.id.btnLinearLayout);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.i(TAG, "Button Clicked");
                    Intent intent = new Intent( MainActivity.this, LinearLayout.class);
                    startActivity(intent);
                }
            });
    }
}