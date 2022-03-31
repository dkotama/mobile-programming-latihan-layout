package com.instiki.dkotama.latihanlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnLayoutList, btnListview, btnGridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLayoutList = findViewById(R.id.btn_layoutlist);
        btnListview  = findViewById(R.id.btn_listview);
        btnGridview = findViewById(R.id.btn_gridview);
    }

    public void onButtonLayoutListClick(View view) {
        Intent layoutMenusIntent = new Intent(MainActivity.this, LayoutMenusActivity.class);
        startActivity(layoutMenusIntent);
    }

    public void onButtonListViewClick(View view) {

    }

    public void onButtonGridViewClick(View view) {

    }

}