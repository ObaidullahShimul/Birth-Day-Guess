package com.gogle.playstore.guessbirthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.gogle.playstore.guessbirthday.MainActivity.day;
import static com.gogle.playstore.guessbirthday.R.id.nobtn3;
import static com.gogle.playstore.guessbirthday.R.id.nobtnfour;
import static com.gogle.playstore.guessbirthday.R.id.yesbtn3;
import static com.gogle.playstore.guessbirthday.R.id.yesbtnfour;

public class Set4 extends AppCompatActivity implements View.OnClickListener {

    private Button yesbtnfo,nobtnfo;

    //int day=7;
    //public

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set4);

        yesbtnfo = (Button) findViewById(yesbtnfour);
        nobtnfo = (Button) findViewById(nobtnfour);

        //Handler handler = new Handler();

        //btnlogin.setOnClickListener(handler);

        yesbtnfo.setOnClickListener(this);
        nobtnfo.setOnClickListener(this);

//        int yesres3=getIntent().getIntExtra("id_key", 0);
//        yesbtnfo.setText(String.valueOf(yesres3));
//
//        int nores3=getIntent().getIntExtra("id_key", 0);
//        nobtnfo.setText(String.valueOf(nores3));
    }


    @Override
    public void onClick(View v) {




        if (v.getId()== yesbtnfour){
            day+=8;
            //logintext.setText("Login Button is Clicked");
            //Toast toast= Toast.makeText(Set4.this,"Yes Button is Clicked: "+day,Toast.LENGTH_LONG);
            //toast.setGravity(Gravity.CENTER,0,0);
            //toast.show();
            //debag
            //Log.d("tag","Login Button Clicked");

            //yesbtnfo.setText(Integer.toString(day));
            //int yesres4=Integer.parseInt(yesbtnfo.getText().toString());


            Intent intent=new Intent(Set4.this,Set5.class);
            intent.putExtra("id_key",day);
            startActivity(intent);
            overridePendingTransition(R.anim.fadeout,R.anim.fadein);
            //finish();
        }


        if (v.getId()== nobtnfour){
            //day=7;
            //logintext.setText("Logout Button is Clicked");
            //Toast toast=Toast.makeText(Set4.this,"No Button is Clicked: "+day,Toast.LENGTH_LONG);
            //toast.setGravity(Gravity.CENTER,0,0);
            //toast.show();
            //Log.d("tag","Logout Button Clicked");
            //nobtnfo.setText(Integer.toString(day));
            //int ida=Integer.parseInt(nobtnfo.getText().toString());

            Intent intent=new Intent(Set4.this,Set5.class);
            intent.putExtra("id_key",day);
            startActivity(intent);
            overridePendingTransition(R.anim.fadein,R.anim.fadeout);
            //finish();
        }

    }

}
