package EjercicioE3;

import EjercicioE3.Entity.Raices;
import EjercicioE3.Service.ServiceRaices;

public class EjercicioE3_main {
	
	public static void main(String[] args) {
		
		ServiceRaices srvRaices = new ServiceRaices();
		Raices raices = new Raices();
		
		srvRaices.calcular(raices);
		
	}
	
}