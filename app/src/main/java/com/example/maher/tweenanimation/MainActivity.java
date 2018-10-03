package com.example.maher.tweenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maher.twinanimation.R;

public class MainActivity extends AppCompatActivity {

    TextView txtAndroid;
    ImageView imgAndroid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAndroid=findViewById(R.id.txt_android);
        imgAndroid=findViewById(R.id.img_android);

        txtAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                txtAndroid.startAnimation(rotate);
            }
        });

        txtAndroid.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                txtAndroid.clearAnimation();
                return true;
            }
        });

        imgAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                imgAndroid.startAnimation(rotate);
            }
        });

        imgAndroid.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                imgAndroid.clearAnimation();
                return true;
            }
        });


    }
}
