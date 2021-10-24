package com.geektech.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView Resultt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Resultt = findViewById(R.id.Result2);
        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("Result").toString();
        Resultt.setText(name);


    }

    @Override
    protected void onStart() {
        super.onStart();


    Button btn1 = (Button) findViewById(R.id.button2);
    btn1.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick (View v){
            // TODO Auto-generated method stub
            finishAffinity();
            System.exit(0);
        }
    });
}
}
