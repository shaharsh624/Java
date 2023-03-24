import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class CalculatorMid extends JFrame implements ActionListener {
    JTextField inputBox;

    public CalculatorMid(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(370,480);
        setLayout(null);

        /*      Text Box     */
        inputBox = new JTextField("");
        inputBox.setEditable(false);
        inputBox.setBounds(2,2,350,48);
        add(inputBox);
        inputBox.addActionListener(this);

        // Creating obj of every button
//        JButton logButton = new JButton("l");
//        JButton powerButton = new JButton("p");
        JButton moduloButton = new JButton("%");
        JButton divideButton = new JButton("/");

        JButton sevenButton = new JButton("7");
        JButton eightButton = new JButton("8");
        JButton nineButton = new JButton("9");
        JButton multiplyButton = new JButton("*");

        JButton fourButton = new JButton("4");
        JButton fiveButton = new JButton("5");
        JButton sixButton = new JButton("6");
        JButton minusButton = new JButton("-");

        JButton oneButton = new JButton("1");
        JButton twoButton = new JButton("2");
        JButton threeButton = new JButton("3");
        JButton plusButton = new JButton("+");

        JButton clearButton = new JButton("C");
        JButton zeroButton = new JButton("0");
        JButton dotButton = new JButton(".");
        JButton equalsButton = new JButton("=");


        // ActionListner
//        logButton.addActionListener(this);
//        powerButton.addActionListener(this);
        moduloButton.addActionListener(this);
        divideButton.addActionListener(this);

        sevenButton.addActionListener(this);
        eightButton.addActionListener(this);
        nineButton.addActionListener(this);
        multiplyButton.addActionListener(this);

        fourButton.addActionListener(this);
        fiveButton.addActionListener(this);
        sixButton.addActionListener(this);
        minusButton.addActionListener(this);

        oneButton.addActionListener(this);
        twoButton.addActionListener(this);
        threeButton.addActionListener(this);
        plusButton.addActionListener(this);

        clearButton.addActionListener(this);
        zeroButton.addActionListener(this);
        dotButton.addActionListener(this);
        equalsButton.addActionListener(this);


        // Setting Bounds(Size)
//        logButton.setBounds(1,50,80,70);
//        powerButton.setBounds(90,50,80,70);
        moduloButton.setBounds(180,50,80,50);
        divideButton.setBounds(270,50,80,70);

        sevenButton.setBounds(10,130,80,70);
        eightButton.setBounds(90,130,80,70);
        nineButton.setBounds(180,130,80,70);
        multiplyButton.setBounds(270,130,80,70);

        fourButton.setBounds(1,210,80,70);
        fiveButton.setBounds(90,210,80,70);
        sixButton.setBounds(180,210,80,70);
        minusButton.setBounds(270,210,80,70);

        oneButton.setBounds(1,290,80,70);
        twoButton.setBounds(90,290,80,70);
        threeButton.setBounds(180,290,80,70);
        plusButton.setBounds(270,290,80,70);

        clearButton.setBounds(1,370,80,70);
        zeroButton.setBounds(90,370,80,70);
        dotButton.setBounds(180,370,80,70);
        equalsButton.setBounds(270,370,80,70);


        // Adding Buttons
//        add(logButton);
//        add(powerButton);
        add(moduloButton);
        add(divideButton);

        add(sevenButton);
        add(eightButton);
        add(nineButton);
        add(multiplyButton);

        add(fourButton);
        add(fiveButton);
        add(sixButton);
        add(minusButton);

        add(oneButton);
        add(twoButton);
        add(threeButton);
        add(plusButton);

        add(clearButton);
        add(zeroButton);
        add(dotButton);
        add(equalsButton);


        // Changing font properties
//        logButton.setFont(new Font("Verdana", Font.BOLD, 12));
//        powerButton.setFont(new Font("Verdana", Font.BOLD, 12));
        moduloButton.setFont(new Font("Verdana", Font.BOLD, 12));
        divideButton.setFont(new Font("Verdana", Font.BOLD, 12));

        sevenButton.setFont(new Font("Verdana", Font.BOLD, 12));
        eightButton.setFont(new Font("Verdana", Font.BOLD, 12));
        nineButton.setFont(new Font("Verdana", Font.BOLD, 12));
        multiplyButton.setFont(new Font("Verdana", Font.BOLD, 12));

        fourButton.setFont(new Font("Verdana", Font.BOLD, 12));
        fiveButton.setFont(new Font("Verdana", Font.BOLD, 12));
        sixButton.setFont(new Font("Verdana", Font.BOLD, 12));
        minusButton.setFont(new Font("Verdana", Font.BOLD, 12));

        oneButton.setFont(new Font("Verdana", Font.BOLD, 12));
        twoButton.setFont(new Font("Verdana", Font.BOLD, 12));
        threeButton.setFont(new Font("Verdana", Font.BOLD, 12));
        plusButton.setFont(new Font("Verdana", Font.BOLD, 12));

        clearButton.setFont(new Font("Verdana", Font.BOLD, 12));
        zeroButton.setFont(new Font("Verdana", Font.BOLD, 12));
        dotButton.setFont(new Font("Verdana", Font.BOLD, 12));
        equalsButton.setFont(new Font("Verdana", Font.BOLD, 12));

        setVisible(true);

    }


    public static void main(String[] args) {
        CalculatorMid c = new CalculatorMid();
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
