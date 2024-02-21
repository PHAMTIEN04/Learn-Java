//package ltgd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Caculatebasic extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texta;
	private JTextField textb;
	private JTextField textkq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Caculatebasic frame = new Caculatebasic();
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
	public Caculatebasic() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
//				System.out.println("Xin chao");
//				JOptionPane.showMessageDialog(null, "Hello World!");
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("a =");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(81, 61, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("b =");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(81, 86, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ket qua:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(53, 112, 60, 25);
		contentPane.add(lblNewLabel_2);
		
		texta = new JTextField();
		texta.setBounds(114, 60, 86, 20);
		contentPane.add(texta);
		texta.setColumns(10);
		
		textb = new JTextField();
		textb.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==10) {
					long a = Long.parseLong(texta.getText());
					long b = Long.parseLong(textb.getText());
					Long kq = a + b;
					textkq.setText(kq.toString());
				}
				if(e.getKeyCode()== 27) {
					System.exit(1);
				}
			}
		});
		textb.setBounds(114, 85, 86, 20);
		contentPane.add(textb);
		textb.setColumns(10);
		
		textkq = new JTextField();
		textkq.setBounds(114, 116, 86, 20);
		contentPane.add(textkq);
		textkq.setColumns(10);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long a = Long.parseLong(texta.getText());
				long b = Long.parseLong(textb.getText());
				Long kq = a + b;
				textkq.setText(kq.toString());
			
			}
		});
		btnadd.setBounds(10, 164, 89, 23);
		contentPane.add(btnadd);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long a = Long.parseLong(texta.getText());
				long b = Long.parseLong(textb.getText());
				Long kq = a - b;
				textkq.setText(kq.toString());
			}
		});
		JButton btnmul = new JButton("x");
		btnmul.setBounds(208, 164, 89, 23);
		contentPane.add(btnmul);
		
		JButton btndiv = new JButton("/");
		btndiv.setBounds(307, 164, 89, 23);
		contentPane.add(btndiv);
//		JButton btnmul = new JButton("x");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long a = Long.parseLong(texta.getText());
				long b = Long.parseLong(textb.getText());
				Long kq = a * b;
				textkq.setText(kq.toString());
			}
		});
//		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long a = Long.parseLong(texta.getText());
				long b = Long.parseLong(textb.getText());
				if(b==0) {
					JOptionPane.showMessageDialog(null, "Bo tay");
					return;
				}
				
				Double kq = (double) a / b;
				textkq.setText(kq.toString());
			
				
	
			}
		});
		btnsub.setBounds(109, 164, 89, 23);
		contentPane.add(btnsub);
		

		}
}
//Phat sinh su kien:
// - Phim:
// Enter ascii : 10
// Esc	ascii : 27
// A ascii : 65
// 0 ascii : 48
// - Chuot:
// Tren chuot co 3 thao tac + re chuot +keo + tha
// Dap ung su kien:
// Lap trinh tren dieu khien nao?
// Lap trinh ten su kien nao cua dieu khien do?
// 1. Jframe: 1 from de nhap xuat
// Thuoc tinh: Layout(bo cuc):absolute(bat buoc)
// Su kien: WindowOpened: xay ra khi chay from(frame) len.
// 2. Jlabel:Dung de hien thi du lieu
// Thuoc tinh: Text: go du lieu
// 3. JtextField : dung de nhap va xuat du lieu
// Thuoc tinh:
// + Variable: Dat ten -> txtten
// + Lay gia tri ra: ten.getText()
// + Dua gia tri vao: ten.setText()
// Su kien thuong dung :
// Keypressed: xay ra khi nhan phim
// e.getKeycode() -> lay ma phim vua nhap(10:enter,27:ESC)
// 4.Jcombox va Jlist
// Thuoc tinh: variable: dat ten -> cmbten,lstten
// cmbten.addItem("Chuoi")
// Event:itemStateChanged: Item state change when item selected change.
// Lay gia tri ra: cmbten.getSelectedItem()