package com.example.miwok;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.miwok.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        TextView numbers=(TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent NumberIntent=new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(NumberIntent);

            }
        });

        TextView family=(TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent NumberIntent=new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(NumberIntent);

            }
        });

        TextView colors=(TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent NumberIntent=new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(NumberIntent);

            }
        });

        TextView phrases=(TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent NumberIntent=new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(NumberIntent);

            }
        });


        TextView palyer=(TextView) findViewById(R.id.mediaPlayer);
        palyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playerIntent=new Intent(MainActivity.this,TempMediaPlayer.class);
                startActivity(playerIntent);

            }
        });


    }


    public void openNumbersList(View view)
    {
        Intent startNumbersActivity=new Intent(this,NumbersActivity.class);
        startActivity(startNumbersActivity);
    }

    public void openPhrasesList(View view)
    {
        Intent startPhrasesActivity=new Intent(this,PhrasesActivity.class);
        startActivity(startPhrasesActivity);
    }

    public void openFamilyList(View view)
    {
        Intent startFamilyActivity=new Intent(this,FamilyActivity.class);
        startActivity(startFamilyActivity);
    }

    public void openColorsList(View view)
    {
        Intent startColorsActivity=new Intent(this,ColorsActivity.class);
        startActivity(startColorsActivity);
    }


    /////temp media player link
    public void openMediaPlayer(View view)
    {
        Intent startColorsActivity=new Intent(this,TempMediaPlayer.class);
        startActivity(startColorsActivity);
    }



}