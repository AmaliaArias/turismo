package Vista;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.TipoVehiculo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class frm_TipoVehiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombretv;
	private JTextField txtobservaciontv;
	private JTextField txtidtipovehi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_TipoVehiculo frame = new frm_TipoVehiculo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frm_TipoVehiculo() {
		setTitle("Tipo de Vehiculos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 188, 121));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnombretv = new JTextField();
		txtnombretv.setToolTipText("Escribe el nombre del vehiculo");
		txtnombretv.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtnombretv.setColumns(10);
		txtnombretv.setBounds(123, 34, 126, 23);
		contentPane.add(txtnombretv);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 37, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Observación");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 82, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		txtobservaciontv = new JTextField();
		txtobservaciontv.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtobservaciontv.setColumns(10);
		txtobservaciontv.setBounds(123, 79, 141, 86);
		contentPane.add(txtobservaciontv);
		
		JButton btnGuardar = new JButton("SAVE");
		btnGuardar.setBackground(new Color(255, 130, 4));
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2931176_diskette_guardar_save_disk_drive_icon.png"));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				TipoVehiculo cr = new TipoVehiculo();
				cr.create(txtnombretv .getText(), 
						txtobservaciontv .getText());
				
				txtnombretv.setText(" ");
				txtobservaciontv.setText(" ");
			}
		});
		btnGuardar.setBounds(10, 196, 132, 57);
		contentPane.add(btnGuardar);
		
		JLabel lblIdTipovehiculo = new JLabel("ID TipoVehiculo");
		lblIdTipovehiculo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdTipovehiculo.setBounds(311, 38, 107, 15);
		contentPane.add(lblIdTipovehiculo);
		
		txtidtipovehi = new JTextField();
		txtidtipovehi.setColumns(10);
		txtidtipovehi.setBounds(307, 80, 86, 20);
		contentPane.add(txtidtipovehi);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.setBackground(new Color(255, 130, 4));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoVehiculo cr = new TipoVehiculo();
				
				cr.delete(Integer.parseInt(txtidtipovehi.getText()));
				
				txtidtipovehi.setText(" ");
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8664938_trash_can_delete_remove_icon.png"));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(311, 196, 132, 57);
		contentPane.add(btnNewButton);
		
		JButton btnbuscar = new JButton("SEARCH");
		btnbuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoVehiculo cr = new TipoVehiculo();
				
				cr.readOne(Integer.parseInt(txtidtipovehi.getText()), txtnombretv, txtobservaciontv);
				
				
			}
		});
		btnbuscar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\211817_search_strong_icon.png"));
		btnbuscar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnbuscar.setBounds(152, 199, 150, 51);
		contentPane.add(btnbuscar);
		
		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				TipoVehiculo cr = new TipoVehiculo();
				
				cr.update(Integer.parseInt(txtidtipovehi.getText()), txtnombretv.getText(), txtobservaciontv.getText());
				
				txtidtipovehi.setText(" ");
				txtnombretv.setText(" ");
				txtobservaciontv.setText(" ");
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\172618_update_icon.png"));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(299, 123, 144, 51);
		contentPane.add(btnNewButton_1);
	}

}
