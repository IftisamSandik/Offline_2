package com.example.offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button enterNewActivityButton1;
    private EditText nameEditText,IdEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterNewActivityButton1 = (Button) findViewById(R.id.loginButtonId);
        nameEditText=(EditText) findViewById(R.id.NameTextId);
        IdEditText=(EditText) findViewById(R.id.IdTextId);



        enterNewActivityButton1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String userNameText=nameEditText.getText().toString();
        String userIdText=IdEditText.getText().toString();



        Intent loginIntent = new Intent(MainActivity.this,SecondActivity.class);
        loginIntent.putExtra("name",userNameText);
        loginIntent.putExtra("Id",userIdText);
        startActivity(loginIntent);

    }
}
