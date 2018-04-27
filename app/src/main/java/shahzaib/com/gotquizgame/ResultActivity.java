/*Copyright 2016 Android

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.**/


package shahzaib.com.gotquizgame;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class ResultActivity extends AppCompatActivity {

    MediaPlayer player;
    private Button play_again;
    private Button main_menu;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        textView = findViewById(R.id.ttt);
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/GameofThrones.ttf");
        if (textView != null) {
            textView.setTypeface(typeface1);
        }


        player = MediaPlayer.create(getApplicationContext(), R.raw.themesong);
        player.start();


        play_again = (Button) findViewById(R.id.play_again_button);
        if (play_again != null) {
            play_again.setBackgroundResource(R.drawable.button_pink);

        }
        play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getApplicationContext(), questionDisplay.class);
                startActivity(intent);
                finish();


            }
        });


        main_menu = (Button) findViewById(R.id.main_menus);
        if (main_menu != null) {
            main_menu.setBackgroundResource(R.drawable.button_pink);

        }
        main_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();


            }
        });


        // retrieves Bundle from MainActivity
        Bundle b = getIntent().getExtras();
        // stores the score that was passed from question display activity
        int score = b.getInt("score");

        TextView points_text = (TextView) findViewById(R.id.points);

        // when score is is 1 change points to point to correct grammar
        if (score == 1) {
            if (points_text != null) {
                points_text.setText("Points");
            }
        }

        TextView scores = (TextView) findViewById(R.id.point_scored);

        // displays the score in the TextView for result
        if (scores != null) {
            scores.setText(String.valueOf(score));
        }





    }


    @Override
    public void onStop() {
        super.onStop();

        if (player != null) {
            player.release();
            player = null;

        }
    }


}

