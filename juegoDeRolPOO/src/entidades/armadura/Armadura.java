package entidades.armadura;

public class Armadura {
	private String nombre;
	private int precio;
	private int mejoraDeVida;
	private int penalizacionDeVelocidad;
	private String tipo;
	
	public Armadura(
			String tipoArmadura, 
			String nombre, 
			int precio, 
			int mejoraDeVida, 
			int penalizacionDeVelocidad
			) {
		this.tipo = tipoArmadura;
		this.nombre = nombre;
		this.precio = precio;
		this.mejoraDeVida = mejoraDeVida;
		this.penalizacionDeVelocidad = penalizacionDeVelocidad;
	}
	
}
