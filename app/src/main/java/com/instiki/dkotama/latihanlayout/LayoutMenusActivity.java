package com.instiki.dkotama.latihanlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.instiki.dkotama.latihanlayout.layouts.FrameLayoutActivity;
import com.instiki.dkotama.latihanlayout.layouts.RelativeLayoutActivity;
import com.instiki.dkotama.latihanlayout.layouts.TableLayoutActivity;
import com.instiki.dkotama.latihanlayout.layouts.WebViewActivity;

public class LayoutMenusActivity extends AppCompatActivity {
    ListView listViewMenus;
    String[] menus = {
           "Relative Layout", "Table Layout", "Frame Layout", "Web View"
    };

    AppCompatActivity layoutMenus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_menus);

        layoutMenus = this;

        // deklarasi listview
        listViewMenus = findViewById(R.id.listview_layout_menus);

        // memasukkan list menus ke dalam listview via adapter
        ArrayAdapter<String> menusAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menus);
        listViewMenus.setAdapter(menusAdapter);

        // membuat listview bisa di tap
        listViewMenus.setClickable(true);

        // set action setiap listview

        listViewMenus.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//               Object obj = listViewMenus.getItemAtPosition(i);
//                Toast.makeText(LayoutMenusActivity.this, keys[i], Toast.LENGTH_LONG).show();
                Intent intent = null;

                // mengecek user
                switch (position) {
                    case 0:
                        // jika user memilih posisi ke-0
                        intent = new Intent(LayoutMenusActivity.this, RelativeLayoutActivity.class);
                        break;
                    case 1:
                        // jika user memilih posisi ke-1
                        intent = new Intent(LayoutMenusActivity.this, TableLayoutActivity.class);
                        break;
                    case 2:
                        // jika user memilih posisi ke-2
                        intent = new Intent(LayoutMenusActivity.this, FrameLayoutActivity.class);
                        break;
                    case 3:
                        // jika user memilih posisi ke-3
                        intent = new Intent(LayoutMenusActivity.this, WebViewActivity.class);
                        break;
                }


                // Jika user memilih sesuatu ditandai dengan intent tidak null
                if (intent != null) {
                    startActivity(intent);
                }
            }
        });


        // Mengatur actionbar agar ada tombol back
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home :
                this.finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}