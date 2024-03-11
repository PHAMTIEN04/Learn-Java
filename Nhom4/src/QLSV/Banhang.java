package QLSV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Banhang extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox textma;
	private JTextField textsl;
	private JTextField textgia;
	private JTextField texttong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Banhang frame = new Banhang();
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
	public Banhang() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				textma.addItem("Xang");
				textma.addItem("Dau");
				textma.addItem("Nhot");
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mặt Hàng");
		lblNewLabel.setBounds(10, 28, 107, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Số lượng");
		lblNewLabel_1.setBounds(10, 66, 81, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Giá bán");
		lblNewLabel_2.setBounds(10, 106, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Thành tiền");
		lblNewLabel_3.setBounds(10, 147, 81, 14);
		contentPane.add(lblNewLabel_3);
		
		textma = new JComboBox();
		textma.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String th = textma.getSelectedItem().toString();
				if(th.equals("Xang"))
				{
					textgia.setText("20000");
				}
				else
				{
					if(th.equals("Dau"))
					{
						textgia.setText("18000");
					}
					else
					{
						textgia.setText("12000");
					}
				}
			}
		});
		textma.setBounds(127, 25, 250, 20);
		contentPane.add(textma);
		
		
		textsl = new JTextField();
		textsl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10)
				{
					long soluong = Long.parseLong(textsl.getText());
					long gia = Long.parseLong(textgia.getText());
					Long tong = soluong * gia;
					texttong.setText(tong.toString());
				}
				if(e.getKeyCode() == 27)
				{
					System.exit(1);
				}
			}
		});
		textsl.setBounds(127, 63, 250, 20);
		contentPane.add(textsl);
		textsl.setColumns(10);
		
		textgia = new JTextField();
		textgia.setBounds(127, 103, 250, 20);
		contentPane.add(textgia);
		textgia.setColumns(10);
		
		texttong = new JTextField();
		texttong.setBounds(127, 144, 250, 20);
		contentPane.add(texttong);
		texttong.setColumns(10);
		
		JButton btnNewButton = new JButton("Mua");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long soluong = Long.parseLong(textsl.getText());
				long gia = Long.parseLong(textgia.getText());
				Long tong = soluong * gia;
				texttong.setText(tong.toString());
			}
		});
		btnNewButton.setBounds(315, 200, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String th = textma.getSelectedItem().toString();
				textsl.setText("");
				texttong.setText("");
			}
		});
		btnNewButton_1.setBounds(203, 200, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
