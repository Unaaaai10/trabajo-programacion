package proyecto;

import java.util.Arrays;

public class CicloFormativo2 {

	private String nombreCicloFormativo;
	private Grupo2[] arrayGrupos;
	
	public CicloFormativo2(String nombreCicloFormativo) {
		this.nombreCicloFormativo = nombreCicloFormativo;
		arrayGrupos = new Grupo2[] { new Grupo2("Grupo1")};
		
	}
	
	
	
	@Override
	public String toString() {
		return "Nombre ciclo formativo: " + this.nombreCicloFormativo + ", nombre grupo: "
				+ Arrays.toString(arrayGrupos);
	}



	public static void main(String[] args) {
		CicloFormativo2 cf1 = new CicloFormativo2("DW");
		System.out.println(cf1.toString());
	}
}