package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class FrameNguoi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public void napbang(ArrayList<String> ds) {
		try {
		DefaultTableModel mh = new DefaultTableModel();
		mh.addColumn("MNV");
		mh.addColumn("Họ tên");
		mh.addColumn("Khóa");
		mh.addColumn("ĐTB");
		mh.addColumn("Giới tính");
		mh.addColumn("Sđt");
		mh.addColumn("Email");
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
					FrameNguoi frame = new FrameNguoi();
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
	public FrameNguoi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 603);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"H\u1ECD v\u00E0 T\u00EAn", "Gi\u1EDBi T\u00EDnh", "Ng\u00E0y sinh", "L\u1EDBp", "\u0110TB", "M\u00E3 nh\u00E2n vi\u00EAn", "Email"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 198, 640, 326);
		contentPane.add(scrollPane);
		
		JButton btnNewButton_1 = new JButton("Run");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(191, 36, 61, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Chức năng");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(0, 0, 89, 25);
		contentPane.add(lblNewLabel);
		
		JMenu mnNewMenu = new JMenu("Hiển Thị");
		mnNewMenu.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu.setBounds(0, 81, 117, 26);
		contentPane.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("1. Tất cả");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("2. Nhân viên");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("3. Học sinh");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Đánh giá");
		mnNewMenu_1.setBounds(0, 118, 117, 26);
		contentPane.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("1. Đậu");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("2. Rớt");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JLabel lblNewLabel_1 = new JLabel("Tìm kiếm");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 40, 74, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(70, 38, 111, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		

	}
}
