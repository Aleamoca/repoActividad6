package modelo.javabean;

public class Profesor extends Persona {
	/*
	 * Se definen los atributos privados
	 */
	private String competencias;

	/*
	 * Se crea el constructor vacio
	 */
	public Profesor() {
		super();
	}
	
	/*
	 * Se crea el constructor con todos los atributos
	 */
	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}

	/*
	 * Se crean los getter and setter de todos los atributos
	 */

	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}

	/*
	 * Se redefinen los metodos de Object
	 */
	@Override
	public String toString() {
		return "Profesor " + super.toString() + "]" + "Competencias:" + competencias;
	}
	/*
	 * Se crea el objeto de clase Persona
	 */
	/*Profesor p1 = new Profesor(getNif(), getNombre(), getDireccion(), getTelefono(), competencias);
	/*
	 * Se define la llamada al metodo heredado 
	 */
	@Override
	public String trabajar() {
		return "El profesor " + getNombre() + " va a impartir su clase";
	}
	/*
	 * Se define el metodo propio "ponerNotas"
	 */
	public String ponerNotas() {
		return "El profesor " + this.getNombre() + " va a corregir los exámenes";
	}	
}
