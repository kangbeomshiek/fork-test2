package com.base;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.Util.Share;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserRegistration extends JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JTextField tfUserid;
	private JLabel lblPassword;
	private JPasswordField pfPassword;
	private JLabel lblName;
	private JTextField tfName;
	private JButton btnOK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRegistration dialog = new UserRegistration();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public UserRegistration() {
		setTitle("사용자 등록 화면");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getTfUserid());
		getContentPane().add(getLblPassword());
		getContentPane().add(getPfPassword());
		getContentPane().add(getLblName());
		getContentPane().add(getTfName());
		getContentPane().add(getBtnOK());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("User id:");
			lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel.setBounds(93, 39, 90, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfUserid() {
		if (tfUserid == null) {
			tfUserid = new JTextField();
			tfUserid.setBounds(195, 34, 130, 26);
			tfUserid.setColumns(10);
		}
		return tfUserid;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password :");
			lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
			lblPassword.setBounds(93, 71, 90, 16);
		}
		return lblPassword;
	}
	private JPasswordField getPfPassword() {
		if (pfPassword == null) {
			pfPassword = new JPasswordField();
			pfPassword.setBounds(205, 72, 109, 26);
		}
		return pfPassword;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name :");
			lblName.setHorizontalAlignment(SwingConstants.TRAILING);
			lblName.setBounds(93, 111, 90, 16);
		}
		return lblName;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(195, 110, 130, 26);
		}
		return tfName;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					okAction();
					
				}
			});
			btnOK.setBounds(162, 167, 117, 29);
		}
		return btnOK;
	}
	
	
	//----function-----
	
	private void okAction() {
		Share.userid = tfUserid.getText();
		Share.name = tfName.getText();
		
		
		char [] pass = pfPassword.getPassword();
		String passString = new String(pass);
		Share.password = passString;
//		Share.password = new String(pass);
		
		//화면 정리
//	   dispose();
	   Main main = new Main();
//	    main.();
	   
	   Main window = new Main();
		window.main(null);
		this.str
//		this.
		
	}
	
	
	
	
}
