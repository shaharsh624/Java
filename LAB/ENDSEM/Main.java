import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class Main {
    public Main(){
        JFrame f = new JFrame("Student Details");
        f.setSize(400,400);

        JPanel p = new JPanel(new GridLayout(3,2));
        p.setBounds(100,100,200,100);
        JPanel p2 = new JPanel();

        JLabel l1 = new JLabel("Roll No");
        JLabel l2 = new JLabel("Name");
        JLabel l3 = new JLabel("Branch");

        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();
        String[] s1 = { " ", "CSE", "ICT", "ECE" };
        JComboBox tf3 = new JComboBox(s1);
        String branch = tf3.getSelectedItem() + "";
        System.out.println(branch);

        JButton button = new JButton("ENTER");
        button.setBounds(420, 300, 70, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String rollNo = tf1.getText();
                String name = tf2.getText();
                String branch = tf3.getSelectedItem() + "";
                try {
                    if (branch.equals("CSE")) {
                        FileWriter fw = new FileWriter("C:\\Users\\harsh\\OneDrive - pdpu.ac.in\\HARSH\\CODE\\JAVA\\LABs\\ENDSEM\\src\\CSE.txt", true);
                        fw.write("\n" + "\n" + rollNo + "\n" + name + "\n" + branch);
                        fw.close();
                    } else if (branch.equals("ICT")) {
                        FileWriter fw = new FileWriter("C:\\Users\\harsh\\OneDrive - pdpu.ac.in\\HARSH\\CODE\\JAVA\\LABs\\ENDSEM\\src\\ICT.txt", true);
                        fw.write("\n" + "\n" + rollNo + "\n" + name + "\n" + branch);
                        fw.close();
                    } else if (branch.equals("ECE")) {
                        FileWriter fw = new FileWriter("C:\\Users\\harsh\\OneDrive - pdpu.ac.in\\HARSH\\CODE\\JAVA\\LABs\\ENDSEM\\src\\ECE.txt", true);
                        fw.write("\n" + "\n" + rollNo + "\n" + name + "\n" + branch);
                        fw.close();
                    }
                    JOptionPane.showMessageDialog(button,"Record Saved Successfully");
                    f.dispose();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }

        });

        f.add(p);
        f.add(p2);
        p2.add(button);
        p.add(l1);
        p.add(tf1);
        p.add(l2);
        p.add(tf2);
        p.add(l3);
        p.add(tf3);

        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }


}


































