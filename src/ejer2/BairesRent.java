package ejer2;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import ejer1.Main;

public class BairesRent {
	
	private LocalDate ingreso;
	private int estadia;
	private int huespedes;
	private int dormitorios;
	private int ubicacion;
	private LocalDate chekout;
	private boolean alquilado;
	private Period periodo;
	
	


	public BairesRent(LocalDate ingreso, int estadia, int huespedes, int dormitorios, int ubicacion, LocalDate chekout,
			boolean alquilado, Period periodo) {
		super();
		this.ingreso = ingreso;
		this.estadia = estadia;
		this.huespedes = huespedes;
		this.dormitorios = dormitorios;
		this.ubicacion = ubicacion;
		this.chekout = chekout;
		this.alquilado = alquilado;
		this.periodo = periodo;
	}







	public Period getPeriodo() {
		return periodo;
	}







	public void setPeriodo(Period periodo) {
		this.periodo = periodo;
	}







	public boolean isAlquilado() {
		return alquilado;
	}





	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}





	public LocalDate getChekout() {
		return chekout;
	}


	public void setChekout(LocalDate chekout) {
		this.chekout = chekout;
	}


	public LocalDate getIngreso() {
		return ingreso;
	}


	public void setIngreso(LocalDate ingreso) {
		this.ingreso = ingreso;
	}


	public int getEstadia() {
		return estadia;
	}


	public void setEstadia(int estadia) {
		this.estadia = estadia;
	}


	public int getHuespedes() {
		return huespedes;
	}


	public void setHuespedes(int huespedes) {
		this.huespedes = huespedes;
	}


	public int getDormitorios() {
		return dormitorios;
	}


	public void setDormitorios(int dormitorios) {
		this.dormitorios = dormitorios;
	}


	public int getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(int ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	
	public Period estadia() {
		int min = 2024;
		int max = 2026;
		
		int anio = (int) (Math.random() * (max - min + 1)) + min;
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes que quiere entrar (en numero)"));
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia que quiere entrar"));

		if (mes <= 12 && mes > 0 && dia <=31 && dia > 0) {
			ingreso = LocalDate.of(anio, mes, dia);
			
			
			mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes que quiere salir (en numero)"));
			dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia que quiere hacer el chekout"));

			chekout = LocalDate.of(anio, mes, dia);
			
			
			periodo = Period.between(ingreso, chekout);
			
			JOptionPane.showMessageDialog(null, "Entraria en la fecha " + ingreso + " y saldria en la fecha de " + chekout + " Va a estar " + periodo + " dias ");
		} else {
			JOptionPane.showMessageDialog(null, "Error");
		}
		
		
		
		
		return periodo;


	}
	
	public boolean alquiler(Period periodo) {
		
		String [] propiedades = {
				"Puerto Madero", "Palermo",  "Nordelta",  "salir"	
			};
		
		dormitorios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de habitaciones"));
		huespedes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de huespedes"));
		
		int opcion;
		 opcion = JOptionPane.showOptionDialog(null, "Accion", "Inmobiliria", 0, JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("inmo6.jpg")), propiedades, propiedades[0]);

		 while (opcion != 3) {
			 if (opcion == 0) {
				 JOptionPane.showMessageDialog(null,"Puerto Madero", "Departamento", JOptionPane. DEFAULT_OPTION, new ImageIcon (BairesRent.class.getResource ("madero.jpeg")));   
					int precio = (int) (Math.random()*1000000 + 1);
					JOptionPane.showMessageDialog(null, " Hermosa habitacion para " + huespedes + " huespedes " + " con " + dormitorios + " dormitorios"+ " Disponible desde " + periodo + " con un precio de " + precio) ;
			        String pregunta = JOptionPane.showInputDialog("Desea alquilarlo?");
			        if (pregunta.equalsIgnoreCase("si")) {
			        	JOptionPane.showMessageDialog(null, "Gracias por su compra");
			        	alquilado = true;
			        	break;
					} else if (pregunta.equalsIgnoreCase("no")) {
						alquilado = false;
						opcion = JOptionPane.showOptionDialog(null, "Accion", "Veterinaria", 0, JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("images.png")), propiedades, propiedades[0]);

					}
			        
			} else if ( opcion == 1) {
				JOptionPane.showMessageDialog(null,"Palermo",null, JOptionPane. DEFAULT_OPTION, new ImageIcon (BairesRent.class.getResource ("palermo.jpg"))); 
				
				int precio = (int) (Math.random()*1000000 + 1);
				
				JOptionPane.showMessageDialog(null, " Hermosa habitacion para " + huespedes + " huespedes " + " con " + dormitorios + " dormitorios"
	    		+ " Disponible desde " + periodo + " Con un precio de " + precio);
				
		         String pregunta = JOptionPane.showInputDialog("Desea alquilarlo?");
		         
		        if (pregunta.equalsIgnoreCase("si")) {
		        	JOptionPane.showMessageDialog(null, "Gracias por su compra");
		        	alquilado = true;
		        	break;
		        	
				} else if (pregunta.equalsIgnoreCase("no")) {
					alquilado = false;
					opcion = JOptionPane.showOptionDialog(null, "Accion", "Veterinaria", 0, JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("images.png")), propiedades, propiedades[0]);

					
				}
			} else if (opcion == 2) {
				JOptionPane.showMessageDialog(null,"Nordelta",null, JOptionPane. DEFAULT_OPTION, new ImageIcon (BairesRent.class.getResource ("nordelta.jpg")));   
				int precio = (int) (Math.random()*1000000 + 1);
				JOptionPane.showMessageDialog(null, " Hermosa habitacion para " + huespedes + " huespedes " + " con " + dormitorios + " dormitorios"
	    		+ " Disponible desde " + periodo + " con un precio de " + precio) ;
		         String pregunta = JOptionPane.showInputDialog("Desea alquilarlo?");
		        if (pregunta.equalsIgnoreCase("si")) {
		        	JOptionPane.showMessageDialog(null, "Gracias por su compra");
		        	alquilado = true;
		        	break;

				} else if (pregunta.equalsIgnoreCase("no")) {
					alquilado = false;
					
				}
			}
		}
		 
		
		return alquilado;
		 
		
	}
	
	
	

}
