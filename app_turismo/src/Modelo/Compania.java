package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Compania {
	Conexion conector = new Conexion();

	public String razonsocial;
	public String direccion;
	public String correo;
	public int telefono;
	public String fechacreacion;
	public String web;
	public String observacion;

	public Compania(String razonsocial, String direccion, String correo, int telefono, String fechacreacion, String web,
			String observacion) {
		super();
		this.razonsocial = razonsocial;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.fechacreacion = fechacreacion;
		this.web = web;
		this.observacion = observacion;
	}

	public Compania() {
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreoElectronico() {
		return correo;
	}

	public void setCorreoElectronico(String correo) {
		this.correo = correo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getObservaciones() {
		return observacion;
	}

	public void setObservaciones(String observacion) {
		this.observacion = observacion;
	}

	public void create(String razonsocial, String direccion, String correo, int telefono, String fechacreacion,
			String web, String observacion) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO  tbl_companias (razonsocial, direccion, correo, telefono, fechacreacion, web, observacion) values (?, ?, ?, ?, ?, ?, ?)";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setString(1, razonsocial);
			pst.setString(2, direccion);
			pst.setString(3, correo);
			pst.setInt(4, telefono);
			pst.setString(5, fechacreacion);
			pst.setString(6, web);
			pst.setString(7, observacion);

			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro exitoso");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

	}

	public void delete(int idcompanias) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "DELETE FROM tbl_companias WHERE idcompanias = ?";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			// parametrizar el campo
			pst.setInt(1, idcompanias);

			// CONFIRMAR LA OPERACION
			int resp = JOptionPane.showConfirmDialog(null, " ¿Desea eliminar el registro # " + idcompanias + "?");

			if (resp == JOptionPane.OK_OPTION) {

				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro # " + idcompanias + " ELIMINADO");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
