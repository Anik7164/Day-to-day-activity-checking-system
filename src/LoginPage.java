
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.KeyEvent;
import javax.swing.border.MatteBorder;
import javax.swing.DebugGraphics;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class LoginPage {

	private JFrame frmDayToDay;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frmDayToDay.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDayToDay = new JFrame();
		frmDayToDay.setTitle("Day To Day Activity Checker");
		frmDayToDay.getContentPane().setBackground(SystemColor.activeCaption);
		frmDayToDay.setBounds(100, 100, 450, 300);
		frmDayToDay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDayToDay.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
		lblUsername.setBounds(51, 80, 118, 14);
		frmDayToDay.getContentPane().add(lblUsername);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(51, 121, 118, 14);
		frmDayToDay.getContentPane().add(lblNewLabel_1);
		
		JLabel lblAdminLogin = new JLabel("ADMIN LOGIN");
		lblAdminLogin.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAdminLogin.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 24));
		lblAdminLogin.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblAdminLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminLogin.setBackground(new Color(255, 255, 255));
		lblAdminLogin.setBounds(125, 11, 189, 42);
		frmDayToDay.getContentPane().add(lblAdminLogin);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(199, 80, 138, 20);
		frmDayToDay.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(199, 121, 138, 20);
		frmDayToDay.getContentPane().add(txtPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				String password = txtPassword .getText();
				if (username.contains("admin")&& password.contains("1234") ) {
					CurrentDateTask ob = new CurrentDateTask();
					 ob.main(null);
					 frmDayToDay.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid Login","Login Error",JOptionPane.ERROR_MESSAGE);
					txtUsername.setText(null);
					txtPassword.setText(null);
				}
				
			}
		});
		btnNewButton.setBounds(104, 183, 89, 23);
		frmDayToDay.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnNewButton_1.setBounds(260, 183, 89, 23);
		frmDayToDay.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(51, 230, 118, 23);
		frmDayToDay.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Register Now");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration ob = new Registration();
				ob.main(null);
				
			}
			
		});
		btnNewButton_3.setBounds(287, 230, 126, 23);
		frmDayToDay.getContentPane().add(btnNewButton_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(30, 66, 383, 3);
		frmDayToDay.getContentPane().add(separator_1);
	}
}
