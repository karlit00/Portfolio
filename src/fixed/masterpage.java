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

public class masterpage extends JFrame {
	private JFrame frame;
	private JPanel menu,invipanel;
	private JButton aboutme,projects,skills,exit;
	private JLabel bgpic;
	
	//This is the constructor method for the masterpage class.
	public masterpage(){
		
		//These lines set various properties of the JFrame object (this).
		setTitle("miPortfolio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//These lines create a new JPanel object named invipanel and set it as the content pane of the frame.
		invipanel = new JPanel();
		setContentPane(invipanel);
		
		//These lines create an ImageIcon and set it as the icon image for the frame.
		ImageIcon karlpixl = new ImageIcon("pixlkarl.png");
		setIconImage(karlpixl.getImage());
		
		//These lines create an ImageIcon and set it as the icon for the bgpic JLabel.
		ImageIcon bg = new ImageIcon("firstbg (1).jpg");
		bgpic = new JLabel();
		bgpic.setSize(600, 600);
		bgpic.setIcon(bg);
		
		//These lines create a JButton with the label "About me" and configure its appearance. 
		aboutme = new JButton("About me");
		aboutme.setBounds(10, 80, 200, 35);
		aboutme.setFont(new Font("Agency FB",Font.BOLD,20));
		aboutme.setForeground(Color.white);
		aboutme.setFocusable(false);
		aboutme.setBackground(new Color(0x010A14));
		aboutme.setBorder(BorderFactory.createEtchedBorder());
		aboutme.addActionListener(new ActionListener(){
			//An action listener is added to handle button clicks, which opens an instance of aboutmepage and disposes of the current frame.
		public void actionPerformed(ActionEvent e) {
			
			aboutmepage abtme = new aboutmepage();
			abtme.setVisible(true);
			dispose();
			
		}
		});
		
		
		//These lines create a JButton with the label "Projects" and configure its appearance. 
		projects = new JButton("Projects");
		projects.setBounds(230, 80, 200, 35);
		projects.setFont(new Font("Agency FB",Font.BOLD,20));
		projects.setForeground(Color.white);
		projects.setFocusable(false);
		projects.setBackground(new Color(0x010A14));
		projects.setBorder(BorderFactory.createEtchedBorder());
		projects.addActionListener(new ActionListener(){
			//An action listener is added to handle button clicks, which opens an instance of projectpage and disposes of the current frame.
			public void actionPerformed(ActionEvent e) {
				
				projectpage proj = new projectpage();
				proj.setVisible(true);
				dispose();
				
			}
			});
		//These lines create a JButton with the label "Skills" and configure its appearance. 
		skills = new JButton("Skills");
		skills.setBounds(10, 120, 200, 35);
		skills.setFont(new Font("Agency FB",Font.BOLD,20));
		skills.setForeground(Color.white);
		skills.setFocusable(false);
		skills.setBackground(new Color(0x010A14));
		skills.setBorder(BorderFactory.createEtchedBorder());
		skills.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				skillspage skills = new skillspage();
				skills.setVisible(true);
				dispose();
				
			}
			});
			
		//These lines create a JButton with the label "Exit" and configure its appearance. 
		exit = new JButton("Exit");
		exit.setBounds(230, 120, 200, 35);
		exit.setFont(new Font("Agency FB",Font.BOLD,20));
		exit.setForeground(Color.white);
		exit.setFocusable(false);
		exit.setBackground(new Color(0x2A0001));
		exit.setBorder(BorderFactory.createEtchedBorder());
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				new welcomepage();
				dispose();
				
			}
			});
			
		//These lines create a JPanel object named menu and configure its properties. 
		menu = new JPanel();
		menu.setBounds(75, 180, 440, 250);
		menu.setLayout(null);
		menu.setBackground(Color.white);
		menu.add(aboutme);
		menu.add(projects);
		menu.add(skills);
		menu.add(exit);
		
		//These lines add the menu panel to the invipanel, set its layout to null layout, and add the bgpic label to the invipanel.
		invipanel.add(menu);
		invipanel.setLayout(null);
		invipanel.add(bgpic);
		
		
		
}
	
}
