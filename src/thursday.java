import java.awt.Color;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class thursday extends Alldays  {

	private JFrame frmThursday;
	private JTable thurstable;
	DefaultTableModel model;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thursday window = new thursday();
					window.frmThursday.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public thursday() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmThursday = new JFrame();
		frmThursday.setTitle("Thursday");
		frmThursday.setBounds(100, 100, 1016, 710);
		frmThursday.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmThursday.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 966, 604);
		frmThursday.getContentPane().add(scrollPane);
		
		thurstable = new JTable();

		model = new DefaultTableModel();
		Object[] column = {"serial no","Task","Start time","End Time"};
		Object[] row = new Object[4];
		model.setColumnIdentifiers(column);
		thurstable.setModel(model);
		String filePath = "E:\\java file\\AnikNazifaProject\\src\\thursday.txt";
		File file = new File(filePath);
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
		DefaultTableModel model = (DefaultTableModel)thurstable.getModel();
		Object[] lines = br.lines().toArray();
		for (int i = 0; i< lines.length;i=i+2) {
			String[] row1 = lines[i].toString().split(" ");
			model.addRow(row1);
		}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		scrollPane.setViewportView(thurstable);
		
		btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmThursday.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.setBounds(400, 624, 115, 39);
		frmThursday.getContentPane().add(btnNewButton);
	}

}
