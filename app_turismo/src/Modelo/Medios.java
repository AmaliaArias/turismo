package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class Medios {
	Conexion conector = new Conexion();

	public String nombre;
	public String observaciones;
	public int idTipoMedios;
	public int codigo;

	public Medios(String nombre, String observaciones, int idTipoMedios, int codigo) {
		super();
		this.nombre = nombre;
		this.observaciones = observaciones;
		this.idTipoMedios = idTipoMedios;
	}

	public Medios() {

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

	public int getIdTipoMedios() {
		return idTipoMedios;
	}

	public void setIdTipoMedios(int idTipoMedios) {
		this.idTipoMedios = idTipoMedios;
	}

	public void create(String nombre) {

	}

	public void create(String nombre, String observaciones, int idTipoMedios) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tbl_medios (nombre, observaciones, idTipoMedios) values (?, ?, ?)";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setString(1, nombre);
			pst.setString(2, observaciones);
			pst.setInt(3, idTipoMedios);

			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro exitoso");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// DELETE
	public void delete(int idMedios) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "DELETE FROM tbl_medios WHERE idMedios = ?";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			// parametrizar el campo
			pst.setInt(1, idMedios);

			// CONFIRMAR LA OPERACION
			int resp = JOptionPane.showConfirmDialog(null, " ¿Desea eliminar el registro # " + idMedios + "?");

			if (resp == JOptionPane.OK_OPTION) {

				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro # " + idMedios + " ELIMINADO");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// BUSCAR
	public void readOne(int idMedios, JTextField nombre, JTextField observaciones, JTextField idTipoMedios) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // PREPARA LA TRANSACCION

		String script = "SELECT * FROM tbl_medios WHERE idMedios = ?";

		try {
			dbConnection = conector.conectarBD(); // ABRIR LA CONEXION
			pst = dbConnection.prepareStatement(script); // ABRIR EL BUFFLE

			pst.setInt(1, idMedios);

			ResultSet rs = pst.executeQuery(); // ALMACENAMIENTO TEMPORAL

			while (rs.next()) {
				nombre.setText(rs.getString(2));
				observaciones.setText(rs.getString(3));
				idTipoMedios.setText(rs.getString(4));

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	
	
	

	//UPDATE
	public void update(int idMedios, String nombre, String observaciones, int idTipoMedios) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // PREPARA LA TRANSACCION

		String script = "UPDATE tbl_medios SET nombre = ?, observaciones = ?, idTipoMedios = ? WHERE idMedios = ?";

		try {
			dbConnection = conector.conectarBD(); // ABRIR LA CONEXION pst =
			pst = dbConnection.prepareStatement(script); // ABRIR EL BUFFLE ResultSet rs =

			pst.setString(1, nombre);
			pst.setString(2, observaciones);
			pst.setInt(3, idTipoMedios);
			pst.setInt(4, idMedios);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + idMedios + "?");

			if (resp == JOptionPane.YES_OPTION) {
				pst.execute();

				JOptionPane.showConfirmDialog(null, "Registro No. " + idMedios + "Actualizado");

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
