package fixed;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class projectpage extends masterpage{
	private JPanel invipanel3;
	private JLabel me,bgpic;
	private JButton back2;
	
	//This is the constructor method for the projectpage class.
	projectpage(){
		
		//These lines set the title of the frame and create a new JPanel object named invipanel3 and set it as the content pane of the frame.
		setTitle("Projects");
		invipanel3 = new JPanel(); 
		setContentPane(invipanel3);
		
		//These lines create an ImageIcon and set it as the icon image for the frame.
		ImageIcon karlpixl = new ImageIcon("pixlkarl.png");	
		setIconImage(karlpixl.getImage());
		
		//These lines create an ImageIcon and set it as the icon for the bgpic JLabel.
		ImageIcon bg = new ImageIcon("firstbg (1).jpg");
		bgpic = new JLabel();
		bgpic.setSize(600, 600);
		bgpic.setIcon(bg);
	
		//These lines create an ImageIcon and set it as the icon for the me JLabel.
		ImageIcon myprojs = new ImageIcon("projects (1).jpg");
		me = new JLabel();
		me.setIcon(myprojs);
		me.setBounds(45,-15,600,600);
		
		//These lines create a JButton with the label "Back" and configure its appearance.
		back2 = new JButton("Back");
		back2.setBounds(370, 515, 200, 35);
		back2.setFont(new Font("Agency FB",Font.BOLD,20));
		back2.setForeground(new Color(0x2A0001));
		back2.setFocusable(false);
		back2.setBackground(Color.white);
		back2.setBorder(BorderFactory.createEtchedBorder());
		back2.addActionListener(new ActionListener(){
			//An action listener is added to handle button clicks, which disposes of the current frame and opens a new instance of masterpage.
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				new masterpage();
				
			}
			});
		
		//These lines add the back2 button, me label, and bgpic label to the invipanel3. 
		invipanel3.add(back2);
		invipanel3.add(me);
		invipanel3.setLayout(null);
		invipanel3.add(bgpic);
	
	
	
	}
	}