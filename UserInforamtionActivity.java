package spice.in.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class UserInforamtionActivity extends AppCompatActivity {

    TextView txtName, txtContact,userStuts;
    String nameValue, contactValue,userStatus;
    Bundle firstBundle,secondBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_inforamtion);

        txtName = (TextView) findViewById(R.id.txtName);
        txtContact = (TextView) findViewById(R.id.txtContact);
        userStuts= (TextView) findViewById(R.id.userStuts);

        firstBundle = this.getIntent().getExtras().getBundle("FisrtBundle");
        secondBundle = this.getIntent().getExtras().getBundle("SecondBundle");

        nameValue = firstBundle.getString("UserName");
        contactValue = firstBundle.getString("UserContact");
        userStatus=secondBundle.getString("userinfo");


        txtName.setText(nameValue);
        txtContact.setText(contactValue);
        userStuts.setText(userStatus);

    }

}
