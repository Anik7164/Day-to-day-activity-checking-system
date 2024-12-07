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

public class saturday extends Alldays {

	private JFrame frmSaturday;
	private JTable sattable;
	DefaultTableModel model;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					saturday window = new saturday();
					window.frmSaturday.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public saturday() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSaturday = new JFrame();
		frmSaturday.setTitle("Saturday");
		frmSaturday.setBounds(100, 100, 1087, 708);
		frmSaturday.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSaturday.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 1053, 606);
		frmSaturday.getContentPane().add(scrollPane);
		
		sattable = new JTable();
		model = new DefaultTableModel();
		Object[] column = {"serial no","Task","Start time","End Time"};
		Object[] row = new Object[4];
		model.setColumnIdentifiers(column);
		sattable.setModel(model);
		String filePath = "E:\\java file\\AnikNazifaProject\\src\\saturday.txt";
		File file = new File(filePath);
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
		DefaultTableModel model = (DefaultTableModel)sattable.getModel();
		Object[] lines = br.lines().toArray();
		for (int i = 0; i< lines.length;i=i+2) {
			String[] row1 = lines[i].toString().split(" ");
			model.addRow(row1);
		}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		scrollPane.setViewportView(sattable);
		
		btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSaturday	.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.setBounds(465, 626, 97, 35);
		frmSaturday.getContentPane().add(btnNewButton);
	}

}
