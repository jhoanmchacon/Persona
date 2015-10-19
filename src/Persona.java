import java.util.Scanner;

public class Persona {

     private String nombre;
	 private String apellido;
	 private String edad;
	 private String cedula;
	 private String telefono;
	 
	 static Scanner in = new Scanner (System.in);

	public void introducirDatos(){
		System.out.println("Introduce tu nombre:");
		nombre = in.next();
		System.out.println("Introduce tu apellido:");
		apellido = in.next();
		System.out.println("Introduce tu edad:");
		edad = in.next();
		System.out.println("Introduce tu cedula:");
		cedula = in.next();
		System.out.println("Introduce tu numero de telefono:");
		telefono = in.next();
						
		
	}
	public void Imprimir(){
		
	System.out.println("Tus datos son:\n"+ nombre);
	System.out.println("\n" + apellido);
	System.out.println("\n" + edad);
	System.out.println("\n" + cedula);
	System.out.println("\n" + telefono);
	

}
	public static void main(String[]args){
		Persona p= new Persona();
		p.introducirDatos();
		p.Imprimir();
	}
}
	


		
	

