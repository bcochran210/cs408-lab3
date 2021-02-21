package edu.jsu.mcis.cs408.lab3;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;

public class Calculator {

    private AppCompatActivity parent;
    private BigDecimal lValue;
    private BigDecimal rValue;
    private BigDecimal result;
    private StringBuilder inputBuffer = new StringBuilder();
    private StringBuilder displayBuffer = new StringBuilder();
    private String functionKey;

    public Calculator (AppCompatActivity parent) {

        AppCompatActivity _parent;

        this.parent = parent;

    }

    public void process(String button) {
        /* Receives input from the main activity for processing */

        if (button.equals(parent.getResources().getString(R.string.c))) {
            lValue = new BigDecimal("0");
            rValue = new BigDecimal("0");
            inputBuffer = new StringBuilder();
            displayBuffer = new StringBuilder();
        }

        if (button.equals(parent.getResources().getString(R.string._1))) {
            inputBuffer.append("1");
        }

        if (button.equals(parent.getResources().getString(R.string._2))) {
            inputBuffer.append("2");
        }

        if (button.equals(parent.getResources().getString(R.string._3))) {
            inputBuffer.append("3");
        }

        if (button.equals(parent.getResources().getString(R.string._4))) {
            inputBuffer.append("4");
        }

        if (button.equals(parent.getResources().getString(R.string._5))) {
            inputBuffer.append("5");
        }

        if (button.equals(parent.getResources().getString(R.string._6))) {
            inputBuffer.append("6");
        }

        if (button.equals(parent.getResources().getString(R.string._7))) {
            inputBuffer.append("7");
        }

        if (button.equals(parent.getResources().getString(R.string._8))) {
            inputBuffer.append("8");
        }

        if (button.equals(parent.getResources().getString(R.string._9))) {
            inputBuffer.append("9");
        }

        if (button.equals(parent.getResources().getString(R.string._0))) {
            inputBuffer.append("0");
        }

        if (button.equals(parent.getResources().getString(R.string._decimal))) {
            if(!inputBuffer.toString().contains(".")) {
                inputBuffer.append(".");
            }
        }

        if (button.equals(parent.getResources().getString(R.string._add))) {
            displayBuffer = new StringBuilder();
            if (lValue != null && !inputBuffer.toString().isEmpty()) {
                rValue = new BigDecimal(inputBuffer.toString());
                lValue = lValue.add(rValue);
                rValue = new BigDecimal("0");
                displayBuffer.append(lValue);
                inputBuffer = new StringBuilder();
            } else if (!inputBuffer.toString().isEmpty()) {
                lValue = new BigDecimal(inputBuffer.toString());
                inputBuffer = new StringBuilder();
            }
        }

        if (button.equals(parent.getResources().getString(R.string._equals))) {
            displayBuffer.append(result);
        }

        //return result;

    }

    public String getDisplay() {
        /* Gets an updated display based on the data processed */
        return displayBuffer.toString();
    }

}
