

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sunday extends Alldays {

	private JFrame frmSunday;
	private JTable suntable;
	DefaultTableModel model;
	private final JButton btnNewButton = new JButton("Back");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sunday window = new sunday();
					window.frmSunday.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sunday() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSunday = new JFrame();
		frmSunday.setFont(new Font("Dialog", Font.BOLD, 16));
		frmSunday.setTitle("Sunday");
		frmSunday.setBounds(100, 100, 977, 636);
		frmSunday.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSunday.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 20, 943, 524);
		frmSunday.getContentPane().add(scrollPane);
		
		suntable = new JTable();
		suntable.setBackground(new Color(240, 248, 255));
		model = new DefaultTableModel();
		Object[] column = {"serial no","Task","Start time","End Time"};
		Object[] row = new Object[4];
		model.setColumnIdentifiers(column);
		suntable.setModel(model);
		String filePath = "E:\\java file\\AnikNazifaProject\\src\\sunday.txt";
		File file = new File(filePath);
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
		DefaultTableModel model = (DefaultTableModel)suntable.getModel();
		Object[] lines = br.lines().toArray();
		for (int i = 0; i< lines.length;i=i+2) {
			String[] row1 = lines[i].toString().split(" ");
			model.addRow(row1);
		}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		scrollPane.setViewportView(suntable);
		scrollPane.setViewportView(suntable);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSunday.dispose();
			}
		});
		btnNewButton.setBounds(428, 549, 128, 40);
		frmSunday.getContentPane().add(btnNewButton);
	}
		


}


