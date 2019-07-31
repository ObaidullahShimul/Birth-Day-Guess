package com.gogle.playstore.guessbirthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.gogle.playstore.guessbirthday.MainActivity.day;

public class Output_Result extends AppCompatActivity{

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output__result);

         t1= (TextView) findViewById(R.id.resulttext);
        //t1.setText(getIntent().getExtras().getString("mydate"));
        //t1.setText("date");
        //t1= (TextView) findViewById(R.id.resulttext);

        //int resy5=getIntent().getIntExtra("id_key", 0);
        t1.setText(String.valueOf(day));

        //t1.setText(day);

        day=0;

    }

    //int day=0;


}
