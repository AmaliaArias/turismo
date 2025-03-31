package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Operadores {
	Conexion conector = new Conexion();

	public String tipoDocumento;

	public String nombres;
	public String apellidos;
	public String direccion;
	public String correo;
	public int telefono;
	public String matricula;
	public int idvehiculo;
	public int numDocumento;

	public Operadores(String tipoDocumento, String nombres, String apellidos, String direccion, String correo,
			int telefono, int idvehiculo, String matricula, int numDocumento) {

		super();
		this.tipoDocumento = tipoDocumento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.idvehiculo = idvehiculo;
		this.matricula = matricula;
		this.numDocumento = numDocumento;
	}

	public Operadores() {
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public int getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(int numDocumento) {
		this.numDocumento = numDocumento;
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

	public String getCorreoElectronico() {
		return correo;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correo = correoElectronico;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getIdvehiculo() {
		return idvehiculo;
	}

	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void create(String tipoDocumento, String nombres, String apellidos, String direccion, String correo,
			int telefono, int idvehiculo, String matricula, int numDocumento) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tbl_operadores (tipoDocumento, nombres, apellidos, direccion, correo, telefono, idvehiculo, matricula, numDocumento) values (?, ?, ?, ?, ?, ?, ?, ?, ?) ";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setString(1, tipoDocumento);
			pst.setString(2, nombres);
			pst.setString(3, apellidos);
			pst.setString(4, direccion);
			pst.setString(5, correo);
			pst.setInt(6, telefono);
			pst.setInt(7, idvehiculo);
			pst.setString(8, matricula);
			pst.setInt(9, numDocumento);

			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro exitoso");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
