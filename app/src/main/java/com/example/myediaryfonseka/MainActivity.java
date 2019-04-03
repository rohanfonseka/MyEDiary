package com.example.myediaryfonseka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureWelcomePageButton();
        configureNewAccountButton();
    }

    //logs in; goes to welcome page
    private void configureWelcomePageButton() {
        Button nextButton = (Button) findViewById(R.id.button2);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WelcomePage.class));
            }
        });
    }

    //prompts user to enter new account info; goes to login page
    private void configureNewAccountButton() {
        Button nextButton = (Button) findViewById(R.id.button6);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginPage.class));
            }
        });
    }


}
