package com.example.rezahojati123;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    Button buttonGreet;
    TextView textViewGreeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        buttonGreet = findViewById(R.id.buttonGreet);
        textViewGreeting = findViewById(R.id.textViewGreeting);

        buttonGreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString().trim();
                if (!name.isEmpty()) {
                    String greeting = "خوش آمدید " + name + "!";
                    textViewGreeting.setText(greeting);


                    Toast.makeText(MainActivity.this, greeting, Toast.LENGTH_SHORT).show();
                } else {
                    String warning = "لطفاً نام خود را وارد کنید.";
                    textViewGreeting.setText(warning);
                    Toast.makeText(MainActivity.this, warning, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
