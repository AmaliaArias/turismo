package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class Cliente {
	Conexion conector = new Conexion();

	public String tipoDocumento;
	public int documento;
	public String nombres;
	public String apellidos;
	public String direccion;
	public String eps;
	public String alergias;
	public String fechaNacimiento;
	public String correo;
	public String estadocivil;
	public int telefono;

	public Cliente(String tipoDocumento, int documento, String nombres, String apellidos, String eps, String alergias,
			String fechaNacimiento, String correo, String estadocivil, int telefono, String direccion) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.eps = eps;
		this.alergias = alergias;
		this.fechaNacimiento = fechaNacimiento;
		this.correo = correo;
		this.estadocivil = estadocivil;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public Cliente() {
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

	public String getEps() {
		return eps;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCorreoElectronico() {
		return correo;
	}

	public void setCorreoElectronico(String correo) {
		this.correo = correo;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	// CREATE
	public void create(String tipoDocumento, int documento, String nombres, String apellidos, String eps,
			String alergias, String fechaNacimiento, String correo, String estadocivil, int telefono,
			String direccion) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tbl_clientes (tipoDocumento, documento, nombres, apellidos, eps, alergias, fechaNacimiento, correo, estadoCivil, telefono, direccion ) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setString(1, tipoDocumento);
			pst.setInt(2, documento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, eps);
			pst.setString(6, alergias);
			pst.setString(7, fechaNacimiento);
			pst.setString(8, correo);
			pst.setString(9, estadocivil);
			pst.setInt(10, telefono);
			pst.setString(11, direccion);

			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro exitoso");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// DELETE
	public void delete(int idclientes) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "DELETE FROM tbl_clientes WHERE idclientes = ?";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			// parametrizar el campo
			pst.setInt(1, idclientes);

			// CONFIRMAR LA OPERACION
			int resp = JOptionPane.showConfirmDialog(null, " ¿Desea eliminar el registro # " + idclientes + "?");

			if (resp == JOptionPane.OK_OPTION) {

				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro # " + idclientes + " ELIMINADO");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// BUSCAR
	public void readOne(int idclientes, JTextField tipoDocumento, JTextField documento, JTextField nombres,
			JTextField apellidos, JTextField eps, JTextField alergias, JTextField fechaNacimiento, JTextField correo,
			JTextField estadocivil, JTextField telefono, JTextField direccion) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // PREPARA LA TRANSACCION

		String script = "SELECT * FROM tbl_clientes WHERE idclientes = ?";

		try {
			dbConnection = conector.conectarBD(); // ABRIR LA CONEXION
			pst = dbConnection.prepareStatement(script); // ABRIR EL BUFFLE

			pst.setInt(1, idclientes);

			ResultSet rs = pst.executeQuery(); // ALMACENAMIENTO TEMPORAL

			while (rs.next()) {
				tipoDocumento.setText(rs.getString(2));
				documento.setText(rs.getString(3));
				nombres.setText(rs.getString(4));
				apellidos.setText(rs.getString(5));
				eps.setText(rs.getString(6));
				alergias.setText(rs.getString(7));
				fechaNacimiento.setText(rs.getString(8));
				correo.setText(rs.getString(9));
				estadocivil.setText(rs.getString(10));
				telefono.setText(rs.getString(11));
				direccion.setText(rs.getString(12));

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// UPDATE
	public void update(int idclientes, String tipoDocumento, int documento, String nombres, String apellidos,
			String eps, String alergias, String fechaNacimiento, String correo, String estadocivil, int telefono,
			String direccion) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // PREPARA LA TRANSACCION

		String script = "UPDATE tbl_clientes SET tipoDocumento = ?, documento = ?, nombres = ?, apellidos = ?, eps = ?, alergias = ?, fechaNacimiento = ?, correo = ?, estadocivil = ?, telefono = ?, direccion = ? WHERE idclientes  = ?";

		try {
			dbConnection = conector.conectarBD(); // ABRIR LA CONEXION pst =
			pst = dbConnection.prepareStatement(script); // ABRIR EL BUFFLE ResultSet rs =

			pst.setString(1, tipoDocumento);
			pst.setInt(2, documento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, eps);
			pst.setString(6, alergias);
			pst.setString(7, fechaNacimiento);
			pst.setString(8, correo);
			pst.setString(9, estadocivil);
			pst.setInt(10, telefono);
			pst.setString(11, direccion);
			pst.setInt(12, idclientes);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + idclientes + "?");

			if (resp == JOptionPane.YES_OPTION) {
				pst.execute();

				JOptionPane.showConfirmDialog(null, "Registro No. " + idclientes + " Actualizado");

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
