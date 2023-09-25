package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFunction(View view){
        EditText firstInput = (EditText) findViewById(R.id.firstInput);
        EditText secondInput = (EditText) findViewById(R.id.secondInput);
        String resultStr = null;
        Log.i("INFO", "ADD Pressed");
        try {
            int first = Integer.parseInt(firstInput.getText().toString());
            int second = Integer.parseInt(secondInput.getText().toString());
            double result = first + second;

            resultStr = String.valueOf(result);
        }catch(NumberFormatException NFE) {
            Toast.makeText(getApplicationContext(), "Please enter a valid number!", Toast.LENGTH_SHORT).show();
        }
        goToActivity(resultStr);
    }

    public void minusFunction(View view){
        EditText firstInput = (EditText) findViewById(R.id.firstInput);
        EditText secondInput = (EditText) findViewById(R.id.secondInput);
        String resultStr = null;
        Log.i("INFO", "MINUS Pressed");
        try {
            int first = Integer.parseInt(firstInput.getText().toString());
            int second = Integer.parseInt(secondInput.getText().toString());
            double result = first - second;

            resultStr = String.valueOf(result);
        }catch(NumberFormatException NFE) {
            Toast.makeText(getApplicationContext(), "Please enter a valid number!", Toast.LENGTH_SHORT).show();
        }
        goToActivity(resultStr);
    }
    public void multFunction(View view){
        EditText firstInput = (EditText) findViewById(R.id.firstInput);
        EditText secondInput = (EditText) findViewById(R.id.secondInput);
        String resultStr = null;
        Log.i("INFO", "MULT Pressed");
        try {
            int first = Integer.parseInt(firstInput.getText().toString());
            int second = Integer.parseInt(secondInput.getText().toString());
            double result = first * second;

            resultStr = String.valueOf(result);
        }catch(NumberFormatException NFE) {
            Toast.makeText(getApplicationContext(), "Please enter a valid number!", Toast.LENGTH_SHORT).show();
        }
        goToActivity(resultStr);
    }
    public void divFunction(View view){
        EditText firstInput = (EditText) findViewById(R.id.firstInput);
        EditText secondInput = (EditText) findViewById(R.id.secondInput);
        String resultStr = null;
        Log.i("INFO", "DIV Pressed");
        try {
            int first = Integer.parseInt(firstInput.getText().toString());
            int second = Integer.parseInt(secondInput.getText().toString());
            double result;

            if(second == 0){
                Toast.makeText(getApplicationContext(), "Cannot divide by zero!", Toast.LENGTH_SHORT).show();
                return;
            }

            result = (double) first / second;

            resultStr = String.valueOf(result);
        }catch(NumberFormatException NFE) {
            Toast.makeText(getApplicationContext(), "Please enter a valid number!", Toast.LENGTH_SHORT).show();
        }
        goToActivity(resultStr);
    }

    private void goToActivity(String s) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

}