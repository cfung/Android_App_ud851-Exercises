package com.example.android.explicitintent;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;


// Do steps 6 & 7 in ChildActivity.java
// completed (6) Create a TextView field to display your message
// completed (7) Get a reference to your TextView in Java
public class ChildActivity extends AppCompatActivity {

    private TextView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        mView = (TextView) findViewById(R.id.tv_display);

    }

}
