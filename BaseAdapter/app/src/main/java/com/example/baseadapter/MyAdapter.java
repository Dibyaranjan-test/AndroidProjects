package com.example.baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

class Holder
{
    String txt;
    int image;
    Holder(String main, int i)
    {
        txt= main;
        image=i;
    }
}
public class MyAdapter extends BaseAdapter {
    Holder[] list;
    Context c;
    MyAdapter(Context context,String[] m, int[] img)
    {
        c = context;
        Holder holder = new Holder(m[0], img[0]);
        list[0]=holder;
    }
    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public Object getItem(int i) {
        return list[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View row = view;
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        row = inflater.inflate(R.layout.mylist, viewGroup, false);
        TextView text = row.findViewById(R.id.textView);
        ImageView imageView = row.findViewById(R.id.imageView);
        text.setText(list[0].txt);
        imageView.setImageResource(list[0].image);
        return row;
    }
}
