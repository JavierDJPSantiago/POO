package com.gatitos;

public class EjercicioConAtributosTacos {

	private String tipoDeTortilla;
	private String tipoDeGuisado;
	private int numeroDeTortilla;
	private String tamanoDeTortilla;
	private float precio = 0.0f;
	
	public String gettipoDeTortilla() {
		return this.tipoDeTortilla;
	}
	
	public void settipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	
	public float getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(float precio) {
		if(precio > 100) {
			System.out.println("Tu taco costo: "+ precio + " Te timaron");
		}else {
			System.out.println("Buen precio");
		}
		this.precio = precio; 

	}
	
}
