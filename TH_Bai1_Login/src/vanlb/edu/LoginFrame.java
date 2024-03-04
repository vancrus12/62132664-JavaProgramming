package vanlb.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenDangNhap;
	private JPasswordField txtMatKhau;

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setTitle("Đăng nhập hệ thống quản lý bán hàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(46, 38, 96, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu:");
		lblMtKhu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMtKhu.setBounds(46, 85, 96, 37);
		contentPane.add(lblMtKhu);
		
		txtTenDangNhap = new JTextField();
		txtTenDangNhap.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTenDangNhap.setBounds(174, 38, 158, 29);
		contentPane.add(txtTenDangNhap);
		txtTenDangNhap.setColumns(10);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMatKhau.setBounds(174, 85, 158, 29);
		contentPane.add(txtMatKhau);
		
		JButton btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnDangNhap.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnDangNhap.setBounds(158, 149, 105, 29);
		contentPane.add(btnDangNhap);
	}
	void XuLyDangNhap() {
		// Lay ve ten dang nhap va mat khau
		String strTen = txtTenDangNhap.getText();
		String strMK = txtMatKhau.getText();
		// Xu ly
		if(strTen.equals("63CNTT") && strMK.equals("123")) {
			HomeFrame homePage = new HomeFrame();
			homePage.setVisible(true);
			// an form dang nhap
			this.setVisible(false);
		}else {
			//xoa du lieu nhap
			txtTenDangNhap.setText("");
			txtMatKhau.setText("");
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Đăng nhập thất bại");
		}
	}
}
