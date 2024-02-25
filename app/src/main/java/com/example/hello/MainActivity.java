package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    EditText editText1;

    Button button1;
    ImageView imageView1;

    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView1=findViewById(R.id.textView1);
        editText1=findViewById(R.id.editText1);
        button1=findViewById(R.id.button1);
        imageView1=findViewById(R.id.imageView1);

        textView1.setText("Welcome to Greeting App");
        imageView1.setImageResource(R.drawable.earth);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username=editText1.getText().toString();
                if(username.isEmpty())
                {
                    Toast.makeText(MainActivity.this,
                            "Please enter your name",
                            Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,
                            "Hi "+username+", Welcome to Greeting App.",
                            Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}