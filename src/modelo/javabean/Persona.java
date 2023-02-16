package modelo.javabean;

public abstract class Persona {
	/*
	 * Se definen los atributos privados
	 */
	private String nif;
	private String nombre;
	private String direccion;
	private String telefono;

	/*
	 * Se crea el constructor vacio
	 */
	public Persona() {
		super();
	}

	/*
	 * Se crea el constructor con todos los atributos
	 */
	public Persona(String nif, String nombre, String direccion, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	/*
	 * Se crean los getter and setter de todos los atributos
	 */
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/*
	 * Se declara el metodo con dependecia "llamar"
	 */
	public void llamar(Persona p) {
		System.out.println(this.nombre + " está llamando a  " + p.getNombre());
	}
	
	/*
	 * Se declara el metodo abstracto trabajar
	 */
	public abstract void trabajar();
	
	/*
	 * Se redefinen los metodos de Object
	 */
	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}	
}
