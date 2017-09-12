package com.goofans.watchingyoutube.easyxml;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.File;

import javax.print.DocFlavor.URL;
import javax.swing.DropMode;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class NewXSL extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtF;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewXSL frame = new NewXSL();
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
	public NewXSL() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NewXSL.class.getResource("/com/goofans/watchingyoutube/easyxml/icon/xsl_uwT_icon.ico")));
		setTitle("New XSL");
		setBounds(100, 100, 455, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewXsl = new JLabel("New XSL");
		lblNewXsl.setFont(new Font("Arial Black", Font.PLAIN, 24));
		lblNewXsl.setBounds(5, 5, 429, 52);
		lblNewXsl.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewXsl);
		
		JLabel lblFileToMerge = new JLabel("File to merge with");
		lblFileToMerge.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblFileToMerge.setBounds(5, 99, 238, 27);
		contentPane.add(lblFileToMerge);
		
		JFileChooser fileChooser = new JFileChooser();
		
		fileChooser.setBounds(5000, 157, 582, 397);
		contentPane.add(fileChooser);
		
		JButton btnChoose = new JButton("Choose");
		btnChoose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileNameExtensionFilter filter = new FileNameExtensionFilter(
			"XML Files",	"xml");
		fileChooser.setFileFilter(filter);
		fileChooser.setCurrentDirectory(null);
		int returnVal = fileChooser.showOpenDialog(null);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			System.out.println("File opened: " + fileChooser.getSelectedFile());
			File filetext = (fileChooser.getSelectedFile());
			textField.setText("" + filetext);
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
						txtF.setText(sCurrentLine);
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
		btnChoose.setBounds(15, 137, 89, 23);
		contentPane.add(btnChoose);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(114, 137, 110, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Reload XML");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
						txtF.setText(sCurrentLine);
					}
					} catch (IOException e) {
						e.printStackTrace();
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
		btnNewButton.setBounds(292, 137, 135, 67);
		contentPane.add(btnNewButton);
		
		txtF = new JTextField();
		txtF.setBounds(287, 215, 142, 218);
		contentPane.add(txtF);
		txtF.setColumns(10);
		
		JLabel lblLinesToMerge = new JLabel("Line(s) to merge");
		lblLinesToMerge.setBounds(5, 190, 99, 14);
		contentPane.add(lblLinesToMerge);
		
		textField_1 = new JTextField();
		textField_1.setBounds(114, 174, 168, 43);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnGenerateXsl = new JButton("Generate XSL");
		btnGenerateXsl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					File folder = new File(FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "\\EasyXSL");
					if (!folder.exists()) {
						boolean result = false;
						
						try{
							folder.mkdir();
							result = true;
						}catch(SecurityException el) {
							
						}if(result) {
							
						}
					}
					
					File xslfinal = new File(folder + "\\" + textField.getText().substring(textField.getText().lastIndexOf('\\')+ 1) + ".xsl");
					System.out.println("" + xslfinal);
					
					if (xslfinal.createNewFile()) {
						System.out.println("XSL created");
					}else{
						System.out.println("XSL already created");
					}
					
					FileWriter writer = new FileWriter(xslfinal);
					writer.write("<xsl:transform version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\">\r\n" + 
							"\r\n" + 
							" <!-- Copy everything not matched by another rule -->\r\n" + 
							" <xsl:template match=\"* | comment()\">\r\n" + 
							"  <xsl:copy>\r\n" + 
							"   <xsl:copy-of select=\"@*\"/>\r\n" + 
							"   <xsl:apply-templates/>\r\n" + 
							"  </xsl:copy>\r\n" + 
							" </xsl:template>\r\n" + 
							"\r\n" + 
							" <!-- Append our strings to the end -->\r\n" + 
							" <xsl:template match=" + textField_2.getText() + ">\r\n" + 
							"  <xsl:copy>\r\n" + 
							"   <xsl:copy-of select=\"@*\"/>\r\n" + 
							"   <xsl:apply-templates/>\r\n" + 
							"\r\n" + 
							textField_1.getText() + "    \r\n" + 
							"\r\n" + 
							"  </xsl:copy>\r\n" + 
							"\r\n" + 
							" </xsl:template>\r\n" + 
							"</xsl:transform>");
					writer.close();
					System.out.println(writer);
					int yesorno1 = JOptionPane.showOptionDialog(btnGenerateXsl, "Your XSL file has been created, Would you like to open it?", "XSL created", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
					if(yesorno1==0) {
						try{
							Runtime.getRuntime().exec("explorer.exe /select," + xslfinal);
						}catch(Exception el) {
							
						}finally {
							
						}
					}
					
				}catch (Exception el) {
					
				}finally {
					
				}
			}
		});
		
		btnGenerateXsl.setBounds(5, 393, 238, 23);
		contentPane.add(btnGenerateXsl);
		
		JLabel lblWhatToMatch = new JLabel("What to match with");
		lblWhatToMatch.setBounds(5, 232, 110, 27);
		contentPane.add(lblWhatToMatch);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(114, 228, 168, 23);
		contentPane.add(textField_2);
		
		
	}
}
