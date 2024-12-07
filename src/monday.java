import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class monday extends Alldays {

	private JFrame frmMonday;
	private JTable montable;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					monday window = new monday();
					window.frmMonday.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public monday() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMonday = new JFrame();
		frmMonday.setTitle("Monday");
		frmMonday.setBounds(100, 100, 1001, 699);
		frmMonday.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMonday.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 21, 977, 597);
		frmMonday.getContentPane().add(scrollPane);
		
		montable = new JTable();
		montable.setBackground(new Color(245, 245, 245));
		model = new DefaultTableModel();
		Object[] column = {"serial no","Task","Start time","End Time"};
		Object[] row = new Object[4];
		model.setColumnIdentifiers(column);
		montable.setModel(model);
		String filePath = "E:\\java file\\AnikNazifaProject\\src\\monday.txt";
		File file = new File(filePath);
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
		DefaultTableModel model = (DefaultTableModel)montable.getModel();
		Object[] lines = br.lines().toArray();
		for (int i = 0; i< lines.length;i=i+2) {
			String[] row1 = lines[i].toString().split(" ");
			model.addRow(row1);
		}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		scrollPane.setViewportView(montable);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMonday.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.setBounds(462, 622, 128, 40);
		frmMonday.getContentPane().add(btnNewButton);
	}
}
