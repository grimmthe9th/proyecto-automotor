package Controlador;

import Modelo.Sedan;

public class tablero {

	Sedan corolla = new Sedan(true,true,true,true);
	
	Sedan taunus = new Sedan(true,true,true,true);
	
	public void encenderCorolla(){
	
		if (corolla.isMotor() && corolla.isRuedas()&& corolla.isCarroceria()&& corolla.isDireccion()) {
			
			corolla.encender();
		
		}else{
			System.out.println("El automovil tiene fallas");
		}
		
	}
	
	public void encenderTaunus(){
		
		if (taunus.isMotor()&& taunus.isRuedas()&& taunus.isCarroceria()&& taunus.isDireccion()) {
		
			taunus.encender();
	
		}else{
			System.out.println("El automovil tiene fallas");
		}
		
	}

}