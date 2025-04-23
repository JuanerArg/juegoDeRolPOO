package entidades;

import entidades.armadura.Armadura;
import entidades.equipamiento.Arma;

public class Jugador {
	private String nombre;
	private int ID;
	private int vida = 100;
	private int dañoAtaque = 2;
	private int velocidadDeAtaque = 1;
	private int dinero = 7000;
	private Armadura casco;
	private Armadura peto;
	private Armadura grebas;
	private Armadura botas;
	private Arma arma;
	
	public Jugador(String Nombre, int ID) {
		this.nombre = Nombre;
		this.ID = ID;
	}
	
	public int getDinero() {
		return this.dinero;
	}
	
	public void setDinero(int nuevoSaldo) {
		if(nuevoSaldo >= 0) {
			if(nuevoSaldo < this.dinero) {
				this.dinero = nuevoSaldo;
			}else {
				System.err.println("[ERROR] No puede ingresar mas dinero del que ya hay");	
			}			
		}else{
			System.err.println("[ERROR] No le alcanza el dinero");
		}
	}
}
