package com.example.alarmexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    MediaPlayer mediaPlayer;

    @Override
    public void onReceive(Context context, Intent intent) {

        mediaPlayer = MediaPlayer.create(context, R.raw.alarm_clock);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(context, "Alarm Invoked", Toast.LENGTH_LONG).show();
    }
}
