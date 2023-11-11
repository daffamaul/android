package com.a4.daffaapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;

    private int secondCount = 1;

    private int currentFib = 0;

    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        EditText inputLimit = findViewById(R.id.input_limit);
        if(!inputLimit.getText().toString().isEmpty()) {
            int limit = Integer.parseInt(inputLimit.getText().toString());
            if(mCount >= limit) {
                Toast.makeText(this, "Telah mencapai limit", Toast.LENGTH_LONG).show();
                return;
            }
        }
        int next = mCount;
        mCount = secondCount;
        secondCount = next + mCount;
        if (mShowCount != null)
            mShowCount.setTextColor(setColor());
            mShowCount.setText(Integer.toString(next));
    }

    public void reset(View view) {
        mCount = 0;
        secondCount = 1;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public int setColor() {
        currentFib++;
        if(currentFib % 2 == 0) {
            return ContextCompat.getColor(this, R.color.black);
        } else {
            return ContextCompat.getColor(this, R.color.blue);
        }
    }
}