package interfaces;

import entidades.Jugador;
import entidades.armadura.Armadura;
import entidades.equipamiento.Arma;
import utilidades.Utiles;

/*Para Arreglar
 * 
 * Que no puedan ser null los nombre
 * 	que no se puedan repetir el equipamiento y ver de borrarlos de la matriz
 * 	unificar interfaz grafica
 * 	Que te muestre que compraste hasta ahora
 * 	Que te muestre tu saldo
 * 
 * */

public class Tienda {
		private Jugador jugador;
		private int saldoJugador;
	
		final private int MIN_ARMADURAS = 1; final private int MAX_ARMADURAS = 24;
		final private int MIN_ARMAS = 1; final private int MAX_ARMAS = 18;
		
		final private int MIN_OPCIONES_MENU = 1; final private int MAX_OPCIONES_MENU = 3;
		
		final private int TIPO_ARMADURA = 0;
		final private int NOMBRE_ARMADURA = 1;
		final private int PRECIO_ARMADURA = 2;
		final private int MEJORA_VIDA_ARMADURA = 3;
		final private int PENALIZACION_VELOCIDAD_ARMADURA= 4;
		final private String[][] ARMADURAS = new String[][] {
			{"Casco","Casco de cuero","500","5","0"},
			{"Casco","Casco de bronce","800","10","2"},
			{"Casco","Casco de plata","1000","15","2"},
			{"Casco","Casco de oro","1200","20","1"},
			{"Casco","Casco de platino","1500","25","0"},
			{"Casco","Casco de diamante","1800","30","0"},
			{"Peto","Peto de cuero","700","10","0"},
			{"Peto","Peto de bronce","1200","15","3"},
			{"Peto","Peto de plata","1500","25","3"},
			{"Peto","Peto de oro","1800","30","2"},
			{"Peto","Peto de platino","2000","35","1"},
			{"Peto","Peto de diamante","2500","50","0"},
			{"Grebas","Grebas de cuero","600","5","1"},
			{"Grebas","Grebas de bronce","1300","10","2"},
			{"Grebas","Grebas de plata","1500","20","3"},
			{"Grebas","Grebas de oro","1800","30","2"},
			{"Grebas","Grebas de platino","2000","35","1"},
			{"Grebas","Grebas de diamante","2500","40","0"},
			{"Botas","Botas de cuero","400","5","0"},
			{"Botas","Botas de bronce","600","5","2"},
			{"Botas","Botas de plata","800","5","1"},
			{"Botas","Botas de oro","1500","5","0"},
			{"Botas","Botas de platino","2000","5","0"},
			{"Botas","Botas de diamante","2200","5","0"}
			};
		
		final private int NOMBRE_ARMA = 0;
		final private int DAÑO_ARMA = 1;
		final private int 	VELOCIDAD_ARMA = 2;
		final private int 	PRECIO_ARMA = 3;
		
		final private String[][] ARMAS = new String[][] {
			{"Daga filosa","3","10","500"},
			{"Daga Dorada","5","12","1500"},
			{"Daga prohibida","10","20","2500"},
			{"Espada de madera","5","18","800"},
			{"Espada de piedra","15","10","1500"},
			{"Espada de tantalio","20","25","2800"},
			{"Espada de grafito","20","30","3200"},
			{"Maza de piedra","20","8","800"},
			{"Maza de hierro","25","10","1300"},
			{"Maza de platino","35","15","2200"},
			{"Maza de materia oscura","50","18","4500"},
			{"Arco liviano","5","20","700"},
			{"Arco preciso","8","15","1000"},
			{"Arco de diamante","10","20","2000"},
			{"Arco encantado","15","18","2200"},
			{"Hacha vieja","15","10","1200"},
			{"Hacha pesada","25","12","1800"},
			{"Hacha Vikinga","35","15","2400"}
			};
		
		
		public Tienda(Jugador jugador) {
			this.jugador = jugador;
			this.saldoJugador = jugador.getDinero();
		}
		
		public void mostrarTienda() {
			System.out.println("Bienvenido a la Armeria!");
			System.out.println("Venis por armaduras(1) o por armas(2)?");
			elegirQueComprar();
		}
		
		private void mostrarArmaduras() {
			for (int i = 0; i < ARMADURAS.length; i++) {
				System.out.println((i+1) + ")");
				System.out.println("	Tipo: " + ARMADURAS[i][TIPO_ARMADURA]);
				System.out.println("	Nombre: " + ARMADURAS[i][NOMBRE_ARMADURA]);
				System.out.println("	Precio: " + ARMADURAS[i][PRECIO_ARMADURA]);
				System.out.println("	Puntos de vida extra: " + ARMADURAS[i][MEJORA_VIDA_ARMADURA]);
				System.out.println("	Penalizacion de velocidad: " + ARMADURAS[i][PENALIZACION_VELOCIDAD_ARMADURA]);
			}
		}
		
		private void mostrarArmas() {
			for (int i = 0; i < ARMAS.length; i++) {
				System.out.println(i + ")");
				System.out.println("	Nombre: " + ARMAS[i][NOMBRE_ARMA]);
				System.out.println("	Daño: " + ARMAS[i][DAÑO_ARMA]);
				System.out.println("	Velocidad: " + ARMAS[i][VELOCIDAD_ARMA]);
				System.out.println("	Precio: " + ARMAS[i][PRECIO_ARMA]);
			}
		}
		
		private void elegirQueComprar() {
			int opcion = 0;
			do {
				if(opcion != 0) {
					System.out.println("	---Tienda---");
					System.out.println("1-Mostrar armaduras");
					System.out.println("2-Mostrar armas");
					System.out.println("3-Salir");
				}
				opcion = Utiles.ingresarEntero(MIN_OPCIONES_MENU, MAX_OPCIONES_MENU);
				switch(opcion) {
				case 1:
					mostrarArmaduras();
					int idArmadura = elegirCualComprar(opcion);
					crearArmadura(idArmadura);
					break;
				case 2:
					mostrarArmas();
					int idArma = elegirCualComprar(opcion);
					crearArma(idArma);
					break;
				case 3:
					break;
				default:
					System.err.println("[ERROR] Ingrese una opcion valida");
					break;
				}
			}while(opcion != 3);
		}
		
		private int elegirCualComprar(int opcionMenu) {
			int opcion = 0;
			if(opcionMenu == 1) {
				opcion = comprarArmadura();
			}else {
				opcion = comprarArma();
			}
			return opcion;
		}

		public int comprarArma() {
			int opcion;
			System.out.println("Ingrese que arma quiere comprar");
			opcion = Utiles.ingresarEntero(MIN_ARMAS, MAX_ARMAS);
			int precioArma = pasarAEntero(ARMAS[opcion][PRECIO_ARMA]);
			if(saldoJugador < precioArma) {
				System.err.println("[ERROR] Tu saldo es insuficiente");
			}
			return opcion;
		}

		public int comprarArmadura() {
			int opcion;
			System.out.println("Ingrese que armadura quiere comprar");
			opcion = Utiles.ingresarEntero(MIN_ARMADURAS, MAX_ARMADURAS);
			int precioArmadura = pasarAEntero(ARMADURAS[opcion][PRECIO_ARMADURA]);
			if(saldoJugador < precioArmadura) {
				System.err.println("[ERROR] Tu saldo es insuficiente");
			}
			return opcion;
		}
		
		private Armadura crearArmadura(final int ID_ARMADURA) {
			return new Armadura(
							ARMADURAS[ID_ARMADURA][TIPO_ARMADURA],
							ARMADURAS[ID_ARMADURA][NOMBRE_ARMADURA],
							pasarAEntero(ARMADURAS[ID_ARMADURA][PRECIO_ARMADURA]),
							pasarAEntero(ARMADURAS[ID_ARMADURA][MEJORA_VIDA_ARMADURA]),
							pasarAEntero(ARMADURAS[ID_ARMADURA][PENALIZACION_VELOCIDAD_ARMADURA])
					);
		}
		
		private Arma crearArma(final int ID_ARMA) {
			return new Arma(
					ARMAS[ID_ARMA][NOMBRE_ARMA],
					pasarAEntero(ARMAS[ID_ARMA][DAÑO_ARMA]),
					pasarAEntero(ARMAS[ID_ARMA][VELOCIDAD_ARMA]),
					pasarAEntero(ARMAS[ID_ARMA][PRECIO_ARMA])
					);
		}
		
		private int pasarAEntero(String numero) {
			int valor = 0;
			try {
			    valor = Integer.parseInt(numero);
			} catch (NumberFormatException e) {
			    System.err.println("[ERROR] El string no es un número válido");
			    System.exit(1);
			}
			return valor;
		}
}
