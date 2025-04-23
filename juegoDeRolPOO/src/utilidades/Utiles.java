package utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utiles {
	public static Scanner s = new Scanner(System.in);
	
	public static int ingresarEntero(final int MIN, final int MAX) {
		int numero = 0;
		boolean error = false;
		
		if(MIN > MAX) {
			System.err.println("[ERROR] Error fatal, minimo nunca puede ser mayor que maximo");
			System.exit(1);
		}
		
		do {		
			try {
				numero = Utiles.s.nextInt();
				if(numero > MAX || numero < MIN) {
					System.err.println("[ERROR] Ingrese un numero dentro del rango (" + MIN + " - " + MAX + ")");
					error = true;
				}
			}catch(InputMismatchException e) {
				System.err.println("[ERROR] Ingrese un numero entero");
				error = true;
			}catch(Exception e) {
				System.err.println("[ERROR] Error no contemplado, llame a Servicio Tecnico");
				error = true;
			}
		}while(error);
		
		return numero;
	}
}
