package shahzaib.com.gotquizgame;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.romainpiel.shimmer.Shimmer;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button playgame,exit,mutebtn;
    private Button music;
    private MediaPlayer mediaPlayer;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        playgame = findViewById(R.id.btnplaygame);
        exit = findViewById(R.id.btnexit);
        mutebtn = findViewById(R.id.btnmute);
        //TextView friends_textview = (TextView) findViewById(R.id.txt);
        TextView friends_textview = (TextView) findViewById(R.id.txt);

        TextView friends_textview1 = (TextView) findViewById(R.id.txt1);
        Typeface typeface122 = Typeface.createFromAsset(getAssets(), "fonts/Poppins-Regular.ttf");
        if (playgame != null & mutebtn != null & exit != null) {
            playgame.setTypeface(typeface122);
            exit.setTypeface(typeface122);
            mutebtn.setTypeface(typeface122);
            friends_textview1.setTypeface(typeface122);

        }


        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/GameofThrones.ttf");
        if (friends_textview != null & friends_textview1 != null) {
            friends_textview.setTypeface(typeface1);

        }

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.themesong);
        mediaPlayer.start();


        mutebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (mediaPlayer.isPlaying()) {
                    mutebtn.setText(R.string.musicoff);
                    onPause();
                } else {
                    mutebtn.setText(R.string.musicon);
                    onStart();
                }


            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

                finish();


            }
        });

        playgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), questionDisplay.class);
                startActivity(intent);

            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        mediaPlayer.seekTo(0);
        onStart();


    }


    @Override
    public void onStart() {
        super.onStart();
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    // when user clicks the pause button music will be muted
    @Override
    public void onPause() {
        super.onPause();
        if (mediaPlayer != null) {
            mediaPlayer.pause();

        }
    }

    // when the activity is destroyed
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
