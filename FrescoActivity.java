package spice.in.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

public class FrescoActivity extends AppCompatActivity {
    ImageView imageView;
    SimpleDraweeView draweeViewGif, simpleImage;
    DraweeController controllerOne;
    Uri imageUriGif, imageUriSimple, url;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_fresco);
        context = this;
        url = Uri.parse("https://www.w3schools.com/css/paris.jpg");



        imageUriGif = Uri.parse("http://25.media.tumblr.com/tumblr_mdaws9x5671r3tn9do1_500.gif");//gid image url
        imageUriSimple = Uri.parse("https://www.w3schools.com/css/paris.jpg");//simple image


        simpleImage = (SimpleDraweeView) findViewById(R.id.simpleImage);
        simpleImage.setImageURI(imageUriSimple);

        draweeViewGif = (SimpleDraweeView) findViewById(R.id.sdvImage);
        controllerOne = Fresco.newDraweeControllerBuilder()
                .setUri(imageUriGif)
                .setAutoPlayAnimations(true)
                .build();

        draweeViewGif.setController(controllerOne);


        imageView = (ImageView) findViewById(R.id.imageView);
//        Picasso.with(context).load("https://www.w3schools.com/css/paris.jpg").into(imageView);

        Glide.with(this)
                .load(imageUriGif)
                .asGif()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);


    }
}
