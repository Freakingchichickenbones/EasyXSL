package com.goofans.watchingyoutube.easyxml;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JToolBar;
import javax.swing.JSeparator;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class EasyXSL {

	private JFrame frmEasyXsl;
	private JTextField textField;
	private final JButton btnNewButton = new JButton("New XSL");


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EasyXSL window = new EasyXSL();
					window.frmEasyXsl.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EasyXSL() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEasyXsl = new JFrame();
		frmEasyXsl.setIconImage(Toolkit.getDefaultToolkit().getImage(EasyXSL.class.getResource("/com/goofans/watchingyoutube/easyxml/icon/xsl_uwT_icon.ico")));
		frmEasyXsl.setTitle("Easy XSL");
		frmEasyXsl.setBounds(100, 100, 598, 483);
		frmEasyXsl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEasyXsl.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		textField.setEditable(false);
		
		textField.setBounds(10, 52, 293, 381);
		frmEasyXsl.getContentPane().add(textField);
		textField.setColumns(10);
		btnNewButton.setBounds(467, 52, 105, 91);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					NewXSL aboutopen=new NewXSL();
					aboutopen.setVisible(true);
				} catch (Exception el) {
					
				} finally {
					
				}
			}
			}
		);
		frmEasyXsl.getContentPane().add(btnNewButton);
		
		JButton btnEditAnXsl = new JButton("Edit XML");
		btnEditAnXsl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
						EditXSL aboutopen=new EditXSL();
						aboutopen.setVisible(true);
					} catch (Exception el) {
						
					} finally {
						
					}
				}
			}
		);
		
		btnEditAnXsl.setBounds(467, 154, 105, 91);
		btnEditAnXsl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmEasyXsl.getContentPane().add(btnEditAnXsl);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setBounds(0, 0, 582, 41);
		frmEasyXsl.getContentPane().add(toolBar);
		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					About aboutopen=new About();
					aboutopen.setVisible(true);
				} catch (Exception el) {
					
				} finally {
					
				}
			}
		});
		toolBar.add(btnAbout);
	
	}
}
