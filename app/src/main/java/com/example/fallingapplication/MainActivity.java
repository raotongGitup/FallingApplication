package com.example.fallingapplication;

import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private FallingView mFallingView;
    private ImageView img;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFallingView = (FallingView) findViewById(R.id.falling_view);
        img = (ImageView) findViewById(R.id.img);
        img.setImageResource(R.drawable.bg1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.img1:
                mFallingView.start();
                break;
            case R.id.img2:
                mFallingView.stop();
                break;

        }
        return super.onOptionsItemSelected(item);
    }


}
