package com.example.dfreeman.calculatortdd.View;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dfreeman.calculatortdd.Controller.Controller;
import com.example.dfreeman.calculatortdd.R;

public class MainActivity extends AppCompatActivity {

    private String firstFieldText = "";
    private String secondFieldText = "";
    private String operatorText = "";
    private boolean isSecondHalf = false;
    private double solution;
    private int backgroundCounter = 1;
    private String color = "white";
    private TextView firstField;
    private TextView secondField;
    private TextView operatorField;
    private TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstField = (TextView) findViewById(R.id.firstInput);
        secondField = (TextView) findViewById(R.id.secondInput);
        operatorField = (TextView) findViewById(R.id.operator);
        answer = (TextView) findViewById(R.id.answer);
    }

    public void onClickZero(View v) {
        if (!isSecondHalf) {
            firstFieldText = firstFieldText + "0";
            firstField.setText(firstFieldText);
        } else {
            secondFieldText = secondFieldText + "0";
            secondField.setText(secondFieldText);
        }
    }

    public void onClickOne(View v) {
        if (!isSecondHalf) {
            firstFieldText = firstFieldText + "1";
            firstField.setText(firstFieldText);
        } else {
            secondFieldText = secondFieldText + "1";
            secondField.setText(secondFieldText);
        }
    }

    public void onClickTwo(View v) {
        if (!isSecondHalf) {
            firstFieldText = firstFieldText + "2";
            firstField.setText(firstFieldText);
        } else {
            secondFieldText = secondFieldText + "2";
            secondField.setText(secondFieldText);
        }
    }

    public void onClickThree(View v) {
        if (!isSecondHalf) {
            firstFieldText = firstFieldText + "3";
            firstField.setText(firstFieldText);
        } else {
            secondFieldText = secondFieldText + "3";
            secondField.setText(secondFieldText);
        }
    }

    public void onClickFour(View v) {
        if (!isSecondHalf) {
            firstFieldText = firstFieldText + "4";
            firstField.setText(firstFieldText);
        } else {
            secondFieldText = secondFieldText + "4";
            secondField.setText(secondFieldText);
        }
    }

    public void onClickFive(View v) {
        if (!isSecondHalf) {
            firstFieldText = firstFieldText + "5";
            firstField.setText(firstFieldText);
        } else {
            secondFieldText = secondFieldText + "5";
            secondField.setText(secondFieldText);
        }
    }

    public void onClickSix(View v) {
        if (!isSecondHalf) {
            firstFieldText = firstFieldText + "6";
            firstField.setText(firstFieldText);
        } else {
            secondFieldText = secondFieldText + "6";
            secondField.setText(secondFieldText);
        }
    }

    public void onClickSeven(View v) {
        if (!isSecondHalf) {
            firstFieldText = firstFieldText + "7";
            firstField.setText(firstFieldText);
        } else {
            secondFieldText = secondFieldText + "7";
            secondField.setText(secondFieldText);
        }
    }

    public void onClickEight(View v) {
        if (!isSecondHalf) {
            firstFieldText = firstFieldText + "8";
            firstField.setText(firstFieldText);
        } else {
            secondFieldText = secondFieldText + "8";
            secondField.setText(secondFieldText);
        }
    }

    public void onClickNine(View v) {
        if (!isSecondHalf) {
            firstFieldText = firstFieldText + "9";
            firstField.setText(firstFieldText);
        } else {
            secondFieldText = secondFieldText + "9";
            secondField.setText(secondFieldText);
        }
    }

    public void onPlusClick(View v) {
        operatorText = "+";
        isSecondHalf = true;
        operatorField.setText(operatorText);
    }

    public void onMinusClick(View v) {
        operatorText = "-";
        isSecondHalf = true;
        operatorField.setText(operatorText);
    }

    public void onMultClick(View v) {
        operatorText = "*";
        isSecondHalf = true;
        operatorField.setText(operatorText);
    }

    public void onDivideClick(View v) {
        operatorText = "/";
        isSecondHalf = true;
        operatorField.setText(operatorText);
    }

    public void onClickClear(View v) {
        firstFieldText = "";
        secondFieldText = "";
        operatorText = "";
        isSecondHalf = false;
        firstField.setText(firstFieldText);
        secondField.setText(secondFieldText);
        operatorField.setText(operatorText);
        answer.setText("");
    }

    public void onEqualsClick(View v) {
        if (firstFieldText != "" && secondFieldText != "" && operatorText != "") {
            Controller controller = new Controller();
            double firstNum = Double.parseDouble(firstFieldText);
            double secondNum = Double.parseDouble(secondFieldText);
            if (operatorText.equals("+")) {
                solution = controller.Add((int)firstNum, (int)secondNum);
            }
            if (operatorText.equals("-")) {
                solution = controller.Subtract((int)firstNum, (int)secondNum);
            }
            if (operatorText.equals("*")) {
                solution = controller.Multiply((int)firstNum, (int)secondNum);
            }
            if (operatorText.equals("/")) {
                if (secondFieldText.equals("0")) {
                    solution = 0;
                } else {
                    solution = controller.Divide(firstNum, secondNum);
                }
            }
            String output = "" + solution;
            answer.setText(output);
        }
    }

    public void onChangeColorClick(View v) {
        int temp = backgroundCounter % 6;
        View mv = findViewById(R.id.activity_main);
        if (temp == 0) {
            backgroundCounter++;
            color = "white";
            mv.setBackgroundColor(Color.argb(255, 255, 255, 255));
        }
        if (temp == 1) {
            backgroundCounter++;
            color = "grey";
            mv.setBackgroundColor(Color.argb(255, 200, 200, 200));
        }
        if (temp == 2) {
            backgroundCounter++;
            color = "blue";
            mv.setBackgroundColor(Color.argb(255, 100, 100, 255));
        }
        if (temp == 3) {
            backgroundCounter++;
            color = "green";
            mv.setBackgroundColor(Color.argb(255, 100, 255, 100));
        }
        if (temp == 4) {
            backgroundCounter++;
            color = "yellow";
            mv.setBackgroundColor(Color.argb(255, 255, 255, 100));
        }
        if (temp == 5) {
            backgroundCounter++;
            color = "red";
            mv.setBackgroundColor(Color.argb(255, 255, 100, 100));
        }
    }

    public String getFirstFieldText() {
        return firstFieldText;
    }

    public String getSecondFieldText() {
        return secondFieldText;
    }

    public String getOperatorText() {
        return operatorText;
    }

    public double getSolution() {
        return solution;
    }

    public String getColor() {
        return color;
    }
}
