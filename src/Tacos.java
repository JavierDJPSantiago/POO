
public class Tacos {
//clase Tacos
	
	
	//tiene atributos, no llevan valores porque le correpsonden a los objetos
	//la razon de no llevar valor es para que cada objeto se de sus valores 
	String tipoDeTortilla;
	String tipoDeGuisado;
	int numeroDeTortilla;
	String tamanoDeTortilla;
	float precio = 0.0f;//le dimos valor 0(inicial) porque con el metodo subirPrecio puede dar error en la suma 
	
	
	//Hablando de constructor: nos ayuda a inicializar un objeto, nos ayuda a crearlos necesitmos:
	//sea publico y con nombre de clase
	//con atributos
	//las clases ya tienen un constructor por defecto, con este nuevo le damos mas orden a los objetos 
    //la forma de crear objetos tambien cambio
	public Tacos(String tipoDeTortilla, 
			String tipoDeGuisado, 
			int numeroDeTortilla, 
			String tamanoDeTortilla, 
			float precio) {
		//con this le decimos que hablamos del atributo de afuera del constructor
		//this.atributoDeAfuera = atributoDelConstructor;
		this.tipoDeTortilla = tipoDeTortilla;
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanoDeTortilla = tamanoDeTortilla;
		this.precio = precio;
	}
	
	//sobre carga
	//podemos hacer multiples constructores pero deben tener el mismo nombre porque son la misma clase
	//podemos hacer constructores vacios cuando no tengamos idea de que poner
	public Tacos() {
	}
	//o hacer un constructor con un solo atributo
	public Tacos(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	
	
	
	//Los metodos son acciones que tiene la clase
	void preparar() {
		System.out.println("Preparando tu rico taco");
	}
	
	void vender() {
		System.out.println("Taco vendido");
		
	}
	
	void ponerSalsa() {
		System.out.println("Agregando salsa de la que no pica");
	}
	
	void subirPrecio(float aumento) {
		precio = precio + aumento;
	}
	//aqui click derecho/ source/ generate to Strin()/seleccionar todos los metodos menos los inherentes
	//nuevo metodo de la clase Tacos, para visualizar el contenido de los objetos en Main
	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanoDeTortilla=" + tamanoDeTortilla + ", precio=" + precio + "]";
	}

	
	
	

	
	
	

	
	
}
