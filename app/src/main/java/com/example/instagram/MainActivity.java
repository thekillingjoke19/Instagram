package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
private ImageView iconimage;
private LinearLayout linearLayout;
private Button register,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iconimage = findViewById(R.id.icon_image);
        linearLayout = findViewById(R.id.linear_layout);
        register = findViewById(R.id.register);
        login = findViewById(R.id.login);
        linearLayout.animate().alpha(0f).setDuration(1);

        TranslateAnimation animation= new TranslateAnimation(0,0,0,-1000);
        animation.setDuration(1000);
        animation.setFillAfter(false);
        animation.setAnimationListener(new MyAnimationListenner());


    }
private class MyAnimationListenner implements Animation.AnimationListener

{

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
              iconimage.clearAnimation();
              iconimage.setVisibility(View.INVISIBLE);
              linearLayout.animate().alpha(0f).setDuration(1);

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}


}