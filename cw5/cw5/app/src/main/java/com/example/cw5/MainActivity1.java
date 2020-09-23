package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        TextView name = findViewById(R.id.textView);
        TextView age = findViewById(R.id.age);
        final Button l = findViewById(R.id.button3);

        Bundle k = getIntent().getExtras();
        Bundle t = getIntent().getExtras();
        String p = k.getString("name");
        String o = t.getString("age");
        name.setText(p);
        age.setText(o);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(MainActivity1.this, MainActivity.class);
                startActivity(r);




            }
        });

    }
}