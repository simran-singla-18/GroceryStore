package com.example.grocery_store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Grocery_Activity extends AppCompatActivity {
  ImageView imageView;
  TextView name;
Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery_);
        imageView=(ImageView)findViewById(R.id.fullimage);
        name=(TextView)findViewById(R.id.txtname);

         Integer image=getIntent().getIntExtra("link",0);
        String string=getIntent().getStringExtra("name");
        name.setText(string);

        imageView.setBackgroundResource(image);
    }
}