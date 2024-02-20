package Javaday4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FmQLSV extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtmsv;
	private JTextField txthoten;
	private JTextField txtkhoa;
	private JTextField txtdtb;
	private JTable table;

	ArrayList<String> ds = new ArrayList<String>();
	ArrayList<String> ds_s = new ArrayList<String>();
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
					FmQLSV frame = new FmQLSV();
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
	public FmQLSV() {
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
					FileReader f = new FileReader("sinhvien.txt");
					BufferedReader rf = new BufferedReader(f);
					while(true) {
						String st = rf.readLine();
						if(st == null || st == "") break;
						ds.add(st);
//						System.out.println(st);
					}
					rf.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				napbang(ds);
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 672);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tlbmsv = new JLabel("MSV");
		tlbmsv.setFont(new Font("Tahoma", Font.BOLD, 11));
		tlbmsv.setBounds(55, 33, 46, 14);
		contentPane.add(tlbmsv);
		
		JLabel tlbhoten = new JLabel("Họ Tên");
		tlbhoten.setFont(new Font("Tahoma", Font.BOLD, 11));
		tlbhoten.setBounds(55, 77, 46, 14);
		contentPane.add(tlbhoten);
		
		JLabel tlbkhoa = new JLabel("Khóa");
		tlbkhoa.setFont(new Font("Tahoma", Font.BOLD, 11));
		tlbkhoa.setBounds(55, 126, 46, 14);
		contentPane.add(tlbkhoa);
		
		JLabel tlbdtb = new JLabel("ĐTB");
		tlbdtb.setFont(new Font("Tahoma", Font.BOLD, 11));
		tlbdtb.setBounds(55, 182, 46, 14);
		contentPane.add(tlbdtb);
		
		txtmsv = new JTextField();
		txtmsv.setBounds(111, 30, 215, 20);
		contentPane.add(txtmsv);
		txtmsv.setColumns(10);
		
		txthoten = new JTextField();
		txthoten.setBounds(111, 74, 215, 20);
		contentPane.add(txthoten);
		txthoten.setColumns(10);
		
		txtkhoa = new JTextField();
		txtkhoa.setBounds(111, 123, 215, 20);
		contentPane.add(txtkhoa);
		txtkhoa.setColumns(10);
		
		txtdtb = new JTextField();
		txtdtb.setBounds(111, 179, 215, 20);
		contentPane.add(txtdtb);
		txtdtb.setColumns(10);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String masv =txtmsv.getText();
				String hoten = txthoten.getText();
				String khoa = txtkhoa.getText();
				String dtb = txtdtb.getText();
				String tt = masv + ";" + hoten + ";" + khoa + ";" + dtb;
				// them vao danh sach
				boolean check = false;
				for(String x:ds) {
//					String[] t = x.split("[;]");
					if(x.contains(masv)) {
						check = true;
						break;
					}
				}
				if(check == false) {
					ds.add(tt);
					napbang(ds);
				}

			}
		});
		btnNewButton.setBounds(10, 235, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Xóa");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String masv = JOptionPane.showInputDialog("Nhap ma sinh vien");
				for(String x : ds) {
					String[] che = x.split("[;]");
					if(che[0].trim().toLowerCase().equals(masv.trim().toLowerCase())) {
						int n = JOptionPane.showConfirmDialog(null, "Xoa khong ban?");
						if(n==0) {
						ds.remove(x);	
						}
						
						break;
					}
				}
				napbang(ds);
			}
		});
		btnNewButton_1.setBounds(141, 235, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sửa");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String masv =txtmsv.getText();
				String hoten = txthoten.getText();
				String khoa = txtkhoa.getText();
				String dtb = txtdtb.getText();
				String tt = masv + ";" + hoten + ";" + khoa + ";" + dtb;
				int n = ds.size();// lay ra so phan tu trong mang
				for(int i = 0 ; i < n ; i++) {
					String sv = ds.get(i);// lay ra sv thu i
					String[] che = sv.split("[;]");
					if(che[0].trim().toLowerCase().equals(masv.trim().toLowerCase())) {
						ds.set(i,tt);// thay the tt vao vi tri thu i trong ds	

						
						break;
					}
				}
				napbang(ds);
			}
		});
		btnNewButton_2.setBounds(280, 235, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Tìm kiếm");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String masv = JOptionPane.showInputDialog("Nhap Key");
				for(String x : ds) {
//					String[] che = x.split("[;]");
					if(x.trim().toLowerCase().contains(masv.trim().toLowerCase())) {
						ds_s.add(x);	
						break;
					}
				}
				napbang(ds_s);
			}
		});
		btnNewButton_3.setBounds(409, 235, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Lưu file");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter f = new FileWriter("sinhvien.txt",false);
					PrintWriter g = new PrintWriter(f);
					for(String x:ds) {
						g.println(x);
					}
					g.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_4.setBounds(547, 235, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(37, 280, 604, 342);
		contentPane.add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("Danh Sách Sinh Viên", null, scrollPane, null);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//lay dong vua chon
				int d = table.getSelectedRow();
				String msv = table.getValueAt(d, 0).toString();
				String hoten = table.getValueAt(d, 1).toString();
				String khoa = table.getValueAt(d, 2).toString();
				String dtb = table.getValueAt(d, 3).toString();
				
				txtmsv.setText(msv);
				txthoten.setText(hoten);
				txtkhoa.setText(khoa);
				txtdtb.setText(dtb);
			}
		});
		scrollPane.setViewportView(table);
	}
}
