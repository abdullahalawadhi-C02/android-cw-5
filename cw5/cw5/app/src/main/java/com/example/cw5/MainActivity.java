package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button n = findViewById(R.id.nextPage);
        final EditText name = findViewById(R.id.name);
      final   EditText age = findViewById(R.id.age);


        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameInEditText = name.getText().toString();
                String ageInEditText = age.getText().toString();
                Intent x = new Intent(MainActivity.this, MainActivity1.class);
                x.putExtra("name",nameInEditText);
                x.putExtra("age",ageInEditText);
                startActivity(x);

            }
        });

    }
}