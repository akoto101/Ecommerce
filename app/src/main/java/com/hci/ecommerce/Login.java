package com.hci.ecommerce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {
    Button btn_Signup,btn_Login;
    EditText edt_User,edt_Pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn_Signup = (Button) findViewById(R.id.btn_Signup);
        btn_Login = (Button) findViewById(R.id.btn_Login);
        edt_User = findViewById(R.id.txt_Username);
        edt_Pass = findViewById(R.id.txt_Password);


        btn_Signup.setOnClickListener(this);
        btn_Login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(btn_Signup == v)
        {
            startActivity(new Intent(this,Signup.class));

        }
        if(btn_Login == v)
        {

                startActivity(new Intent(this,Home.class));


        }
    }
}
