import java.util.Arrays;
import java.util.Scanner;

public class Persona {

     private static String nombre;
	 private static String apellido;
	 private static int edad;
	 private static String cedula;
	 private static String telefono;
	 
	 static Scanner in = new Scanner (System.in);

	public void introducirDatos(){
		System.out.println("Introduce tu nombre:");
		nombre = in.next();
		System.out.println("Introduce tu apellido:");
		apellido = in.next();
		System.out.println("Introduce tu edad:");
		edad = in.nextInt();
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
	public void mayorEdad(){
		if (edad>=18){
			System.out.println("\n Es mayor de edad");
		}
		else {
			System.out.println("\n Es menor de edad");
		}
	}
	public void comprobarNombre(){
		String nombre="maria";
		if (nombre=="maria"){
			System.out.println("\n datos correctos");
		}
		else{
			System.out.println("\n datos incorrectos");
		}
	}
	public static void main(String[]args){
		Persona p= new Persona();
		p.introducirDatos();
		p.Imprimir();
		p.mayorEdad();
		p.comprobarNombre();
		
		Object[] p1= {nombre, apellido, edad, cedula, telefono};
		System.out.println("\n Vector de datos");
		for (Object value: p1);
		System.out.println(Arrays.deepToString(p1));
	}

}
	


		
	

