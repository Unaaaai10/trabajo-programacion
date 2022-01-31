package proyecto;

public class CiclosFormativos {

	private String[] listaNombreCiclo = {"Programación", "Base de datos", "Lenguaje de Marcas", "Entornos de desarrollo", "Sistemas informáticos"};
	private String[] listaIdGrupo;
	private Alumnos[] arrayAlumnos;
	
	private String[][] alumnoGrupo;
	
	public CiclosFormativos(String[] listaNombreCiclo, String[] listaIdGrupo, Alumnos[] arrayAlumnos) {
		//this.listaNombreCiclo = {"Programación", "Base de datos", "Lenguaje de Marcas"};
		this.listaIdGrupo = new String[10];
		this.arrayAlumnos = new Alumnos[10];
	}

	public String[] getListaIdGrupo() {
		return listaIdGrupo;
	}
}