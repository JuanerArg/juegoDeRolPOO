package entidades.equipamiento;

public class Arma {
	private String nombre;
	private int dañoAtaque;
	private int velocidadDeAtaque;
	private int precio;
	
	public Arma(String nombre, int dañoAtaque, int velocidadDeAtaque, int precio) {
		this.nombre = nombre;
		this.dañoAtaque = dañoAtaque;
		this.velocidadDeAtaque = velocidadDeAtaque;
		this.precio = precio;
	}
	
}
