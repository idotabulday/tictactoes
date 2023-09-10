package com.example.tictactoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void move(View view)
    {
        if(view.getId() == R.id.b1)
        {
            Toast.makeText(this," button 1 clicked!",Toast.LENGTH_LONG).show();
        }
    }
}