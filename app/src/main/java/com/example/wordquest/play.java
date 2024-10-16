package com.example.wordquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        Button button = (Button) findViewById(R.id.btn_play);
        button.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(),home.class));
        });



    }


}