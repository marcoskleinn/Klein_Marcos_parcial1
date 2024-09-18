package ejer1;

import java.time.LocalDate;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AmigosPeludos cliente1 = new AmigosPeludos(LocalDate.of(2024, 6, 23));
		AmigosPeludos cliente2 = new AmigosPeludos(LocalDate.of(2024, 6, 23));
		AmigosPeludos cliente3 = new AmigosPeludos(null);

		cliente1.setFechaTurno(null);
		
		int opcion;
		String [] operacion = {
				"Reservar Turno", "Consulta con el medico",  "Salir"	
			};
		
		
		do {
			 opcion = JOptionPane.showOptionDialog(null, "Accion", "Veterinaria", 0, JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("images.png")), operacion, operacion[0]);

			 switch (opcion) {
				case 0:
					cliente1.agendarTurno();
					cliente2.agendarTurno();
					
					break;
					
				case 1:
					
					cliente1.consulta("");
					
					break;
					
				case 2:
					JOptionPane.showMessageDialog(null, "Gracias por confiar en nosotros");
					break;	


				}
		} while (opcion != 3);
	}

}
