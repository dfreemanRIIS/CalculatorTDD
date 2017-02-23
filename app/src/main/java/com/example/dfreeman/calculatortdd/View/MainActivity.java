package com.example.dfreeman.calculatortdd.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.dfreeman.calculatortdd.R;

public class MainActivity extends AppCompatActivity {

    private String firstFieldText = "";
    private String secondFieldText = "";
    private String operatorText = "";
    private  boolean isSecondHalf = false;
    private double solution;
    private int backgroundCounter=1;
    private String color ="white";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickZero(View v) {
        if(!isSecondHalf) {
            firstFieldText = firstFieldText + "0";
        } else {
            secondFieldText = secondFieldText + "0";
        }
    }

    public void onClickOne(View v) {
        if(!isSecondHalf) {
            firstFieldText = firstFieldText + "1";
        } else {
            secondFieldText = secondFieldText + "1";
        }
    }

    public void onClickTwo(View v) {
        if(!isSecondHalf) {
            firstFieldText = firstFieldText + "2";
        } else {
            secondFieldText = secondFieldText + "2";
        }
    }

    public void onClickThree(View v) {
        if(!isSecondHalf) {
            firstFieldText = firstFieldText + "3";
        } else {
            secondFieldText = secondFieldText + "3";
        }
    }

    public void onClickFour(View v) {
        if(!isSecondHalf) {
            firstFieldText = firstFieldText + "4";
        } else {
            secondFieldText = secondFieldText + "4";
        }
    }

    public void onClickFive(View v) {
        if(!isSecondHalf) {
            firstFieldText = firstFieldText + "5";
        } else {
            secondFieldText = secondFieldText + "5";
        }
    }

    public void onClickSix(View v) {
        if(!isSecondHalf) {
            firstFieldText = firstFieldText + "6";
        } else {
            secondFieldText = secondFieldText + "6";
        }
    }

    public void onClickSeven(View v) {
        if(!isSecondHalf) {
            firstFieldText = firstFieldText + "7";
        } else {
            secondFieldText = secondFieldText + "7";
        }
    }

    public void onClickEight(View v) {
        if(!isSecondHalf) {
            firstFieldText = firstFieldText + "8";
        } else {
            secondFieldText = secondFieldText + "8";
        }
    }

    public void onClickNine(View v) {
        if(!isSecondHalf) {
            firstFieldText = firstFieldText + "9";
        } else {
            secondFieldText = secondFieldText + "9";
        }
    }

    public void onPlusClick(View v) {
        operatorText = "+";
        isSecondHalf = true;
    }

    public void onMinusClick(View v) {
        operatorText = "-";
        isSecondHalf = true;
    }

    public void onMultClick(View v) {
        operatorText = "*";
        isSecondHalf = true;
    }

    public void onDivideClick(View v) {
        operatorText = "/";
        isSecondHalf = true;
    }

    public void onClickClear(View v) {
        firstFieldText = "";
        secondFieldText = "";
        operatorText = "";
        isSecondHalf = false;
    }

    public void onEqualsClick(View v) {
        double firstNum = Double.parseDouble(firstFieldText);
        double secondNum = Double.parseDouble(secondFieldText);
        if(operatorText.equals("+")) {
            solution = firstNum + secondNum;
        }
        if(operatorText.equals("-")) {
            solution = firstNum - secondNum;
        }
        if(operatorText.equals("*")) {
            solution = firstNum * secondNum;
        }
        if(operatorText.equals("/")) {
            if(secondFieldText.equals("0")) {
                final String divZero = "YOU CANT DIVIDE BY ZERO YOU CANT DIVIDE BY ZERO YOU CANT DIVIDE BY ZERO YOU CANT DIVIDE BY ZERO YOU CANT DIVIDE BY ZERO YOU CANT DIVIDE BY ZERO YOU CANT DIVIDE BY ZERO YOU CANT DIVIDE BY ZERO ";
                solution = 0;
            } else {
                solution = firstNum / secondNum;
            }
        }
    }

    public void onChangeColorClick(View v) {
        int temp = backgroundCounter % 6;
        if(temp == 0) {
            backgroundCounter++;
            color = "white";
        }
        if(temp == 1) {
            backgroundCounter++;
            color = "grey";
        }
        if(temp == 2) {
            backgroundCounter++;
            color = "blue";
        }
        if (temp == 3) {
            backgroundCounter++;
            color = "green";
        }
        if (temp == 4) {
            backgroundCounter++;
            color = "yellow";
        }
        if (temp == 5) {
            backgroundCounter++;
            color = "red";
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
