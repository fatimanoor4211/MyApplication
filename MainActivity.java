package spice.in.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etName, etContact;
    private Button btnNext;
    Intent mintent;
    String userName, userContact;
    private String TAG = MainActivity.this.getClass().getSimpleName();
    Context mContext;
    Bundle mBundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=this;
        setViews();
//        setData();
        btnNext.setOnClickListener(this);
    }

    private void setViews() {
        etName = (EditText) findViewById(R.id.etName);
        etContact = (EditText) findViewById(R.id.etContact);
        btnNext = (Button) findViewById(R.id.btnNext);
    }

    private void setData() {
        userName = etName.getText().toString().trim();
        userContact = etContact.getText().toString().trim();
    }

    @Override
    public void onClick(View v) {

        setData();

        if (userName == null && userName.equalsIgnoreCase(""))
            Toast.makeText(mContext, "Please enter your name", Toast.LENGTH_SHORT).show();

        else if (userContact == null && userContact.equalsIgnoreCase(""))
            Toast.makeText(mContext, "Please enter your contact", Toast.LENGTH_SHORT).show();

        else{

            mBundle=new Bundle();
            mBundle.putString("UserName",userName);
            mBundle.putString("UserContact",userContact);

            mintent=new Intent(mContext,EditInformationActivity.class);
            mintent.putExtras(mBundle);
            startActivity(mintent);

            etName.getText().clear();
            etContact.getText().clear();



        }

    }


}
