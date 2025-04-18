package Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class Agencias {
	Conexion conector = new Conexion();

	public String ubicacion;
	public String nombre;
	public String direccion;
	public String correoElectronico;
	public int telefono;
	public String web;
	public String observaciones;
	public int idcompanias;

	public Agencias(String ubicacion, String nombre, String direccion, String correoElectronico, int telefono,
			String web, String observaciones, int idcompanias) {
		super();
		this.ubicacion = ubicacion;
		this.nombre = nombre;
		this.direccion = direccion;
		this.correoElectronico = correoElectronico;
		this.telefono = telefono;
		this.web = web;
		this.observaciones = observaciones;
		this.idcompanias = idcompanias;
	}

	public Agencias() {
	}

	public Conexion getConector() {
		return conector;
	}

	public void setConector(Conexion conector) {
		this.conector = conector;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getIdcompanias() {
		return idcompanias;
	}

	public void setIdcompanias(int idcompanias) {
		this.idcompanias = idcompanias;
	}

	// CREATE
	public void create(String ubicacion, String nombre, String direccion, String correoElectronico, int telefono,
			String web, String observaciones, int idcompanias) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tbl_agencias (ubicación, nombre, direccion, correoElectronico, telefono, web, observacion, idcompanias) value (?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setString(1, ubicacion);
			pst.setString(2, nombre);
			pst.setString(3, direccion);
			pst.setString(4, correoElectronico);
			pst.setInt(5, telefono);
			pst.setString(6, web);
			pst.setString(7, observaciones);
			pst.setInt(8, idcompanias);

			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro exitoso");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// DELETE
	public void delete(int idAgencia) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "DELETE FROM tbl_agencias WHERE idAgencia = ?";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			// parametrizar el campo
			pst.setInt(1, idAgencia);

			// CONFIRMAR LA OPERACION
			int resp = JOptionPane.showConfirmDialog(null, " ¿Desea eliminar el registro # " + idAgencia + "?");

			if (resp == JOptionPane.OK_OPTION) {

				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro # " + idAgencia + " ELIMINADO");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// BUSCAR
	public void readOne(int idAgencia, JTextField ubicacion, JTextField nombre, JTextField direccion,
			JTextField correoElectronico, JTextField telefono, JTextField web, JTextField observaciones,
			JTextField idcompanias) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "SELECT * FROM tbl_agencias WHERE idAgencia = ?";

		try {
			dbConnection = conector.conectarBD(); // ABRIR LA CONEXIÓN
			pst = dbConnection.prepareStatement(script); // PREPARAR EL BUFFER

			pst.setInt(1, idAgencia);

			ResultSet rs = pst.executeQuery(); // ALMACENAMIENTO TEMPORAL

			while (rs.next()) {
				ubicacion.setText(rs.getString(1));
				nombre.setText(rs.getString(2));
				direccion.setText(rs.getString(3));
				correoElectronico.setText(rs.getString(4));
				telefono.setText(rs.getString(5));
				web.setText(rs.getString(6));
				observaciones.setText(rs.getString(7));
				idcompanias.setText(rs.getString(8));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	// UPDATE
	public void update(int idAgencia, String ubicacion, String nombre, String direccion, String correoElectronico,
			int telefono, String web, String observaciones, int idcompanias) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // PREPARA LA TRANSACCION

		String script = "UPDATE tbl_agencias SET ubicación = ?, nombre = ?, direccion = ?, correoElectronico = ?, telefono = ?, web = ?, observacion = ?, idcompanias = ? WHERE idAgencia  = ?";

		try {
			dbConnection = conector.conectarBD(); // ABRIR LA CONEXION pst =
			pst = dbConnection.prepareStatement(script); // ABRIR EL BUFFLE ResultSet rs =

			pst.setString(1, ubicacion);
			pst.setString(2, nombre);
			pst.setString(3, direccion);
			pst.setString(4, correoElectronico);
			pst.setInt(5, telefono);
			pst.setString(6, web);
			pst.setString(7, observaciones);
			pst.setInt(8, idcompanias);
			pst.setInt(9, idAgencia);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + idAgencia + "?");

			if (resp == JOptionPane.YES_OPTION) {
				pst.execute();

				JOptionPane.showConfirmDialog(null, "Registro No. " + idAgencia + " Actualizado");

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
