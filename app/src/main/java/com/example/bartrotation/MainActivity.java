package com.example.bartrotation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void rotate(View view){

        ImageView bart=(ImageView) findViewById(R.id.imageView);

        bart.animate().translationXBy(-150).scaleX(0.5f).scaleY(0.5f).setDuration(2000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView bart=(ImageView) findViewById(R.id.imageView);
        bart.setX(-1000);
        bart.animate().rotation(3600).translationXBy(1000).setDuration(2000);
    }
}