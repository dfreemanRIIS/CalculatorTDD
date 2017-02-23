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
    }

    public void onChangeColorClick(View v) {
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
}
