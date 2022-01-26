package com.codetrix.applovin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MediationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediation);

        getSupportActionBar().setTitle("Mediation");
    }
}