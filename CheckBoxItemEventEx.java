import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxItemEventEx extends JFrame{
private JCheckBox [] frutis = new JCheckBox[3];
private String [] names ={"Apple","Pear","banana"};

private JLabel sumLabel;

public CheckBoxItemEventEx(){
setTitle("Check Box ItemEvent Ex");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c = getContentPane();
c.setLayout(new FlowLayout());

c.add(new JLabel("Apple 100won","Pear 500won","Banana 2000won"));

MyItemLister listerne=new MyItemListerner();
for(int i=0; i<fruits.length; i++){
	fruits[i]=new JCheckBox(name[i]);
	fruits[i].setBorderPainted(true);
	c.add(fruits[i]);
	fruits[i].addItemListener(listener);

}

sumLabel=new JLabel("im groots");
c.add(sumLabel);
setsize(300,250);
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
else(e.getItem() == fruits[1])
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
