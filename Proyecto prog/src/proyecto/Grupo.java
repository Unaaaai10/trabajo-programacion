package proyecto;

public class Grupo {

	private int idGrupo;
	private Alumnos[] arrayAlumnos;
	
	public Grupo(int idGrupo, int tama�oGrupo) {
		this.idGrupo = idGrupo;
		this.arrayAlumnos = new Alumnos[tama�oGrupo];
	}
	
	public Alumnos[] cargarAlumnos() {
		for (int i = 0; i < arrayAlumnos.length; i++) {
			Alumnos alumnos = arrayAlumnos[i];
		}
		return null;
	}
}