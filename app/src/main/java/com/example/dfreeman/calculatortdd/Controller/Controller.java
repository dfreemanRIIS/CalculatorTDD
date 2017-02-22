package com.example.dfreeman.calculatortdd.Controller;

import com.example.dfreeman.calculatortdd.Model.AdditionModel;
import com.example.dfreeman.calculatortdd.Model.DivisionModel;
import com.example.dfreeman.calculatortdd.Model.MultiplicationModel;
import com.example.dfreeman.calculatortdd.Model.SubtractionModel;

public class Controller {
    public int Add(int first, int second) {
        AdditionModel additionModel = new AdditionModel();
        return 1;
    }

    public int Subtract(int first, int second) {
        SubtractionModel subtractionModel = new SubtractionModel();
        return 1;
    }

    public int Multiply(int first, int second) {
        MultiplicationModel multiplicationModel = new MultiplicationModel();
        return 1;
    }

    public double Divide(double first, double second) {
        DivisionModel divisionModel = new DivisionModel();
        return 1;
    }
}
