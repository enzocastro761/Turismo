package turismo;

public class Usuario {
	private String nombre;
	private float presupuesto;
	private float tiempoDisponible;
	private String atraccionPreferida;
	private float monedasGastadas;
	private Atracciones [] itinerario = new Atracciones[3];
	
	public Usuario(String nombre, float presupuesto, float tiempoDisponible, String atraccionPreferida, float monedasGastadas) {
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.tiempoDisponible = tiempoDisponible;
		this.atraccionPreferida = atraccionPreferida;
		this.monedasGastadas = monedasGastadas;
	}
	
	
}
