package com.java.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton;
    private JButton equalButton, clearButton;
    private JButton sinButton, cosButton, tanButton, arcsinButton, arccosButton, arctanButton;
    private JButton expButton, logButton, sqrtButton, powerButton, log10Button, absButton;
    private JPanel panel;

    private double num1, num2, result;
    private char operator;

    public Calculator() {
        this.setTitle("Basic Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 500);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(25, 25, 112)); // Navy Blue color

        textField = new JTextField();
        textField.setBounds(30, 30, 330, 30);
        textField.setEditable(false);
        textField.setBackground(Color.WHITE);
        textField.setForeground(Color.BLACK);
        textField.setHorizontalAlignment(JTextField.RIGHT);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setBackground(Color.WHITE);
            numberButtons[i].setForeground(Color.BLACK);
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 18));
        }

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");

        sinButton = new JButton("sin");
        cosButton = new JButton("cos");
        tanButton = new JButton("tan");
        arcsinButton = new JButton("arcsin");
        arccosButton = new JButton("arccos");
        arctanButton = new JButton("arctan");

        expButton = new JButton("exp");
        logButton = new JButton("ln");
        sqrtButton = new JButton("√");
        powerButton = new JButton("^");
        log10Button = new JButton("log");
        absButton = new JButton("|x|");

        functionButtons = new JButton[]{addButton, subButton, mulButton, divButton, sinButton, cosButton, tanButton,
                arcsinButton, arccosButton, arctanButton, expButton, logButton, sqrtButton, powerButton, log10Button, absButton};

        for (JButton button : functionButtons) {
            button.addActionListener(this);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.setBackground(new Color(70, 130, 180)); // Steel Blue color
            button.setForeground(Color.WHITE);
        }

        equalButton = new JButton("=");
        clearButton = new JButton("C");

        equalButton.addActionListener(this);
        clearButton.addActionListener(this);

        panel = new JPanel();
        panel.setBounds(30, 80, 330, 350);
        panel.setLayout(new GridLayout(7, 4, 10, 10));
        panel.setBackground(new Color(25, 25, 112)); // Navy Blue color

        panel.add(sinButton);
        panel.add(cosButton);
        panel.add(tanButton);
        panel.add(arcsinButton);
        panel.add(arccosButton);
        panel.add(arctanButton);
        panel.add(expButton);
        panel.add(logButton);
        panel.add(sqrtButton);
        panel.add(powerButton);
        panel.add(log10Button);
        panel.add(absButton);

        for (int i = 1; i <= 9; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(numberButtons[0]);
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(equalButton);
        panel.add(clearButton);

        this.add(textField);
        this.add(panel);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if (e.getSource() == sinButton) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.sin(num1);
            textField.setText(String.valueOf(result));
        }
        if (e.getSource() == cosButton) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.cos(num1);
            textField.setText(String.valueOf(result));
        }
        if (e.getSource() == tanButton) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.tan(num1);
            textField.setText(String.valueOf(result));
        }
        if (e.getSource() == arcsinButton) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.asin(num1);
            textField.setText(String.valueOf(result));
        }
        if (e.getSource() == arccosButton) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.acos(num1);
            textField.setText(String.valueOf(result));
        }
        if (e.getSource() == arctanButton) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.atan(num1);
            textField.setText(String.valueOf(result));
        }
        if (e.getSource() == expButton) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.exp(num1);
            textField.setText(String.valueOf(result));
        }
        if (e.getSource() == logButton) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.log(num1);
            textField.setText(String.valueOf(result));
        }
        if (e.getSource() == sqrtButton) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.sqrt(num1);
            textField.setText(String.valueOf(result));
        }
        if (e.getSource() == powerButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '^';
            textField.setText("");
        }
        if (e.getSource() == log10Button) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.log10(num1);
            textField.setText(String.valueOf(result));
        }
        if (e.getSource() == absButton) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.abs(num1);
            textField.setText(String.valueOf(result));
        }
        if (e.getSource() == equalButton) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '^':
                    result = Math.pow(num1, num2);
                    break;
            }
            textField.setText(String.valueOf(result));
        }
        if (e.getSource() == clearButton) {
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

