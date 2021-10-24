 package com.geektech.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
     private TextView result;
     private Integer firstVariable,secondVariable;
     private String Operation;
     private Boolean isOperationFinis = false;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         result = findViewById(R.id.result);
     }


     public void OnNumberClick(View view) {
         switch (view.getId()) {




             case (R.id.one):
                 if(isOperationFinis==true||result.getText().toString().equals("0")){
                     result.setText("1");
                     isOperationFinis=false;
                 } else {
                     result.append("1");
                 }

                 break;
             case (R.id.two):
                 if(isOperationFinis==true||result.getText().toString().equals("0")){
                     result.setText("2");
                     isOperationFinis=false;
                 } else {
                     result.append("2");
                 }
                 break;
             case (R.id.Ac):
                 result.setText("0");
                 firstVariable=0;
                 secondVariable=0;
                 break;
             case (R.id.tree):
                 if(isOperationFinis==true||result.getText().toString().equals("0")){
                     result.setText("3");
                     isOperationFinis=false;
                 } else {
                     result.append("3");
                 }
                 break;
             case (R.id.four):
                 if(isOperationFinis==true||result.getText().toString().equals("0")){
                     result.setText("4");
                     isOperationFinis=false;
                 } else {
                     result.append("4");
                 }
                 break;
             case (R.id.five):
                 if(isOperationFinis==true||result.getText().toString().equals("0")){
                     result.setText("5");
                     isOperationFinis=false;
                 } else {
                     result.append("5");
                 }
                 break;
             case (R.id.nol):
                 if(isOperationFinis==true||result.getText().toString().equals("0")){
                     result.setText("0");
                     isOperationFinis=false;
                 } else {
                     result.append("0");
                 }
                 break;
             case (R.id.six):
                 if(isOperationFinis==true||result.getText().toString().equals("0")){
                     result.setText("6");
                     isOperationFinis=false;
                 } else {
                     result.append("6");
                 }
                 break;
             case (R.id.seven):
                 if(isOperationFinis==true||result.getText().toString().equals("0")){
                     result.setText("7");
                     isOperationFinis=false;
                 } else {
                     result.append("7");
                 }
                 break;
             case (R.id.eight):
                 if(isOperationFinis==true||result.getText().toString().equals("0")){
                     result.setText("8");
                     isOperationFinis=false;
                 } else {
                     result.append("8");
                 }
                 break;
             case (R.id.nine):
                 if(isOperationFinis==true||result.getText().toString().equals("0")){
                     result.setText("9");
                     isOperationFinis=false;
                 } else {
                     result.append("9");
                 }
                 break;


         }
     }

     public void OnOperationClick(View view) {
         switch (view.getId()) {

             case R.id.rovno:
                 if (Operation == "+") {
                     String text = result.getText().toString();
                     text = text.replace(firstVariable + Operation, "");
                     secondVariable = Integer.parseInt(text);

                     Integer tv = firstVariable + secondVariable;
                     result.setText( tv.toString());
                 }
                 if (Operation == "-") {
                     String text = result.getText().toString();
                     text = text.replace(firstVariable + Operation, "");
                     secondVariable = Integer.parseInt(text);

                     Integer tv = firstVariable - secondVariable;
                     result.setText( tv.toString());
                 }
                 if (Operation == "x") {
                     String text = result.getText().toString();
                     text = text.replace(firstVariable + Operation, "");
                     secondVariable = Integer.parseInt(text);

                     Integer tv = firstVariable * secondVariable;
                     result.setText( tv.toString());
                 }
                 if (Operation == "/") {
                     String text = result.getText().toString();
                     text = text.replace(firstVariable + Operation, "");
                     secondVariable = Integer.parseInt(text);

                     Integer tv = firstVariable / secondVariable;
                     result.setText( tv.toString());
                 }

                 isOperationFinis =true;
                 Operation="=";




                 break;
             case R.id.xis:
                 if(isOperationFinis==true||result.getText().toString().equals("0")){
                     Toast toast = Toast.makeText(getApplicationContext(),
                                     "Ошибка", Toast.LENGTH_SHORT);
                                        toast.show();

                 }else {

                     firstVariable = Integer.parseInt(result.getText().toString());
                     Operation = "x";
                     result.setText(firstVariable + Operation);
                 }
                 break;
             case R.id.delenie:
                 if(isOperationFinis==true||result.getText().toString().equals("0")){
                     Toast toast = Toast.makeText(getApplicationContext(),
                             "Ошибка", Toast.LENGTH_SHORT);
                     toast.show();}else {
                 firstVariable =Integer.parseInt(result.getText().toString());
                 Operation = "/";
                 result.setText(firstVariable + Operation);}
                 break;



             case R.id.plus:
                 if(isOperationFinis==true||result.getText().toString().equals("0")){
                     Toast toast = Toast.makeText(getApplicationContext(),
                             "Ошибка", Toast.LENGTH_SHORT);
                     toast.show();}else {
               firstVariable =Integer.parseInt(result.getText().toString());
               Operation = "+";
                 result.setText(firstVariable + Operation);}
                 break;
             case R.id.minus: if(isOperationFinis==true||result.getText().toString().equals("0")){
                 Toast toast = Toast.makeText(getApplicationContext(),
                         "Ошибка", Toast.LENGTH_SHORT);
                 toast.show();}else {

                 firstVariable =Integer.parseInt(result.getText().toString());
                 Operation ="-";
                 result.setText(firstVariable + Operation);}

                 break;

                 }
             }
         }
   //  Toast toast = Toast.makeText(getApplicationContext(),
     //        "Неверная почта или пороль!", Toast.LENGTH_SHORT);
        //           toast.show();