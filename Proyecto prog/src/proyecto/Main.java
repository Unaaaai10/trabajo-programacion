package proyecto;

public class Main {

	public static void main(String[] args) {
		Grupo gp1 = new Grupo("Grupo1");
		Grupo gp2 = new Grupo("Grupo2");
		Alumno a1 = new Alumno("Andoni", "", "", "");
		Alumno a2 = new Alumno("Unai", "", "", "");
		
		
		System.out.println("Introduce un número del 1 al 3");
		System.out.println("1: Ver notas de cada alumno");
		System.out.println("2: Ver notas de un módulo");
		System.out.println("3: Introducir notas");
		int n = Console.readInt();
		switch (n) {
		case 1:
			System.out.println("Ver notas de cada alumno");
			a1.enseñarNotas();
			break;
		case 2:
			System.out.println("Ver notas de un módulo");
			
			break;
		case 3:
			System.out.println("Introducir notas");
			a2.ponerNota();
			break;
		default:
			System.out.println("Error, introduce un número del 1 al 3");
			break;
		}
	}
}