import java.util.*;

public class Profesor extends Persona{
	public String materia;
	public String semestres;
	public String pensum;
	public int horas;
	public String horario;
	public String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes"};
	public String[] bloque = {"5:30 pm a 7:30 pm", "7:45 pm a 10:15 pm"};
	//public String bloque1="5:30 pm a 7:30 pm";
	//public String bloque2="7:45 pm a 10:15 pm";
	public float costoHora= 152.16f;
	public float salario;
	public int rand;
	public int rand1;
	public Scanner in = new Scanner (System.in);
	
	public void materias(){
		System.out.print("Nombre de la Materia: ");
		materia= in.next();
		System.out.print("Pensum: ");
		pensum=in.next();	
		System.out.print("Cantidad de horas semanales (3h / 6h): ");
		horas=in.nextInt();
		}
	public void horario(){
		
        int length = dias.length;
        int length1 = bloque.length;
        	for (int i = 0; i < 2; i++)
        	{
        		rand = (int) (Math.random() * length);
        		rand1 = (int) (Math.random()* length1);
        		System.out.print("\n horario de: "+ dias[rand] + " " + bloque[rand1] + " ");
           	}
        	        	
        }
	public void salario(){
		salario= horas*costoHora;
		}
	public void imprimir(){
		System.out.println("\n Nombre de la Materia" +" "+ materia);
		System.out.println("\n Pensum: " +" "+ pensum);
		System.out.println("\n Horas semanales: " +" "+ horas);//System.out.print("\n horario de: "+ dias[rand] + " " + bloque[rand1] + " ");
		
	}

	public static void main(String[]args){
		Persona p= new Persona();
		p.introducirDatos();
		Profesor m = new Profesor();
		m.materias();
		m.salario();
		p.Imprimir();
		m.imprimir();
		m.horario();
		p.verificacionInf();
		}
	
}
	
	
	
