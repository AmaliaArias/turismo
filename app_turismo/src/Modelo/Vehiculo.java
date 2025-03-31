package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

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
	
	
	public Vehiculo(String matricula, String marca, int puestos, String modelo, int numeromotor,
			String categoria, int idtipovehiculo, int id) {
	
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
	
	public void create (String matricula, String marca, int puestos, String modelo, int numeromotor,
			String categoria, int idtipovehiculo, int id) {
		
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
	
	
	
}