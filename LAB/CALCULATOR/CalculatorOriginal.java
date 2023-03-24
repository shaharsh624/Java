import javax.swing.*;
import java.awt.*;

public class CalculatorOriginal extends JFrame {
    JTextField inputBox;

    //Constructor
    public CalculatorOriginal() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(370, 480);
        setLayout(null);

        /*      Text Box     */
        inputBox = new JTextField("");
        inputBox.setBounds(2, 2, 350, 48);
        add(inputBox);

        // Creating obj of every button
        JButton logButton = new JButton("log");
        JButton powerButton = new JButton("a^b");
        JButton moduloButton = new JButton("%");
        JButton divideButton = new JButton("/");

        JButton sevenButton = new JButton("7");
        JButton eightButton = new JButton("8");
        JButton nineButton = new JButton("9");
        JButton multiplyButton = new JButton("x");

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


        // Setting Bounds(Size)
        logButton.setBounds(1, 50, 80, 70);
        powerButton.setBounds(90, 50, 80, 70);
        moduloButton.setBounds(180, 50, 80, 70);
        divideButton.setBounds(270, 50, 80, 70);

        sevenButton.setBounds(1, 130, 80, 70);
        eightButton.setBounds(90, 130, 80, 70);
        nineButton.setBounds(180, 130, 80, 70);
        multiplyButton.setBounds(270, 130, 80, 70);

        fourButton.setBounds(1, 210, 80, 70);
        fiveButton.setBounds(90, 210, 80, 70);
        sixButton.setBounds(180, 210, 80, 70);
        minusButton.setBounds(270, 210, 80, 70);

        oneButton.setBounds(1, 290, 80, 70);
        twoButton.setBounds(90, 290, 80, 70);
        threeButton.setBounds(180, 290, 80, 70);
        plusButton.setBounds(270, 290, 80, 70);

        clearButton.setBounds(1, 370, 80, 70);
        zeroButton.setBounds(90, 370, 80, 70);
        dotButton.setBounds(180, 370, 80, 70);
        equalsButton.setBounds(270, 370, 80, 70);


        // Adding Buttons
        add(logButton);
        add(powerButton);
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
        logButton.setFont(new Font("Verdana", Font.BOLD, 12));
        powerButton.setFont(new Font("Verdana", Font.BOLD, 12));
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
        CalculatorOriginal c = new CalculatorOriginal();
    }

}