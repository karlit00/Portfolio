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

public class aboutmepage extends masterpage{
	private JPanel aboutmepanel,invipanel2;
	private JLabel title1,bgpic,formal;
	private JTextArea details;
	private JButton back;
	
	//This is the constructor method for the aboutmepage class.
	aboutmepage(){
		
		//These lines set the title of the frame and create a new JPanel object named invipanel2 and set it as the content pane of the frame.
		setTitle("About Me");
		invipanel2 = new JPanel(); 
		setContentPane(invipanel2);
		
		//These lines create an ImageIcon and set it as the icon image for the frame.
		ImageIcon karlpixl = new ImageIcon("pixlkarl.png");	
		setIconImage(karlpixl.getImage());
		
		//These lines create an ImageIcon and set it as the icon for the formal JLabel.
		ImageIcon formalpic = new ImageIcon("formal.jpg");
		formal = new JLabel();
		formal.setIcon(formalpic);
		formal.setBounds(450,200,75,75);
		
		//These lines create an ImageIcon and set it as the icon for the bgpic JLabel. 
		ImageIcon bg = new ImageIcon("firstbg (1).jpg");
		bgpic = new JLabel();
		bgpic.setSize(600, 600);
		bgpic.setIcon(bg);
		
		//These lines create a JLabel with the text "About me" and configure its appearance. 
		title1 = new JLabel("About me");
		title1.setFont(new Font("Agency FB",Font.BOLD,35));
		title1.setForeground(new Color(0x010A14));
		title1.setBounds(20, -5, 250, 70);
		
		//These lines create a JTextArea named details and configure its properties. 
		details = new JTextArea();
		details.setForeground(Color.black);
		details.setOpaque(true);
		details.setTabSize(5);
		details.setBackground(Color.white);
		details.setBounds(20, 70, 400, 250);
		details.setEditable(false);
		details.setFont(new Font("Arial",Font.BOLD,13));
		details.setText("Name:   Gabutero, Karl Christian G.\nDate of Birth: December 26,2003\nPlace of Birth: Pasig City, NCR\n"
				+ "Hobbies: Basketball, Valorant, Guitar"
				+ "\n\n"
				+ "Education Background:\nElementary: Child Jesus of Prague School\nHigh School: Regional Lead School for the "
				+ "Arts in Angono\nSenior High School: Jose Rizal University (ABM)\nCollege: National University\n\n"
				+ "Strengths: Written"
				+ " Communication\n\t\tTeam-oriented\nWeaknesses: Pressure Handling\n\t\tOral Communication");
			
		//These lines create a JButton with the label "Back" and configure its appearance. 
		back = new JButton("Back");
		back.setBounds(290, 325, 200, 35);
		back.setFont(new Font("Agency FB",Font.BOLD,20));
		back.setForeground(Color.white);
		back.setFocusable(false);
		back.setBackground(new Color(0x2A0001));
		back.setBorder(BorderFactory.createEtchedBorder());
		back.addActionListener(new ActionListener(){
			//An action listener is added to handle button clicks, which disposes of the current frame and opens a new instance of masterpage.
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				new masterpage();
				
			}
			});
		
		//These lines create a JPanel object named aboutmepanel and configure its properties.
		aboutmepanel = new JPanel();
		aboutmepanel.setBounds(45, 180, 500, 370);
		aboutmepanel.setLayout(null);
		aboutmepanel.setBackground(Color.white);
		aboutmepanel.add(title1);
		aboutmepanel.add(details);
		aboutmepanel.add(back);
		
		//These lines add the formal label, aboutmepanel, and bgpic label to the invipanel2.
		//The layout of invipanel2 is set to null layout.
		invipanel2.add(formal);
		invipanel2.add(aboutmepanel);
		invipanel2.setLayout(null);
		invipanel2.add(bgpic);
		
		
		
	}
	
	
}
