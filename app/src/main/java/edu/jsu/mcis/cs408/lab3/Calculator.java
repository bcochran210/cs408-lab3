package edu.jsu.mcis.cs408.lab3;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;

public class Calculator {

    private AppCompatActivity parent;

    private BigDecimal lValue;
    private BigDecimal rValue;

    private String operator;

    private StringBuilder inputBuffer = new StringBuilder();
    private StringBuilder displayBuffer = new StringBuilder();

    private boolean decimalExists = false;
    private boolean accumulate = false;


    public Calculator (AppCompatActivity parent) {

        AppCompatActivity _parent;

        this.parent = parent;

    }

    public void updateBuffers(String digit) {

        inputBuffer.append(digit);
        displayBuffer.append(digit);

    }

    public void process(String button) {
        /* Receives input from the main activity for processing */

        if (button.equals(parent.getResources().getString(R.string.c))) {
            lValue = null;
            rValue = null;
            operator = null;
            inputBuffer.setLength(0);
            decimalExists = false;
            accumulate = false;
        }

        if (button.equals(parent.getResources().getString(R.string._1))) {
            if (accumulate == false || inputBuffer.toString().startsWith("0")) {
                inputBuffer.setLength(0);
                accumulate = true;
            }

            if (accumulate == true) {
                inputBuffer.append("1");
            }
        }

        if (button.equals(parent.getResources().getString(R.string._2))) {
            if (accumulate == false || inputBuffer.toString().startsWith("0")) {
                inputBuffer.setLength(0);
                accumulate = true;
            }

            if (accumulate == true) {
                inputBuffer.append("2");
            }
        }

        if (button.equals(parent.getResources().getString(R.string._3))) {
            if (accumulate == false || inputBuffer.toString().startsWith("0")) {
                inputBuffer.setLength(0);
                accumulate = true;
            }

            if (accumulate == true) {
                inputBuffer.append("3");
            }
        }

        if (button.equals(parent.getResources().getString(R.string._4))) {
            if (accumulate == false || inputBuffer.toString().startsWith("0")) {
                inputBuffer.setLength(0);
                accumulate = true;
            }

            if (accumulate == true) {
                inputBuffer.append("4");
            }
        }

        if (button.equals(parent.getResources().getString(R.string._5))) {
            if (accumulate == false || inputBuffer.toString().startsWith("0")) {
                inputBuffer.setLength(0);
                accumulate = true;
            }

            if (accumulate == true) {
                inputBuffer.append("5");
            }
        }

        if (button.equals(parent.getResources().getString(R.string._6))) {
            if (accumulate == false || inputBuffer.toString().startsWith("0")) {
                inputBuffer.setLength(0);
                accumulate = true;
            }

            if (accumulate == true) {
                inputBuffer.append("6");
            }
        }

        if (button.equals(parent.getResources().getString(R.string._7))) {
            if (accumulate == false || inputBuffer.toString().startsWith("0")) {
                inputBuffer.setLength(0);
                accumulate = true;
            }

            if (accumulate == true) {
                inputBuffer.append("7");
            }
        }

        if (button.equals(parent.getResources().getString(R.string._8))) {
            if (accumulate == false || inputBuffer.toString().startsWith("0")) {
                inputBuffer.setLength(0);
                accumulate = true;
            }

            if (accumulate == true) {
                inputBuffer.append("8");
            }
        }

        if (button.equals(parent.getResources().getString(R.string._9))) {
            if (accumulate == false || inputBuffer.toString().startsWith("0")) {
                inputBuffer.setLength(0);
                accumulate = true;
            }

            if (accumulate == true) {
                inputBuffer.append("9");
            }
        }

        if (button.equals(parent.getResources().getString(R.string._0))) {
            if (accumulate == false || inputBuffer.toString().startsWith("0")) {
                inputBuffer.setLength(0);
                accumulate = true;
            }

            if (accumulate == true) {
                inputBuffer.append("0");
            }
        }

        if (button.equals(parent.getResources().getString(R.string._decimal))) {
            if (decimalExists == false) {
                inputBuffer.append(".");
                decimalExists = true;
            }
        }

        // Neg / Pos
        if (button.equals(parent.getResources().getString(R.string.u00b1))) {
            if (!inputBuffer.toString().contains("-")) {
                inputBuffer.replace(0, inputBuffer.length(), "-" + inputBuffer.toString());
            } else {
                inputBuffer.replace(0, inputBuffer.length(), inputBuffer.toString().replace("-", ""));
            }
        }

        // Square Root
        if (button.equals(parent.getResources().getString(R.string.u221a))) {
            double value = Double.parseDouble(inputBuffer.toString());
            double squareRoot = Math.pow(value, 0.5);

            inputBuffer.replace(0, inputBuffer.length(), String.valueOf(squareRoot));
        }

        if (button.equals(parent.getResources().getString(R.string._add))) {
            BigDecimal operand = new BigDecimal(inputBuffer.toString());

            if (lValue == null) {
                lValue = operand;
            } else if (lValue != null) {
                rValue = operand;
            }

            // If the current operator is not set to null, evaluate it
            if (operator != null) {
                if (rValue == null) {
                    rValue = lValue;
                }
                if (operator == "+") {
                    lValue = lValue.add(rValue);
                } else if (operator == "-") {
                    lValue = lValue.subtract(rValue);
                } else if (operator == "*") {
                    lValue = lValue.multiply(rValue);
                } else if (operator == "/") {
                    lValue = lValue.divide(rValue);
                } else if (operator == "%") {
                    lValue = lValue.remainder(rValue);
                }
                rValue = null;
                operator = null;
            }

            inputBuffer.setLength(0);
            inputBuffer.append(lValue);
            decimalExists = false;
            accumulate = false;

            // Set current operator entered by user
            operator = "+";

        }

        if (button.equals(parent.getResources().getString(R.string._sub))) {
            BigDecimal operand = new BigDecimal(inputBuffer.toString());

            if (lValue == null) {
                lValue = operand;
            } else if (lValue != null) {
                rValue = operand;
            }

            // If the current operator is not set to null, evaluate it
            if (operator != null) {
                if (rValue == null) {
                    rValue = lValue;
                }
                if (operator == "+") {
                    lValue = lValue.add(rValue);
                } else if (operator == "-") {
                    lValue = lValue.subtract(rValue);
                } else if (operator == "*") {
                    lValue = lValue.multiply(rValue);
                } else if (operator == "/") {
                    lValue = lValue.divide(rValue);
                } else if (operator == "%") {
                    lValue = lValue.remainder(rValue);
                }
                rValue = null;
                operator = null;
            }

            inputBuffer.setLength(0);
            inputBuffer.append(lValue);
            decimalExists = false;
            accumulate = false;

            // Set current operator entered by user
            operator = "-";

        }

        // Multiply
        if (button.equals(parent.getResources().getString(R.string.u00d7))) {
            BigDecimal operand = new BigDecimal(inputBuffer.toString());

            if (lValue == null) {
                lValue = operand;
            } else if (lValue != null) {
                rValue = operand;
            }

            // If the current operator is not set to null, evaluate it
            if (operator != null) {
                if (rValue == null) {
                    rValue = lValue;
                }
                if (operator == "+") {
                    lValue = lValue.add(rValue);
                } else if (operator == "-") {
                    lValue = lValue.subtract(rValue);
                } else if (operator == "*") {
                    lValue = lValue.multiply(rValue);
                } else if (operator == "/") {
                    lValue = lValue.divide(rValue);
                } else if (operator == "%") {
                    lValue = lValue.remainder(rValue);
                }
                rValue = null;
                operator = null;
            }

            inputBuffer.setLength(0);
            inputBuffer.append(lValue);
            decimalExists = false;
            accumulate = false;

            // Set current operator entered by user
            operator = "*";

        }

        // Divide
        if (button.equals(parent.getResources().getString(R.string.u00f7))) {
            BigDecimal operand = new BigDecimal(inputBuffer.toString());

            if (lValue == null) {
                lValue = operand;
            } else if (lValue != null) {
                rValue = operand;
            }

            // If the current operator is not set to null, evaluate it
            if (operator != null) {
                if (rValue == null) {
                    rValue = lValue;
                }
                if (operator == "+") {
                    lValue = lValue.add(rValue);
                } else if (operator == "-") {
                    lValue = lValue.subtract(rValue);
                } else if (operator == "*") {
                    lValue = lValue.multiply(rValue);
                } else if (operator == "/") {
                    lValue = lValue.divide(rValue);
                } else if (operator == "%") {
                    lValue = lValue.remainder(rValue);
                }
                rValue = null;
                operator = null;
            }

            inputBuffer.setLength(0);
            inputBuffer.append(lValue);
            decimalExists = false;
            accumulate = false;

            // Set current operator entered by user
            operator = "/";

        }

        if (button.equals(parent.getResources().getString(R.string._Modulud))) {
            BigDecimal operand = new BigDecimal(inputBuffer.toString());

            if (lValue == null) {
                lValue = operand;
            } else if (lValue != null) {
                rValue = operand;
            }

            // If the current operator is not set to null, evaluate it
            if (operator != null) {
                if (rValue == null) {
                    rValue = lValue;
                }
                if (operator == "+") {
                    lValue = lValue.add(rValue);
                } else if (operator == "-") {
                    lValue = lValue.subtract(rValue);
                } else if (operator == "*") {
                    lValue = lValue.multiply(rValue);
                } else if (operator == "/") {
                    lValue = lValue.divide(rValue);
                } else if (operator == "%") {
                    lValue = lValue.remainder(rValue);
                }
                rValue = null;
                operator = null;
            }

            inputBuffer.setLength(0);
            inputBuffer.append(lValue);
            decimalExists = false;
            accumulate = false;

            // Set current operator entered by user
            operator = "%";

        }

        if (button.equals(parent.getResources().getString(R.string._equals))) {

            if (lValue != null && !inputBuffer.toString().isEmpty()) {
                rValue = new BigDecimal(inputBuffer.toString());
            }

            if (operator == "+") {
                lValue = lValue.add(rValue);
                inputBuffer.setLength(0);
                inputBuffer.append(lValue);
                operator = null;
            } else if (operator == "-") {
                lValue = lValue.subtract(rValue);
                inputBuffer.setLength(0);
                inputBuffer.append(lValue);
                operator = null;
            } else if (operator == "*") {
                lValue = lValue.multiply(rValue);
                inputBuffer.setLength(0);
                inputBuffer.append(lValue);
                operator = null;
            } else if (operator == "/") {
                lValue = lValue.divide(rValue);
                inputBuffer.setLength(0);
                inputBuffer.append(lValue);
                operator = null;
            } else if (operator == "%") {
                lValue = lValue.remainder(rValue);
                inputBuffer.setLength(0);
                inputBuffer.append(lValue);
                operator = null;
            }

            decimalExists = false;
            accumulate = false;

        }

    }

    public String getDisplay() {
        /* Gets an updated display based on the data processed */
        return inputBuffer.toString();
    }

}
