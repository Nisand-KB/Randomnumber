package com.example.nisand.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button b;
    Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.button);
        r = new Random();

    b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int i1 = r.nextInt(1000000);
            Toast.makeText(getApplicationContext(),"fv = "+i1,Toast.LENGTH_LONG).show();
        }
    });
    }
}
