import java.util.Arrays;// libreria para vectores
import java.util.Scanner;// mas comentarios jhoan

//librerias de la clase
public class Persona {
=======

public class Persona {// otro cambio

<<<<<<< HEAD
     private static String nombre;//jhoan chacon
=======
         //variables del programa
         private static String nombre;
>>>>>>> 201c887860c12a4360a7dcd599e36e25341fab85
	 private static String apellido;//declaracion de variable apellido
	 private static int edad;
	 private static String cedula;
	 private static String telefono;
	 
	 static Scanner in = new Scanner (System.in);
  
	public void introducirDatos(){//pruebas
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
		
	System.out.println("Tus datos son:\n Nombre:"+ nombre);
	System.out.println("\n Apellido:" + apellido);
	System.out.println("\n Edad:" + edad);
	System.out.println("\n Cedula:" + cedula);
	System.out.println("\n Telefono:" + telefono);
	

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
	 }      //Imprimir vector

}
	


		
	

