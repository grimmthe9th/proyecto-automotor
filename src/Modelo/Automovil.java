package Modelo;

import utils.AccionesMotoras;

public class Automovil implements AccionesMotoras{
	 private boolean motor;
	 private boolean ruedas;
	 private boolean carroceria;
	 private boolean direccion;
	 
	 
	 public boolean isMotor() {
		return motor;
	}
	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	public boolean isRuedas() {
		return ruedas;
	}
	public void setRuedas(boolean ruedas) {
		this.ruedas = ruedas;
	}
	public boolean isCarroceria() {
		return carroceria;
	}
	public void setCarroceria(boolean carroceria) {
		this.carroceria = carroceria;
	}
	public boolean isDireccion() {
		return direccion;
	}
	public void setDireccion(boolean direccion) {
		this.direccion = direccion;
	}
	
	
	
	
	@Override
	 public void rodar(){
		 System.out.println(".....rodando");
	 }
	 @Override
	 public void frenar(){
		 System.out.println(".....frenando");
	 }
	 @Override
	 public void encender(){
		 System.out.println(".....encendiendo");
	 }
	 @Override
	 public void apagar(){
		 System.out.println(".....apagando");
	 }
	 @Override
	 public void apagar(boolean e){
		if (e){
		 System.out.println(".....apagando");
		}else{
			System.out.println(".... Ya esta apagado");
		}
		}
}
