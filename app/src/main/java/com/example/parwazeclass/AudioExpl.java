package com.example.parwazeclass;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class AudioExpl extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    VideoView videoView;
    String MY_VIDEO = "http://www.ebookfrenzy.com/android_book/movie.mp4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_expl);
        mediaPlayer = MediaPlayer.create(AudioExpl.this, R.raw.abc); /// audio file name small letter
        videoView=findViewById(R.id.videoView);
    }
    public void startt(View view) {
        mediaPlayer.start();
    }
    public void pausee(View view) {
        mediaPlayer.pause();
    }
    public void stopp(View view) {
       // mediaPlayer.stop();
       // mediaPlayer = MediaPlayer.create(AudioExpl.this, R.raw.abc); /// audio file name small letter
        MediaController mediacontroller = new MediaController(AudioExpl.this);

        mediacontroller.setAnchorView(videoView);
        Uri video = Uri.parse(MY_VIDEO);
        videoView.setMediaController(mediacontroller);
        videoView.setVideoURI(video);
        videoView.start();
    }
}
