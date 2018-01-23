package spice.in.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditInformationActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etName, etContact;
    private Button btnSubmit;
    Intent mintent;
    String userName, userContact, userNameValue, userConatctVlaue;
    Context mContext;
    public Bundle getBundle = null,secondBundle,newBundle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_information);
        mContext = this;
        setViews();

        getBundle = this.getIntent().getExtras();
        userNameValue = getBundle.getString("UserName");
        userConatctVlaue = getBundle.getString("UserContact");
        etName.setText(userNameValue);
        etContact.setText(userConatctVlaue);
        btnSubmit.setOnClickListener(this);

    }

    private void setViews() {
        etName = (EditText) findViewById(R.id.etName);
        etContact = (EditText) findViewById(R.id.etContact);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
    }

    private void GetData() {
        userName = etName.getText().toString().trim();
        userContact = etContact.getText().toString().trim();

    }

    @Override
    public void onClick(View v) {
        GetData();
        if (userName == null && userName.equalsIgnoreCase(""))
            Toast.makeText(mContext, "Please enter your name", Toast.LENGTH_SHORT).show();

        else if (userContact == null && userContact.equalsIgnoreCase(""))
            Toast.makeText(mContext, "Please enter your contact", Toast.LENGTH_SHORT).show();

        else {
            secondBundle=new Bundle();
            secondBundle.putString("userinfo","Successfully updated");

            mintent = new Intent(mContext, UserInforamtionActivity.class);
            mintent.putExtra("FisrtBundle",getBundle);
            mintent.putExtra("SecondBundle",secondBundle);
            startActivity(mintent);

            etName.getText().clear();
            etContact.getText().clear();


        }

    }
}
