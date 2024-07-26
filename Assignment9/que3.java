/*Write a java awt program, which will create 3 text field and one button labelled as add. The program will take the input from the two text filed and upon pressing the add button it will display the result in the third text field.*/
import java.awt.*;
import java.awt.event.*;

class MyClass extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

class First extends Frame implements ActionListener {
    TextField t1, t2, t3; 

    First() {
        t1 = new TextField();
        t1.setBounds(50, 80, 150, 30); 
        t2 = new TextField();
        t2.setBounds(50, 120, 150, 30);
        t3 = new TextField();
        t3.setBounds(50, 160, 150, 30);
        add(t1);
        add(t2);
        add(t3);

        Button b = new Button("Add");
        b.setBounds(50, 200, 100, 30);
        add(b);
		Button b1 = new Button("Subtract");
        b1.setBounds(150, 200, 100, 30);
        add(b1);
		b.addActionListener(this);
		b1.addActionListener(this);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        addWindowListener(new MyClass());
    }

    public void actionPerformed(ActionEvent ae) { 
        String s1 = t1.getText();
        String s2 = t2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
		int result;
		String str=ae.getActionCommand();
        if (str.equals("Add")) {
            result = a + b;
        } else {
            result = a - b;
        }
		String resultStr = String.valueOf(result);
        t3.setText(resultStr);
    }
}

public class que3 {
    public static void main(String args[]) {
        First f = new First();
        f.setTitle("Addition and subtraction");
        f.setResizable(true); 
    }
}
