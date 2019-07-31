package com.gogle.playstore.guessbirthday;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.gogle.playstore.guessbirthday.MainActivity.day;
import static com.gogle.playstore.guessbirthday.R.id.info;
import static com.gogle.playstore.guessbirthday.R.id.nobtnfive;
import static com.gogle.playstore.guessbirthday.R.id.nobtnfour;
import static com.gogle.playstore.guessbirthday.R.id.yesbtnfive;
import static com.gogle.playstore.guessbirthday.R.id.yesbtnfour;

public class Set5 extends AppCompatActivity implements View.OnClickListener{

    Button yesbtnfiv,nobtnfiv;

    //TextView showvalue;

    //int day=15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set5);

        yesbtnfiv= (Button) findViewById(R.id.yesbtnfive);
        nobtnfiv= (Button) findViewById(R.id.nobtnfive);


        yesbtnfiv.setOnClickListener(this);
        nobtnfiv.setOnClickListener(this);

//        int yesres4=getIntent().getIntExtra("id_key", 0);
//        yesbtnfiv.setText(String.valueOf(yesres4));
//
//        int nores4=getIntent().getIntExtra("id_key", 0);
//        nobtnfiv.setText(String.valueOf(nores4));
//
//        showvalue=(TextView) findViewById(R.id.showtxt5);



    }



    @Override
    public void onClick(View v) {



        if (v.getId()== yesbtnfive) {
            day += 16;
            //Toast toast = Toast.makeText(Set5.this, "Yes Button is Clicked"+day, Toast.LENGTH_LONG);
            //toast.show();
            //debagtoast.setGravity(Gravity.CENTER, 0, 0);
            //showvalue.setText(Integer.toString(day));
            //Log.d("tag","Login Button Clicked");
            //yesbtnfiv.setText(Integer.toString(day));
            //int resy5=Integer.parseInt(yesbtnfiv.getText().toString());

            //yesbtnfiv.setText(Integer.toString(day));
            //int resy5=Integer.parseInt(yesbtnfiv.getText().toString());

            Intent intent = new Intent(Set5.this, Output_Result.class);
            //intent.putExtra("mydate", (Parcelable) showvalue);
            intent.putExtra("id_key",day);
            //yesbtnfiv.setText("");
            startActivity(intent);
            overridePendingTransition(R.anim.downtoup,R.anim.downtoup);
            finish();
        }


        if (v.getId()== nobtnfive){
            //day=15;
            //Toast toast=Toast.makeText(Set5.this,"No Button is Clicked"+day,Toast.LENGTH_LONG);
            //toast.setGravity(Gravity.CENTER,0,0);
            //toast.show();
            //Log.d("tag","Logout Button Clicked");

            //nobtnfiv.setText(Integer.toString(day));
            //int resy5=Integer.parseInt(nobtnfiv.getText().toString());

            Intent intent=new Intent(Set5.this,Output_Result.class);
            intent.putExtra("id_key",day);
            //yesbtnfiv.setText("");

            startActivity(intent);
            overridePendingTransition(R.anim.downtoup,R.anim.uptodown);
            finish();
        }

    }
}
