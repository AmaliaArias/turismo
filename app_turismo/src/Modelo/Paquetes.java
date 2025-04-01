package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Paquetes {
	Conexion conector = new Conexion();

	public int idDestino;
	public int idOrigen;
	public String fechaVenta;
	public String horaventa;
	public String fechaejecucion;
	public String horasalida;
	public String observaciones;
	public int idMedios;
	public String matricula;
	public int idpromotor;
	public Double pecio;
	public int idAgencia;

	public Paquetes(int idDestino, int idOrigen, String fechaVenta, String horaventa, String fechaejecucion,
			String horasalida, String observaciones, int idMedios, String matricula, int idpromotor, Double pecio,
			int idAgencia) {
		super();
		this.idDestino = idDestino;
		this.idOrigen = idOrigen;
		this.fechaVenta = fechaVenta;
		this.horaventa = horaventa;
		this.fechaejecucion = fechaejecucion;
		this.horasalida = horasalida;
		this.observaciones = observaciones;
		this.idMedios = idMedios;
		this.matricula = matricula;
		this.idpromotor = idpromotor;
		this.pecio = pecio;
		this.idAgencia = idAgencia;
	}

	public Paquetes() {
	}

	public int getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}

	public int getIdOrigen() {
		return idOrigen;
	}

	public void setIdOrigen(int idOrigen) {
		this.idOrigen = idOrigen;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public String getHoraventa() {
		return horaventa;
	}

	public void setHoraventa(String horaventa) {
		this.horaventa = horaventa;
	}

	public String getFechaejecucion() {
		return fechaejecucion;
	}

	public void setFechaejecucion(String fechaejecucion) {
		this.fechaejecucion = fechaejecucion;
	}

	public String getHorasalida() {
		return horasalida;
	}

	public void setHorasalida(String horasalida) {
		this.horasalida = horasalida;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getIdMedios() {
		return idMedios;
	}

	public void setIdMedios(int idMedios) {
		this.idMedios = idMedios;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getIdpromotor() {
		return idpromotor;
	}

	public void setIdpromotor(int idpromotor) {
		this.idpromotor = idpromotor;
	}

	public Double getPecio() {
		return pecio;
	}

	public void setPecio(Double pecio) {
		this.pecio = pecio;
	}

	public int getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}

	public void create(int idDestino, int idOrigen, String fechaVenta, String horaventa, String fechaejecucion,
			String horasalida, String observaciones, int idMedios, String matricula, int idpromotor, Float pecio,
			int idAgencia) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tbl_paquete (idDestino, idOrigen, fechaVenta, horaventa, fechaejecucion, horasalida, observaciones, idMedios, matricula, idpromotor, pecio, idAgencia) value (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, idDestino);
			pst.setInt(2, idOrigen);
			pst.setString(3, fechaVenta);
			pst.setString(4, horaventa);
			pst.setString(5, fechaejecucion);
			pst.setString(6, horasalida);
			pst.setString(7, observaciones);
			pst.setInt(8, idMedios);
			pst.setString(9, matricula);
			pst.setInt(10, idpromotor);
			pst.setFloat(11, pecio);
			pst.setInt(12, idAgencia);

			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro exitoso");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public void delete(int codigo) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "DELETE FROM tbl_paquete WHERE codigo = ?";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			// parametrizar el campo
			pst.setInt(1, codigo);

			// CONFIRMAR LA OPERACION
			int resp = JOptionPane.showConfirmDialog(null, " ¿Desea eliminar el registro # " + codigo + "?");

			if (resp == JOptionPane.OK_OPTION) {

				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro # " + codigo + " ELIMINADO");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
