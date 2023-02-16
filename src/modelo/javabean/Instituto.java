package modelo.javabean;

import java.util.ArrayList;
import java.util.List;

public class Instituto implements InstitutoDao {

	private ArrayList<Persona> personas;
	
	// Variables constantes de utilidad utilizadas en el metodo buscarPorTipo
	public final String ADMINISTRATIVO = "Administrativo";
	public final String PROFESOR = "Profesor";
	public final String ALUMNO = "Alumno";

	public Instituto() {
		this.personas = new ArrayList<Persona>();
	}

	// Agregamos a una persona a la lista de personas
	@Override
	public boolean altaPersona(Persona persona) {
		return this.personas.add(persona);
	}

	@Override
	public Persona buscarPersona(String nif) {
		// Iteramos sobre la lista comparando cada nif con el recibido por parametro
		for(Persona ele : this.personas) {
			if (ele.getNif().equals(nif)) return ele;
		}
		return null;
	}

	// Devolvemos toda la lista de personas
	@Override
	public List<Persona> buscarTodas() {
		return this.personas;
	}

	// Eliminamos a la persona recibida por parametro en la lista
	@Override
	public boolean eliminarPersona(Persona persona) {
		return this.personas.remove(persona);
	}

	@Override
	public List<Persona> buscarPersonaPorTipo(String tipoPersona) {
		List<Persona> resultado = new ArrayList<Persona>();

		// Booleanos de utilidad para filtrar mas adelante dentro del bucle
		boolean esFiltroAdministrativo = tipoPersona.equals(ADMINISTRATIVO);
		boolean esFiltroProfesor = tipoPersona.equals(PROFESOR);
		boolean esFiltroAlumno = tipoPersona.equals(ALUMNO);

		// Si no recibimos un tipo valido devolvemos lista vacia
		if (!esFiltroAdministrativo && !esFiltroProfesor && !esFiltroAlumno) return resultado;

		// Iteramos sobre cada persona haciendo uso de instanceof
		// para comprobar a que clase pertenecen
		for (Persona ele : this.personas) {
			if (esFiltroAdministrativo && ele instanceof Administrativo) {
				resultado.add(ele);
			} else if (esFiltroProfesor && ele instanceof Profesor) {
				resultado.add(ele);
			} else if (esFiltroAlumno && ele instanceof Alumno) {
				resultado.add(ele);
			}
		}

		return resultado;
	}
	
}
