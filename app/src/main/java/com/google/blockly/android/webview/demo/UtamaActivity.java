package com.google.blockly.android.webview.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.blocklywebview.R;

public class UtamaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);
    }

    public void next(View view) {
        Intent intent = new Intent(UtamaActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void pengguna(View view) {
        Intent intent = new Intent(UtamaActivity.this, PetunjukActivity.class);
        startActivity(intent);
    }

    public void exit(View view) {
        moveTaskToBack(true);
        System.exit(1);
    }

    public void scan(View view) {

    }
}