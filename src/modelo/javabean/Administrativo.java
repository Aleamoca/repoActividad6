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
	Administrativo a1 = new Administrativo(getNif(), getNombre(), getDireccion(), getTelefono(), tareas);
	
	/*
	 * Se redefinen los metodos de Object
	 */
	@Override
	public String toString() {
		return "Administrativo [tareas=" + tareas + "]";
	}

	/*
	 * Se define la llamada al metodo heredado 
	 */
	@Override
	public void trabajar() {
		System.out.printf("El administrativo %s va a realizar estas tareas: %s\n" ,a1.getNombre(),tareas);	
	}
	
	/*
	 * Se define el metodo propio "gestionarMatricula"
	 */
	public void gestionarMatricula() {
		System.out.printf("El administrativo %s va a gestionar una matrícula\n" ,a1.getNombre());
	}	
}