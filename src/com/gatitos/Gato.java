package com.gatitos;

public class Gato {
	//atributos
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	//constructor: tiene la capcidad de usar los atributos privados AL FORMAR PARTE DE LA CLASE

	public Gato(String nombre, int patas, boolean adoptado) {
		super();
		this.nombre = nombre;
		this.patas = patas;
		this.adoptado = adoptado;
	}

	
	
	
	//que hacemos para modificar los atributos privados: usar getter y setter (encapsulamiento)
	//esto es util para que nuestros datos no puedan ser modificados fuera de nuestros codigo
	//ya que las cambiaremos debemos crear public
	//con esto encapsulamos a nombre
	
	//creacion de getter: llevan el tipo de valor del elemento a encapsular
	//para obtner y regresar el valor de nombre
	public String getnombre() {
		return this.nombre;
	}
	
	//creacion de setter: recibe un valor para poder cambiar la variable nombre/
	//lleva dentro un void y en los parametros lo que va a modificar
	public void setnombre (String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public int getPatas() {
		return this.patas;
	}
	
	public void setPatas(int patas) {
		if(patas>=0 && patas <5) { //rango de 0-4
			this.patas = patas; 
		}else {
			throw new IllegalArgumentException("El numero de patas no es valido");//manda un mensaje de error personalizado
		}
	}
	
	
	//si queremos usar un atributo boolena en vez de get usa is

	public boolean isadoptado() {
		return this.adoptado;
	}
	
	public void setadoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}
	
	
	
	//Metodo toString
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + "]";
	}

	
	
}
