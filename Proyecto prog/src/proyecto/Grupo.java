package proyecto;

import java.util.Arrays;

public class Grupo {

	private String nombreGrupo;
	private Alumno[] alumnosArray;
	
	public Grupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
		this.alumnosArray = new Alumno[25];
	}
	
	public String[] getListaAlumnos() {
		String[] listaNombres = new String[alumnosArray.length];
		for (int i = 0; i < alumnosArray.length; i++) {
			listaNombres[i] = alumnosArray[i].getNombre() + " ";
		}
		return listaNombres;
	}
	
	//Función repetida para diferentes formas de ejecución
	public void getListaAlumnos2() {
		for (int i = 0; i < alumnosArray.length; i++) {
			System.out.print(alumnosArray[i].getNombre() + " ");
		}
		System.out.println();
	}
	
	public void llenarGrupo() {
		for (int i = 0; i < alumnosArray.length; i++) {
			alumnosArray[i] = new Alumno("nombre", "apellido", "", "");
		}
	}
	
	public void cargarAlumno(Alumno alumn, int numAlumnEnGrupo) {
		this.alumnosArray[numAlumnEnGrupo] = alumn;
	}

	public String toString() {
		return this.nombreGrupo + ", alumnos grupo: " + Arrays.toString(this.alumnosArray);
	}
}