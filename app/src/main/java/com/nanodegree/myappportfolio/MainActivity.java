package com.nanodegree.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public final String TAG = MainActivity.class.getSimpleName();

    Button spotify, scores, library,builditbigger, xyz, capstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotify = (Button)findViewById(R.id.spotify_btn);
        scores = (Button)findViewById(R.id.scores_btn);
        library = (Button)findViewById(R.id.library_btn);
        builditbigger = (Button) findViewById(R.id.bigger_btn);
        xyz = (Button) findViewById(R.id.xyz_btn);
        capstone = (Button)findViewById(R.id.capstone_btn);

        spotify.setOnClickListener(this);
        scores.setOnClickListener(this);
        library.setOnClickListener(this);
        builditbigger.setOnClickListener(this);
        xyz.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so SHORT
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {

            case R.id.spotify_btn:
                Toast.makeText(getApplicationContext(), String.format(getResources()
                        .getString(R.string.apps_toastmsg),
                        getResources().getString(R.string.spotify)), Toast.LENGTH_SHORT).show();
                break;

            case R.id.scores_btn:
                Toast.makeText(getApplicationContext(), String.format(getResources()
                        .getString(R.string.apps_toastmsg),
                        getResources().getString(R.string.scores)), Toast.LENGTH_SHORT).show();
                break;

            case R.id.library_btn:
                Toast.makeText(getApplicationContext(), String.format(getResources()
                        .getString(R.string.apps_toastmsg),
                        getResources().getString(R.string.library)), Toast.LENGTH_SHORT).show();
                break;

            case R.id.bigger_btn:
                Toast.makeText(getApplicationContext(), String.format(getResources()
                        .getString(R.string.apps_toastmsg),
                        getResources().getString(R.string.build)), Toast.LENGTH_SHORT).show();
                break;

            case R.id.xyz_btn:
                Toast.makeText(getApplicationContext(), String.format(getResources()
                        .getString(R.string.apps_toastmsg),
                        getResources().getString(R.string.xyz)), Toast.LENGTH_SHORT).show();
                break;

            case R.id.capstone_btn:
                Toast.makeText(getApplicationContext(), String.format(getResources()
                        .getString(R.string.apps_toastmsg),
                        getResources().getString(R.string.capstone)), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
