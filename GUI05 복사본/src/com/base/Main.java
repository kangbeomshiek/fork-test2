package com.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmMenu;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenu mnNewMenu_1;
	private JMenuItem menuAddition;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JSeparator separator;
	private JTextField tfnum1;
	private JTextField tfnum2;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmMenu.setVisible(true);
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
		frmMenu = new JFrame();
		frmMenu.setTitle("Menu");
		frmMenu.setBounds(100, 100, 450, 300);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.setJMenuBar(getMenuBar());
		frmMenu.getContentPane().setLayout(null);
		frmMenu.getContentPane().add(getTfnum1());
		frmMenu.getContentPane().add(getTfnum2());
		frmMenu.getContentPane().add(getTfResult());
	}

	private JMenuBar getMenuBar() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBackground(new Color(252, 255, 255));
			menuBar.setForeground(new Color(0, 0, 0));
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnNewMenu_1());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("File");
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_1());
			mnNewMenu.add(getMntmNewMenuItem_2());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("Print");
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("Exit");
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("tip");
		}
		return mntmNewMenuItem_2;
	}
	private JMenu getMnNewMenu_1() {
		if (mnNewMenu_1 == null) {
			mnNewMenu_1 = new JMenu("Calc");
			mnNewMenu_1.add(getMenuAddition());
			mnNewMenu_1.add(getMntmNewMenuItem_4());
			mnNewMenu_1.add(getMntmNewMenuItem_5());
			mnNewMenu_1.add(getSeparator());
			mnNewMenu_1.add(getMntmNewMenuItem_6());
		}
		return mnNewMenu_1;
	}
	private JMenuItem getMenuAddition() {
		if (menuAddition == null) {
			menuAddition = new JMenuItem("Addition");
			menuAddition.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addAction();
					
				}
			});
		}
		return menuAddition;
	}
	private JMenuItem getMntmNewMenuItem_4() {
		if (mntmNewMenuItem_4 == null) {
			mntmNewMenuItem_4 = new JMenuItem("Subtration");
			mntmNewMenuItem_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					subAction();
				}
			});
		}
		return mntmNewMenuItem_4;
	}
	private JMenuItem getMntmNewMenuItem_5() {
		if (mntmNewMenuItem_5 == null) {
			mntmNewMenuItem_5 = new JMenuItem("Multiplication");
			mntmNewMenuItem_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mulAction();
					
				}
			});
		}
		return mntmNewMenuItem_5;
	}
	private JMenuItem getMntmNewMenuItem_6() {
		if (mntmNewMenuItem_6 == null) {
			mntmNewMenuItem_6 = new JMenuItem("Division");
			mntmNewMenuItem_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					divAction();
					
				}
			});
		}
		return mntmNewMenuItem_6;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
		}
		return separator;
	}
	private JTextField getTfnum1() {
		if (tfnum1 == null) {
			tfnum1 = new JTextField();
			tfnum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfnum1.setBounds(33, 47, 130, 26);
			tfnum1.setColumns(10);
		}
		return tfnum1;
	}
	private JTextField getTfnum2() {
		if (tfnum2 == null) {
			tfnum2 = new JTextField();
			tfnum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfnum2.setColumns(10);
			tfnum2.setBounds(33, 106, 130, 26);
		}
		return tfnum2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setHorizontalAlignment(SwingConstants.TRAILING);
			tfResult.setColumns(10);
			tfResult.setBounds(223, 106, 130, 26);
		}
		return tfResult;
	}
	
	//----Function------
	
	private void addAction() {
	tfResult.setText(Integer.toString(	Integer.parseInt(tfnum1.getText()) + Integer.parseInt(tfnum2.getText())));			
	}
	
	private void subAction() {
		tfResult.setText(Integer.toString(Integer.parseInt(tfnum1.getText()) - Integer.parseInt(tfnum2.getText())));
	}
	private void mulAction() {
		tfResult.setText(Integer.toString(Integer.parseInt(tfnum1.getText()) * Integer.parseInt(tfnum2.getText())));
	}
	private void divAction() {
		tfResult.setText(Integer.toString(Integer.parseInt(tfnum1.getText()) / Integer.parseInt(tfnum2.getText())));
	}
	
		

	
}
