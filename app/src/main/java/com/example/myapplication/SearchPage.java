package com.example.myapplication;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SearchPage extends AppCompatActivity {

    ImageButton originalpagebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_page);

        originalpagebutton = findViewById(R.id.originalpagebutton);

        originalpagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),OriginalPage.class);
                startActivity(intent);
            }
        });




    }
}