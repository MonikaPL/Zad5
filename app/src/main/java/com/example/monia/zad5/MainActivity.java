package com.example.monia.zad5;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static android.R.id.button2;


public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private String[] lang;
    private String[] phrases;

    private void initResources() {
        Resources res = getResources();
        lang = res.getStringArray(R.array.languages);
      //  phrases = res.getStringArray(R.array.hello_world);
    }
    private void initLanguagesListView(){
        lv.setAdapter(new ArrayAdapter<String>(getBaseContext(),
                android.R.layout.simple_list_item_1,lang));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View v, int pos, long id){
                if (pos == 0)
                {

                    Intent intent = new Intent(getApplicationContext(), Telefon1.class);
                    startActivity(intent);
                }
                else if (pos == 1)
                {
                    Intent intent = new Intent(getApplicationContext(), Telefon2.class);
                    startActivity(intent);
                }
                else if (pos == 2)
                {
                    Intent intent = new Intent(getApplicationContext(), Telefon3.class);
                    startActivity(intent);
            }

            }
    });
    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.langagues);
        initResources();
        initLanguagesListView();


        }




    }


