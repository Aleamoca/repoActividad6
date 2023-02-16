package testing;

import java.util.ArrayList;
import java.util.List;

import modelo.javabean.*;

public class Principal {

	public static void main(String[] args) {
			Profesor profe1 = new Profesor("36592641K", "Carlos Robles", "Calle del Roble 4", "656565653", "Matemáticas");
			Alumno alumno1 = new Alumno("85485486J", "Alicia Torres", "Avda de la Fuente 12", "615241235", "1º de Bach");
			Administrativo admin1 = new Administrativo("45825632L", " Rosa Castillo ", "Ronda de Huelva 1", "653265329", 
					" renovación de matrícula");
			
			List<Persona> persona = new ArrayList<>();
			persona.add(profe1);
			persona.add(alumno1);
			persona.add(admin1);
			
			
			for (Persona pers:persona) {
				System.out.println(pers.toString());
				pers.trabajar();
				
			}
			System.out.println("\n");
			alumno1.llamar(profe1);
			System.out.println("\n");
				
			for (Persona pers:persona) {
				if (pers instanceof Profesor) {
					((Profesor)pers).ponerNotas();
				}else if (pers instanceof Alumno) {
					((Alumno)pers).hacerExamen(); 
				}else if (pers instanceof Administrativo) {
					((Administrativo)pers).gestionarMatricula();
				}   
			
			}
	}}
					
	

