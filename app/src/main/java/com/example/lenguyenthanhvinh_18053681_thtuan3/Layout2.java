package com.example.lenguyenthanhvinh_18053681_thtuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Layout2 extends AppCompatActivity {

    TextView txtMau;
    Button btnBac, btnDo, btnDen, btnXanhDam, btnXong;
    ImageView imgviewPhone;
    int tmp = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);
        txtMau = findViewById(R.id.txtMau);
        btnBac = findViewById(R.id.btnXanh);
        btnDen = findViewById(R.id.btnDen);
        btnDo = findViewById(R.id.btnDo);
        btnXong = findViewById(R.id.btnXong);
        btnXanhDam = findViewById(R.id.btnXanhDam);
        imgviewPhone = findViewById(R.id.imgviewPhone);
        btnXong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                String t = String.valueOf(tmp);
                intent.putExtra("key",t);
                setResult(0,intent);
                finish();
            }
        });
        btnDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMau.setText("Đỏ");
                imgviewPhone.setImageResource(0);
                imgviewPhone.setBackgroundResource(R.drawable.vsreda2);
                tmp = 2;

            }
        });
        btnDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMau.setText("Đen");
                imgviewPhone.setImageResource(0);
                tmp=3;
                imgviewPhone.setBackgroundResource(R.drawable.vsmartblackstar);
            }
        });
        btnXanhDam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMau.setText("Xanh đậm");
                imgviewPhone.setImageResource(0);
                imgviewPhone.setBackgroundResource(R.drawable.vsmartlivexanh1);
                tmp=4;
            }
        });
        btnBac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMau.setText("Bạc");
                imgviewPhone.setImageResource(0);
                imgviewPhone.setBackgroundResource(R.drawable.vsbac1);
                tmp=1;
            }
        });

    }
}