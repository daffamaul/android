package com.a4.daffaapps;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AlarmProject extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        Button button = findViewById(R.id.button_alarm);
        TextView alarmName = findViewById(R.id.set_alarm_name);
        TextView hourAlarm = findViewById(R.id.set_hour_alarm);
        TextView minuteAlarm = findViewById(R.id.set_minute_alarm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = String.format(String.valueOf(alarmName));
                int hour = Integer.parseInt(hourAlarm.getText().toString());
                int minute = Integer.parseInt(minuteAlarm.getText().toString());
                Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                        .putExtra(AlarmClock.EXTRA_MESSAGE, name)
                        .putExtra(AlarmClock.EXTRA_HOUR, hour)
                        .putExtra(AlarmClock.EXTRA_MINUTES, minute);
                if(intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}
