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
	


	public AmigosPeludos() {

		
	}
	



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public String getTipoAnimal() {
		return tipoAnimal;
	}


	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}



	public String getNombreDuenio() {
		return nombreDuenio;
	}


	public void setNombreDuenio(String nombreDuenio) {
		this.nombreDuenio = nombreDuenio;
	}

	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public LocalDate getFechaTurno() {
		return fechaTurno;
	}


	public void setFechaTurno(LocalDate fechaTurno) {
		this.fechaTurno = fechaTurno;
	}



	public boolean isEstadoSalud() {
		return estadoSalud;
	}


	public void setEstadoSalud(boolean estadoSalud) {
		this.estadoSalud = estadoSalud;
	}

	public boolean isTipoAtencion() {
		return tipoAtencion;
	}



	public void setTipoAtencion(boolean tipoAtencion) {
		this.tipoAtencion = tipoAtencion;
	}



	public void agendarTurno() {
				
		
		if (!(this.nombre.isEmpty() && this.tipoAnimal.isEmpty()  && this.nombreDuenio.isEmpty() && this.telefono <= 0)) {
			
			if (getFechaTurno() == getFechaTurno()) {
				JOptionPane.showMessageDialog(null, "Ya hay un turno agendado para esa fecha");
			} else {
				JOptionPane.showMessageDialog(null, " Turno agendado para " + getNombre() + " cuyo dueño es " + getNombreDuenio() + " para el dia " + getFechaTurno());
				
			}
		}
	}
	
	public String seguimiento(String nombre) {
		
		return nombre;
		
	}
	
	

}
