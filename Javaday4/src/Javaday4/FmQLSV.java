package Javaday4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FmQLSV extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1057, 636);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtmsv = new JLabel("MSV");
		txtmsv.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtmsv.setBounds(55, 33, 46, 14);
		contentPane.add(txtmsv);
		
		JLabel txthoten = new JLabel("Họ Tên");
		txthoten.setFont(new Font("Tahoma", Font.BOLD, 11));
		txthoten.setBounds(55, 77, 46, 14);
		contentPane.add(txthoten);
		
		JLabel txtkhoa = new JLabel("Khóa");
		txtkhoa.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtkhoa.setBounds(55, 126, 46, 14);
		contentPane.add(txtkhoa);
		
		JLabel txtdtb = new JLabel("ĐTB");
		txtdtb.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtdtb.setBounds(55, 182, 46, 14);
		contentPane.add(txtdtb);
		
		textField = new JTextField();
		textField.setBounds(111, 30, 215, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(111, 74, 215, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(111, 123, 215, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(111, 179, 215, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 235, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Xóa");
		btnNewButton_1.setBounds(141, 235, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sửa");
		btnNewButton_2.setBounds(280, 235, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Tìm kiếm");
		btnNewButton_3.setBounds(409, 235, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Lưu file");
		btnNewButton_4.setBounds(547, 235, 89, 23);
		contentPane.add(btnNewButton_4);
	}
}
