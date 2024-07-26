/*Design an AWT GUI application (called AWT Counter). Each time the "Count" button is clicked, the counter value should increase by 1 and each time the Reset button is clicked the counter value should be reset to zero.*/
import java.awt.*;
import java.awt.event.*;

class MyClass extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

class First extends Frame implements ActionListener {
    int count = 0;
    Label label;

    First() {
        label = new Label("Count: 0");
        label.setBounds(100, 50, 100, 20);
        add(label);

        Button countButton = new Button("Count");
        countButton.setBounds(50, 80, 70, 30);
        add(countButton);
        countButton.addActionListener(this);

        Button resetButton = new Button("Reset");
        resetButton.setBounds(50, 180, 70, 30);
        add(resetButton);
        resetButton.addActionListener(this);

        setLayout(null);
        setSize(300, 300);
        setVisible(true);
        addWindowListener(new MyClass());
        
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        if (command.equals("Count")) {
            count++;
        } else if (command.equals("Reset")) {
            count = 0;
        }

        label.setText("Count: " + count);
    }
}

public class que5 {
    public static void main(String args[]) {
        First f = new First();
		f.setTitle("AWT Counter");
        f.setResizable(true);
    }
}
