import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MHTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;
	public MHTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình tính toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất(a)");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(41, 39, 137, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ nhất(b)");
		lblNhpSTh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNhpSTh.setBounds(41, 104, 137, 37);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtA.setBounds(188, 49, 96, 19);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtB.setBounds(188, 114, 96, 19);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JButton btnCong = new JButton("+");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				HamXuLyCong();
			}
		});
		btnCong.setBounds(89, 172, 61, 28);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("-");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				HamXuLyTru();
			}
		});
		btnTru.setBounds(160, 172, 61, 28);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("x");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				HamXuLyNhan();
			}
		});
		btnNhan.setBounds(231, 172, 61, 28);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("/");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				HamXuLyChia();
			}
		});
		btnChia.setBounds(305, 172, 61, 28);
		contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("Kết quả tính:");
		lblKtQuTnh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(41, 220, 137, 37);
		contentPane.add(lblKtQuTnh);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setBounds(188, 230, 96, 19);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
	}//
	void HamXuLyCong() {
		//Lay du lieu tu dieu khien
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		// Chuyen kieu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tinh toan
		double tong=soA+soB;
		//
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyTru() {
		//Lay du lieu tu dieu khien
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		// Chuyen kieu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tinh toan
		double hieu=soA-soB;
		//
		txtKetQua.setText(String.valueOf(hieu));
	}
	void HamXuLyNhan() {
		//Lay du lieu tu dieu khien
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		// Chuyen kieu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tinh toan
		double tich=soA*soB;
		//
		txtKetQua.setText(String.valueOf(tich));		
	}
	void HamXuLyChia() {
		//Lay du lieu tu dieu khien
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		// Chuyen kieu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tinh toan
		double thuong=soA/soB;
		//
		txtKetQua.setText(String.valueOf(thuong));
	}
}
