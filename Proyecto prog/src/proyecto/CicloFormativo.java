package proyecto;

import java.util.Arrays;

public class CicloFormativo {

	private String nombreCicloFormativo;
	private Grupo[] arrayGrupos;
	
	public CicloFormativo(String nombreCicloFormativo, Grupo[] arrayGrupos) {
		this.nombreCicloFormativo = nombreCicloFormativo;
		this.arrayGrupos = arrayGrupos;
	}
	
	public Grupo getGrupo(int numGrupo) {
		return this.arrayGrupos[numGrupo];
	}
	
	public String toString() {
		return "Nombre ciclo formativo: " + this.nombreCicloFormativo + ", nombre grupo: "
				+ Arrays.toString(arrayGrupos);
	}

	public static void main(String[] args) {
		CicloFormativo cf1 = new CicloFormativo("DW", new Grupo[] {new Grupo("Grupo1"), new Grupo("Grupo2")});
		System.out.println(cf1.toString());
	}
}