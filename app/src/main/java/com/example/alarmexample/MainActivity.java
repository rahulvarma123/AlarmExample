package com.example.alarmexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etTime;
    Button btSet, btCancel;
    AlarmManager alarmManager;
    PendingIntent pendingIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etTime = findViewById(R.id.etText);
        btSet = findViewById(R.id.btnSet);
        btCancel = findViewById(R.id.btnCancel);
        btSet.setOnClickListener(this);
        btCancel.setOnClickListener(this);
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);


    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnSet) {
            Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
            intent.putExtra(AlarmClock.EXTRA_HOUR,13);
            intent.putExtra(AlarmClock.EXTRA_MINUTES,41);
            startActivity(intent);

        } else if (view.getId() == R.id.btnCancel) {
            alarmManager.cancel(pendingIntent);
        }


    }
}
