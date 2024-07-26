import java.awt.*;
import java.awt.event.*;

class MyClass extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

class First extends Frame implements ActionListener {
    Label label;

    First() {
        Button red = new Button("Red");
        red.setBounds(400, 180, 70, 30);
        add(red);

        Button blue = new Button("Blue");
        blue.setBounds(400, 120, 70, 30);
        add(blue);

        Button green = new Button("Green");
        green.setBounds(400, 60, 70, 30);
        add(green);

        label = new Label("WELCOME");
        label.setBounds(100, 50, 100, 20);
        add(label);

        setSize(500, 300);
        setLayout(null);
        setVisible(true);

        red.addActionListener(this);
        blue.addActionListener(this);
        green.addActionListener(this);

        addWindowListener(new MyClass());
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();

        switch (command) {
            case "Red":
                label.setForeground(Color.RED);
                break;
            case "Blue":
                label.setForeground(Color.BLUE);
                break;
            case "Green":
                label.setForeground(Color.GREEN);
                break;
        }
    }
}

public class que6 {
    public static void main(String args[]) {
        First f = new First();
        f.setTitle("My Buttons");
        f.setResizable(true);
    }
}
