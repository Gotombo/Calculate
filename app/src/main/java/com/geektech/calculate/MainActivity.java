 package com.geektech.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
     private TextView result;
     private Integer firstVariable,secondVariable;
     private String Operation;
     private Boolean isOperationFinis = false;
     private Boolean Intte = false;
     private Button Button1;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         result = findViewById(R.id.result);
         Button1 = findViewById(R.id.button1);

         }

         public void OnNumberClick(View view) {
                                           switch (view.getId()) {


                                               case (R.id.one):
                                                   Button1.setAlpha(0);
                                                   if (isOperationFinis == true || result.getText().toString().equals("0")) {
                                                       result.setText("1");
                                                       isOperationFinis = false;
                                                   } else {
                                                       result.append("1");
                                                   }

                                                   break;
                                               case (R.id.two):
                                                   Button1.setAlpha(0);
                                                   if (isOperationFinis == true || result.getText().toString().equals("0")) {
                                                       result.setText("2");
                                                       isOperationFinis = false;
                                                   } else {
                                                       result.append("2");
                                                   }
                                                   break;
                                               case (R.id.Ac):
                                                   Button1.setAlpha(0);
                                                   result.setText("0");
                                                   firstVariable = 0;
                                                   secondVariable = 0;
                                                   break;
                                               case (R.id.tree):
                                                   Button1.setAlpha(0);
                                                   if (isOperationFinis == true || result.getText().toString().equals("0")) {
                                                       result.setText("3");
                                                       isOperationFinis = false;
                                                   } else {
                                                       result.append("3");
                                                   }
                                                   break;
                                               case (R.id.four):
                                                   Button1.setAlpha(0);
                                                   if (isOperationFinis == true || result.getText().toString().equals("0")) {
                                                       result.setText("4");
                                                       isOperationFinis = false;
                                                   } else {
                                                       result.append("4");
                                                   }
                                                   break;
                                               case (R.id.five):
                                                   Button1.setAlpha(0);
                                                   if (isOperationFinis == true || result.getText().toString().equals("0")) {
                                                       result.setText("5");
                                                       isOperationFinis = false;
                                                   } else {
                                                       result.append("5");
                                                   }
                                                   break;
                                               case (R.id.nol):
                                                   Button1.setAlpha(0);
                                                   if (isOperationFinis == true || result.getText().toString().equals("0")) {
                                                       result.setText("0");
                                                       isOperationFinis = false;
                                                   } else {
                                                       result.append("0");
                                                   }
                                                   break;
                                               case (R.id.six):
                                                   Button1.setAlpha(0);
                                                   if (isOperationFinis == true || result.getText().toString().equals("0")) {
                                                       result.setText("6");
                                                       isOperationFinis = false;
                                                   } else {
                                                       result.append("6");
                                                   }
                                                   break;
                                               case (R.id.seven):
                                                   Button1.setAlpha(0);
                                                   if (isOperationFinis == true || result.getText().toString().equals("0")) {
                                                       result.setText("7");
                                                       isOperationFinis = false;
                                                   } else {
                                                       result.append("7");
                                                   }
                                                   break;
                                               case (R.id.eight):
                                                   Button1.setAlpha(0);
                                                   if (isOperationFinis == true || result.getText().toString().equals("0")) {
                                                       result.setText("8");
                                                       isOperationFinis = false;
                                                   } else {
                                                       result.append("8");
                                                   }
                                                   break;
                                               case (R.id.nine):
                                                   Button1.setAlpha(0);
                                                   if (isOperationFinis == true || result.getText().toString().equals("0")) {
                                                       result.setText("9");
                                                       isOperationFinis = false;
                                                   } else {
                                                       result.append("9");
                                                   }
                                                   break;


                                           }
                                       }


                                       public void OnOperationClick(View view) {
                                           switch (view.getId()) {

                                               case R.id.rovno:
                                                   Button1.setAlpha(1);

                                                   if (Operation == "+") {
                                                       String text = result.getText().toString();
                                                       text = text.replace(firstVariable + Operation, "");
                                                       secondVariable = Integer.parseInt(text);

                                                       Integer tv = firstVariable + secondVariable;
                                                       result.setText(tv.toString());
                                                   }
                                                   if (Operation == "-") {
                                                       String text = result.getText().toString();
                                                       text = text.replace(firstVariable + Operation, "");
                                                       secondVariable = Integer.parseInt(text);

                                                       Integer tv = firstVariable - secondVariable;
                                                       result.setText(tv.toString());
                                                   }
                                                   if (Operation == "x") {
                                                       String text = result.getText().toString();
                                                       text = text.replace(firstVariable + Operation, "");
                                                       secondVariable = Integer.parseInt(text);

                                                       Integer tv = firstVariable * secondVariable;
                                                       result.setText(tv.toString());
                                                   }
                                                   if (Operation == "/") {
                                                       String text = result.getText().toString();
                                                       text = text.replace(firstVariable + Operation, "");
                                                       secondVariable = Integer.parseInt(text);

                                                       Integer tv = firstVariable / secondVariable;
                                                       result.setText(tv.toString());
                                                   }

                                                   isOperationFinis = true;
                                                   Operation = "=";


                                                   break;
                                               case R.id.xis:
                                                   Button1.setAlpha(0);
                                                   if (isOperationFinis == true || result.getText().toString().equals("0")) {
                                                       Toast toast = Toast.makeText(getApplicationContext(),
                                                               "Ошибка", Toast.LENGTH_SHORT);
                                                       toast.show();

                                                   } else {

                                                       firstVariable = Integer.parseInt(result.getText().toString());
                                                       Operation = "x";
                                                       result.setText(firstVariable + Operation);
                                                   }
                                                   break;
                                               case R.id.delenie:
                                                   Button1.setAlpha(0);
                                                   if (isOperationFinis == true || result.getText().toString().equals("0")) {
                                                       Toast toast = Toast.makeText(getApplicationContext(),
                                                               "Ошибка", Toast.LENGTH_SHORT);
                                                       toast.show();
                                                   } else {
                                                       firstVariable = Integer.parseInt(result.getText().toString());
                                                       Operation = "/";
                                                       result.setText(firstVariable + Operation);
                                                   }
                                                   break;


                                               case R.id.plus:
                                                   Button1.setAlpha(0);
                                                   if (isOperationFinis == true || result.getText().toString().equals("0")) {
                                                       Toast toast = Toast.makeText(getApplicationContext(),
                                                               "Ошибка", Toast.LENGTH_SHORT);
                                                       toast.show();
                                                   } else {
                                                       firstVariable = Integer.parseInt(result.getText().toString());
                                                       Operation = "+";
                                                       result.setText(firstVariable + Operation);
                                                   }
                                                   break;
                                               case R.id.minus:
                                                   Button1.setAlpha(0);
                                                   if (isOperationFinis == true || result.getText().toString().equals("0")) {
                                                       Toast toast = Toast.makeText(getApplicationContext(),
                                                               "Ошибка", Toast.LENGTH_SHORT);
                                                       toast.show();
                                                   } else {

                                                       firstVariable = Integer.parseInt(result.getText().toString());
                                                       Operation = "-";
                                                       result.setText(firstVariable + Operation);
                                                   }

                                                   break;


                                           }
                                       }

     public void OnButtonClick(View view) {
         switch (view.getId()) {

             case R.id.button1:
                 if (Operation == "=" && isOperationFinis == true) {
                     Button1.setAlpha(1);
                 }
                 Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                 String data = result.getText().toString();
                 intent.putExtra("Result", data);
                 startActivity(intent);

         }
         Intte=true;

     }
 }




   //  Toast toast = Toast.makeText(getApplicationContext(),
     //        "Неверная почта или пороль!", Toast.LENGTH_SHORT);
        //           toast.show(); Омар