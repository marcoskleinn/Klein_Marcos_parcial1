package ejer1;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class AmigosPeludos {
	
	private String nombre;
	private String tipoAnimal;
	private String nombreDuenio;
	private int telefono;
	private LocalDate fechaTurno;
	private boolean estadoSalud; 
	private boolean tipoAtencion;
	


	public AmigosPeludos(LocalDate fechaTurno) {

		this.fechaTurno = fechaTurno;
	}
	



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		
		nombre = JOptionPane.showInputDialog("Ingrese nombre de la mascota");
		nombreDuenio = JOptionPane.showInputDialog("Nombre del dueño");
		telefono = Integer.parseInt(JOptionPane.showInputDialog("Telefono"));
		
		
		int anio = 2024;
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes de la consulta (en numero)"));
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia de la consulta"));

		
			if (!(this.nombre.isEmpty() && this.tipoAnimal.isEmpty()  && this.nombreDuenio.isEmpty() &&
					this.telefono <= 0 && mes < 31 && dia > 0 && dia < 32)) {
				
				fechaTurno = LocalDate.of(anio, mes, dia);

		JOptionPane.showMessageDialog(null, " Turno agendado para " + getNombre() + " cuyo dueño es " + getNombreDuenio() + " para el dia " + fechaTurno);
				
			} else {
				JOptionPane.showMessageDialog(null, "Error");
			}
		}
	
		
	
	public String consulta(String nombre) {
		
		String salud = JOptionPane.showInputDialog(null, "Diga el estado de salud del animal (diga mala o buena)");
		if (salud.equalsIgnoreCase("buena")) {
			estadoSalud = true;
			JOptionPane.showMessageDialog(null, getNombre());
			int vacunas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de vacunas"));
			if (vacunas >= 3) {
				JOptionPane.showMessageDialog(null, " Debe tener mas de 5 vacunas");
				JOptionPane.showMessageDialog(null, "El siguiente turno debe ser un tipo de atencion adicional");
				tipoAtencion = true;
			}
		} else if (salud.equalsIgnoreCase("mala")) {
			nombre = JOptionPane.showInputDialog(getNombre());
			JOptionPane.showMessageDialog(null, "El siguiente turno debe ser un tipo de un tratamiento");
			tipoAtencion = false;
		}
		return nombre;
		
	}
	
	

}
