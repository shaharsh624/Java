package PRACTICE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class Calculator extends JFrame implements ActionListener {
    JTextField inputBox;

    public Calculator(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(385,425);
        setLayout(null);
//        getContentPane().setBackground(Color.WHITE);
        getContentPane().setBackground(Color.decode("#F7F8FB"));


        // Text Box
        inputBox = new JTextField("");
        inputBox.setEditable(false);
        inputBox.setBounds(10,10,350,70);

        inputBox.setFont(new Font("Verdana", Font.BOLD, 20));
        inputBox.setBackground(Color.decode("#FBFCFD"));
        inputBox.setForeground(Color.decode("#424242"));

        inputBox.addActionListener(this);
        add(inputBox);
        /*Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
        inputBox.setBorder(border);*/


        // Creating obj of every button
        JButton clearButton = new JButton("C");        JButton deleteButton = new JButton("<-"); // add it
        JButton moduloButton = new JButton("%");        JButton divideButton = new JButton("/");

        JButton sevenButton = new JButton("7");        JButton eightButton = new JButton("8");
        JButton nineButton = new JButton("9");        JButton multiplyButton = new JButton("*");

        JButton fourButton = new JButton("4");        JButton fiveButton = new JButton("5");
        JButton sixButton = new JButton("6");        JButton minusButton = new JButton("-");

        JButton oneButton = new JButton("1");        JButton twoButton = new JButton("2");
        JButton threeButton = new JButton("3");        JButton plusButton = new JButton("+");

        JButton zeroButton = new JButton("0");        JButton dotButton = new JButton(".");
        JButton equalsButton = new JButton("=");

        // ActionListner
        clearButton.addActionListener(this);        deleteButton.addActionListener(this);
        moduloButton.addActionListener(this);        divideButton.addActionListener(this);

        sevenButton.addActionListener(this);        eightButton.addActionListener(this);
        nineButton.addActionListener(this);        multiplyButton.addActionListener(this);

        fourButton.addActionListener(this);        fiveButton.addActionListener(this);
        sixButton.addActionListener(this);        minusButton.addActionListener(this);

        oneButton.addActionListener(this);        twoButton.addActionListener(this);
        threeButton.addActionListener(this);        plusButton.addActionListener(this);

        zeroButton.addActionListener(this);        dotButton.addActionListener(this);
        equalsButton.addActionListener(this);


        // Setting Bounds(Size)
        clearButton.setBounds(10,85,80,55);        deleteButton.setBounds(100,85,80,55);
        moduloButton.setBounds(190,85,80,55);        divideButton.setBounds(280,85,80,55);

        sevenButton.setBounds(10,145,80,55);        eightButton.setBounds(100,145,80,55);
        nineButton.setBounds(190,145,80,55);        multiplyButton.setBounds(280,145,80,55);

        fourButton.setBounds(10,205,80,55);        fiveButton.setBounds(100,205,80,55);
        sixButton.setBounds(190,205,80,55);        minusButton.setBounds(280,205,80,55);

        oneButton.setBounds(10,265,80,55);        twoButton.setBounds(100,265,80,55);
        threeButton.setBounds(190,265,80,55);        plusButton.setBounds(280,265,80,55);

        zeroButton.setBounds(100,325,80,55);        dotButton.setBounds(190,325,80,55);
        equalsButton.setBounds(280,325,80,55);

        // Changing font properties
        clearButton.setFont(new Font("Verdana", Font.BOLD, 17));        deleteButton.setFont(new Font("Verdana", Font.BOLD, 17));
        moduloButton.setFont(new Font("Verdana", Font.BOLD, 17));        divideButton.setFont(new Font("Verdana", Font.BOLD, 17));

        sevenButton.setFont(new Font("Verdana", Font.BOLD, 17));        eightButton.setFont(new Font("Verdana", Font.BOLD, 17));
        nineButton.setFont(new Font("Verdana", Font.BOLD, 17));        multiplyButton.setFont(new Font("Verdana", Font.BOLD, 17));

        fourButton.setFont(new Font("Verdana", Font.BOLD, 17));        fiveButton.setFont(new Font("Verdana", Font.BOLD, 17));
        sixButton.setFont(new Font("Verdana", Font.BOLD, 17));        minusButton.setFont(new Font("Verdana", Font.BOLD, 17));

        oneButton.setFont(new Font("Verdana", Font.BOLD, 17));        twoButton.setFont(new Font("Verdana", Font.BOLD, 17));
        threeButton.setFont(new Font("Verdana", Font.BOLD, 17));        plusButton.setFont(new Font("Verdana", Font.BOLD, 17));

        zeroButton.setFont(new Font("Verdana", Font.BOLD, 17));        dotButton.setFont(new Font("Verdana", Font.BOLD, 17));
        equalsButton.setFont(new Font("Verdana", Font.BOLD, 17));

        // Button Color
        clearButton.setBackground(Color.decode("#FBFCFD"));        deleteButton.setBackground(Color.decode("#FBFCFD"));
        moduloButton.setBackground(Color.decode("#ADE1FF"));        divideButton.setBackground(Color.decode("#ADE1FF"));

        sevenButton.setBackground(Color.decode("#FBFCFD"));        eightButton.setBackground(Color.decode("#FBFCFD"));
        nineButton.setBackground(Color.decode("#FBFCFD"));        multiplyButton.setBackground(Color.decode("#ADE1FF"));

        fourButton.setBackground(Color.decode("#FBFCFD"));        fiveButton.setBackground(Color.decode("#FBFCFD"));
        sixButton.setBackground(Color.decode("#FBFCFD"));        minusButton.setBackground(Color.decode("#ADE1FF"));

        oneButton.setBackground(Color.decode("#FBFCFD"));        twoButton.setBackground(Color.decode("#FBFCFD"));
        threeButton.setBackground(Color.decode("#FBFCFD"));        plusButton.setBackground(Color.decode("#ADE1FF"));

        zeroButton.setBackground(Color.decode("#FBFCFD"));        dotButton.setBackground(Color.decode("#FBFCFD"));
        equalsButton.setBackground(Color.decode("#19ACFF"));

        // Button Text Color
        clearButton.setForeground(Color.decode("#858585"));        deleteButton.setForeground(Color.decode("#858585"));
        moduloButton.setForeground(Color.decode("#109DFF"));        divideButton.setForeground(Color.decode("#109DFF"));

        sevenButton.setForeground(Color.decode("#38B9FF"));        eightButton.setForeground(Color.decode("#38B9FF"));
        nineButton.setForeground(Color.decode("#38B9FF"));        multiplyButton.setForeground(Color.decode("#109DFF"));

        fourButton.setForeground(Color.decode("#38B9FF"));        fiveButton.setForeground(Color.decode("#38B9FF"));
        sixButton.setForeground(Color.decode("#38B9FF"));        minusButton.setForeground(Color.decode("#109DFF"));

        oneButton.setForeground(Color.decode("#38B9FF"));        twoButton.setForeground(Color.decode("#38B9FF"));
        threeButton.setForeground(Color.decode("#38B9FF"));        plusButton.setForeground(Color.decode("#109DFF"));

        zeroButton.setForeground(Color.decode("#38B9FF"));        dotButton.setForeground(Color.decode("#38B9FF"));
        equalsButton.setForeground(Color.decode("#B2DAFF"));

        // Adding Buttons
        add(clearButton);        add(deleteButton);
        add(moduloButton);        add(divideButton);

        add(sevenButton);        add(eightButton);
        add(nineButton);        add(multiplyButton);

        add(fourButton);        add(fiveButton);
        add(sixButton);        add(minusButton);

        add(oneButton);        add(twoButton);
        add(threeButton);        add(plusButton);

        add(zeroButton);        add(dotButton);
        add(equalsButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }

    public void actionPerformed(ActionEvent e) {
        String expression = e.getActionCommand();
        if (expression.charAt(0) == 'C'){
            inputBox.setText("");
        }
        else if (expression.charAt(0) == '='){
            inputBox.setText(evaluate(inputBox.getText()));
        }
        else{
            inputBox.setText(inputBox.getText() + expression);
        }
    }

    public static String evaluate(String expression){
        char[] arr = expression.toCharArray();
        String operand1 = "";
        String operand2 = "";
        String operator = "";
        double result;

        for (int i=0 ; i<arr.length ; i++){
            if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.'){
                if (operator.isEmpty()){
                    operand1 = operand1 + arr[i];
                }
                else{
                    operand2 = operand2 + arr[i];
                }
            }

            if (arr[i] == '+' || arr[i] == '-' || arr[i] == '*' || arr[i] == '/' || arr[i] == '%' || arr[i] == 'l' ||  arr[i] == 'p'){
                operator = operator + arr[i];
            }
        }

        if (operator.equals("+")){
            result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
        }
        else if (operator.equals("-")){
            result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
        }
        else if (operator.equals("*")){
            result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));
        }
        else if (operator.equals("/")){
            result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
        }
        else if (operator.equals("%")){
            result = (Double.parseDouble(operand1) % Double.parseDouble(operand2));
        }
        else if (operator.equals("l")){
            result = (log(Double.parseDouble(operand1)));
        }
        else{
            result = pow(Double.parseDouble(operand1),Double.parseDouble(operand2));
        }

        return (operand1 + " " + operator + " " + operand2 + " = " + result);


    }
}



        /*  Button-border
        clearButton.setBorder(border);
        deleteButton.setBorder(border);
        moduloButton.setBorder(border);
        divideButton.setBorder(border);

        sevenButton.setBorder(border);
        eightButton.setBorder(border);
        nineButton.setBorder(border);
        multiplyButton.setBorder(border);

        fourButton.setBorder(border);
        fiveButton.setBorder(border);
        sixButton.setBorder(border);
        minusButton.setBorder(border);

        oneButton.setBorder(border);
        twoButton.setBorder(border);
        threeButton.setBorder(border);
        plusButton.setBorder(border);

        zeroButton.setBorder(border);
        dotButton.setBorder(border);
        equalsButton.setBorder(border);
        */

        /* Log-power button

        JButton logButton = new JButton("l");
        JButton powerButton = new JButton("p");

        logButton.addActionListener(this);
        powerButton.addActionListener(this);

        logButton.setBounds(1,50,80,70);
        powerButton.setBounds(90,50,80,70);

        add(logButton);
        add(powerButton);

        logButton.setFont(new Font("Verdana", Font.BOLD, 17));
        powerButton.setFont(new Font("Verdana", Font.BOLD, 17));
*/