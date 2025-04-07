package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;
import Vista.frm_Principal;

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
	public String contrasena;

	public Promotor(String contrasena) {
		super();
		this.contrasena = contrasena;
	}

	public String getContasena() {
		return contrasena;
	}

	public void setContasena(String contasena) {
		this.contrasena = contasena;
	}

	public Promotor(String tipoDocumento, int documento, String nombres, String apellidos, String direccion,
			String correoPersonal, String correoCorporativo, String fechaNacimiento, int telefono) {
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

	// CREATE
	public void create(String tipoDocumento, int documento, String nombres, String apellidos, String direccion,
			String correoPersonal, String correoCorporativo, String fechaNacimiento, int telefono, String contrasena) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tbl_promotor (tipoDocumento, documento, nombres, apellidos, direccion, correoPersonal, correoCorporativo, fechaNacimiento, telefono, contrasena) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

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
			pst.setString(10, contrasena);

			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro exitoso");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

	}

	// DELETE
	public void delete(int idPromotor) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "DELETE FROM tbl_promotor WHERE idPromotor = ?";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			// parametrizar el campo
			pst.setInt(1, idPromotor);

			// CONFIRMAR LA OPERACION
			int resp = JOptionPane.showConfirmDialog(null, " ¿Desea eliminar el registro # " + idPromotor + "?");

			if (resp == JOptionPane.OK_OPTION) {

				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro # " + idPromotor + " ELIMINADO");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// ALL

	// USER
	public void controlAcceso(int user, String pass) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // PREPARA LA TRANSACCION

		String script = "SELECT * FROM tbl_promotor WHERE documento = ? and contrasena = ? ";

		try {
			dbConnection = conector.conectarBD(); // ABRIR LA CONEXION
			pst = dbConnection.prepareStatement(script); // ABRIR EL BUFFLE

			pst.setInt(1, user);
			pst.setString(2, pass);

			ResultSet rs = pst.executeQuery(); // ALMACENAMIENTO TEMPORAL

			while (rs.next()) {

				frm_Principal login = new frm_Principal();
				login.show();
				login.setVisible(true);

				// si entra aca es porque hay datos validos
				JOptionPane.showConfirmDialog(null, "Acceso Permitido");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// BUSCAR
	public void readOne(int idPromotor, JTextField tipoDocumento, JTextField documento, JTextField nombres,
			JTextField apellidos, JTextField direccion, JTextField correoPersonal, JTextField correoCorporativo,
			JTextField fechaNacimiento, JTextField telefono) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // PREPARA LA TRANSACCION

		String script = "SELECT * FROM tbl_promotor WHERE idPromotor = ?";

		try {
			dbConnection = conector.conectarBD(); // ABRIR LA CONEXION
			pst = dbConnection.prepareStatement(script); // ABRIR EL BUFFLE

			pst.setInt(1, idPromotor);

			ResultSet rs = pst.executeQuery(); // ALMACENAMIENTO TEMPORAL

			while (rs.next()) {
				tipoDocumento.setText(rs.getString(2));
				documento.setText(rs.getString(3));
				nombres.setText(rs.getString(4));
				apellidos.setText(rs.getString(5));
				direccion.setText(rs.getString(6));
				correoPersonal.setText(rs.getString(7));
				correoCorporativo.setText(rs.getString(8));
				fechaNacimiento.setText(rs.getString(9));
				telefono.setText(rs.getString(10));

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// UPDATE
	public void update(int idPromotor, String tipoDocumento, int documento, String nombres, String apellidos,
			String direccion, String correoPersonal, String correoCorporativo, String fechaNacimiento, int telefono,
			String contrasena) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // PREPARA LA TRANSACCION

		String script = "UPDATE tbl_promotor SET tipoDocumento = ?, documento = ?, nombres = ?, apellidos = ?, direccion = ?, correoPersonal = ?, correoCorporativo = ?, fechaNacimiento = ?, telefono = ?, contrasena = ? WHERE idPromotor  = ?";

		try {
			dbConnection = conector.conectarBD(); // ABRIR LA CONEXION pst =
			pst = dbConnection.prepareStatement(script); // ABRIR EL BUFFLE ResultSet rs =

			pst.setString(1, tipoDocumento);
			pst.setInt(2, documento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, direccion);
			pst.setString(6, correoPersonal);
			pst.setString(7, correoCorporativo);
			pst.setString(8, fechaNacimiento);
			pst.setInt(9, telefono);
			pst.setString(10, contrasena);
			pst.setInt(11, idPromotor);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + idPromotor + "?");

			if (resp == JOptionPane.YES_OPTION) {
				pst.execute();

				JOptionPane.showConfirmDialog(null, "Registro No. " + idPromotor + " Actualizado");

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
