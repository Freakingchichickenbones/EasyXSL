package com.goofans.watchingyoutube.easyxml;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JOptionPane;

public class EditXSL extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	/**
	 * @wbp.nonvisual location=554,289
	 */
	private final JFileChooser fileChooser = new JFileChooser();
	private JButton btnSave;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditXSL frame = new EditXSL();
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
	public EditXSL() {
		setTitle("Edit XSL");
		setBounds(100, 100, 450, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnChoose = new JButton("Choose");
		btnChoose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					try {
						FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"XML Files",	"xml");
			fileChooser.setFileFilter(filter);
			fileChooser.setCurrentDirectory(null);
			int returnVal = fileChooser.showOpenDialog(null);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				System.out.println("File opened: " + fileChooser.getSelectedFile());
				File filetext = (fileChooser.getSelectedFile());
				textField_1.setText("" + filetext);
			}
					}catch(Exception el) {
						
					} finally {
						
					}
					try {
						File FILENAME = fileChooser.getSelectedFile();
						BufferedReader br = null;
						FileReader fr = null;
						
						try {
						
						fr = new FileReader(FILENAME);
						br = new BufferedReader(fr);
						
						String sCurrentLine;
						
						while ((sCurrentLine = br.readLine()) != null) {
							System.out.println(sCurrentLine);
							textField.setText(sCurrentLine);
						}
						} catch (IOException el) {
							el.printStackTrace();
						} finally {
							try {
								if (br != null)
									br.close();
								
								if (fr != null)
									fr.close();
							} catch (IOException ex) {
								
							}
						}
					}catch (Exception el) {
						
					}finally {
						
					}
				}
			
		});
		btnChoose.setBounds(10, 11, 89, 23);
		contentPane.add(btnChoose);
		
		textField = new JTextField();
		
		textField.setBounds(10, 66, 414, 298);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					FileWriter fstream = new FileWriter(fileChooser.getSelectedFile(),true);
					BufferedWriter out = new BufferedWriter(fstream);
					out.write(textField.getText());
					out.close();
					int yesorno1 = JOptionPane.showOptionDialog(btnSave, "Your XSL file has been saved, Would you like to open it?", "XSL created", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
					if(yesorno1==0) {
						try{
							Runtime.getRuntime().exec("explorer.exe /select," + fileChooser.getSelectedFile());
						}catch(Exception el) {
							
						}finally {
							
						}
					}
				}catch (Exception el){
					System.err.println("Error: " + el.getMessage());
				}
			}
		});
		btnSave.setBounds(20, 375, 89, 23);
		contentPane.add(btnSave);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 12, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
