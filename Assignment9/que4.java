/*Write a java awt program, which will create 2 text field and one button labelled as Factorial. The user will enter a number in the 1st text field and upon pressing the button it will display the Factorial of the number in the 2nd text field.*/
import java.awt.*;
import java.awt.event.*;

class MyClass extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

class First extends Frame implements ActionListener {
    TextField t1, t2;
	First() {
        t1 = new TextField();
        t1.setBounds(50, 80, 150, 30);
		add(t1);
		Button b = new Button("Factorial");
        b.setBounds(50, 120, 150, 30);
        add(b);
        t2 = new TextField();
        t2.setBounds(50, 180, 150, 30);
		add(t2);
		b.addActionListener(this);
		setSize(300, 300);
        setLayout(null);
        setVisible(true);
        addWindowListener(new MyClass());
	}
	public void actionPerformed(ActionEvent ae) { 
        String s1 = t1.getText();
        int a = Integer.parseInt(s1);
        int f = 1;
		for (int i = 1; i <= a; i++) {
            f =f * i;
        }
		String result = String.valueOf(f);
        t2.setText(result);
	}
}
public class que4 {
    public static void main(String args[]) {
        First f = new First();
        f.setTitle("Factorial");
        f.setResizable(true); 
    }
}