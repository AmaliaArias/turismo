package Modelo;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class TestPrincipal {

	public static void main(String[] args) {
		Conexion test = new Conexion();
				if (test.conectarBD() != null) {
					JOptionPane.showConfirmDialog(null, "Conectado a la BD");
					
				} else {
					JOptionPane.showConfirmDialog(null, "No conectado a la BD");
				}
	}

}
