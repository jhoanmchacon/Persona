import java.util.Scanner;

//librerias de la clase

public class Persona {// otro cambio
    protected static String nombre;//jhoan chacongggggg
	protected static String apellido;//declaracion de variable apellido
	protected static int edad;
	protected static String cedula;
	protected static String telefono;
	protected static String val;
	protected static String pais;
	 
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
		System.out.println("Introduce el país donde naciste:");
		pais= in.next();
						
		
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
		
		if (nombre.equals("maria")){
			System.out.println("\n datos correctos");	
		}
		else{
			System.out.println("\n datos incorrectos");
		}
	}
	
	public void Imprimir(){
	System.out.println("\n Sr(a) Por favor verifique si sus datos son Correctos");
	System.out.println("\n Nombre:"+ nombre +(" ")+ apellido);
	System.out.println("\n Edad:" + edad);
	System.out.println("\n Cedula:" + cedula);
	System.out.println("\n Telefono:" + telefono);
	System.out.println("\n Pais de nacimiento:" + pais);
	

}
	
	public void verificacionInf(){
		System.out.println("\n Sr(a) "+ nombre + " sus datos son Correctos Y/N: ");
		val=in.next();
		if (val.equals("y")){
			System.out.println("\n Gracias por usar Nuestro Sistema");
		}else{
			
			introducirDatos();
			Imprimir();
			mayorEdad();
			comprobarNombre();
			verificacionInf();
		}
	}
			
	public void verNacionalidad(){
		if (pais.equals("venezuela")){
			System.out.println("Es venezolano");
		}
		else{
			System.out.println("Es extranjero");
		}

	}
	
	
	
	/*Persona p= new Persona();
	p.introducirDatos();
	p.Imprimir();
	p.mayorEdad();
	p.comprobarNombre();
	p.verificacionInf();
	p.verNacionalidad();
			
	System.out.println("\n Vector de datos");
	Object[] p1= {nombre, apellido, edad, cedula, telefono, pais};
	for (Object value: p1);
	System.out.println(Arrays.deepToString(p1));*/

 } 

	


		
	

