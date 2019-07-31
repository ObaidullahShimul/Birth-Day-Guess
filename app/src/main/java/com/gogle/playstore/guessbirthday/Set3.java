package com.gogle.playstore.guessbirthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.gogle.playstore.guessbirthday.MainActivity.day;
import static com.gogle.playstore.guessbirthday.R.id.nobtn2;
import static com.gogle.playstore.guessbirthday.R.id.nobtn3;
import static com.gogle.playstore.guessbirthday.R.id.yesbtn2;
import static com.gogle.playstore.guessbirthday.R.id.yesbtn3;

public class Set3 extends AppCompatActivity implements View.OnClickListener{

    private Button yesbtnth,nobtnth;

    //public

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set3);

        yesbtnth = (Button) findViewById(yesbtn3);
        nobtnth = (Button) findViewById(nobtn3);

        //Handler handler = new Handler();

        //btnlogin.setOnClickListener(handler);

        yesbtnth.setOnClickListener(this);
        nobtnth.setOnClickListener(this);
        
    }
    //int day=3;


    @Override
    public void onClick(View v) {


        if (v.getId()== yesbtn3){
            day+=4;
            //logintext.setText("Login Button is Clicked");
            //Toast toast= Toast.makeText(Set3.this,"Yes Button is Clicked: "+day,Toast.LENGTH_LONG);
            //toast.setGravity(Gravity.CENTER,0,0);
            //toast.show();
            //debag
            //Log.d("tag","Login Button Clicked");

            //yesbtnth.setText(Integer.toString(day));
            //int yesres3=Integer.parseInt(yesbtnth.getText().toString());

            Intent intent=new Intent(Set3.this,Set4.class);
            intent.putExtra("id_key",day);
            startActivity(intent);
            overridePendingTransition(R.anim.fadeout,R.anim.fadein);
            finish();
        }

        if (v.getId()== nobtn3){
            //day=3;
            //logintext.setText("Logout Button is Clicked");

            //Toast toast=Toast.makeText(Set3.this,"No Button is Clicked: "+day,Toast.LENGTH_LONG);
            //toast.setGravity(Gravity.CENTER,0,0);
            //toast.show();
            //Log.d("tag","Logout Button Clicked");
            //nobtnth.setText(Integer.toString(day));
            //int ida=Integer.parseInt(nobtnth.getText().toString());

            Intent intent=new Intent(Set3.this,Set4.class);
            intent.putExtra("id_key",day);
            startActivity(intent);
            overridePendingTransition(R.anim.fadeout,R.anim.fadein);
            finish();
        }

    }

}
