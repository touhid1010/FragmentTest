package com.touhidapps.fragmenttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class SecondActivityFragmentWithJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity_fragment_with_java);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        MyFragment myFragment = new MyFragment();
        MyFragmentSecond myFragmentSecond = new MyFragmentSecond();

        getFragmentManager().beginTransaction()
                .add(R.id.frameLayout_forFragment, myFragment)
                .commit();

        getFragmentManager().beginTransaction()
                .add(R.id.frameLayout_forFragmentSecond, myFragmentSecond)
                .commit();







    }
}
