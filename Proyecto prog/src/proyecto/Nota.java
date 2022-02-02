package proyecto;

public class Nota {

	private String modulo;
	private int evaluacion;
	private double valorNota;
	private String codAlumno;
	private String codGrupo;
	private String comentario; //especificar motivo de la nota
	
	public Nota(String modulo, int evaluacion, double valorNota, String codAlumno, String codGrupo, String comentario) {
		this.modulo = modulo;
		this.evaluacion = evaluacion;
		this.valorNota = valorNota;
		this.codAlumno = codAlumno;
		this.codGrupo = codGrupo;
		this.comentario = comentario;
	}

	public String getComentario() {
		return this.comentario;
	}

	public String getModulo() {
		return this.modulo;
	}

	public String getCodAlumno() {
		return this.codAlumno;
	}

	public String getCodGrupo() {
		return this.codGrupo;
	}
	
	public double getValorNota() {
		return this.valorNota;
	}
	
	
	
	
}