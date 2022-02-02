package proyecto;

public class Alumno {

	private String nombre;
	private String apellido;
	private String dni;
	private String localidad;
	private double[][] listaNotasDeCadaAlumno;
	private Nota[] notas;
	
	public Alumno(String nombre, String apellido, String dni, String localidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.localidad = localidad;
		listaNotasDeCadaAlumno = new double[7][3];
		notas = new Nota[100];
	}
	
	
	
	public Nota[] getNotas() {
		return this.notas;
	}

	/*public double[] getNotasModulo(String codModulo) {
		for (int i = 0; i < notas.length; i++) {
			if (this.notas[i].getModulo() == codModulo) {
				return this.notas[i];
			}
		}
	}*/

	public String getNombre() {
		return this.nombre;
	}

	public double[][] getListaNotasDeCadaAlumno() {
		return this.listaNotasDeCadaAlumno;
	}
	
	public void ponerNota() {
		System.out.println("Introduce codigo del modulo del 0 al 6:");
		int codModulo = Console.readInt();
		System.out.println("Introduce el numero de evaluacion del 1 al 3:");
		int eval = Console.readInt();
		System.out.println("Introduce nota");
		this.listaNotasDeCadaAlumno[codModulo][eval] = Console.readDouble();
	}
	
	public void introducirNota(Nota nota) {
		for (int i = 0; i < listaNotasDeCadaAlumno.length; i++) {
			if(notas[i] == null) {
				notas[i] = nota;
			}
		}
	}
	
	public void showNotas() {
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota de: " + this.notas[i].getComentario() + " nota: " + this.notas[i].getValorNota());
		}
	}
	
	public void enseñarNotas() {
		for (int i = 0; i < listaNotasDeCadaAlumno.length; i++) {
			System.out.println("modulo " + (i + 1) + " ");
			for (int j = 0; j < listaNotasDeCadaAlumno[0].length; j++) {
				System.out.print("evaluacion: " + (j + 1) + " :"+ listaNotasDeCadaAlumno[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Alumno n1 = new Alumno("Andoni", "", "", "");
		n1.enseñarNotas();
		n1.ponerNota();
		n1.enseñarNotas();
		Grupo gp3 = new Grupo("Grupo3");
		gp3.llenarGrupo();
		gp3.cargarAlumno(n1, 0);
		
		gp3.getListaAlumnos2();
		
		for (int i = 0; i < 25; i++) {
			System.out.print(gp3.getListaAlumnos()[i]);
		}
		
		
		CicloFormativo cf1 = new CicloFormativo("DW", new Grupo[] {new Grupo("Grupo1"), new Grupo("Grupo2")});
		
		
	}
}