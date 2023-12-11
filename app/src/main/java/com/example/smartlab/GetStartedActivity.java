package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class GetStartedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        ImageView imageView = findViewById(R.id.pic_imgGetStarted);
        Glide.with(this).asGif().load(R.drawable.getstarted).into(imageView);
    }
}