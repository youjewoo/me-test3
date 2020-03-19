import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxItemEventEx extends JFrame{
private JCheckBox [] fruits = new JCheckBox[3];
private String [] names ={"Apple","Pear","banana"};

private JLabel sumLabel;

public CheckBoxItemEventEx(){
setTitle("Check Box ItemEvent Ex");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c = getContentPane();
c.setLayout(new FlowLayout());

c.add(new JLabel("Apple 100won, Pear 500won, Banana 2000won"));

MyItemListener listener=new MyItemListener();
for(int i=0; i<fruits.length; i++){
	fruits[i]=new JCheckBox(names[i]);
	fruits[i].setBorderPainted(true);
	c.add(fruits[i]);
	fruits[i].addItemListener(listener);

}

sumLabel=new JLabel("im groots");
c.add(sumLabel);
setSize(300,250);
setVisible(true);
}
class MyItemListener implements ItemListener{
private int sum=0;

public void itemStateChanged(ItemEvent e){
if(e.getStateChange() == ItemEvent.SELECTED){
	if(e.getItem() == fruits[0])
		sum += 100;
	else if(e.getItem() == fruits[1])
		sum += 500;
	else
		sum += 2000;

	

}
else {
if(e.getItem() == fruits[0])
	sum -= 100;
else if(e.getItem() == fruits[1])
	sum -= 500;
else
	sum -= 2000;
}
sumLabel.setText("someTimes"+sum+"won.");
		}
}
public static void main(String [] args){
	new CheckBoxItemEventEx();

	}

}
