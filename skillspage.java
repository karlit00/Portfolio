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

public class skillspage extends masterpage{
	private JPanel invipanel4;
	private JLabel me,bgpic,skill;
	private JButton back3;
	
	//This is the constructor method for the skillspage class.
	skillspage(){
		
		//These lines set the title of the frame and create a new JPanel object named invipanel4 and set it as the content pane of the frame.
		setTitle("Skills");
		invipanel4 = new JPanel(); 
		setContentPane(invipanel4);
		
		//These lines create an ImageIcon and set it as the icon for the bgpic JLabel. 
		ImageIcon bg = new ImageIcon("firstbg (1).jpg");
		bgpic = new JLabel();
		bgpic.setSize(600, 600);
		bgpic.setIcon(bg);
		
		//These lines create an ImageIcon and set it as the icon image for the frame.
		ImageIcon karlpixl = new ImageIcon("pixlkarl.png");	
		setIconImage(karlpixl.getImage());
		
		//These lines create an ImageIcon and set it as the icon for the skill JLabel.
		ImageIcon myskills = new ImageIcon("skills.png");
		skill = new JLabel();
		skill.setIcon(myskills);
		skill.setBounds(45,30,500,500);
		
		//These lines create a JButton with the label "Back" and configure its appearance.
		back3 = new JButton("Back");
		back3.setBounds(380, 510, 200, 35);
		back3.setFont(new Font("Agency FB",Font.BOLD,20));
		back3.setForeground(Color.white);
		back3.setFocusable(false);
		back3.setBackground(new Color(0x2A0001));
		back3.setBorder(BorderFactory.createEtchedBorder());
		back3.addActionListener(new ActionListener(){
			//An action listener is added to handle button clicks, which disposes of the current frame and opens a new instance of masterpage.
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				new masterpage();
				
			}
			});
		
		//These lines add the back3 button, skill label, and bgpic label to the invipanel4.
		invipanel4.add(back3);
		invipanel4.add(skill);
		invipanel4.setLayout(null);
		invipanel4.add(bgpic);
	
	}
	}
		