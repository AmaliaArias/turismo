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
import java.awt.Font;
import javax.swing.ImageIcon;

public class frm_TipoMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtobservaciontm;
	private JTextField txtidtipomed;

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
		setBounds(100, 100, 509, 388);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(179, 113, 251));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnombre = new JTextField();
		txtnombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtnombre.setBounds(147, 29, 123, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(27, 29, 86, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Observación");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(27, 77, 112, 28);
		contentPane.add(lblNewLabel_2);
		
		txtobservaciontm = new JTextField();
		txtobservaciontm.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtobservaciontm.setBounds(147, 71, 153, 69);
		contentPane.add(txtobservaciontm);
		txtobservaciontm.setColumns(10);
		
		JButton btnGuardar = new JButton("SAVE");
		btnGuardar.setForeground(new Color(255, 255, 255));
		btnGuardar.setBackground(new Color(115, 12, 199));
		btnGuardar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2931176_diskette_guardar_save_disk_drive_icon.png"));
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
		btnGuardar.setBounds(10, 181, 153, 64);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel = new JLabel("ID TipoMedios");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(358, 33, 107, 15);
		contentPane.add(lblNewLabel);
		
		txtidtipomed = new JTextField();
		txtidtipomed.setBounds(358, 52, 86, 20);
		contentPane.add(txtidtipomed);
		txtidtipomed.setColumns(10);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(115, 12, 199));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoMedios cr = new TipoMedios();
				
				cr.delete(Integer.parseInt(txtidtipomed.getText()));
				
				txtidtipomed.setText(" ");
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8664938_trash_can_delete_remove_icon.png"));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(336, 181, 147, 64);
		contentPane.add(btnNewButton);
		
		JButton btnbuscar = new JButton("SEARCH");
		btnbuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				TipoMedios cr = new TipoMedios();
				
				cr.readOne(Integer.parseInt(txtidtipomed.getText()), txtnombre, txtobservaciontm);
				
	
			}
		});
		btnbuscar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\211817_search_strong_icon.png"));
		btnbuscar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnbuscar.setBounds(181, 194, 145, 51);
		contentPane.add(btnbuscar);
		
		JButton btntodos = new JButton("ALL");
		btntodos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoMedios cr = new TipoMedios();
				
				cr.readAll(Integer.parseInt(txtidtipomed.getText()), 
						txtnombre.getText(), 
						txtobservaciontm.getText());
				
				txtidtipomed.setText(" ");
				txtnombre.setText(" ");
				txtobservaciontm.setText(" ");
			}
		});
		btntodos.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3669377_clear_all_ic_icon.png"));
		btntodos.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btntodos.setBounds(169, 279, 146, 43);
		contentPane.add(btntodos);
		
		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				TipoMedios cr = new TipoMedios();
				
				cr.update(Integer.parseInt(txtidtipomed.getText()), txtnombre.getText(), txtobservaciontm.getText());
				
				txtidtipomed.setText(" ");
				txtnombre.setText(" ");
				txtobservaciontm.setText(" ");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\172618_update_icon.png"));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(321, 94, 144, 51);
		contentPane.add(btnNewButton_1);
	}
}
