package proyecto;

public class CiclosFormativos {

	private String[] listaNombreCiclo = {"Programaci�n", "Base de datos", "Lenguaje de Marcas", "Entornos de desarrollo", "Sistemas inform�ticos"};
	private String[] listaIdGrupo;
	private Alumnos[] arrayAlumnos;
	
	private String[][] alumnoGrupo;
	
	public CiclosFormativos(String[] listaNombreCiclo, String[] listaIdGrupo, Alumnos[] arrayAlumnos) {
		//this.listaNombreCiclo = {"Programaci�n", "Base de datos", "Lenguaje de Marcas"};
		this.listaIdGrupo = new String[10];
		this.arrayAlumnos = new Alumnos[10];
	}

	public String[] getListaIdGrupo() {
		return listaIdGrupo;
	}
}