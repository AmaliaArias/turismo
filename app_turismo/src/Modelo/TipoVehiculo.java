package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class TipoVehiculo {

	Conexion conector = new Conexion();

	public String nombre;
	public String observacion;

	public TipoVehiculo(String nombre, String observacion) {
		super();

		this.nombre = nombre;
		this.observacion = observacion;
	}

	public TipoVehiculo() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	public void create (String nombre, String observacion ) {
		
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "INSERT INTO tbl_tipovehiculo (nombre, observación) values (?, ?)";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setString(1, nombre);
			pst.setString(2, observacion);

			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro exitoso");
			
		} catch (SQLException e) {
			
			System.out.println( e.getMessage());
			
		}
		
	}
	
	public void delete(int idtipovehiculo) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "DELETE FROM tbl_tipovehiculo WHERE idtipovehiculo = ?";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			// parametrizar el campo
			pst.setInt(1, idtipovehiculo);

			// CONFIRMAR LA OPERACION
			int resp = JOptionPane.showConfirmDialog(null, " ¿Desea eliminar el registro # " + idtipovehiculo + "?");

			if (resp == JOptionPane.OK_OPTION) {

				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro # " + idtipovehiculo + " ELIMINADO");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
