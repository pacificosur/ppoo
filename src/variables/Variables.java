package variables;

public class Variables {
	//Tipos de datos
	private String nombre;
	
	public Variables() {
		nombre = "Hola mundo";
		System.out.println(nombre);
	}
	
	public static void main(String[] args) {
		Variables v = new Variables();
	}
}
