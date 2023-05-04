package EjercicioE4;

import EjercicioE4.Entity.NIF;
import EjercicioE4.Service.ServiceNIF;

public class EjercicioE4_main {
	
	public static void main(String[] args) {
		
		ServiceNIF srvNIF = new ServiceNIF();
		NIF nif = new NIF();
		
		srvNIF.crearNIF(nif);
		
	}
}
