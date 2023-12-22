package com.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Main {

	private JFrame frame;
	private JTextField text;
	private JTextField text2;
	private JComboBox mail;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("전자우편 주소 결정");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getText());
		frame.getContentPane().add(getText2());
		frame.getContentPane().add(getMail());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
	}

	private JTextField getText() {
		if (text == null) {
			text = new JTextField();
			text.setBounds(76, 63, 91, 26);
			text.setColumns(10);
		}
		return text;
	}
	private JTextField getText2() {
		if (text2 == null) {
			text2 = new JTextField();
			text2.setBounds(197, 63, 101, 26);
			text2.setColumns(10);
		}
		return text2;
	}
	private JComboBox getMail() {
		if (mail == null) {
			mail = new JComboBox();
			mail.setModel(new DefaultComboBoxModel(new String[] {"naver.com", "daum.net", "gmail.com", "icloud.com", ""}));
			mail.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addAction();
					
				}
			});
			mail.setBounds(310, 64, 119, 27);
		}
		return mail;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Email주소:");
			lblNewLabel.setBounds(19, 68, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("@");
			lblNewLabel_1.setBounds(174, 68, 27, 16);
		}
		return lblNewLabel_1;
	}
	public void addAction() {
		mail.getSelectedItem().toString();
		text2.setText(mail);
		
	}
}
