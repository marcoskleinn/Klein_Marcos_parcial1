package ejer1;

import java.time.LocalDate;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AmigosPeludos veterinaria = new AmigosPeludos();
		AmigosPeludos cliente1 = new AmigosPeludos();
		AmigosPeludos cliente2 = new AmigosPeludos();
		
		
		int opcion;
		String [] operacion = {
				"Reservar Turno", "Consulta con el medico", "Salir"	
			};
		
		cliente1.setNombre("Juan");
		cliente1.setNombreDuenio("jose");
		cliente1.setTelefono(1212);
		cliente1.setFechaTurno(LocalDate.of(2024, 6, 23));
		
		cliente2.setNombre("Marcos");
		cliente2.setNombreDuenio("Jorge");
		cliente2.setTelefono(12123);
		cliente2.setFechaTurno(LocalDate.of(2024, 5, 22));
		
		
		do {
			 opcion = JOptionPane.showOptionDialog(null, "Accion", "Banco", 0, JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("images.png")), operacion, operacion[0]);

			 switch (opcion) {
				case 0:
					cliente1.agendarTurno();
					cliente2.agendarTurno();
					break;
					
				case 1:
					
					break;
					
				case 2:
					JOptionPane.showMessageDialog(null, "Gracias por confiar en nosotros");
					break;	


				}
		} while (opcion != 2);
	}

}
