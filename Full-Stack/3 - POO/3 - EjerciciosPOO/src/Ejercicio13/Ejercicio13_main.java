package Ejercicio13;

import Ejercicio13.Entity.Curso;
import Ejercicio13.Service.ServiceCurso;

public class Ejercicio13_main {
	
	public static void main(String[] args) {
	
		ServiceCurso srvCurso = new ServiceCurso();
		Curso curso1 =  new Curso(), curso2 = new Curso(), curso3 = new Curso(), curso4 = new Curso(), curso5 = new Curso();
		
		srvCurso.crearCurso(curso1);
		srvCurso.crearCurso(curso2);
		srvCurso.crearCurso(curso3);
		srvCurso.crearCurso(curso4);
		srvCurso.crearCurso(curso5);
		
	}
	
}
