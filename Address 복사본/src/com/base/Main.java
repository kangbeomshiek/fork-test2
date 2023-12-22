package com.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JRadioButton rdbinput;
	private JRadioButton rdbdelete;
	private JRadioButton rbdupdate;
	private JRadioButton rbdsearch;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JComboBox tfcombo;
	private JTextField tfinput;
	private JButton btnsearch;
	private JScrollPane scrollPane;
	private JTable sptable;
	private JLabel lblNewLabel;
	private JTextField ftsequenceNo;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField tfName;
	private JTextField tfTelNo;
	private JTextField tfAddress;
	private JTextField tfEmail;
	private JTextField tfRelation;
	private JButton btnOk;

	
	
	private final DefaultTableModel outer_Table = new DefaultTableModel();
	private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
	private final String id_mysql = "root";
	private final String pw_mysql = "qwer1234";
	private JTable inner_Table;
	
	
	
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
		frame.setTitle("주소록");
		frame.setBounds(100, 100, 450, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getRdbinput());
		frame.getContentPane().add(getRdbdelete());
		frame.getContentPane().add(getRbdupdate());
		frame.getContentPane().add(getRbdsearch());
		frame.getContentPane().add(getTfcombo());
		frame.getContentPane().add(getTfinput());
		frame.getContentPane().add(getBtnsearch());
		frame.getContentPane().add(getScrollPane());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getFtsequenceNo());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getLblNewLabel_4());
		frame.getContentPane().add(getLblNewLabel_5());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getTfTelNo());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getTfRelation());
		frame.getContentPane().add(getBtnOk());
	}
	private JRadioButton getRdbinput() {
		if (rdbinput == null) {
			rdbinput = new JRadioButton("입력");
			buttonGroup.add(rdbinput);
			rdbinput.setBounds(23, 19, 54, 23);
		}
		return rdbinput;
	}
	private JRadioButton getRdbdelete() {
		if (rdbdelete == null) {
			rdbdelete = new JRadioButton("삭제");
			buttonGroup.add(rdbdelete);
			rdbdelete.setBounds(89, 19, 54, 23);
		}
		return rdbdelete;
	}
	private JRadioButton getRbdupdate() {
		if (rbdupdate == null) {
			rbdupdate = new JRadioButton("수정");
			buttonGroup.add(rbdupdate);
			rbdupdate.setBounds(155, 19, 54, 23);
		}
		return rbdupdate;
	}
	private JRadioButton getRbdsearch() {
		if (rbdsearch == null) {
			rbdsearch = new JRadioButton("검색");
			rbdsearch.setSelected(true);
			buttonGroup.add(rbdsearch);
			rbdsearch.setBounds(221, 19, 54, 23);
		}
		return rbdsearch;
	}
	private JComboBox getTfcombo() {
		if (tfcombo == null) {
			tfcombo = new JComboBox();
			tfcombo.setModel(new DefaultComboBoxModel(new String[] {"이름", "전화번호", "관계"}));
			tfcombo.setBounds(33, 54, 88, 27);
		}
		return tfcombo;
	}
	private JTextField getTfinput() {
		if (tfinput == null) {
			tfinput = new JTextField();
			tfinput.setBounds(133, 54, 181, 26);
			tfinput.setColumns(10);
		}
		return tfinput;
	}
	private JButton getBtnsearch() {
		if (btnsearch == null) {
			btnsearch = new JButton("검색");
			btnsearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					      bottenAction();
					      
				}
			});
			btnsearch.setBounds(326, 53, 117, 29);
		}
		return btnsearch;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(43, 93, 381, 190);
			scrollPane.setViewportView(getSptable());
			scrollPane.setViewportView(getInner_Table());
		}
		return scrollPane;
	}
	private JTable getInner_table() {
		if (sptable == null) {
			sptable = new JTable();
			sptable.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tableInit();	
					searchAction();		
				}
			});
		}
		return sptable;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("SequenceNo:");
			lblNewLabel.setBounds(59, 307, 84, 16);
		}
		return lblNewLabel;
	}
	private JTextField getFtsequenceNo() {
		if (ftsequenceNo == null) {
			ftsequenceNo = new JTextField();
			ftsequenceNo.setBounds(178, 302, 41, 26);
			ftsequenceNo.setColumns(10);
		}
		return ftsequenceNo;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("이름 :");
			lblNewLabel_1.setBounds(59, 335, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("전화번호 :");
			lblNewLabel_2.setBounds(59, 370, 61, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("주소 :");
			lblNewLabel_3.setBounds(60, 405, 61, 16);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("전자우편 :");
			lblNewLabel_4.setBounds(60, 442, 61, 16);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("관계 :");
			lblNewLabel_5.setBounds(59, 480, 61, 16);
		}
		return lblNewLabel_5;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(178, 330, 68, 26);
		}
		return tfName;
	}
	private JTextField getTfTelNo() {
		if (tfTelNo == null) {
			tfTelNo = new JTextField();
			tfTelNo.setColumns(10);
			tfTelNo.setBounds(178, 365, 130, 26);
		}
		return tfTelNo;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setColumns(10);
			tfAddress.setBounds(184, 400, 209, 26);
		}
		return tfAddress;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(178, 437, 154, 26);
		}
		return tfEmail;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setColumns(10);
			tfRelation.setBounds(178, 475, 215, 26);
		}
		return tfRelation;
	}
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton("OK");
			btnOk.setBounds(326, 533, 117, 29);
		}
		return btnOk;
	}
	
	public void bottenAction() {
		
	}
	
	public void tableInit() {
		outer_Table.addColumn("순서");
		outer_Table.addColumn("이름");
		outer_Table.addColumn("전화번호");
		outer_Table.addColumn("관계");
		outer_Table.setColumnCount(4);
		//순서
				int colNo =0;
				TableColumn col = inner_Table.getColumnModel().getColumn(colNo);
				int width= 30;
				col.setPreferredWidth(width);
				//이름
				 colNo =1;
				  col = inner_Table.getColumnModel().getColumn(colNo);
				 width= 100;
				col.setPreferredWidth(width);
				//전화번호
				 colNo =2;
				  col = inner_Table.getColumnModel().getColumn(colNo);
				 width= 150;
				col.setPreferredWidth(width);
				//관계
				 colNo =3;
				  col = inner_Table.getColumnModel().getColumn(colNo);
				 width= 100;
				col.setPreferredWidth(width);
				
				//초기화 시키기
				int i = outer_Table.getRowCount();
				for ( int j =0;j<i; j++) {
					outer_Table.removeRow(0);
				}
				
				inner_Table.setAutoResizeMode(inner_Table.AUTO_RESIZE_OFF);
				
	}
									
	
	
	private JTable getInner_Table() {
		if (inner_Table == null) {
			inner_Table = new JTable();
		}
		return inner_Table;
	}
}
