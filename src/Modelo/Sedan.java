package Modelo;

public class Sedan extends Automovil{
    public int cantidadPuertas;
	public double litrosNafta;
	public String tipoMotor;
	public double LitrosMaleta;
	public String color;

	public Sedan(){
		
		setMotor(true);
		setRuedas(true);
		setCarroceria(true);
		setDireccion(true);
		
	}

	public Sedan(boolean tieneMotor,boolean tieneRuedas, boolean tieneCarroceria, boolean tieneDireccion){
		
		setMotor(tieneMotor);
		setRuedas(tieneRuedas);
		setCarroceria(tieneCarroceria);
		setDireccion(tieneDireccion);
	}
}
