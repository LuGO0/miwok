package com.example.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.miwok.R;
import com.example.miwok.Word;
import com.example.miwok.WordAdapter;

import java.util.ArrayList;

public class TempMediaPlayer extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_player_layout);


        final MediaPlayer player = MediaPlayer.create(this,R.raw.color_dusty_yellow);

        Button playButton=(Button )findViewById(R.id.play_it);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
                player.start();

            }
        });


        Button pauseButton=(Button )findViewById(R.id.pause_it);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
                player.pause();
            }
        });




    }


}