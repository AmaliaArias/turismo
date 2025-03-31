package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Promotor {
	Conexion conector = new Conexion();
	
	public String tipoDocumento;
	public int documento;
	public String nombres;
	public String apellidos;
	public String direccion;
	public String correoPersonal;
	public String correoCorporativo;
	public String fechaNacimiento;
	public int telefono;
	
	public Promotor(String tipoDocumento, int documento, String nombres, String apellidos,
			String direccion, String correoPersonal, String correoCorporativo, String fechaNacimiento, int telefono) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.correoPersonal = correoPersonal;
		this.correoCorporativo = correoCorporativo;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
	}

	public Promotor() {
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreoPersonal() {
		return correoPersonal;
	}

	public void setCorreoPersonal(String correoPersonal) {
		this.correoPersonal = correoPersonal;
	}

	public String getCorreoCorporativo() {
		return correoCorporativo;
	}

	public void setCorreoCorporativo(String correoCorporativo) {
		this.correoCorporativo = correoCorporativo;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public void create (String tipoDocumento, int documento, String nombres, String apellidos,
			String direccion, String correoPersonal, String correoCorporativo, String fechaNacimiento, int telefono) {
		
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "INSERT INTO tbl_promotor (tipoDocumento, documento, nombres, apellidos, direccion, correoPersonal, correoCorporativo, fechaNacimiento, telefono) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
		
			pst.setString(1, tipoDocumento);
			pst.setInt(2, documento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, direccion);
			pst.setString(6, correoPersonal);
			pst.setString(7, correoCorporativo);
			pst.setString(8, fechaNacimiento);
			pst.setInt(9, telefono);
		
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro exitoso");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	
}

