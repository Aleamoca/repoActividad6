package testing;

import modelo.javabean.*;

public class TestBuscar {

	public static void main(String[] args) {
Instituto misPersonas = new Instituto();
		
		/*
		 * El siguiente codigo recorre la lista de personas, y llama el metodo unico dependiendo de que tipo de persona sea, alumno, profesor o administrativo.
		 */
		
		for (Persona persona : misPersonas.buscarTodas()) {
			if (persona instanceof Alumno) {
				System.out.println(((Alumno) persona).hacerExamen());
			}
			
			if (persona instanceof Profesor) {
				System.out.println(((Profesor) persona).ponerNotas());
			}
			
			if (persona instanceof Administrativo) {
				System.out.println(((Administrativo) persona).gestionarMatricula());
			}
			
			System.out.println(" ");
			
		}

	}

}
