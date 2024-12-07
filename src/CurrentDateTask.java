

import java.awt.EventQueue;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.awt.event.ActionEvent;

public class CurrentDateTask {

	private JFrame frmDailytask;
	private JLabel lbldate;
	private JTable imtable;
	DefaultTableModel model;
	private JScrollPane scrollPane;
	private JButton btnImport;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrentDateTask window = new CurrentDateTask();
					window.frmDailytask.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void clock() {
		Calendar cal = new GregorianCalendar();
		int  day =cal.get(Calendar.DAY_OF_MONTH);
		int  month =cal.get(Calendar.MONTH);
		int  year =cal.get(Calendar.YEAR);
		int  second  =cal.get(Calendar.SECOND);
		int  minute =cal.get(Calendar.MINUTE);
		int  hour =cal.get(Calendar.HOUR);
		lbldate.setText("Time : "+hour+":"+minute+":"+second+"                       "+"Date : "+day+"/"+month+"/"+year);
		
	}

	/**
	 * Create the application.
	 */
	public CurrentDateTask() {
		initialize();
		clock();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDailytask = new JFrame();
		frmDailytask.setTitle("DailyTask");
		frmDailytask.setBounds(100, 100, 1046, 605);
		frmDailytask.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frmDailytask.getContentPane().setLayout(null);
		
	    lbldate = new JLabel("");
	    lbldate.setBounds(10, 10, 1012, 92);
	    lbldate.setBackground(Color.CYAN);
	    lbldate.setFont(new Font("Tahoma", Font.PLAIN, 44));
		frmDailytask.getContentPane().add(lbldate);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 112, 1002, 391);
		frmDailytask.getContentPane().add(scrollPane);
		
		imtable = new JTable();
		imtable.setBackground(new Color(248, 248, 255));
		model = new DefaultTableModel();
		Object[] column = {"serial no","Task","Start time","End Time"};
		Object[] row = new Object[4];
		model.setColumnIdentifiers(column);
		imtable.setModel(model);
		scrollPane.setViewportView(imtable);
		
		JButton btnNewButton = new JButton("Edit Task");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alldays ob = new Alldays();
			 ob.main(null);
			// frmDailytask.dispose();
				
			}
		});
		btnNewButton.setBounds(30, 513, 122, 45);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmDailytask.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBounds(847, 513, 129, 45);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmDailytask.getContentPane().add(btnNewButton_1);
		
		btnImport = new JButton("Refresh");
		btnImport.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filePath = "E:\\java file\\AnikNazifaProject\\src\\thursday.txt";
				File file = new File(filePath);
				try {
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					
				DefaultTableModel model = (DefaultTableModel)imtable.getModel();
				Object[] lines = br.lines().toArray();
				for (int i = 0; i< lines.length;i=i+2) {
					String[] row = lines[i].toString().split(" ");
					model.addRow(row);
				}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnImport.setBounds(426, 513, 153, 45);
		frmDailytask.getContentPane().add(btnImport);
	}
}
