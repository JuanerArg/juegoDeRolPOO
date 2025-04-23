package principal;

import entidades.Jugador;
import interfaces.Inicio;
import interfaces.Tienda;

public class Principal {
	public static void main(String[] args) {
		Inicio inicio = new Inicio();
		
		Jugador jugador1 = inicio.crearJugador();
		Jugador jugador2 = inicio.crearJugador();
		
		Tienda Armeria1 = inicio.crearTienda(jugador1);	
		Armeria1.mostrarTienda();
		Tienda Armeria2 = inicio.crearTienda(jugador2);	
		Armeria2.mostrarTienda();
		
		
	}
	
}
