package com.example.myapplication.Science_Activity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Science_5F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    ImageView imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_5f);
        textview=findViewById(R.id.textView6);
        moving_501();
        moving_503();
        moving_504();
        moving_505();
        moving_507();
        moving_508();
        moving_509();
        moving_510();
        moving_551();
        moving_552();
        moving_555();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    // 101호에서 최단거리 이동
    private void moving_501() {
        final Button b = (Button) findViewById(R.id.s_501);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 800, 1000, 1000); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 500, 500, 350); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE); // 두번 반복
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_503() {
        final Button b = (Button) findViewById(R.id.s_503);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_504() {
        final Button b = (Button) findViewById(R.id.s_504);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_505() {
        final Button b = (Button) findViewById(R.id.s_505);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_507() {
        final Button b = (Button) findViewById(R.id.s_507);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_508() {
        final Button b = (Button) findViewById(R.id.s_508);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_509() {
        final Button b = (Button) findViewById(R.id.s_509);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_510() {
        final Button b = (Button) findViewById(R.id.s_510);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_551() {
        final Button b = (Button) findViewById(R.id.s_551);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_552() {
        final Button b = (Button) findViewById(R.id.s_552);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
    private void moving_555() {
        final Button b = (Button) findViewById(R.id.s_555);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
}