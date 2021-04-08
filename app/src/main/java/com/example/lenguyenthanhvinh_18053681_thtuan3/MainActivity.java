package com.example.lenguyenthanhvinh_18053681_thtuan3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnChonMau;
    ImageView imgPhon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChonMau = findViewById(R.id.btnChonMau);
        imgPhon = findViewById(R.id.impPhon);
        btnChonMau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), Layout2.class);
                startActivityForResult(i,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String st = data.getStringExtra("key");

        int t = Integer.parseInt(st);
        if(t==4){
            imgPhon.setImageResource(0);
            imgPhon.setBackgroundResource(R.drawable.vsmartlivexanh1);
        }
        else if(t==1){
            imgPhon.setImageResource(0);
            imgPhon.setBackgroundResource(R.drawable.vsbac1);
        }
        else if(t==3){
            imgPhon.setImageResource(0);
            imgPhon.setBackgroundResource(R.drawable.vsmartblackstar);
        }
        else if(t==2){
            imgPhon.setImageResource(0);
            imgPhon.setBackgroundResource(R.drawable.vsreda2);
        }
    }
}