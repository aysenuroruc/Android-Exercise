package com.example.ayse.graduationprj;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button up, down ;
    ImageButton right, left ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button up = (Button) findViewById(R.id.up);
        Button down = (Button) findViewById(R.id.down);
        ImageButton right = (ImageButton) findViewById(R.id.rig);
        ImageButton left = (ImageButton) findViewById(R.id.lef);
        
        up.setOnClickListener(this);
        down.setOnClickListener(this);
        right.setOnClickListener(this);
        left.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        int id = v.getId();

        switch (id)
        {
            case R.id.up:
                Toast.makeText(getApplicationContext(), "Hi!", Toast.LENGTH_LONG).show();
                break;
            case R.id.down:

                break;
            case R.id.rig:

                break;
            case R.id.lef:
                break;
        }
    }
}
