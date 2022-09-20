package com.example.listsview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.view.LayoutInflaterCompat;

import java.util.List;

public class list_viewAdapter extends BaseAdapter {
    private Context context;
    private  int layout;
    private List<list_view> x;
    public list_viewAdapter( Context context, int layout, List<list_view> x){
        this.context = context;
        this.layout = layout;
        this.x = x;
    }
    @Override
    public int getCount() {
        return x.size();
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

        TextView ten = (TextView) view.findViewById(R.id.tv_name);
        TextView mota = (TextView) view.findViewById(R.id.tv_title);
        ImageView img = (ImageView) view.findViewById(R.id.img);

        list_view lv = x.get(i);
        ten.setText(x.get(i).getName());
        mota.setText(x.get(i).getTitle());
        img.setImageResource(x.get(i).getImg());


        return view;
    }
}
