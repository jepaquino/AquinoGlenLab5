package com.aquino.glen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        getSupportActionBar().setTitle("Activity 1");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("4ith", "Paused");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4ith", "Started");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("4ith", "Restarted");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4ith", "Resumed");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("4ith", "Destroyed");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("4ith", "Paused");
    }
    public void process(View v){
        Intent i = null, chooser=null;
        if (v.getId()==R.id.act2){
            i = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(i);
        }
        else if (v.getId()==R.id.map2){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5969544,120.9782601"));
            chooser = Intent.createChooser(i, "Choose Application For Maps");
            startActivity(chooser);
        }
    }
}
