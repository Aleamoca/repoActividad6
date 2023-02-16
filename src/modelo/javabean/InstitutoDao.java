package modelo.javabean;

import java.util.List;

/*
 * Definimos la interfaz con sus metodos correspondientes
 */

public interface InstitutoDao {
	public boolean altaPersona(Persona persona);
	public Persona buscarPersona(String nif);
	public List<Persona> buscarTodas();
	public boolean eliminarPersona(Persona persona);
	public List<Persona> buscarPersonaPorTipo(String tipoPersona);
}
