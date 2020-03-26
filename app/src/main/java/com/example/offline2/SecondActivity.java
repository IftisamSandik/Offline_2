package com.example.offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView nameText,IdText;
    Button TakeCourseButton;
    private CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nameText=findViewById(R.id.nameTextView2);
        IdText=findViewById(R.id.IdTextView2);
        TakeCourseButton=(Button) findViewById(R.id.TakeButtonId);
        checkBox1= (CheckBox) findViewById(R.id.CheckboxId1);
        checkBox2= (CheckBox) findViewById(R.id.CheckboxId2);
        checkBox3= (CheckBox) findViewById(R.id.CheckboxId3);
        checkBox4= (CheckBox) findViewById(R.id.CheckboxId4);
        checkBox5= (CheckBox) findViewById(R.id.CheckboxId5);
        Toast.makeText(SecondActivity.this, "Login successfull", Toast.LENGTH_SHORT).show();

        TakeCourseButton.setOnClickListener(this);

        Bundle bundle =getIntent().getExtras();
        if(bundle!=null){
            String value1 = bundle.getString("name");
            String value2 = bundle.getString("Id");

            nameText.setText(value1);
            IdText.setText(value2);
        }




        }




    @Override
    public void onClick(View v) {
        Intent takeIntent = new Intent(SecondActivity.this,ThirdActivity.class);
        StringBuilder stringBuilder = new StringBuilder();

        if(checkBox1.isChecked()){
            String value= checkBox1.getText().toString();
            stringBuilder.append(value + " is taken"+"\n");
        }
        if(checkBox2.isChecked()){
            String value= checkBox2.getText().toString();
            stringBuilder.append(value + " is taken"+"\n");
        }
        if(checkBox3.isChecked()){
            String value= checkBox3.getText().toString();
            stringBuilder.append(value + " is taken"+"\n");
        }
        if(checkBox4.isChecked()){
            String value= checkBox4.getText().toString();
            stringBuilder.append(value + " is taken"+"\n");
        }
        if(checkBox5.isChecked()){
            String value= checkBox5.getText().toString();
            stringBuilder.append(value + " is taken"+"\n");
        }
        takeIntent.putExtra("course", (Serializable) stringBuilder);



        startActivity(takeIntent);

    }
}
