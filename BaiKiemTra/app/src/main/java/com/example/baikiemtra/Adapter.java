package com.example.baikiemtra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<TacGia> list;

    public Adapter(Context context, int layout, ArrayList<TacGia> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);


        TextView name =view.findViewById(R.id.name);
        TextView mota =view.findViewById(R.id.mota);
        ImageView img =view.findViewById(R.id.img);

        TacGia tacGia = list.get(i);
        name.setText(tacGia.getTen());
        mota.setText(tacGia.getMota());
        img.setImageResource(tacGia.getHinhanh());



        return view;
    }
}
