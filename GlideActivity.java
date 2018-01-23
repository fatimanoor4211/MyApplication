package spice.in.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GlideActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);
        imageView=(ImageView)findViewById(R.id.imageView);

        Glide.with(this)
                .load("http://25.media.tumblr.com/tumblr_mdaws9x5671r3tn9do1_500.gif")
                .asGif()
                .into(imageView);
    }
}
