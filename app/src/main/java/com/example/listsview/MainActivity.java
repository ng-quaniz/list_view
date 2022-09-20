package com.example.listsview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<list_view> arrayCourse;
    list_viewAdapter adapter;
    Boolean kt=false;
    int j=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)  findViewById(R.id.lv);
        arrayCourse = new ArrayList<>();


        arrayCourse.add(new list_view("Chuối","Nguyễn Hồng Quân - 2050531200257", R.drawable.chuoi)) ;
        arrayCourse.add(new list_view("Ổi","Nguyễn Hồng Quân - 2050531200257", R.drawable.oi)) ;
        arrayCourse.add(new list_view("Táo","Nguyễn Hồng Quân - 2050531200257", R.drawable.tao)) ;
        arrayCourse.add(new list_view("Dưa hấu","Nguyễn Hồng Quân - 2050531200257", R.drawable.dua)) ;
        arrayCourse.add(new list_view("Xoài","Nguyễn Hồng Quân - 2050531200257", R.drawable.xoai)) ;

        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this, android.R.layout.simple_list_item_1,arrayCourse);

        lv.setAdapter(adapter);
    // click
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        intent.putExtra("dulieu", arrayCourse.get(i).getName());
                        if (kt != true)
                            startActivity(intent);
                        kt = false;
                    }
                });
                lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                    @Override
                    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                        kt = true;
                        Xacnhanxoa(i);
                        return false;
                    }
                });
            }}

            public void Xacnhanxoa(final int pos) {
                AlertDialog.Builder alertDiaLog = new AlertDialog.Builder(MainActivity.this);
                alertDiaLog.setTitle("Thong bao");
                alertDiaLog.setIcon(R.mipmap.ic_launcher);
                alertDiaLog.setMessage("Ban co muon xoa");
                alertDiaLog.setPositiveButton("Co", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        arrayCourse.remove(pos);
                        adapter.notifyDataSetChanged();
                    }
                });
                alertDiaLog.setNegativeButton("Khong", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                alertDiaLog.show();

            }

    }
}
