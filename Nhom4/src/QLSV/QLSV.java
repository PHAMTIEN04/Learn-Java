package QLSV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QLSV extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtmasv;
	private JTextField txthoten;
	private JTextField txtkhoa;
	private JTextField txttb;
	private JTable table;
	ArrayList<String> ds = new ArrayList<String>();
	/**
	 * Launch the application.
	 */
	public void Napbang(ArrayList<String> ds)
	{
		DefaultTableModel mh = new DefaultTableModel();
		//Them cot
		mh.addColumn("Masv");
		mh.addColumn("Hoten");
		mh.addColumn("Khoa");
		mh.addColumn("Dtb");
		for(String sv:ds)
		{
			String[] che = sv.split("[;]");
			mh.addRow(che);
		}
		table.setModel(mh);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSV frame = new QLSV();
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
	public QLSV() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				try {
					FileReader f = new FileReader("sinhvien.txt");
					BufferedReader r = new BufferedReader(f);
					while(true)
					{
						String st=r.readLine();
						if(st==""||st==null) break;
						ds.add(st);
					}
					Napbang(ds);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			@Override
			public void windowClosing(WindowEvent e) {
				int d = JOptionPane.showConfirmDialog(null,"Ban co muon luu bai lai khong");
				if(d==0)
				{
					try {
						FileWriter fw = new FileWriter("sinhvien.txt");
						PrintWriter p = new PrintWriter(fw);
						for(String sv:ds)
						{
							p.println(sv);
						}
						p.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1190, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Masv");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 21, 111, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Họ Tên");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 46, 111, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Khóa");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 74, 111, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DTB");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 99, 111, 14);
		contentPane.add(lblNewLabel_3);
		
		txtmasv = new JTextField();
		txtmasv.setBounds(72, 18, 274, 20);
		contentPane.add(txtmasv);
		txtmasv.setColumns(10);
		
		txthoten = new JTextField();
		txthoten.setBounds(72, 43, 274, 20);
		contentPane.add(txthoten);
		txthoten.setColumns(10);
		
		txtkhoa = new JTextField();
		txtkhoa.setBounds(72, 71, 274, 20);
		contentPane.add(txtkhoa);
		txtkhoa.setColumns(10);
		
		txttb = new JTextField();
		txttb.setBounds(72, 96, 274, 20);
		contentPane.add(txttb);
		txttb.setColumns(10);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String masv =txtmasv.getText();
				String hoten = txthoten.getText();
				String khoa = txtkhoa.getText();
				String dtb = txttb.getText();
				String tt = masv + ";" + hoten + ";" + khoa +";" + dtb;
				Boolean kiemtra = false;
				for(String sv: ds)
				{
					String[] che = sv.split("[;]");
					if(che[0].trim().toLowerCase().equals(masv.trim().toLowerCase()))
					{
						kiemtra = true;
					}
				}
				if(!kiemtra)
				{
					ds.add(tt);
					Napbang(ds);
				}
			
				
			}
		});
		btnNewButton.setBounds(390, 17, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Xóa");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String masv = JOptionPane.showInputDialog("Nhap ma sv");
				for(String sv: ds)
				{
					String[] che = sv.split("[;]");
					if(che[0].trim().toLowerCase().equals(masv.trim().toLowerCase()))
					{
						int n = JOptionPane.showConfirmDialog(null,"Xoa ko thi bao?");
						if(n==0)
						{
							ds.remove(sv);break;
						}
					}
				}
				Napbang(ds);
			}
		});
		btnNewButton_1.setBounds(390, 42, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sửa");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String masv =txtmasv.getText();
				String hoten = txthoten.getText();
				String khoa = txtkhoa.getText();
				String dtb = txttb.getText();
				String tt = masv + ";" + hoten + ";" + khoa +";" + dtb;
				int n = ds.size();
				for(int i =0;i<n;i++)
				{
					String sv = ds.get(i);
					String[] che = sv.split("[;]");
					if(che[0].trim().toLowerCase().equals(masv.trim().toLowerCase()))
					{
						//Sua lai vi tri thu i gia tri tt
						ds.set(i, tt);
					}
				}
				Napbang(ds);
			}
		});
		btnNewButton_2.setBounds(390, 70, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Tìm");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> tam = new ArrayList<String>();
				String key = JOptionPane.showInputDialog("Nhap key");
				
				for(String sv: ds)
				{
					if(sv.trim().toLowerCase().contains(key.trim().toLowerCase()))
					{
						tam.add(sv);
						break;					}
				}
				Napbang(tam);
			}
		});
		btnNewButton_3.setBounds(390, 95, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Lưu File");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter fw = new FileWriter("sinhvien.txt");
					PrintWriter p = new PrintWriter(fw);
					for(String sv:ds)
					{
						p.println(sv);
					}
					p.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_4.setBounds(390, 129, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 215, 1154, 294);
		contentPane.add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("Danh sách sinh viên", null, scrollPane, null);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int d = table.getSelectedRow();
				String masv = table.getValueAt(d, 0).toString();
				String hoten = table.getValueAt(d, 1).toString();
				String khoa = table.getValueAt(d, 2).toString();
				String dtb = table.getValueAt(d, 3).toString();
				txtmasv.setText(masv);
				txthoten.setText(hoten);
				txtkhoa.setText(khoa);
				txttb.setText(dtb);
				//System.out.print(d);
						
			}
		});
		scrollPane.setViewportView(table);
	}
}
