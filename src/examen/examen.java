package examen;
import java.util.Scanner;

public class examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Clases
		Scanner sc = new Scanner (System.in);
		int n, mayor, menor, años = 0, t = 0;
		String nmayor, nmenor, trabajo, contiene = "";
		double media, cuantos = 0; 
		boolean es=false;
		
		//Pide número de trabajadores
		System.out.println("Introduzca el número de trabajadores de la empresa:");
		n = sc.nextInt();
		
		//Arrays
		String[] nombre = new String [n];
		int[] antiguedad = new int [n];
		String[] oficio = new String [n];
		int[] tporoficio = new int [n];
		
		//Bucle que pide los datos de los arrays
		for (int i=0; i<nombre.length; i++, cuantos ++) {
			System.out.println("Introduzca el nombre: "+i);
			nombre[i] = sc.next();
			System.out.println("Introduzca la antiguedad: "+i);
			antiguedad[i] = sc.nextInt();
			System.out.println("Introduzca el oficio: "+i);
			oficio[i] = sc.next();
			System.out.println("Los datos del trabajador/a son (nombre-edad-oficio): "+nombre[i]+"-"+antiguedad[i]+"-"+oficio[i]);
			años = años + antiguedad[i]; // Suma los años de antiguedad para luego hacer una media
		}
		
		//Enseñar quien es el trabajador con mayor y menor antiguedad de la empresa
		//Da un valor a todas las variables
		mayor = antiguedad[0];
		menor = antiguedad[0];
		nmayor = nombre [0];
		nmenor = nombre [0];
		
		//Compara hasta encontrar mayor y menor
		for (int i=0; i<nombre.length; i++) {
			if (antiguedad[i]>mayor) {
				mayor = antiguedad[i];
				nmayor = nombre[i];
			}
		}
		for (int i=0; i<nombre.length; i++) {
			if (antiguedad[i]<menor) {
				menor = antiguedad[i];
				nmenor = nombre[i];
			}
		}
		
		//Imprime resultado
		System.out.println("El trabajador con mayor antiguedad es: "+nmayor+" y tiene "+mayor+" años de oficio.");
		System.out.println("El trabajador con menor antiguedad es: "+nmenor+" y tiene "+menor+" años de oficio.");
		
		//Calcula media de años e imprime resultado
		media = años/cuantos;
		System.out.println("La media de antiguedad de la empresa es: "+media);
		
		//Decir que trabajadores comparten un oficio
		System.out.println("El número de trabajadores de que oficio quieres mostrar?: ");
		trabajo = sc.next();
		
		//Cuenta cuantos hay
		for (int i=0; i<nombre.length; i++) {
			if (oficio[i].equalsIgnoreCase(trabajo)) {
				t ++;
				es = true;
			}
			
		}
		
		//Imprime resultado
		if (es) {
			System.out.println("El número de trabajadores del oficio "+trabajo+" es: "+t);
		} else {
			System.out.println("El número de trabajadores del oficio "+trabajo+" es: "+t);
		}

		//Decir los nombres de los oficios
		System.out.println("Los oficios de los trabajadores son los siguientes:");
		for (int i=0; i<nombre.length; i++) {
			if (contiene.contains(oficio[i])) { //Compara si se repiten los nombres
				
			} else {
				System.out.println(oficio[i]);
				contiene = contiene+oficio[i];//Suma los nombres para comparar si se repiten
			}
			
		}
		
		//Decir el número de trabajadores por oficio
		System.out.println("El número de trabajadores por oficio es el siguiente:");
		
		//Bucle para comparar todos los oficios cuantos trabajadores tiene cada uno
		for (int i=0; i<nombre.length; i++) {
			trabajo = oficio[i];
			tporoficio[i] = 0;
			for (int e=0; e<nombre.length; e++) {
				if (oficio[i].equalsIgnoreCase(oficio[e])) {
					tporoficio[i] ++;
				}
			}
			
		}
		
		//Imprime resultado con bucle
		
		for (int i=0; i<nombre.length; i++) {
			System.out.println("Oficio: "+oficio[i]+" número de trabajadores: "+tporoficio[i]);
		}
		
		sc.close();


	}

}
