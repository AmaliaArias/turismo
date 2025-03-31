package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Medios;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm_Medios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtidtipomedio;
	private JTextField txtNombreMedios;
	private JTextField txtObservacionMedio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Medios frame = new frm_Medios();
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
	public frm_Medios() {
		setTitle("Medios de Turismo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 159, 207));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(319, 11, 105, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Observación");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(146, 146, 117, 14);
		contentPane.add(lblNewLabel_2);
		
		txtidtipomedio = new JTextField();
		txtidtipomedio.setBackground(new Color(255, 236, 255));
		txtidtipomedio.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtidtipomedio.setBounds(170, 42, 112, 20);
		contentPane.add(txtidtipomedio);
		txtidtipomedio.setColumns(10);
		
		txtNombreMedios = new JTextField();
		txtNombreMedios.setBackground(new Color(255, 236, 255));
		txtNombreMedios.setToolTipText("Escriba el medio ");
		txtNombreMedios.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtNombreMedios.setBounds(312, 42, 112, 20);
		contentPane.add(txtNombreMedios);
		txtNombreMedios.setColumns(10);
		
		JButton btnGuardarMedios = new JButton("Guardar");
		btnGuardarMedios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardarMedios.setBackground(new Color(255, 0, 255));
		btnGuardarMedios.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardarMedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				Medios cm = new Medios();
				
				cm.create(txtNombreMedios.getText(), 
						txtObservacionMedio.getText(), 
						Integer.parseInt(txtidtipomedio.getText()));	
			
				txtNombreMedios.setText(" ");
				txtObservacionMedio.setText(" ");
				txtidtipomedio.setText(" ");
			}
		});
		btnGuardarMedios.setBounds(335, 227, 89, 23);
		contentPane.add(btnGuardarMedios);
		
		JLabel lblNewLabel_2_1 = new JLabel("id Tipo Medios");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(180, 11, 117, 14);
		contentPane.add(lblNewLabel_2_1);
		
		txtObservacionMedio = new JTextField();
		txtObservacionMedio.setBackground(new Color(255, 236, 255));
		txtObservacionMedio.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtObservacionMedio.setColumns(10);
		txtObservacionMedio.setBounds(146, 171, 150, 79);
		contentPane.add(txtObservacionMedio);
		
		JTextPane txtpnRedesSociales = new JTextPane();
		txtpnRedesSociales.setBackground(new Color(255, 236, 255));
		txtpnRedesSociales.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		txtpnRedesSociales.setText("\r\n1. Llamada face to face\r\n6. Redes Sociales \r\n7.  Mapas Digitales \r\n8. Oficinas Turisticas");
		txtpnRedesSociales.setBounds(10, 11, 154, 100);
		contentPane.add(txtpnRedesSociales);
	}
}
