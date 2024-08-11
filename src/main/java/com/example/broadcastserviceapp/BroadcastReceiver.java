package com.example.broadcastserviceapp;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.util.Objects;

public class BroadcastReceiver extends android.content.BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(Objects.equals(intent.getAction(), Intent.ACTION_AIRPLANE_MODE_CHANGED)){
            boolean isAirplaneModeOn = intent.getBooleanExtra("state", false);
            String message = isAirplaneModeOn ? "Airplane mode is active" : "Airplane mode is inactive";
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
        }
    }
}
