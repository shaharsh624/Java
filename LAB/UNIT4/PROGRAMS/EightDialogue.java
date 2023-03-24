import java.awt.event.*;
import javax.swing.*;

class DialogueClass extends JFrame implements ActionListener {
    JButton b1;
    DialogueClass() {
        this.setLayout(null);
        b1 = new JButton("Button 2");
        b1.setBounds(130, 05, 100, 50);
        this.add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == b1) {
            JOptionPane.showMessageDialog(this, "Enter a valid String",                    "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }
}

class EightDialogue {
    public static void main(String args[]) {
        DialogueClass f = new DialogueClass();
        f.setBounds(200, 200, 400, 300);
        f.setResizable(false);
        f.setVisible(true);
    }
}
