package Ejercicio13.Entity;

public class Curso {
	String nombreCurso, turno;
	public String[] alumnos = new String[5];
	int precio, cantHorasxDia, cantDiasxSemana, precioxHora;
	
	public Curso() {
	}

	public Curso(String nombreCurso, int precio, int cantHorasxDia, int cantDiasxSemana, String turno, int precioxHora, String[] alumnos) {
		this.nombreCurso = nombreCurso;
		this.cantHorasxDia = cantHorasxDia;
		this.cantDiasxSemana = cantDiasxSemana;
		this.turno = turno;
		this.precioxHora = precioxHora;
		this.alumnos = alumnos;
		this.precio = precio;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getCantHorasxDia() {
		return cantHorasxDia;
	}

	public void setCantHorasxDia(int cantHorasxDia) {
		this.cantHorasxDia = cantHorasxDia;
	}

	public int getCantDiasxSemana() {
		return cantDiasxSemana;
	}

	public void setCantDiasxSemana(int cantDiasxSemana) {
		this.cantDiasxSemana = cantDiasxSemana;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getPrecioxHora() {
		return precioxHora;
	}

	public void setPrecioxHora(int precioxHora) {
		this.precioxHora = precioxHora;
	}

	public String[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(String alumnos, int aux) {
		this.alumnos[aux] = alumnos;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
