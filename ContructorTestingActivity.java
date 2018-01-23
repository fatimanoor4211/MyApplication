package spice.in.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

public class ContructorTestingActivity extends AppCompatActivity {

//  public ContructorTestingActivity(){
//
//  }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contructor_testing);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ConstructorAcess constructorAcess = new ConstructorAcess();
        Toast.makeText(this,"Value: "+constructorAcess.toString(),Toast.LENGTH_SHORT).show();
        Log.d("value", constructorAcess.toString());

//        Toast.makeText(this,"Value: "+"TESTING",Toast.LENGTH_SHORT).show();
    }

}
