package com.example.windowdialog2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {
    private Button bgButton;
    public RelativeLayout relativeLayout;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bgButton = (Button)findViewById(R.id.background_button);
        relativeLayout = (RelativeLayout)findViewById(R.id.relativelayout);
        context = MainActivity.this;
    }
}