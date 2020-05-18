package com.example.akira.nokincoronaquest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class EasyModeActivity extends AppCompatActivity {







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_mode);


//        TextView FirstHp = (TextView) findViewById(R.id.easy_corona_monster_hp);
//        TextView FirstMenu = (TextView) findViewById(R.id.menu_name);
//        TextView FirstTimes = (TextView) findViewById(R.id.numberOfTimes);



        Button start = (Button) findViewById(R.id.start_button);
        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TextView FirstHp = (TextView) findViewById(R.id.easy_corona_monster_hp);

                Random random = new Random();
                int randomValue = random.nextInt(100);


            FirstHp.setText("：" + randomValue + "/" + randomValue);





            }
        });














        Button back = (Button) findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });
    }
}
