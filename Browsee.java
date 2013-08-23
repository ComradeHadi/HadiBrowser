package Java_Networking;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import javax.swing.event.*;

import java.util.*;


public class Browsee {
    public Icon BodyBackgrounds;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser intelliBee = new Browser();
		
		///intelliBee.setIconImage(BodyBackgrounds);
		intelliBee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		intelliBee.setSize(500, 300);
		intelliBee.setVisible(true);
		

	}

}
