package com.a4.daffaapps;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EksplisitIntentOne extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
    }

    public void newsScreen(View view) {
        Intent i = new Intent(getApplicationContext(), EksplisitIntentTwo.class);
        startActivity(i);
    }

    public void countApps(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }

    public void scrollingApps(View view) {
        Intent i = new Intent(getApplicationContext(), ScrollingIceCold.class);
        startActivity(i);
    }

    public void alarmApps(View view) {
        Intent i = new Intent(getApplicationContext(), AlarmProject.class);
        startActivity(i);
    }

    public void replyMessageApps(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivityOne.class);
        startActivity(i);
    }

    public void maps(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/@-6.2566479,107.1360328,15.38z?entry=ttu"));
        intent.setPackage("com.google.android.apps.maps");
        if(intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
