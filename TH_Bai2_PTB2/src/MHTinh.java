import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MHTinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSoA;
	private JTextField txtSoB;
	private JTextField txtSoC;
	private JTextField txtKetQua;
	public MHTinh() {
		setTitle("Giải phương trình bậc 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTieuDe = new JLabel("Giải phương trình bậc 2");
		lblTieuDe.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblTieuDe.setBounds(132, 10, 270, 44);
		contentPane.add(lblTieuDe);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập a:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(68, 73, 72, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nhập b:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(68, 117, 72, 34);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nhập c:");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(68, 161, 72, 34);
		contentPane.add(lblNewLabel_1_2);
		
		txtSoA = new JTextField();
		txtSoA.setBounds(150, 73, 218, 29);
		contentPane.add(txtSoA);
		txtSoA.setColumns(10);
		
		txtSoB = new JTextField();
		txtSoB.setColumns(10);
		txtSoB.setBounds(150, 117, 218, 29);
		contentPane.add(txtSoB);
		
		txtSoC = new JTextField();
		txtSoC.setColumns(10);
		txtSoC.setBounds(150, 161, 218, 29);
		contentPane.add(txtSoC);
		
		JButton btnGiai = new JButton("Giải");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamGiaiPTB2();
			}
		});
		btnGiai.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnGiai.setBounds(202, 214, 85, 44);
		contentPane.add(btnGiai);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Kết quả:");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(68, 274, 72, 34);
		contentPane.add(lblNewLabel_1_2_1);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(150, 279, 218, 29);
		contentPane.add(txtKetQua);
	}
	void HamGiaiPTB2() {
		String str_soA = txtSoA.getText();
		String str_soB = txtSoB.getText();
		String str_soC = txtSoC.getText();
		
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double soC = Double.parseDouble(str_soC);
		
		double x,x1,x2;
		if(soA == 0) {
			if(soB == 0) {
				if(soC == 0) {
					txtKetQua.setText(String.valueOf("Phương trình có vô số nghiệm!"));
				}
				else {
					txtKetQua.setText(String.valueOf("Phương trình vô nghiệm!"));
				}
			}
			else {
				x = -soC/soB;
				txtKetQua.setText(String.valueOf("x = " + x));
			}
		}
		else {
			double delta = soB * soB - 4 * soA * soC;
			if (delta <0) {
				txtKetQua.setText(String.valueOf("Phương trình vô nghiệm!"));
			} else if(delta == 0) {
				x = -soB / (2 * soA);
				txtKetQua.setText(String.valueOf("Phương trình có nghiệm kép x = " + x));
			} else if(delta >0) {
				x1 = (-soB + Math.sqrt(delta)) / (2 * soA);
				x2 = (-soB - Math.sqrt(delta)) / (2 * soA);
				txtKetQua.setText("x1 = " + x1 +  ", x2 = " + x2);
			}
		}
	}		
}
