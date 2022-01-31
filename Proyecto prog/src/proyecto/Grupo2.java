package proyecto;

import java.util.Arrays;

public class Grupo2 {

	private String nombreGrupo;
	private String[] alumnosArray;
	
	public Grupo2(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
		alumnosArray = new String[] {"Andoni", "Unai"};
	}

	@Override
	public String toString() {
		return this.nombreGrupo + ", alumnos grupo: " + Arrays.toString(alumnosArray);
	}
}