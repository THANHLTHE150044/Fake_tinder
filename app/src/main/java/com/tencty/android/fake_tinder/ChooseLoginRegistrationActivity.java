package com.tencty.android.fake_tinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import com.lorentzos.flingswipe.SwipeFlingAdapterView;

public class ChooseLoginRegistrationActivity extends AppCompatActivity {
    private Button mLogin, mRegister;

    private void BindingView(){
        mLogin = (Button) findViewById(R.id.login);
        mRegister = (Button) findViewById(R.id.register);
    }

    private void BindingAction(){
        mLogin.setOnClickListener(this::onBtnLoginClick);
        mRegister.setOnClickListener(this::onBtnRegisterClick);
    }

    private void onBtnRegisterClick(View view) {
        Intent i = new Intent(ChooseLoginRegistrationActivity.this, RegistrationActivity.class);
        startActivity(i);
        finish();
        return;
    }

    private void onBtnLoginClick(View view) {
        Intent i = new Intent(ChooseLoginRegistrationActivity.this, LoginActivity.class);
        startActivity(i);
        finish();
        return;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_login_registration);
        BindingView();
        BindingAction();
    }
}