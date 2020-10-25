package ru.geekbrains.helloactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView greetings = findViewById(R.id.hello_geekbrains);
        greetings.setCursorVisible(false);
        greetings.setText(R.string.app_name);
    }
}