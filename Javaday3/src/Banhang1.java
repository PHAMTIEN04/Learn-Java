//package ltgd;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JTextField;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Banhang1 extends JFrame {
	JComboBox cmbhang = new JComboBox();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtgia;
	private JTextField txtsl;
	private JTextField txttt;

	/**
	 * Launch the application.
	 */
	ArrayList<String> ds = new ArrayList<String>();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Banhang1 frame = new Banhang1();
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
	public Banhang1() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				try {
					FileReader rd = new FileReader("‪hang.txt");
					BufferedReader bf = new BufferedReader(rd);
					while(true) {
						String st = bf.readLine();
						if(st == null || st == "") {
							break;
						}
						String[] a = st.split("[;]");
						cmbhang.addItem(a[0]);
						ds.add(st);
					}
					bf.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		cmbhang.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String th = cmbhang.getSelectedItem().toString();
				for(String h:ds) {
					String[] che = h.split("[;]");
					if(che[0].equals(th)) {
						txtgia.setText(che[1]);
					}
				}
			}
		});
		
		
//		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mi tom/10.000d", "Sting Vang/7.000d", "Sting Do/10.000d", "Com chien/20.000d"}));
		cmbhang.setBounds(97, 11, 231, 34);
		contentPane.add(cmbhang);
		
		JLabel lblNewLabel = new JLabel("San Pham");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 8, 88, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gia");
		lblNewLabel_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 79, 80, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("So Luong");
		lblNewLabel_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 125, 80, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Thanh Tien");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 175, 80, 21);
		contentPane.add(lblNewLabel_3);
		
		txtgia = new JTextField();
		txtgia.setBounds(97, 72, 231, 34);
		contentPane.add(txtgia);
		txtgia.setColumns(10);
		
		txtsl = new JTextField();
		txtsl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()== 10) {
					long sl = Long.parseLong(txtsl.getText());
					long gia = Long.parseLong(txtgia.getText());
					Long tt = sl * gia;
					txttt.setText(tt.toString());
				}
				if(e.getKeyCode()== 27) {
					System.exit(1);
				}

			}
		});
		txtsl.setColumns(10);
		txtsl.setBounds(97, 121, 231, 34);
		contentPane.add(txtsl);
		
		txttt = new JTextField();
		txttt.setColumns(10);
		txttt.setBounds(97, 170, 231, 34);
		contentPane.add(txttt);
	}
}
// 1 ten hang 
// gia
// so luong
// thanh tien
// ban
