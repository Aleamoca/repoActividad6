package modelo.javabean;

public class Administrativo extends Persona {
	/*
	 * Se definen los atributos privados
	 */
	private String tareas;

	/*
	 * Se crea el constructor vacio
	 */
	public Administrativo() {
		super();
	}

	/*
	 * Se crea el constructor con todos los atributos
	 */
	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}

	/*
	 * Se crean los getter and setter de todos los atributos
	 */
	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}
	
	/*
	 * Se crea el objeto de clase Administrativo
	 */
	/*Administrativo a1 = new Administrativo(getNif(), getNombre(), getDireccion(), getTelefono(), tareas);
	
	/*
	 * Se redefinen los metodos de Object
	 */
	@Override
	public String toString() {
		return "Administrativo " + super.toString() + "]" + "Tareas:" + tareas;
	}

	/*
	 * Se define la llamada al metodo heredado 
	 */
	@Override
	public String trabajar() {
		return "El administrativo " + this.getNombre() + " va a realizar estas tareas:"
        		+ tareas;
	}
	
	/*
	 * Se define el metodo propio "gestionarMatricula"
	 */
	public String gestionarMatricula() {
		return "El administrativo" + this.getNombre() + "va a gestionar una matrícula";
	}	
}
