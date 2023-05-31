package fixed;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class welcomepage extends JFrame implements ActionListener{
	
	private JPanel middle;
	private JButton enter;
	private JLabel bgpic,credit,me,opensign;
	private ImageIcon karlpixl;
	private JTextArea contacts;
	
	//This is the constructor method for the welcomepage class.
	welcomepage(){
		
		
	//These lines create an ImageIcon and set it as the icon for the bgpic JLabel. The bgpic label is then sized and given the image icon.
	ImageIcon bg = new ImageIcon("firstbg (1).jpg");
	bgpic = new JLabel();
	bgpic.setSize(600, 600);
	bgpic.setIcon(bg);
	
	//These lines create an ImageIcon and set it as the icon for the me JLabel. The me label is then positioned and sized on the frame.
	karlpixl = new ImageIcon("pixlkarl.png");
	me = new JLabel();
	me.setIcon(karlpixl);
	me.setBounds(350,230,400,400);
	
	//These lines create a JLabel with the text "Karl's Portfolio" and set its font, foreground color, and position on the frame.
	opensign = new JLabel("Karl's Portfolio");
	opensign.setFont(new Font("Agency FB",Font.BOLD,40));
	opensign.setForeground(new Color(0x2A0001));
	opensign.setBounds(45, 50, 250, 70);
	
	//These lines create a JTextArea component and configure its appearance and content. 
	//It is set to display contact information and styled with specific colors, font, and size.
	contacts = new JTextArea();
	contacts.setForeground(new Color(0x2A0001));
	contacts.setOpaque(true);
	contacts.setTabSize(5);
	contacts.setBackground(Color.WHITE);
	contacts.setBounds(45, 130, 200, 90);
	contacts.setEditable(false);
	contacts.setFont(new Font("Agency FB",Font.BOLD,12));
	contacts.setText("Contact me:\nemail: kgabutero.18@gmail.com\nuniv email: gabuterokg@students.national-u.edu.ph"
			+ "\nphone: 09277278139\ngithub: https://github.com/karlit00");
	
	//These lines create a JButton with the label "Open" and configure its appearance. It is positioned and styled with specific font, colors, and border.
	enter = new JButton("Open");
	enter.setBounds(50, 240, 200, 35);
	enter.setFont(new Font("Agency FB",Font.BOLD,20));
	enter.setForeground(Color.white);
	enter.setFocusable(false);
	enter.setBackground(new Color(0x010A14));
	enter.setBorder(BorderFactory.createEtchedBorder());
	enter.addActionListener(this);
	
	//These lines create a JLabel with the text "Created by Karl Gabutero" and configure its appearance. 
	//It is positioned and styled with a specific font and color.
	credit = new JLabel("Created by Karl Gabutero");
	credit.setFont(new Font("Agency FB",Font.BOLD,12));
	credit.setBounds(100, 285, 100, 20);
	credit.setForeground(Color.gray);
	
	//These lines create a JPanel named middle and configure its properties.
	middle = new JPanel();
	middle.setBounds(75, 135, 300, 320);
	middle.setLayout(null);
	middle.setBackground(Color.white);
	middle.add(enter);
	middle.add(credit);
	middle.add(opensign);
	middle.add(contacts);
	
	//These lines get the content pane of the JFrame and configure its layout. T
	Container contain = this.getContentPane();
	contain.setLayout(null);
	contain.add(middle);
	contain.add(me);
		
	//These lines configure various properties of the JFrame object (this). 
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("miPortfolio");
	this.setSize(600,600);
	this.setVisible(true);
	this.setResizable(false);
	this.setLayout(null);
	this.setLocationRelativeTo(null);
	this.setIconImage(karlpixl.getImage());
	this.add(bgpic);
	
	}
	
	//This method is an implementation of the actionPerformed method from the ActionListener interface. It is invoked when the "Open" button is clicked.
	//It disposes the current frame (welcomepage) and creates a new instance of the masterpage class.
public void actionPerformed(ActionEvent e) {
    	
    	this.dispose();
    	new masterpage();
		
		
}}