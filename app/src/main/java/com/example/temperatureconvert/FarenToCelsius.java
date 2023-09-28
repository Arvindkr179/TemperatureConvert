package com.example.temperatureconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FarenToCelsius extends AppCompatActivity {
    EditText temp;
    TextView f;
    Button cvt,bk;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faren_to_celsius);
        //noInspection id
        temp=findViewById(R.id.temperatureC);
        f=findViewById(R.id.FarenTemp);
        cvt=findViewById(R.id.Convertcf);
        bk=findViewById(R.id.Bck);
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goback();

            }
        });
        cvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable c=temp.getText();
                String t= String.valueOf((int) ((Integer.parseInt(c.toString())-32)/1.8));

                f.setText(t);
            }
        });


    }

    private void goback() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    private char convertctof() {
        int t = Integer.parseInt(temp.getText().toString());
        double c= ((t*1.8)+32);
        return Character.highSurrogate((int) c);






    }
}