package com.example.baikiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    ArrayList<TacPham> arrayList, arrTacPham;
    int i, h;

    ImageView imgtp, back;
    TextView nametp, namPhatHanhtp;
    ListView lvTacPham;
    TacPhamAdapter tacPhamAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        lvTacPham = findViewById(R.id.lvTacPham);
        imgtp = findViewById(R.id.imgtp);
        nametp = findViewById(R.id.nametp);
        namPhatHanhtp = findViewById(R.id.namPhatHanhtp);

         back = findViewById(R.id.back);

        Intent intent = getIntent();
        i = intent.getIntExtra("i", 0);

        tacPhamHuyCan();
        tacPhamAdapter = new TacPhamAdapter(this, R.layout.item_tacpham, arrTacPham);
        lvTacPham.setAdapter(tacPhamAdapter);


        lvTacPham.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent1 = new Intent(DetailActivity.this, ChiTietActivity.class);
                intent1.putExtra("name", arrTacPham.get(i).getTen() );
                intent1.putExtra("nam", arrTacPham.get(i).getNamPhatHanh() );
                intent1.putExtra("hinh", arrTacPham.get(i).getHinhanh());
                startActivity(intent1);

            }
        });




        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetailActivity.this, MainActivity.class));
            }
        });

    }

    private  void tacPhamHuyCan(){
        arrTacPham = new ArrayList<>();
        arrTacPham.add(new TacPham(R.drawable.huycan, "?????t n??? hoa (t???p th??, 1960)","1960"));
        arrTacPham.add(new TacPham(R.drawable.huycan, "B??i th?? cu???c ?????i (t???p th??, 1963)","1963"));
        arrTacPham.add(new TacPham(R.drawable.huycan, "Ph?? ?????ng Thi??n V????ng (t???p th??, 1968)","1968"));
        arrTacPham.add(new TacPham(R.drawable.huycan, "Nh???ng n??m s??u m????i (t???p th??, 1968)","1968"));
        arrTacPham.add(new TacPham(R.drawable.huycan, "C?? g??i M??o","1960"));
    }

}