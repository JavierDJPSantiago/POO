
public class Main {

	public static void main(String[] args) {
		//creamos algo similar a scanner 
		//Scanner scanner = new Scanner();
		
		//declarando un objeto taco1
		//aqui van los valores
		
		Tacos taco1 =new Tacos("Masa Azul","Suadero",2, "Mediana", 30);//con el constructor creado
		
		/*Con el constructor de defecto
		Tacos taco1 =new Tacos();
		taco1.tipoDeTortilla = "Masa Azul";
		taco1.tipoDeGuisado = "Suadero";
		taco1.numeroDeTortilla = 2;
		taco1.tamanoDeTortilla = "Mediana";
		taco1.precio = 30;
		taco1.subirPrecio(5.5f);//30+ 5.5 =35.5; en parentesis 5.5f porque es el atributo aumento
		*/
		System.out.println(taco1.toString());
		
		//nota: cada objeto es independiente de su informacion
		//segudo objeto Taco2
		//new es para la creacion de un objeto
		Tacos taco2 = new Tacos("Masa Azul","Suadero",2, "Mediana", 30);
		
		/*Con el constructor de defecto
		Tacos taco2 = new Tacos();
		taco2.tipoDeTortilla = "Harina";
		taco2.tipoDeGuisado = "Bisteck";
		taco2.numeroDeTortilla = 1;
		taco2.tamanoDeTortilla = "Grande";
		taco2.precio = 42.6f; //f de float
		//los atributos como los metodos se llaman de la misma forma
		taco2.tamanoDeTortilla = "Trigo";//reemplaza la información anterior
		*/
		System.out.println(taco2.toString());

		
		Tacos taco3 = new Tacos ("Maiz"); 
		
		
		
		System.out.println(taco3);//como el metodo to string es parte de la clase Tacos, 
		//ya no necesitas llamarlo como en 		System.out.println(taco2.toString());
		//al ser parte lo manda en automatico
	}
	
	
	
	

}
