package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class Vehiculo {
	Conexion conector = new Conexion();

	public String matricula;
	public String marca;
	public int puestos;
	public String modelo;
	public int numeromotor;
	public String categoria;
	public int idtipovehiculo;
	public int id;

	public Vehiculo(String matricula, String marca, int puestos, String modelo, int numeromotor, String categoria,
			int idtipovehiculo, int id) {

		super();
		this.matricula = matricula;
		this.marca = marca;
		this.puestos = puestos;
		this.modelo = modelo;
		this.numeromotor = numeromotor;
		this.categoria = categoria;
		this.idtipovehiculo = idtipovehiculo;
	}

	public Vehiculo() {
	}

	public int getIdmatricula() {
		return idtipovehiculo;
	}

	public void setIdmatricula(int idmatricula) {
		this.idtipovehiculo = idmatricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeromotor() {
		return numeromotor;
	}

	public void setNumeromotor(int numeromotor) {
		this.numeromotor = numeromotor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void create(String matricula, String marca, int puestos, String modelo, int numeromotor, String categoria,
			int idtipovehiculo, int id) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tbl_vehiculo (matricula, marca, puestos, modelo, numeromotor, categoria, idtipovehiculo, id) values (?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setString(1, matricula);
			pst.setString(2, marca);
			pst.setInt(3, puestos);
			pst.setString(4, modelo);
			pst.setInt(5, numeromotor);
			pst.setString(6, categoria);
			pst.setInt(7, idtipovehiculo);
			pst.setInt(8, id);

			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro exitoso");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

	}

	// DELETE
	public void delete(int id) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "DELETE FROM tbl_vehiculo WHERE id = ?";

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

	// SEARH
	public void readOne(String matricula, JTextField id, JTextField marca, JTextField puestos, JTextField modelo,
			JTextField numeromotor, JTextField categoria, JTextField idtipovehiculo) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // PREPARA LA TRANSACCION

		String script = "SELECT * FROM tbl_vehiculo WHERE matricula = ?";

		try {
			dbConnection = conector.conectarBD(); // ABRIR LA CONEXION
			pst = dbConnection.prepareStatement(script); // ABRIR EL BUFFLE

			pst.setString(1, matricula);

			ResultSet rs = pst.executeQuery(); // ALMACENAMIENTO TEMPORAL

			while (rs.next()) {

				marca.setText(rs.getString(2));
				puestos.setText(rs.getString(3));
				modelo.setText(rs.getString(4));
				numeromotor.setText(rs.getString(5));
				categoria.setText(rs.getString(6));
				idtipovehiculo.setText(rs.getString(7));
				id.setText(rs.getString(8));

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// UPDATE
	public void update(String matricula, String marca, int puestos, String modelo, int numeromotor,
			String categoria, int idtipovehiculo, int id) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // PREPARA LA TRANSACCION

		String script = "UPDATE tbl_vehiculo SET marca = ?, puestos = ?, modelo = ?, numeromotor = ?, categoria = ?, idtipovehiculo = ?, id = ? WHERE matricula  = ?";

		try {
			dbConnection = conector.conectarBD(); // ABRIR LA CONEXION pst =
			pst = dbConnection.prepareStatement(script); // ABRIR EL BUFFLE ResultSet rs =

			
			pst.setString(1, marca);
			pst.setInt(2, puestos);
			pst.setString(3, modelo);
			pst.setInt(4, numeromotor);
			pst.setString(5, categoria);
			pst.setInt(6, idtipovehiculo);
			pst.setInt(7, id);
			pst.setString(8, matricula);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + matricula + "?");

			if (resp == JOptionPane.YES_OPTION) {
				pst.execute();

				JOptionPane.showConfirmDialog(null, "Registro No. " + matricula + " Actualizado");

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}