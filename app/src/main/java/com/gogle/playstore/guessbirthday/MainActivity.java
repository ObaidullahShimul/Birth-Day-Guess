package com.gogle.playstore.guessbirthday;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import android.app.Activity;
import android.content.Intent;
import android.drm.DrmStore;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button yesbtn1,nobtn1;

    public static int day=0;
    //private static int WELCOME_TIMEOUT=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yesbtn1= (Button) findViewById(R.id.yesbtn1);
        nobtn1= (Button) findViewById(R.id.nobtn1);

        //Handler handler = new Handler();

        //btnlogin.setOnClickListener(handler);

        yesbtn1.setOnClickListener(this);
        nobtn1.setOnClickListener(this);

        //int yesbtn1=1;

    }


    @Override
    public void onClick(View v) {




        if (v.getId()==R.id.yesbtn1){
            day+=1;
            //logintext.setText("Login Button is Clicked");
            //Toast toast= Toast.makeText(MainActivity.this,"SET 1 (YES) Button is Clicked: "+day,Toast.LENGTH_LONG);
            //toast.setGravity(Gravity.CENTER,0,0);
            //toast.show();
            //debag
            //Log.d("tag","Login Button Clicked");

            //yesbtn1.setText(Integer.toString(day));
            //int daya=Integer.parseInt(yesbtn1.getText().toString());
            Intent intent=new Intent(MainActivity.this,Set2.class);
            intent.putExtra("id_key",day);
            startActivity(intent);
            overridePendingTransition(R.anim.fadeout,R.anim.fadein);
            //overridePendingTransition(R.anim.color_opacity,R.anim.color_opacity);
            finish();
        }

        if (v.getId()==R.id.nobtn1){
            //logintext.setText("Logout Button is Clicked");
            //Toast toast=Toast.makeText(MainActivity.this,"SET 2 (NO) Button is Clicked"+day,Toast.LENGTH_LONG);
            //toast.setGravity(Gravity.CENTER,0,0);
            //toast.show();
            //Log.d("tag","Logout Button Clicked");

            //nobtn1.setText(Integer.toString(day));
            //int ida=Integer.parseInt(nobtn1.getText().toString());

            //nobtn1.getBackground().setAlpha(120);

            Intent intent=new Intent(MainActivity.this,Set2.class);
            intent.putExtra("id_key",day);
            startActivity(intent);
            overridePendingTransition(R.anim.fadeout,R.anim.fadein);
            finish();
        }

    }
}
