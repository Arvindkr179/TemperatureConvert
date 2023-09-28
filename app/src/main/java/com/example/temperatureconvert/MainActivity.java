package com.example.temperatureconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button fc,cf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fc=findViewById(R.id.temptocelsius);
        cf=findViewById(R.id.temptofaren);
        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotocelsius();
            }
        });
        cf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoFaren();
            }
        });
    }

    private void gotoFaren() {
        Intent intent=new Intent(this,CelsiustoFaren.class);
        startActivity(intent);

    }

    private void gotocelsius() {
        Intent intent=new Intent(this,FarenToCelsius.class);
        startActivity(intent);
    }


}