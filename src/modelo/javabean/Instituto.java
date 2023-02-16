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
		this.cargarDatos();
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
	
	private void cargarDatos() {
		//Indicamos que tipo de lista utilizaremos, se inicializa porque si no estaria apuntanto a null y no permitiria la utilizacion de metodos como el "add"
		this.personas = new ArrayList<Persona>();
		//Creamos 5 Personas : 1 administrativo , 2 profesores y 2 alumnos:
		Administrativo administrativo1 = new Administrativo("46578526P", "Carla Lopez", "Av Olimpica 54, Madrid", "988564574", "hacer matricula, controlar asistencia");
		Profesor profesor1 = new Profesor("13465987G", "Carlos Perez", "C/ San Miguel Yuste 17, Madrid", "164852349", "Matematicas, Digital");
		Profesor profesor2 = new Profesor("54876214H", "Jose Gomez", "C/ Kalea 11, Madrid", "456238778", "Programacion, Fisica Elemental");
		Alumno alumno1 = new Alumno("46578954F", "Anthony Moncada", "C/ San Romualdo 26, Madrid", "614258976", "Matematicas");
		Alumno alumno2 = new Alumno("46579875Y", "Denis Hernandez", "C/ Cortes 4, Madrid", "696578988", "Programacion");
		
		//Añadimos cada una de ella a la lista de Personas:		
		this.personas.add(administrativo1);
		this.personas.add(profesor1);
		this.personas.add(profesor2);
		this.personas.add(alumno1);
		this.personas.add(alumno2);
		
	}
}
