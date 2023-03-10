package modelo.javabean;

public class Alumno extends Persona {
	/*
	 * Se definen los atributos privados
	 */
	private String curso;

	
	/*
	 * Se crea el constructor vacio
	 */
	public Alumno() {
		super();
	}

	/*
	 * Se crea el constructor con todos los atributos
	 */
	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}

	/*
	 * Se crean los getter and setter de todos los atributos
	 */
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	/*
	 * Se crea el objeto de clase Alumno
	 */
	/*Alumno a1 = new Alumno(getNif(), getNombre(), getDireccion(), getTelefono(), curso);
	
	/*
	 * Se redefinen los metodos de Object
	 */
	@Override
	public String toString() {
		return  "Alumno " + super.toString() + "]" + "cursando:" + curso;
	}
	
	/*
	 * Se define la llamada al metodo heredado 
	 */
	@Override
	public String trabajar() {
		return "El alumno " + this.getNombre() + " va a hacer su examen";
	}
	
	/*
	 * Se define el metodo propio "hacerExamen"
	 */
	public String hacerExamen() {
		return "El alumno " + this.getNombre() + " va a estudiar para el curso " + this.curso;
	}
}
