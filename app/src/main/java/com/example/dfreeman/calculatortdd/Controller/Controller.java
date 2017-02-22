package com.example.dfreeman.calculatortdd.Controller;

import com.example.dfreeman.calculatortdd.Model.AdditionModel;
import com.example.dfreeman.calculatortdd.Model.DivisionModel;
import com.example.dfreeman.calculatortdd.Model.MultiplicationModel;
import com.example.dfreeman.calculatortdd.Model.SubtractionModel;

public class Controller {
    public int Add(int first, int second) {
        AdditionModel additionModel = new AdditionModel();
        return additionModel.add(first, second);
    }

    public int Subtract(int first, int second) {
        SubtractionModel subtractionModel = new SubtractionModel();
        return subtractionModel.sub(first, second);
    }

    public int Multiply(int first, int second) {
        MultiplicationModel multiplicationModel = new MultiplicationModel();
        return multiplicationModel.mult(first, second);
    }

    public double Divide(double first, double second) {
        DivisionModel divisionModel = new DivisionModel();
        return divisionModel.div(first, second);
    }
}
