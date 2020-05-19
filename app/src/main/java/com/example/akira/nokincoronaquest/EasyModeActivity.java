package com.example.akira.nokincoronaquest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class EasyModeActivity extends AppCompatActivity {







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_mode);


//        TextView FirstHp = (TextView) findViewById(R.id.easy_corona_monster_hp);
//        TextView FirstMenu = (TextView) findViewById(R.id.menu_name);
//        TextView FirstTimes = (TextView) findViewById(R.id.numberOfTimes);

//        String[] menuName = new String[4];
//
//        menuName[0] = "腕立て伏せ";
//        menuName[1] = "腹筋";
//        menuName[2] = "スクワット";
//        menuName[3] = "懸垂";




        final ArrayList<Integer>  remainingHpList = new ArrayList<>();


        final Random random = new Random();


        final int randomFirstTimes = random.nextInt(20);

        final int randomSecondHp = random.nextInt(20);




        Button start = (Button) findViewById(R.id.start_button);
        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TextView maximumHp = (TextView) findViewById(R.id.maximum_hp);
                TextView remainingHp = (TextView) findViewById(R.id.remaining_hp);



//                ArrayList<Integer> remainingHpList;
//
//                if(remainingHpList.get() == null){
//                     remainingHpList = new ArrayList<>();
//                }


                TextView FirstTimes = (TextView) findViewById(R.id.numberOfTimes);


;
                if (maximumHp.getText().equals("")){
                    Random random = new Random();
                    int randomHp;
                    randomHp = random.nextInt(50);

//                    maximumHp.setText("/" + randomHp);
                    maximumHp.setText(String.valueOf(randomHp));

                    remainingHp.setText("：" + randomHp);


                } else {
                    int remainingsecondHp = Integer.valueOf(maximumHp.getText().toString());

                   int randomSecondHp = remainingsecondHp - remainingHpList.get(0);

//                     randomSecondHp[0] = Integer.valueOf(FirstTimes.getText().toString());


                    remainingHp.setText("：" + randomSecondHp);



                }



                //メニューの設定
                TextView FirstMenu = (TextView) findViewById(R.id.menu_name);

                String[] menuName = new String[4];

                menuName[0] = "腕立て伏せ";
                menuName[1] = "腹筋";
                menuName[2] = "スクワット";
                menuName[3] = "懸垂";

                int randomFirstMenuName = random.nextInt(4);

                FirstMenu.setText(menuName[randomFirstMenuName]);





                //メニュー回数の設定
                FirstTimes.setText(String.valueOf(randomFirstTimes));


                 remainingHpList.add(randomFirstTimes);

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
