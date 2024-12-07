import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Alldays {

	private JFrame frmDayToDay;
	private JTextField serialno;
	private JTextField task;
	private JTextField start;
	private JTextField end;
	private JTable table;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alldays window = new Alldays();
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
	public Alldays() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDayToDay = new JFrame();
		frmDayToDay.setTitle("Day To Day Activity Checker");
		frmDayToDay.getContentPane().setBackground(SystemColor.activeCaption);
		frmDayToDay.setBounds(100, 100, 985, 729);
		frmDayToDay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDayToDay.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Sunday");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File f = new File("E:\\java file\\AnikNazifaProject\\src\\sunday.txt");
				
				try {
					if(!f.exists()) {
					f.createNewFile();
					}
					FileWriter fw = new FileWriter(f.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					for(int i = 0; i < table.getRowCount();i++) {
						for(int j = 0; j < table.getColumnCount();j++);{
							bw.write(table.getModel().getValueAt(i,0)+" ");
							bw.write(table.getModel().getValueAt(i,1)+" ");
							bw.write(table.getModel().getValueAt(i,2)+" ");
							bw.write(table.getModel().getValueAt(i,3)+" ");
						}
						bw.write("\n_______\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null,"Sunday's Task Saved");
					sunday ob = new sunday();
					 ob.main(null);
					// frmDayToDay.dispose();
				} 
					catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}
			}
		);
		btnNewButton.setBounds(10, 24, 124, 45);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		frmDayToDay.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Monday");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
File f = new File("E:\\java file\\AnikNazifaProject\\src\\monday.txt");
				
				try {
					if(!f.exists()) {
					f.createNewFile();
					}
					FileWriter fw = new FileWriter(f.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					for(int i = 0; i < table.getRowCount();i++) {
						for(int j = 0; j < table.getColumnCount();j++);{
							bw.write(table.getModel().getValueAt(i,0)+" ");
							bw.write(table.getModel().getValueAt(i,1)+" ");
							bw.write(table.getModel().getValueAt(i,2)+" ");
							bw.write(table.getModel().getValueAt(i,3)+" ");
						}
						bw.write("\n_______\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null,"Monday's Task Saved");
					monday ob = new monday();
					 ob.main(null);
				} 
					catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}
			
			}
		);
		btnNewButton_1.setBounds(144, 24, 116, 45);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		frmDayToDay.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Tuesday");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
File f = new File("E:\\java file\\AnikNazifaProject\\src\\tuesday.txt");
				
				try {
					if(!f.exists()) {
					f.createNewFile();
					}
					FileWriter fw = new FileWriter(f.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					for(int i = 0; i < table.getRowCount();i++) {
						for(int j = 0; j < table.getColumnCount();j++);{
							bw.write(table.getModel().getValueAt(i,0)+" ");
							bw.write(table.getModel().getValueAt(i,1)+" ");
							bw.write(table.getModel().getValueAt(i,2)+" ");
							bw.write(table.getModel().getValueAt(i,3)+" ");
						}
						bw.write("\n_______\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null,"Tuesday's Task Saved");
					tuesday ob = new tuesday();
					 ob.main(null);
				//	frmDayToDay.dispose();
				} 
					catch (IOException e1) {
					
					e1.printStackTrace();
				}
			
			
			}
		});
		btnNewButton_2.setBounds(281, 22, 116, 47);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		frmDayToDay.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(407, 68, 62, -45);
		frmDayToDay.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Wednesday");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
File f = new File("E:\\java file\\AnikNazifaProject\\src\\wednesday.txt");
				
				try {
					if(!f.exists()) {
					f.createNewFile();
					}
					FileWriter fw = new FileWriter(f.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					for(int i = 0; i < table.getRowCount();i++) {
						for(int j = 0; j < table.getColumnCount();j++);{
							bw.write(table.getModel().getValueAt(i,0)+" ");
							bw.write(table.getModel().getValueAt(i,1)+" ");
							bw.write(table.getModel().getValueAt(i,2)+" ");
							bw.write(table.getModel().getValueAt(i,3)+" ");
						}
						bw.write("\n_______\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null,"Wednesday's Task Saved");
					wednesday ob = new wednesday();
					 ob.main(null);
					//frmDayToDay.dispose();
				} 
					catch (IOException e1) {
					
					e1.printStackTrace();
				}
			
			
			}
		});
		btnNewButton_4.setBounds(417, 24, 116, 47);
		btnNewButton_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmDayToDay.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Thursday");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
File f = new File("E:\\java file\\AnikNazifaProject\\src\\thursday.txt");
				
				try {
					if(!f.exists()) {
					f.createNewFile();
					}
					FileWriter fw = new FileWriter(f.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					for(int i = 0; i < table.getRowCount();i++) {
						for(int j = 0; j < table.getColumnCount();j++);{
							bw.write(table.getModel().getValueAt(i,0)+" ");
							bw.write(table.getModel().getValueAt(i,1)+" ");
							bw.write(table.getModel().getValueAt(i,2)+" ");
							bw.write(table.getModel().getValueAt(i,3)+" ");
						}
						bw.write("\n_______\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null,"Thursday's Task Saved");
					thursday ob = new thursday();
					 ob.main(null);
					//frmDayToDay.dispose();
				} 
					catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_5.setBounds(557, 22, 124, 47);
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		frmDayToDay.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Friday");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File f = new File("E:\\java file\\AnikNazifaProject\\src\\friday.txt");
			
			try {
				if(!f.exists()) {
				f.createNewFile();
				}
				FileWriter fw = new FileWriter(f.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				for(int i = 0; i < table.getRowCount();i++) {
					for(int j = 0; j < table.getColumnCount();j++);{
						bw.write(table.getModel().getValueAt(i,0)+" ");
						bw.write(table.getModel().getValueAt(i,1)+" ");
						bw.write(table.getModel().getValueAt(i,2)+" ");
						bw.write(table.getModel().getValueAt(i,3)+" ");
					}
					bw.write("\n_______\n");
				}
				bw.close();
				fw.close();
				JOptionPane.showMessageDialog(null,"Friday's Task Saved");
				friday ob = new friday();
				 ob.main(null);
			} 
				catch (IOException e1) {
				
				e1.printStackTrace();
			}
		
		
			}
		});
		btnNewButton_6.setBounds(705, 22, 116, 47);
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 19));
		frmDayToDay.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Saturday");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
File f = new File("E:\\java file\\AnikNazifaProject\\src\\saturday.txt");
				
				try {
					if(!f.exists()) {
					f.createNewFile();
					}
					FileWriter fw = new FileWriter(f.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					for(int i = 0; i < table.getRowCount();i++) {
						for(int j = 0; j < table.getColumnCount();j++);{
							bw.write(table.getModel().getValueAt(i,0)+" ");
							bw.write(table.getModel().getValueAt(i,1)+" ");
							bw.write(table.getModel().getValueAt(i,2)+" ");
							bw.write(table.getModel().getValueAt(i,3)+" ");
						}
						bw.write("\n_______\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null,"Saturday's Task Saved");
					saturday ob = new saturday();
					 ob.main(null);
				} 
					catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_7.setBounds(845, 24, 116, 47);
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmDayToDay.getContentPane().add(btnNewButton_7);
		
		JLabel lblNewLabel = new JLabel("Serial no :");
		lblNewLabel.setBounds(26, 177, 116, 54);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmDayToDay.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Start time :");
		lblNewLabel_1.setBounds(10, 281, 124, 54);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		frmDayToDay.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Task :");
		lblNewLabel_2.setBounds(49, 228, 93, 45);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		frmDayToDay.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("End Time :");
		lblNewLabel_3.setBounds(10, 345, 124, 45);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		frmDayToDay.getContentPane().add(lblNewLabel_3);
		
		serialno = new JTextField();
		serialno.setBounds(144, 189, 157, 38);
		frmDayToDay.getContentPane().add(serialno);
		serialno.setColumns(10);
		
		task = new JTextField();
		task.setBounds(144, 244, 157, 38);
		frmDayToDay.getContentPane().add(task);
		task.setColumns(10);
		
		start = new JTextField();
		start.setBounds(144, 302, 157, 38);
		start.setColumns(10);
		frmDayToDay.getContentPane().add(start);
		
		end = new JTextField();
		end.setBounds(144, 351, 157, 38);
		end.setColumns(10);
		frmDayToDay.getContentPane().add(end);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(356, 186, 605, 468);
		frmDayToDay.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				
				serialno.setText(model.getValueAt(i,0).toString());
				task.setText(model.getValueAt(i, 1).toString());
				start.setText(model.getValueAt(i, 2).toString());
				end.setText(model.getValueAt(i, 3).toString());
			}
		});
		table.setBackground(new Color(64, 224, 208));
		model=new DefaultTableModel();
		Object[] column = {"serial no","Task","Start time","End Time"};
		Object[] row = new Object[4];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
				
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_8 = new JButton("Add");
		btnNewButton_8.setBounds(10, 452, 93, 38);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(serialno.getText().equals("")|| task.getText().equals("")|| start.getText().equals("")||end.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please Complete The Information ");
				}
				else {
				row[0] =serialno.getText();
				row[1] = task.getText();
				row[2] = start.getText();
				row[3] = end.getText();
				model.addRow(row);
				
				serialno.setText("");
				 task.setText("");
				 start.setText("");
				 end.setText("");
				 JOptionPane.showMessageDialog(null, "Saved Succcessfully");
				}	
				
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmDayToDay.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_8_1 = new JButton("Update");
		btnNewButton_8_1.setBounds(127, 452, 93, 38);
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i =table.getSelectedRow();
				if (i>=0) {
					
				
				model.setValueAt(serialno.getText(), i, 0);
				model.setValueAt(task.getText(), i, 1);
				model.setValueAt(start.getText(), i, 2);
				model.setValueAt(end.getText(), i, 3);
				 JOptionPane.showMessageDialog(null, "Updated Succcessfully");
				}
				else {
					JOptionPane.showMessageDialog(null, "Please Select A Row First");
				}
				}
		});
		btnNewButton_8_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmDayToDay.getContentPane().add(btnNewButton_8_1);
		
		JButton btnNewButton_8_2 = new JButton("Delete");
		btnNewButton_8_2.setBounds(26, 527, 108, 38);
		btnNewButton_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i =table.getSelectedRow();
				if (i>=0)
				{
					model.removeRow(i);
					JOptionPane.showMessageDialog(null, "Deleted Successfully");	
				}
				else {
					JOptionPane.showMessageDialog(null, "Please Select A Row First");
				}
			
			}
		});
		btnNewButton_8_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmDayToDay.getContentPane().add(btnNewButton_8_2);
		
		JButton btnNewButton_8_3 = new JButton("Clear");
		btnNewButton_8_3.setBounds(213, 527, 108, 38);
		btnNewButton_8_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				serialno.setText("");
				 task.setText("");
				 start.setText("");
				 end.setText("");
			}
		});
		btnNewButton_8_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmDayToDay.getContentPane().add(btnNewButton_8_3);
		
		JButton btnNewButton_9 = new JButton("Exit");
		btnNewButton_9.setBounds(104, 613, 132, 47);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_9.setBackground(Color.GRAY);
		frmDayToDay.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Save");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File f = new File("E:\\java file\\AnikNazifaProject\\src\\thursday.txt");
				
					try {
						if(!f.exists()) {
						f.createNewFile();
						}
						FileWriter fw = new FileWriter(f.getAbsoluteFile());
						BufferedWriter bw = new BufferedWriter(fw);
						for(int i = 0; i < table.getRowCount();i++) {
							for(int j = 0; j < table.getColumnCount();j++);{
								bw.write(table.getModel().getValueAt(i,0)+" ");
								bw.write(table.getModel().getValueAt(i,1)+" ");
								bw.write(table.getModel().getValueAt(i,2)+" ");
								bw.write(table.getModel().getValueAt(i,3)+" ");
							}
							bw.write("\n_______\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null,"Saved");
						frmDayToDay.dispose();
					} 
						catch (IOException e1) {
						
						e1.printStackTrace();
					}
				}
			
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_10.setBounds(253, 452, 93, 38);
		frmDayToDay.getContentPane().add(btnNewButton_10);
	}
}
