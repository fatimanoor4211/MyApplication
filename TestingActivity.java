package spice.in.myapplication;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TestingActivity extends AppCompatActivity implements LocationListener {

    LocationManager locationManager;
    Button getLocationBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing2);
        Toast.makeText(TestingActivity.this, "onCreate", Toast.LENGTH_SHORT).show();
//
        TestingFragmnet fragmnet = new TestingFragmnet();

        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, fragmnet, "Fragment");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


//        TextView verificationSubtitle = (TextView) findViewById(R.id.subTitleTxtView);
//        String aadhharNumber = "123456789012";
//
////       Get last 4 digit of your mobile number
//        String strLastFourDi = aadhharNumber.substring(aadhharNumber.length() - 4);
//        String newString = this.getResources().getString(R.string.verification_subtitle);
//
//        //Replace digit
//        String replace = newString.replace("3678",strLastFourDi);
//        String text = format(replace);
//
//        //set Text
//        verificationSubtitle.setText(Html.fromHtml(text));
        getLocationBtn = (Button) findViewById(R.id.getLocationBtn);
        getLocationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getLocation();
            }
        });

    }

    void getLocation() {
        try {
            locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 5000, 5, (LocationListener) this);

        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(TestingActivity.this, "onStart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(TestingActivity.this, "onPause", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(TestingActivity.this, "onStop", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(TestingActivity.this, "onResume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(TestingActivity.this, "onRestart", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onLocationChanged(Location location) {
        getLocationBtn.setText("Latitude: " + location.getLatitude() + "\n Longitude: " + location.getLongitude());


    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
