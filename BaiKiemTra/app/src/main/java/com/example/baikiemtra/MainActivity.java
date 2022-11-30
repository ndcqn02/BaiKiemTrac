package com.example.baikiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<TacGia> arr;
    ArrayList<TacPham> arrTacPham;
    public Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        anhXa();
        adapter = new Adapter(this, R.layout.item, arr);
        lv.setAdapter(adapter);

        adapter.notifyDataSetChanged();

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);

                intent.putExtra("i", i);

                startActivity(intent);
            }
        });




    }

    private void anhXa() {
        arr = new ArrayList<>();
        arr.add(new TacGia(R.drawable.huycan, "Huy Cận","Ông từng là Viện sĩ Viện Hàn lâm Thơ Thế giới và Chủ tịch Ủy ban Liên hiệp các Hiệp hội Văn học Việt Nam giai đoạn 1984-1995. Cù Huy Cận.", "******"));
        arr.add(new TacGia(R.drawable.macngon, "Mạc Ngôn", " Mạc Ngôn (sinh ngày 17 tháng 2 năm 1955) là một nhà văn người Trung Quốc xuất thân từ nông dân. Ông đã từng được thế giới biết đến với tác phẩm Cao lương đỏ","**"));
        arr.add(new TacGia(R.drawable.shakespeare, "Shakespeare ", "William Shakespeare ( bapt. 26 April 1564 – 23 April 1616) was an English playwright, poet and actor. He is widely regarded as the greatest writer in the ","**"));
        arr.add(new TacGia(R.drawable.hemingway, "Hemingway ", "Ernest Miller Hemingway was an American novelist, short-story writer, and journalist. His economical and understated style—which he termed the iceberg theory—had a strong influence on 20th-century fiction","***"));

    }

    private  void tacPhamHuyCan(){
        arrTacPham = new ArrayList<>();
        arrTacPham.add(new TacPham(R.drawable.huycan, "Đất nở hoa (tập thơ, 1960)","1960"));
        arrTacPham.add(new TacPham(R.drawable.huycan, "Bài thơ cuộc đời (tập thơ, 1963)","1963"));
        arrTacPham.add(new TacPham(R.drawable.huycan, "Phù Đổng Thiên Vương (tập thơ, 1968)","1968"));
        arrTacPham.add(new TacPham(R.drawable.huycan, "Những năm sáu mươi (tập thơ, 1968)","1968"));
        arrTacPham.add(new TacPham(R.drawable.huycan, "Cô gái Mèo","1960"));
    }







}