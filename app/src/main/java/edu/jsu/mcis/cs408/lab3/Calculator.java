package edu.jsu.mcis.cs408.lab3;

import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;

public class Calculator {

    private AppCompatActivity parent;
    private BigDecimal lValue = new BigDecimal("0.0");
    private BigDecimal rValue = new BigDecimal("0.0");
    private BigDecimal result = new BigDecimal("0.0");
    private StringBuilder inputBuffer = new StringBuilder();

    public Calculator (AppCompatActivity parent) {

        AppCompatActivity _parent;

        this.parent = parent;

    }

    public BigDecimal process(String button) {
        /* Receives input from the main activity for processing */

        if (button.equals(parent.getResources().getString(R.string.c))) {
            lValue = new BigDecimal("0.0");
            rValue = new BigDecimal("0.0");
            inputBuffer = new StringBuilder();
        }

        if (button.equals(parent.getResources().getString(R.string._1))) {
            if (inputBuffer.toString().contains("+")) {
                rValue = new BigDecimal("1.0");
                inputBuffer.append(rValue.toString());
            } else {
                lValue = new BigDecimal("1.0");
                inputBuffer.append(lValue.toString());
            }
        }

        result = new BigDecimal(inputBuffer.toString());

        return result;

    }

    public String getDisplay() {
        /* Gets an updated display based on the data processed */
        return result.toString();
    }

}
