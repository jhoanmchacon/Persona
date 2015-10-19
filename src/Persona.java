
import java.util.*;
public class Persona {	
	private Scanner entrada;
	private String nombre;
	private String apellido;
	private String sexo;
	private int cedula;
	private int edad;
	
	public void capturaDatos(){
		entrada= new Scanner (System.in);
		System.out.println("ingrese su Nombre: ");
		nombre = entrada.next();
		System.out.println("Ingrese su apellido: ");
		apellido=entrada.next();
		System.out.println("Ingrese su Numero de Cedula:  ");
		cedula=entrada.nextInt();
		System.out.println("Ingrese su sexo: ");
		sexo=entrada.next();
		System.out.println("Ingrese su edad: ");
		edad=entrada.nextInt();
		
		System.out.println("Sr(a) Por favor indique si sus datos son Correctos");
		System.out.println("Nombre y apellido:" + nombre + " " + apellido);
		System.out.println("Cedula: " + cedula);
		System.out.println("Edad: " + edad);
		System.out.println("Sexo: " + sexo);
	}
		
		
	public static void main(String[]args){
		Persona persona1;
		persona1=new Persona();
		persona1.capturaDatos();
		//persona1.imprimir();		
		
	}
	
	}

		
	

