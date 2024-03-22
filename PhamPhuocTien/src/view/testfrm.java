package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class testfrm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	ArrayList<String> ds = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public void napbang(ArrayList<String> ds) {
		try {
		DefaultTableModel mh = new DefaultTableModel();
		mh.addColumn("MSV");
		mh.addColumn("Họ tên");
		mh.addColumn("Khóa");
		mh.addColumn("ĐTB");
		for(String x:ds) {
			String []che = x.split("[;]");
			mh.addRow(che);
		}
		table.setModel(mh);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testfrm frame = new testfrm();
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
	public testfrm() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				//Mo file sinhvien.txt va luu vao ds
				try {
					//mo file
					//duyet file
						//doc 1 dong
						//neu het file thi break
						//luu st vao ds
					//dong file
					FileReader f1 = new FileReader("f1.txt");
					BufferedReader rf1 = new BufferedReader(f1);
					FileReader f2 = new FileReader("f2.txt");
					BufferedReader rf2 = new BufferedReader(f2);
					while(true) {
						String st = rf1.readLine();

						if(st == null || st == "") break;
						ds.add(st);
//						System.out.println(st);
					}
					while(true) {
						String st1 = rf2.readLine();

						if(st1 == null || st1 == "") break;
						ds.add(st1);
//						System.out.println(st);
					}
					rf1.close();
					rf2.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				napbang(ds);
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 25, 340, 407);
		contentPane.add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("Quản Lý Học Viên", null, scrollPane, null);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		
		JButton btnNewButton = new JButton("Tin A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DefaultTableModel mh = new DefaultTableModel();
					mh.addColumn("MSV");
					mh.addColumn("Họ tên");
					mh.addColumn("Khóa");
					mh.addColumn("ĐTB");
					for(String x:ds) {
						String []che = x.split("[;]");
						if(che[0].trim().toLowerCase().equals("TinA".trim().toLowerCase())) {
							mh.addRow(che);
						}
						
					}
					table.setModel(mh);
					} catch (Exception e1) {
						// TODO: handle exception
						e1.printStackTrace();
					}
				
			}
		});
		btnNewButton.setBounds(360, 65, 89, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Tin B");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DefaultTableModel mh = new DefaultTableModel();
					mh.addColumn("MSV");
					mh.addColumn("Họ tên");
					mh.addColumn("Khóa");
					mh.addColumn("ĐTB");
					for(String x:ds) {
						String []che = x.split("[;]");
						if(che[0].trim().toLowerCase().equals("TinB".trim().toLowerCase())) {
							mh.addRow(che);
						}
						
					}
					table.setModel(mh);
					} catch (Exception e1) {
						// TODO: handle exception
						e1.printStackTrace();
					}
				
			}
		});
		btnNewButton_1.setBounds(360, 114, 89, 38);
		contentPane.add(btnNewButton_1);
	}
}
