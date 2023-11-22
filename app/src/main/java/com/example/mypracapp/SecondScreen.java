package com.example.mypracapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondScreen extends AppCompatActivity {

    EditText operandOne,operandTwo;
    Button plusBtn,minusBtn,divideBtn,multiplyBtn;
    TextView result;

    String operandOneText,operandTwoText,totalResultText;

    double oprOne,oprTwo,totalResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        operandOne = findViewById(R.id.operandOne);
        operandTwo = findViewById(R.id.operandTwo);
        plusBtn = findViewById(R.id.plusBtn);
        minusBtn = findViewById(R.id.minusBtn);
        divideBtn = findViewById(R.id.divideBtn);
        multiplyBtn = findViewById(R.id.multiplyBtn);
        result = findViewById(R.id.result);



        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operandOneText = operandOne.getText().toString();
                operandTwoText = operandTwo.getText().toString();

                if ((operandOneText.isEmpty() && operandTwoText.isEmpty()) || (operandOneText.isEmpty() || operandTwoText.isEmpty())) {

                    Toast.makeText(SecondScreen.this,"Please enter both operands",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    oprOne = Double.parseDouble(operandOneText);

                    oprTwo = Double.parseDouble(operandTwoText);

                    totalResult = oprOne + oprTwo;

                    totalResultText = "Answer is " + totalResult;

                    result.setText(totalResultText);
                }
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operandOneText = operandOne.getText().toString();
                operandTwoText = operandTwo.getText().toString();

                if ((operandOneText.isEmpty() && operandTwoText.isEmpty()) || (operandOneText.isEmpty() || operandTwoText.isEmpty())) {

                    Toast.makeText(SecondScreen.this,"Please enter both operands",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    oprOne = Double.parseDouble(operandOneText);

                    oprTwo = Double.parseDouble(operandTwoText);

                    totalResult = oprOne - oprTwo;

                    totalResultText = "Answer is " + totalResult;

                    result.setText(totalResultText);
                }
            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operandOneText = operandOne.getText().toString();
                operandTwoText = operandTwo.getText().toString();

                if ((operandOneText.isEmpty() && operandTwoText.isEmpty()) || (operandOneText.isEmpty() || operandTwoText.isEmpty())) {

                    Toast.makeText(SecondScreen.this,"Please enter both operands",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    oprOne = Double.parseDouble(operandOneText);

                    oprTwo = Double.parseDouble(operandTwoText);

                    totalResult = oprOne * oprTwo;

                    totalResultText = "Answer is " + totalResult;

                    result.setText(totalResultText);
                }
            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operandOneText = operandOne.getText().toString();
                operandTwoText = operandTwo.getText().toString();

                if ((operandOneText.isEmpty() && operandTwoText.isEmpty()) || (operandOneText.isEmpty() || operandTwoText.isEmpty())) {

                    Toast.makeText(SecondScreen.this,"Please enter both operands",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    oprOne = Double.parseDouble(operandOneText);

                    oprTwo = Double.parseDouble(operandTwoText);

                    totalResult = oprOne / oprTwo;

                    totalResultText = "Answer is " + totalResult;

                    result.setText(totalResultText);
                }
            }
        });

    }
}