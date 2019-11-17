package com.example.parwazeclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Notificat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificat);
    }

    public void note(View view) {
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        int notificationId = 1;
        String channelId = "df";
        String channelName = "dfh";
        int importance = NotificationManager.IMPORTANCE_HIGH;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel mChannel = new NotificationChannel(
                    channelId, channelName, importance);
            notificationManager.createNotificationChannel(mChannel);
        }

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(Notificat.this, channelId)
                .setSmallIcon(android.R.drawable.ic_media_play)
                .setContentTitle("this is title ")
                .setContentText("this is message body");

        Intent intent = new Intent(Notificat.this,WeBvie.class);
        PendingIntent  pendingIntent = PendingIntent.getActivity(Notificat.this,0,intent,0);
        mBuilder.setContentIntent(pendingIntent);
        notificationManager.notify(notificationId, mBuilder.build());
    }
}
