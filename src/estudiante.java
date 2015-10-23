
import java.util.Scanner;

public class estudiante extends Persona {
	
	
	private static int nota1;
	private static int nota2;
	private static int nota3;
	private static int nota4;
	private static int promedio;
	private static String asig1;
	private static String asig2;
	private static String asig3;
	private static String asig4;
	
	static Scanner in= new Scanner (System.in);
	
    public void introducirNotas(){
		System.out.println("Introduce la primera nota:");
		nota1= in.nextInt();
		System.out.println("Introduce la segunda nota:");
		nota2= in.nextInt();
		System.out.println("Introduce la tercera nota:");
		nota3= in.nextInt();
		System.out.println("Introduce la cuarta nota:");
		nota4= in.nextInt();
		
				
	}
	
    public void asigVistas(){
		
		System.out.println("\n Introduce una asignatura: ");
		asig1= in.next();
		System.out.println("\n Introduce una asignatura: ");
		asig2= in.next();
		System.out.println("\n Introduce una asignatura: ");
		asig3= in.next();
		System.out.println("\n Introduce una asignatura: ");
		asig4= in.next();
		
		
		
	}
    
    public void promedioNotas(){
    	
    promedio= (nota1 + nota2 + nota3 + nota4) /4;
    	
    }
 
	
	public void imprimirEstudiante(){
	
	System.out.println("\n ---------------------------------");
	System.out.println("\n Notas del estudiante: ");
	System.out.println("\n Nota 1: " + nota1);
	System.out.println("\n Nota 2: " + nota2);
	System.out.println("\n Nota 3: " + nota3);
	System.out.println("\n Nota 4: " + nota4);
	
	System.out.println("\n ---------------------------------");
	System.out.println("\n Asignaturas vistas: ");
	System.out.println("\n Asig num 1: " + asig1);
	System.out.println("\n Asig num 2: " + asig2);
	System.out.println("\n Asig num 3: " + asig3);
	System.out.println("\n Asig num 4: " + asig4);
	
	System.out.println("\n ---------------------------------");
	System.out.println("\n El promedio de notas es: " + promedio);
	

}
	
	   
    public void aprobado(){
    	
    	if (promedio>10){
    		System.out.println("\n El estudiante esta aprobado");
    		
    	}
    	else{
    		System.out.println("\n El estudiante esta reprobado");
    	}
    }
    
    public static void main(String[]args){
    	
    	Persona p= new Persona();
		p.introducirDatos();
		p.mayorEdad();
		p.comprobarNombre();
		p.Imprimir();
		p.verificacionInf();
		p.verNacionalidad();
    	estudiante e= new estudiante();
		e.introducirNotas();
		e.asigVistas();
		e.promedioNotas();
		e.imprimirEstudiante();
		e.aprobado();
		/*estudiante frame = new estudiante();
		frame.pack();
		frame.setVisible(true);*/
		
		/*Object[][] e1 = {
				{nombre, apellido, edad, cedula, telefono},
			
				};
				
		String[] columnNames = {"Nombre", "Apellido", "Edad",
				"Cedula", "Telefono"};
				
				final JTable table = new JTable(e1, columnNames);
				table.setPreferredScrollableViewportSize(new Dimension(500, 70));
				
				JScrollPane scrollPane = new JScrollPane(table);*/
				

				
    }
 
    }

	