package ejer1;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class AmigosPeludos {
	
	private String nombre;
	private double peso;
	private String tipoAnimal;
	private String nombreDuenio;
	private int telefono;
	LocalDate fechaTurno;
	private boolean estadoSalud; 
	private boolean tipoAtencion;
	

	




	public AmigosPeludos(String nombre, String tipoAnimal, String nombreDuenio, int telefono,
			LocalDate fechaTurno) {
		this.nombre = nombre;
		this.tipoAnimal = tipoAnimal;
		this.nombreDuenio = nombreDuenio;
		this.telefono = telefono;
		this.fechaTurno = fechaTurno;
	}







	public void AgendarTurno() {
		
		tipoAnimal = JOptionPane.showInputDialog("Ingrese el tipo de animmal");
		
		nombre = JOptionPane.showInputDialog("Ingrese nombre del animal");
		
		
	}
	
	

}
