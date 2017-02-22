package com.example.dfreeman.calculatortdd;

import android.widget.Button;

import com.example.dfreeman.calculatortdd.View.MainActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, manifest = "src/main/AndroidManifest.xml")
public class MainActivityUnitTest {
    private MainActivity mainActivity;
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonSix;
    private Button buttonSeven;
    private Button buttonEight;
    private Button buttonNine;
    private Button buttonZero;


    @Before
    public void setUp() {
        mainActivity = Robolectric.buildActivity(MainActivity.class).create().get();
        assertNotNull("Main Activity not setup", mainActivity);
        buttonOne = (Button)mainActivity.findViewById(R.id.one);
        buttonTwo = (Button)mainActivity.findViewById(R.id.two);
        buttonThree = (Button)mainActivity.findViewById(R.id.three);
        buttonFour = (Button)mainActivity.findViewById(R.id.four);
        buttonFive = (Button)mainActivity.findViewById(R.id.five);
        buttonSix = (Button)mainActivity.findViewById(R.id.six);
        buttonSeven = (Button)mainActivity.findViewById(R.id.seven);
        buttonEight = (Button)mainActivity.findViewById(R.id.eight);
        buttonNine = (Button)mainActivity.findViewById(R.id.nine);
        buttonZero = (Button)mainActivity.findViewById(R.id.zero);
    }

    @Test
    public void testNumberButtons() {
        buttonOne.callOnClick();
        String numberOne = (String) buttonOne.getText();
        String numberTwo = (String) buttonTwo.getText();
        String numberThree = (String) buttonThree.getText();
        String numberFour = (String) buttonFour.getText();
        String numberFive = (String) buttonFive.getText();
        String numberSix = (String) buttonSix.getText();
        String numberSeven = (String) buttonSeven.getText();
        String numberEight = (String) buttonEight.getText();
        String numberNine = (String) buttonNine.getText();
        String numberZero = (String) buttonZero.getText();
        assertEquals("1" ,numberOne);
        assertEquals("2" ,numberTwo);
        assertEquals("3" ,numberThree);
        assertEquals("4" ,numberFour);
        assertEquals("5" ,numberFive);
        assertEquals("6" ,numberSix);
        assertEquals("7" ,numberSeven);
        assertEquals("8" ,numberEight);
        assertEquals("9" ,numberNine);
        assertEquals("0" ,numberZero);

    }
}
