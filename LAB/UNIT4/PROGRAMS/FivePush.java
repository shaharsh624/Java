import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FivePush {
    public static void main(String[] args) {
        final JFrame frame = new JFrame();

        JButton btnOK = new JButton("OK");
        btnOK.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(frame,"You've clicked OK button");
                    }
                });

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(frame,"You've clicked Cancel button"
                        );
                    }
                });


        JPanel buttonPanel = new JPanel( );
        buttonPanel.add(btnOK);
        buttonPanel.add(btnCancel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.getContentPane( ).add(buttonPanel,BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}