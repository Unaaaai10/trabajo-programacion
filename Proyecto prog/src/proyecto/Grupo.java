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
	
	//Funci�n repetida para diferentes formas de ejecuci�n
	public void getListaAlumnos2() {
		for (int i = 0; i < alumnosArray.length; i++) {
			System.out.print(alumnosArray[i].getNombre() + " ");
		}
		System.out.println();
	}
	
	public void llenarGrupo() {
		for (int i = 0; i < alumnosArray.length; i++) {
			alumnosArray[i] = new Alumno("nombre", "apellido", "dni", "localidad");
		}
	}
	
	public void cargarAlumno(Alumno alumn, int numAlumnEnGrupo) {
		this.alumnosArray[numAlumnEnGrupo] = alumn;
	}
	
	/*public void ense�arNotasModulo(String codModulo) {
		for (int i = 0; i < alumnosArray.length; i++) {
			Nota[] notasArray = new Nota[] {this.alumnosArray[i].getNotas()};
			for (int j = 0; j < .length; j++) {
				
			}
		}
	}*/

	public String toString() {
		return this.nombreGrupo + ", alumnos grupo: " + Arrays.toString(this.alumnosArray);
	}
}