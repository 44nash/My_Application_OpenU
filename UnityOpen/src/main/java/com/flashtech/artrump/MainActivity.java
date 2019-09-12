package com.flashtech.artrump;


import com.unity3d.player.*;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends UnityPlayerActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, UnityPlayerActivity.class);
                startActivity(i);
            }
        });

    }

    public void openActivity2(){
//        Intent intent = new Intent(this, UnityPlayerActivity.class);
//        startActivity(intent);

//        Intent intent = getApplicationContext().getPackageManager().getLaunchIntentForPackage("com.flashtech.artrump");
//        startActivity(intent);


//        Intent i = new Intent(MainActivity.this, UnityPlayerActivity.class);
//        startActivity(i);

    }

}

