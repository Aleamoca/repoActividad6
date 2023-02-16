package testing;

import modelo.javabean.*;

public class Testing {

	public static void main(String[] args) {
		//Crecion de una entidad nueva para pruebas:
		Alumno alumno3 = new Alumno("54852668F", "Fiore Garcia", "C/ Ciena 22, Madrid", "164582124", "Literatura");
		
		// Creacion de instituto para pruebas, gracias al metodo privado cargarDatos(), ya viene con 5 entidades de personas para realizar pruebas.
		Instituto misPersonas = new Instituto();
		
		//Primero el metodo buscarTodas(), que nos devuelva la lista de personas dadas de alta:
		System.out.println("Lista de personas en el instituto:");
		for (Persona persona : misPersonas.buscarTodas()) {
			System.out.println(persona.toString());
		}
		
		//Con el metodo buscarPersona(), podemos encontrar una persona en la lista en la que el nif sea igual al introducido en el argumento.
		//Buscaremos la persona con nif 13465987G que es un profesor.
		System.out.println("\nBusqueda de profesor con nif 13465987G :");
		System.out.println(misPersonas.buscarPersona("13465987G"));
		
		//Con el metodo altaPersona() , podemos agregar una nueva persona la lista de personas del instituto:
		System.out.println("\nDada de alta de Persona:");
		System.out.println(alumno3.toString());
		System.out.println("Si fue exitosa, la siguiente linea deberia decir true:");
		System.out.println(misPersonas.altaPersona(alumno3));
		
		//Con el metodo eliminarPersona() , podemos eliminar una persona de la lista:
		System.out.println("\nEliminacion de la persona con nif 13465987G");
		System.out.println("Si fue exitosa, la siguiente linea deberia decir true:");
		System.out.println(misPersonas.eliminarPersona(misPersonas.buscarPersona("13465987G")));
		
		//Lista de Personas con los cambio realizados:
		System.out.println("\nLista de personas con los cambios realizados:");
		for (Persona persona : misPersonas.buscarTodas()) {
			System.out.println(persona.toString());
		}
		
		//El metodo buscarPersonaPorTipo(), nos devuelve una lista de los tipos de personas que le especifiquemos, "Alumno" , "Profesor" o "Administrativo":
		System.out.println("\nPersonas que son Alumnos:");
		for (Persona persona : misPersonas.buscarPersonaPorTipo("Alumno")) {
			System.out.println(persona.toString());
		}
		
		System.out.println("\nPersonas que son Profesores:");
		for (Persona persona : misPersonas.buscarPersonaPorTipo("Profesor")) {
			System.out.println(persona.toString());
		}
		
		System.out.println("\nPersonas que son Administrativos:");
		for (Persona persona : misPersonas.buscarPersonaPorTipo("Administrativo")) {
			System.out.println(persona.toString());
		}

	}

}
