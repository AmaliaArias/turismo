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

public class frm_TipoVehiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombretv;
	private JTextField txtobservaciontv;

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
		setBounds(100, 100, 386, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(156, 204, 226));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnombretv = new JTextField();
		txtnombretv.setToolTipText("Escribe el nombre del vehiculo");
		txtnombretv.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtnombretv.setColumns(10);
		txtnombretv.setBounds(177, 47, 126, 23);
		contentPane.add(txtnombretv);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(64, 50, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Observación");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(64, 95, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		txtobservaciontv = new JTextField();
		txtobservaciontv.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtobservaciontv.setColumns(10);
		txtobservaciontv.setBounds(177, 92, 141, 86);
		contentPane.add(txtobservaciontv);
		
		JButton btnGuardar = new JButton("Guardar");
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
		btnGuardar.setBounds(142, 215, 89, 23);
		contentPane.add(btnGuardar);
	}

}
