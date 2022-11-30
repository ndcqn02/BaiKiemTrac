package com.example.baikiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ChiTietActivity extends AppCompatActivity {


    TextView namedt, namPhatHanhdt, saodt;
    ImageView imgDt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet);

        namedt = findViewById(R.id.namedt);
        namPhatHanhdt = findViewById(R.id.namPhatHanhdt);
        saodt =findViewById(R.id.saodt);
        imgDt =findViewById(R.id.imgDt);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String nam = intent.getStringExtra("nam");
        int hinh = intent.getIntExtra("hinh",1 );
        namedt.setText(name);
        namPhatHanhdt.setText(nam);
        imgDt.setImageResource(hinh);
    }

}