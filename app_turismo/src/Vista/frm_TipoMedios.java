package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.TipoMedios;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm_TipoMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtobservaciontm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_TipoMedios frame = new frm_TipoMedios();
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
	public frm_TipoMedios() {
		setTitle("Gestión de Tipos de Medios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 324, 290);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(156, 204, 226));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(110, 26, 123, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(27, 29, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Observación");
		lblNewLabel_2.setBounds(27, 77, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		txtobservaciontm = new JTextField();
		txtobservaciontm.setBounds(110, 70, 175, 94);
		contentPane.add(txtobservaciontm);
		txtobservaciontm.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				TipoMedios cr = new TipoMedios();
				cr.create(txtnombre.getText(),
						txtobservaciontm.getText()); 
			
				txtnombre.setText(" ");
				txtobservaciontm.setText(" ");
			}
		});
		btnGuardar.setBounds(110, 206, 89, 23);
		contentPane.add(btnGuardar);
	}
}
