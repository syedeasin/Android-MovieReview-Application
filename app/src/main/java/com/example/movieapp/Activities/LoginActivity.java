package com.example.movieapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.movieapp.R;

public class LoginActivity extends AppCompatActivity {
    private EditText userEdit, passEdit;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }

    private void initView() {
        userEdit = findViewById(R.id.editTextText);
        passEdit = findViewById(R.id.editTextPassword);
        loginBtn = findViewById(R.id.loginbtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userEdit.getText().toString().isEmpty()){
                    Toast.makeText(LoginActivity.this,"Please Fill Your User and Password", Toast.LENGTH_SHORT).show();
                } else if (userEdit.getText().toString().equals("test") && passEdit.getText().toString().equals("test")) {
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                }
                else {
                    Toast.makeText(LoginActivity.this, "Your User and Password is not correct", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}