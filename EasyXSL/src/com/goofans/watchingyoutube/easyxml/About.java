package com.goofans.watchingyoutube.easyxml;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class About extends JFrame {

	private JFrame frmAbout;
	private JPanel contentPane;
	private JTextField txtAbout;
	private JTextField txtHttpsdiscordggzazhhhp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public About() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("/com/goofans/watchingyoutube/easyxml/icon/xsl_uwT_icon.ico")));
		setTitle("About");
		setBounds(100, 100, 515, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAbout = new JTextField();
		txtAbout.setBounds(5, 5, 678, 79);
		txtAbout.setFont(new Font("Arial Black", Font.PLAIN, 51));
		txtAbout.setEditable(false);
		txtAbout.setText("About");
		contentPane.add(txtAbout);
		txtAbout.setColumns(10);
		
		JLabel lblGoofans = new JLabel("Created By \"Watching Youtube\"");
		lblGoofans.setBounds(163, 95, 212, 22);
		lblGoofans.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblGoofans);
		
		JLabel lblCreatedInEclipse = new JLabel("Created in Eclipse Neon using Window Builder ");
		lblCreatedInEclipse.setBounds(109, 259, 351, 46);
		contentPane.add(lblCreatedInEclipse);
		
		JLabel lblGoofansDiscord = new JLabel("Goofans Discord:");
		lblGoofansDiscord.setBounds(36, 152, 110, 14);
		contentPane.add(lblGoofansDiscord);
		
		txtHttpsdiscordggzazhhhp = new JTextField();
		txtHttpsdiscordggzazhhhp.setEditable(false);
		txtHttpsdiscordggzazhhhp.setText("https://discord.gg/zazHHHP");
		txtHttpsdiscordggzazhhhp.setBounds(132, 149, 169, 20);
		contentPane.add(txtHttpsdiscordggzazhhhp);
		txtHttpsdiscordggzazhhhp.setColumns(10);
	}
}
