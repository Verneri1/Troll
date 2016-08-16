package com.example.first.troll;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TrollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troll);
    }

    public void backToMain(View view){
        Intent backIntent = new Intent(this, Main.class);
        startActivity(backIntent);
    }


}
