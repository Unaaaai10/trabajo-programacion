package proyecto;

public class NotasAlumno extends AlumnosListaFija {

	private double[][] listaNotasDeCadaAlumno;
	
	public NotasAlumno(String nombre) {
		super(nombre);
		listaNotasDeCadaAlumno = new double[7][3];
	}
	
	public double[][] getListaNotasDeCadaAlumno() {
		return this.listaNotasDeCadaAlumno;
	}

	public void getNotas() {
		
	}
	
	public void ponerNota() {
		System.out.println("Introduce codigo del modulo del 0 al 6:");
		int codModulo = Console.readInt();
		System.out.println("Introduce el numero de evaluacion del 1 al 3:");
		int eval = Console.readInt();
		System.out.println("Introduce nota");
		this.listaNotasDeCadaAlumno[codModulo][eval] = Console.readDouble();
	}
	
	public void enseñarNotas() {
		for (int i = 0; i < listaNotasDeCadaAlumno.length; i++) {
			System.out.println("modulo " + i + " ");
			for (int j = 0; j < listaNotasDeCadaAlumno[0].length; j++) {
				System.out.print("evaluacion: " + j + " :"+ listaNotasDeCadaAlumno[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		NotasAlumno n1 = new NotasAlumno("Andoni");
		n1.enseñarNotas();
		n1.ponerNota();
		n1.enseñarNotas();
		
	}
}