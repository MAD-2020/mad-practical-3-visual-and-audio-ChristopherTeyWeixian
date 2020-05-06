package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer babyLaugh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        babyLaugh = MediaPlayer.create(this, R.raw.baby_laughing);
        babyLaugh.start();



        VideoView view = findViewById(R.id.videoView);
        view.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rabbid) );
        view.start();




    }
}
