package interfaces;

import entidades.Jugador;
import utilidades.Utiles;

public class Inicio {
	private  int contadorDeJugadores = 1;
	private String pedirNombreDelUsuario() {
		System.out.println("Ingrese su nombre");
		String nombre = Utiles.s.nextLine();
		return nombre;
	}
	
	public Jugador crearJugador() {
		String nombre = pedirNombreDelUsuario();
		int ID = contadorDeJugadores;
		return new Jugador(nombre, ID);
	}
	
	public Tienda crearTienda(Jugador jugador) {
		return new Tienda(jugador);
	}
}
