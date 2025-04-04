package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class TipoMedios {
	Conexion conector = new Conexion();

	public String nombre;
	public String observaciones;

	public TipoMedios(int idTipoMedios, String nombre, String observaciones) {
		super();
		this.nombre = nombre;
		this.observaciones = observaciones;
	}

	public TipoMedios() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public void create(String nombre, String observaciones) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tbl_tiposmedios (nombre, observaciones) values (?, ?)";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setString(1, nombre);
			pst.setString(2, observaciones);

			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro exitoso");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void delete(int idTipoMedios) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "DELETE FROM tbl_tiposmedios WHERE idTipoMedios = ?";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			// parametrizar el campo
			pst.setInt(1, idTipoMedios);

			// CONFIRMAR LA OPERACION
			int resp = JOptionPane.showConfirmDialog(null, " ¿Desea eliminar el registro # " + idTipoMedios + "?");

			if (resp == JOptionPane.OK_OPTION) {

				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro # " + idTipoMedios + " ELIMINADO");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	
	// SEARH - UPDATE
		public void readOne(int codigo, JTextField nombres, JTextField observacion ) {
			Connection dbConnection = null;
			PreparedStatement pst = null; // PREPARA LA TRANSACCION

			String script = "SELECT * FROM tbl_tiposmedios WHERE idTipoMedios = ?";

			try {
				dbConnection = conector.conectarBD(); // ABRIR LA CONEXION
				pst = dbConnection.prepareStatement(script); // ABRIR EL BUFFLE

				pst.setInt(1, codigo);

				ResultSet rs = pst.executeQuery(); // ALMACENAMIENTO TEMPORAL

				while (rs.next()) {
					nombres.setText(rs.getString(2));
					observacion.setText(rs.getString(3));
					
				}

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

		}
	
		
		
		//ALL 
		//CONSULTAR TODOS LOS REGISTROS DE LA TABLA TIPODEMEDIOS
		public void readAll (int tipomedios, String nombre, String observacion) {
			Connection dbConnection = null;
			PreparedStatement pst = null; //PREPARA LA TRANSACCION
		 
		 String script = "SELECT * FROM tbl_tiposmedios WHERE idTipoMedios = ?";
		 
		 try { 
			 dbConnection = conector.conectarBD(); //ABRIR LA CONEXION pst =
			pst = dbConnection.prepareStatement(script); //ABRIR EL BUFFLE ResultSet rs =
			ResultSet rs = pst.executeQuery(); //ALMACENAMIENTO TEMPORAL
		 
		 while (rs.next()) {
			 System.out.println(rs.getString(1) + " - " + rs.getString(2) + " - " + rs.getString(3));
			 
			 }
		 
		
		 } catch (SQLException e) { System.out.println(e.getMessage()); }
		 
		 }
}
