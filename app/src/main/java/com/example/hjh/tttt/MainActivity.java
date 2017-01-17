package com.example.hjh.tttt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int  a = 4;
        int b = 6;
        if (a<b){
            System.out.print("bbbb");
        }else {
            System.out.print("aaaaaa");
        }

    }
}
