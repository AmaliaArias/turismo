package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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

	public void delete(int id) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "DELETE FROM tbl_operadores WHERE id = ?";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			// parametrizar el campo
			pst.setInt(1, id);

			// CONFIRMAR LA OPERACION
			int resp = JOptionPane.showConfirmDialog(null, " ¿Desea eliminar el registro # " + id + "?");

			if (resp == JOptionPane.OK_OPTION) {

				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro # " + id + " ELIMINADO");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	

	 

	// SEARH - UPDATE
	public void readOne(int id, JTextField nombres, JTextField apellidos, JTextField direccion,
			JTextField correo, JTextField telefono, JTextField idvehiculo, JTextField matricula, JTextField numDocumento) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // PREPARA LA TRANSACCION

		String script = "SELECT * FROM tbl_operadores WHERE id = ?";

		try {
			dbConnection = conector.conectarBD(); // ABRIR LA CONEXION
			pst = dbConnection.prepareStatement(script); // ABRIR EL BUFFLE

			//parametrizar los datos
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery(); // ALMACENAMIENTO TEMPORAL

			while (rs.next()) {
				System.out.println("");
				nombres.setText(rs.getString(2));
				apellidos.setText(rs.getString(3));
				direccion.setText(rs.getString(4));
				correo.setText(rs.getString(5));
				telefono.setText(rs.getString(6));
				idvehiculo.setText(rs.getString(7));
				matricula.setText(rs.getString(8));
				numDocumento.setText(rs.getString(9));
				
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
