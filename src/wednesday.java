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

public class wednesday extends Alldays  {

	private JFrame frmWednesday;
	private JTable wedtable;
	DefaultTableModel model;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wednesday window = new wednesday();
					window.frmWednesday.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public wednesday() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWednesday = new JFrame();
		frmWednesday.setTitle("WednesDay");
		frmWednesday.setBounds(100, 100, 991, 682);
		frmWednesday.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWednesday.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 957, 578);
		frmWednesday.getContentPane().add(scrollPane);
		
		wedtable = new JTable();
		model = new DefaultTableModel();
		Object[] column = {"serial no","Task","Start time","End Time"};
		Object[] row = new Object[4];
		model.setColumnIdentifiers(column);
		wedtable.setModel(model);
		String filePath = "E:\\java file\\AnikNazifaProject\\src\\wednesday.txt";
		File file = new File(filePath);
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
		DefaultTableModel model = (DefaultTableModel)wedtable.getModel();
		Object[] lines = br.lines().toArray();
		for (int i = 0; i< lines.length;i=i+2) {
			String[] row1 = lines[i].toString().split(" ");
			model.addRow(row1);
		}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		scrollPane.setViewportView(wedtable);
		
		btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmWednesday.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.setBounds(409, 598, 101, 37);
		frmWednesday.getContentPane().add(btnNewButton);
	}
	
}
