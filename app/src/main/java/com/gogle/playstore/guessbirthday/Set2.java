package com.gogle.playstore.guessbirthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.gogle.playstore.guessbirthday.MainActivity.day;
import static com.gogle.playstore.guessbirthday.R.id.nobtn1;

public class Set2 extends AppCompatActivity implements View.OnClickListener{

    Button yesbtntw,nobtntw;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set2);


        yesbtntw= (Button) findViewById(R.id.yesbtn2);
        nobtntw= (Button) findViewById(R.id.nobtn2);

        //Handler handler = new Handler();

        //btnlogin.setOnClickListener(handler);

        yesbtntw.setOnClickListener(this);
        nobtntw.setOnClickListener(this);

//        int yesres1=getIntent().getIntExtra("id_key", 0);
//        yesbtntw.setText(String.valueOf(yesres1));
//
//        int nores1=getIntent().getIntExtra("id_key", 0);
//        nobtntw.setText(String.valueOf(nores1));
//
//
    }


    //int day=1;

    @Override
    public void onClick(View v) {




        if (v.getId()==R.id.yesbtn2){
            day+=2;
            //logintext.setText("Login Button is Clicked");
            //Toast toast= Toast.makeText(Set2.this,"Yes Button is Clicked: "+day,Toast.LENGTH_LONG);
            //toast.setGravity(Gravity.CENTER,0,0);
            //toast.show();
            //debag
            //Log.d("tag","Login Button Clicked");
            //day+=2;

            //yesbtntw.setText(Integer.toString(day));
            //day=Integer.parseInt(yesbtntw.getText().toString());


            Intent intent=new Intent(Set2.this,Set3.class);
            intent.putExtra("id_key",day);
            startActivity(intent);
            overridePendingTransition(R.anim.fadeout,R.anim.fadein);
            finish();
        }


        if (v.getId()==R.id.nobtn2){
            //day=1;
            //logintext.setText("Logout Button is Clicked");
            //Toast toast=Toast.makeText(Set2.this,"No Button is Clicked: "+day,Toast.LENGTH_LONG);
            //toast.setGravity(Gravity.CENTER,0,0);
            //toast.show();
            //Log.d("tag","Logout Button Clicked");
            //nobtntw.setText(Integer.toString(day));
            //int ida=Integer.parseInt(nobtntw.getText().toString());

            Intent intent=new Intent(Set2.this,Set3.class);
            intent.putExtra("id_key",day);
            startActivity(intent);
            overridePendingTransition(R.anim.fadeout,R.anim.fadein);
            finish();
        }

    }

}
