package com.gatitos;

public class PruebaGato {
	public static void main (String[] args) {
		
		Gato g = new Gato();
		
		//g.nombre = "Taco";
		//g.patas = 3;
		
		g.setnombre("Taco");
		g.setPatas(3);
		g.setadoptado(false);
		
		System.out.println(g);//metodo to string aparece porque es parte de la clase Gato
		System.out.println("Mi gato se llama " + g.getnombre());
		
		//error de tiempo de ejecucion, solo aparece cuando ejecutamos la aplicacion
		/*Solo aparece cuando corramos nuestro programa
		//Que sucede, estamos dividiendo entre 0 pero el programa no marca error
		//el error aparece cuando se corre el codigo
		//excepciones
		int num1 =5, num2 =0;
		int resultado = num1/num2;//dividir entre 0 da error 
		System.out.println(resultado);
		*/
		
		
		EjercicioConAtributosTacos taco = new EjercicioConAtributosTacos();
		
		taco.settipoDeTortilla("Harina");
		taco.setprecio(101);
	}
}
