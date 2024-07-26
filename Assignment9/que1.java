/*Write a java program to creates three push buttons showing three different colors as their label. When a button is clicked, that particular color is set as background color in the frame*/
import java.awt.*;
import java.awt.event.*;
class MyClass extends WindowAdapter
{
	public void windowClosing(WindowEvent e) 
	{
		System.exit(0);
	}
}
class First extends Frame implements ActionListener
{
	First()
	{
		Button red = new Button("Red");
		red.setBounds(400,180,70,30);
		add(red);
		Button blue = new Button("Blue");
		blue.setBounds(400,120,70,30);
		add(blue);
		Button green = new Button("Green");
		green.setBounds(400,60,70,30);
		add(green);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		addWindowListener(new MyClass());
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("Red")) 
		{
			this.setBackground(Color.red);
		}
		else if(str.equals("Blue")) 
		{
			this.setBackground(Color.blue);
		}
		else 
		{
			this.setBackground(Color.green);
		}
	}
}
class que1
{
	public static void main(String args[])
	{
		First f = new First();
		f.setTitle("Color");
	}
}

		