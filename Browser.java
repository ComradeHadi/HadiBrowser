package Java_Networking;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.IOException;
import java.net.*;
import javax.swing.event.*;

import java.util.*;

class Browser extends JFrame{
	public JTextField urlAddress;
	public JEditorPane screens;
	public Icon urlBoxBackground;
	public  Icon BodyBackground;
	public JLabel hadi;
	
	
	public Browser(){
		super("Hadi's Browser");
		urlBoxBackground = new ImageIcon(getClass().getResource("urlBox.png"));
		BodyBackground = new ImageIcon(getClass().getResource("body.png"));
		urlAddress = new JTextField("Please Enter url here");
		hadi = new JLabel(BodyBackground);
		
		
		urlAddress.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						loadPage(e.getActionCommand());
					}

					
				}
				);
		add(urlAddress, BorderLayout.NORTH);
		
		screens = new JEditorPane();
		try {
			screens.setPage(BodyBackground.toString());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		screens.setEditable(false);
		screens.addHyperlinkListener(
				new HyperlinkListener(){
					public void hyperlinkUpdate(HyperlinkEvent e){
						if (e.getEventType()==HyperlinkEvent.EventType.ACTIVATED){
						loadPage(e.getURL().toString());
						}
					}

					
				}
				
				);
		add(new JScrollPane(screens), BorderLayout.CENTER);
		//add(hadi);
		setSize(500,300);
		setVisible(true);
	}

	/**
	 * @param args
	 */
	private void loadPage(String actionCommand) {
		// TODO Auto-generated method stub
		try{
			screens.setPage(actionCommand);
			urlAddress.setText(actionCommand);
			
		}
		catch(Exception e){
			System.out.println("C-R-A-P !");
		}
		
		
	}

}
