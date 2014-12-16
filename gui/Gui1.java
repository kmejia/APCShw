import javax.swing.*;
import java.awt.*;
public class Gui1 extends JFrame  {
    
    private Container pane;
    private Jbutton b1,b2;
    public Gui1(){
	setTitle("My First Gui");
	setSize(600,400);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = getContentPane();
	pane = setLayout(new GridLayout(3,3));
	b1 = new Jbutton("button");
	pane.add(b1);
	b2 = new Jbutton("exit");
	pane.add(b2);
	   
	pane.add(new Jbutton("hello1"));
	pane.add(new Jbutton("hello2"));
	pane.add(new Jbutton("hello3"));
	JFrame f2 = new Jpanel();
	text = new JtextArea();
	text.setColumns(40);
	text.setRows(10);
	text.setBotder(BorderFactory.createLineBorder(Color.blue,2));
	pane.add(text);

	
    }
    public static void main(String[] args) {
	Gui1 f = new Gui1();
	f.setVisible(true);
	
    }
}
