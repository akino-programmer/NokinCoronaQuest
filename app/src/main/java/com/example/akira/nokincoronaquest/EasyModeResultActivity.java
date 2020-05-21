package com.example.akira.nokincoronaquest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class EasyModeResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_mode_result);


        ArrayList<String> actMenuNameTimesList = (ArrayList<String>)getIntent().getSerializableExtra("resultMenuNumeTimes");

        ArrayAdapter<String> nameTimesList = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, actMenuNameTimesList );

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(nameTimesList);








        Button back = (Button) findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });


    }
}
