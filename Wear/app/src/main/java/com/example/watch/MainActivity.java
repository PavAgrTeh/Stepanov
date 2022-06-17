package com.example.watch;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.watch.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View myImageView = findViewById(R.id.imageView);
        final Animation animationRotateCenter = AnimationUtils.loadAnimation(
                this, R.anim.rotate_center);
        myImageView.startAnimation(animationRotateCenter);


    }
    public void gotohome(View view){setContentView(R.layout.home);}
    public void gotolog(View view){setContentView(R.layout.log);}
    public void gotoroom(View view){setContentView(R.layout.room);}
    public void gotodev(View view){setContentView(R.layout.dev);}

    public void l100(View view){setContentView(R.layout.l100);}
    public void l090(View view){setContentView(R.layout.l090);}
    public void l080(View view){setContentView(R.layout.l080);}
    public void l070(View view){setContentView(R.layout.l070);}
    public void l060(View view){setContentView(R.layout.l060);}
    public void l050(View view){setContentView(R.layout.l050);}
    public void l040(View view){setContentView(R.layout.l040);}
    public void l030(View view){setContentView(R.layout.l030);}
    public void l020(View view){setContentView(R.layout.l020);}
    public void l010(View view){setContentView(R.layout.l010);}
    public void l000(View view){setContentView(R.layout.l000);}
}