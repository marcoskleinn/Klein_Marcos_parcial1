package ejer2;

import java.time.LocalDate;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BairesRent propiedad1 = new BairesRent(null, 0, 0, 0, 0, null, false, null);
		BairesRent propiedad2 = new BairesRent(null, 0, 0, 0, 0, null, false, null);

		
		
		
		int opcion;
		String [] operacion = {
				"estadia", "Alquiler",  "Salir"	
			};
		
		
		do {
			 opcion = JOptionPane.showOptionDialog(null, "Accion", "Inmobiliria", 0, JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("inmo6.jpg")), operacion, operacion[0]);

			 switch (opcion) {
				case 0:
					propiedad1.estadia();
					break;
					
				case 1:
					
					propiedad1.alquiler(propiedad1.getPeriodo());
					
					break;
					
				case 2:
					JOptionPane.showMessageDialog(null, "Gracias por confiar en nosotros");
					break;	


				}
		} while (opcion != 2);
		
	}

}
