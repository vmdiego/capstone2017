package com.groupc.officelocator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


            Intent intent = new Intent(MainActivity.this, splash.class);
            startActivity(intent);
            finish();


    }












}
