package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean isFunctionalButtonPressed = false;
    private double valueA;
    private double valueB;
    private String currentOperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView userResult = findViewById(R.id.tv_UserResult);
        final Button btn0 = findViewById(R.id.btn0);
        final Button btn00 = findViewById(R.id.btn00);
        final Button btn1 = findViewById(R.id.btn1);
        final Button btn2 = findViewById(R.id.btn2);
        final Button btn3 = findViewById(R.id.btn3);
        final Button btn4 = findViewById(R.id.btn4);
        final Button btn5 = findViewById(R.id.btn5);
        final Button btn6 = findViewById(R.id.btn6);
        final Button btn7 = findViewById(R.id.btn7);
        final Button btn8 = findViewById(R.id.btn8);
        final Button btn9 = findViewById(R.id.btn9);
        final Button btnClear = findViewById(R.id.btnClear);
        final Button btnPercantage = findViewById(R.id.btnPercantage);
        final Button btnDivide = findViewById(R.id.btnDivide);
        final Button btnMultiply = findViewById(R.id.btnMultiply);
        final Button btnMinus = findViewById(R.id.btnMinus);
        final Button btnPlus = findViewById(R.id.btnPlus);
        final Button btnEqual = findViewById(R.id.btnEqual);
        final Button btnPoint = findViewById(R.id.btnPoint);


        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id = v.getId();
                switch (id){
                    case R.id.btn0:
                        userResult.append("0");
                        break;
                    case R.id.btn00:
                        userResult.append("00");
                        break;
                    case R.id.btn1:
                        userResult.append("1");
                        break;
                    case R.id.btn2:
                        userResult.append("2");
                        break;
                    case R.id.btn3:
                        userResult.append("3");
                        break;
                    case R.id.btn4:
                        userResult.append("4");
                        break;
                    case R.id.btn5:
                        userResult.append("5");
                        break;
                    case R.id.btn6:
                        userResult.append("6");
                        break;
                    case R.id.btn7:
                        userResult.append("7");
                        break;
                    case R.id.btn8:
                        userResult.append("8");
                        break;
                    case R.id.btn9:
                        userResult.append("9");
                        break;
                    case R.id.btnClear:
                        userResult.setText("");
                        break;
                    case R.id.btnPercantage:
                        userResult.append("%");
                        isFunctionalButtonPressed = true;
                        currentOperation = "%";
                        break;
                    case R.id.btnDivide:
                        userResult.append("/");
                        isFunctionalButtonPressed = true;
                        currentOperation = "\\/";
                        break;
                    case R.id.btnMultiply:
                        userResult.append("X");
                        isFunctionalButtonPressed = true;
                        currentOperation = "X";
                        break;
                    case R.id.btnMinus:
                        userResult.append("-");
                        isFunctionalButtonPressed = true;
                        currentOperation = "\\-";
                        break;
                    case R.id.btnPlus:
                        userResult.append("+");
                        isFunctionalButtonPressed = true;
                        currentOperation = "\\+";
                        break;
                    case R.id.btnEqual:
                        String calculateThis = userResult.getText().toString();
                        userResult.setText(calculateResult(calculateThis));
                        break;
                    case R.id.btnPoint:
                        userResult.append(".");
                        break;
                }
            }
        };
        btn0.setOnClickListener(calculatorListener);
        btn00.setOnClickListener(calculatorListener);
        btn1.setOnClickListener(calculatorListener);
        btn2.setOnClickListener(calculatorListener);
        btn3.setOnClickListener(calculatorListener);
        btn4.setOnClickListener(calculatorListener);
        btn5.setOnClickListener(calculatorListener);
        btn6.setOnClickListener(calculatorListener);
        btn7.setOnClickListener(calculatorListener);
        btn8.setOnClickListener(calculatorListener);
        btn9.setOnClickListener(calculatorListener);
        btnClear.setOnClickListener(calculatorListener);
        btnPercantage.setOnClickListener(calculatorListener);
        btnDivide.setOnClickListener(calculatorListener);
        btnMultiply.setOnClickListener(calculatorListener);
        btnMinus.setOnClickListener(calculatorListener);
        btnPlus.setOnClickListener(calculatorListener);
        btnEqual.setOnClickListener(calculatorListener);
        btnPoint.setOnClickListener(calculatorListener);



    }

    private String calculateResult(String calculateThis) {
        System.out.println(currentOperation);
        System.out.println(calculateThis);

        String[] parts = calculateThis.split(currentOperation);
        String part1 = parts[0];
        String part2 = parts[1];
        valueA = Double.parseDouble(part1);
        valueB = Double.parseDouble(part2);
        double resultDouble = 0;
        String result = "";

        if(currentOperation == "\\+"){
           resultDouble = valueA + valueB;
        } else if (currentOperation == "\\-") {
            resultDouble = valueA - valueB;
        }else if (currentOperation == "X") {
            resultDouble = valueA * valueB;
        }else if (currentOperation == "\\/") {
            resultDouble = valueA / valueB;
        }

        result = ""+ resultDouble;

        return result;
    }
}
