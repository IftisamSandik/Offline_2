package com.example.offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView courseText;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        courseText=(TextView) findViewById(R.id.courseTextView);
        logoutButton=(Button) findViewById(R.id.logoutButtonId);



        logoutButton.setOnClickListener(this);

        Bundle bundle1=getIntent().getExtras();
        if(bundle1!=null){
            String value3=bundle1.getString("course");
            courseText.setText(value3);
        }
    }

    @Override
    public void onClick(View v) {
        Intent logoutIntent = new Intent(ThirdActivity.this,MainActivity.class);
        Toast.makeText(ThirdActivity.this, "Logout successfull", Toast.LENGTH_SHORT).show();
        startActivity(logoutIntent);
    }
}
