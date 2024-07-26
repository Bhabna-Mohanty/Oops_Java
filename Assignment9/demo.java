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
		red.setBounds(40,180,70,30);
		add(red);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		red.addActionListener(this);
		/*blue.addActionListener();
		green.addActionListener();*/
		addWindowListener(new MyClass());
	}
	public void paint(Graphics g)
	{
		this.setBackground(Color.yellow);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("Red")) 
		{
			this.setBackground(Color.red);
		}
	}
}
class demo
{
	public static void main(String args[])
	{
		First f = new First();
		f.setTitle("Color");
	}
}